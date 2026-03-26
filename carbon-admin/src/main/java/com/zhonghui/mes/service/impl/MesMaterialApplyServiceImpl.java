package com.zhonghui.mes.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.zhonghui.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.zhonghui.mes.domain.MesMaterialApplyItem;
import com.zhonghui.mes.mapper.MesMaterialApplyMapper;
import com.zhonghui.mes.domain.MesMaterialApply;
import com.zhonghui.mes.service.IMesMaterialApplyService;

/**
 * 制造执行MES-领料申请Service业务层处理
 * 
 * @author yang
 * @date 2024-03-31
 */
@Service
public class MesMaterialApplyServiceImpl implements IMesMaterialApplyService 
{
    @Autowired
    private MesMaterialApplyMapper mesMaterialApplyMapper;

    /**
     * 查询制造执行MES-领料申请
     * 
     * @param id 制造执行MES-领料申请主键
     * @return 制造执行MES-领料申请
     */
    @Override
    public MesMaterialApply selectMesMaterialApplyById(Long id)
    {
        return mesMaterialApplyMapper.selectMesMaterialApplyById(id);
    }

    /**
     * 查询制造执行MES-领料申请列表
     * 
     * @param mesMaterialApply 制造执行MES-领料申请
     * @return 制造执行MES-领料申请
     */
    @Override
    public List<MesMaterialApply> selectMesMaterialApplyList(MesMaterialApply mesMaterialApply)
    {
        return mesMaterialApplyMapper.selectMesMaterialApplyList(mesMaterialApply);
    }

    /**
     * 新增制造执行MES-领料申请
     * 
     * @param mesMaterialApply 制造执行MES-领料申请
     * @return 结果
     */
    @Transactional
    @Override
    public int insertMesMaterialApply(MesMaterialApply mesMaterialApply)
    {
        int rows = mesMaterialApplyMapper.insertMesMaterialApply(mesMaterialApply);
        insertMesMaterialApplyItem(mesMaterialApply);
        return rows;
    }

    /**
     * 修改制造执行MES-领料申请
     * 
     * @param mesMaterialApply 制造执行MES-领料申请
     * @return 结果
     */
    @Transactional
    @Override
    public int updateMesMaterialApply(MesMaterialApply mesMaterialApply)
    {
        mesMaterialApplyMapper.deleteMesMaterialApplyItemByApplyId(mesMaterialApply.getId());
        insertMesMaterialApplyItem(mesMaterialApply);
        return mesMaterialApplyMapper.updateMesMaterialApply(mesMaterialApply);
    }

    /**
     * 批量删除制造执行MES-领料申请
     * 
     * @param ids 需要删除的制造执行MES-领料申请主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteMesMaterialApplyByIds(Long[] ids)
    {
        mesMaterialApplyMapper.deleteMesMaterialApplyItemByApplyIds(ids);
        return mesMaterialApplyMapper.deleteMesMaterialApplyByIds(ids);
    }

    /**
     * 删除制造执行MES-领料申请信息
     * 
     * @param id 制造执行MES-领料申请主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteMesMaterialApplyById(Long id)
    {
        mesMaterialApplyMapper.deleteMesMaterialApplyItemByApplyId(id);
        return mesMaterialApplyMapper.deleteMesMaterialApplyById(id);
    }

    /**
     * 新增制造执行MES-领料申请明细信息
     * 
     * @param mesMaterialApply 制造执行MES-领料申请对象
     */
    public void insertMesMaterialApplyItem(MesMaterialApply mesMaterialApply)
    {
        List<MesMaterialApplyItem> mesMaterialApplyItemList = mesMaterialApply.getMesMaterialApplyItemList();
        Long id = mesMaterialApply.getId();
        if (StringUtils.isNotNull(mesMaterialApplyItemList))
        {
            List<MesMaterialApplyItem> list = new ArrayList<MesMaterialApplyItem>();
            for (MesMaterialApplyItem mesMaterialApplyItem : mesMaterialApplyItemList)
            {
                mesMaterialApplyItem.setApplyId(id);
                list.add(mesMaterialApplyItem);
            }
            if (list.size() > 0)
            {
                mesMaterialApplyMapper.batchMesMaterialApplyItem(list);
            }
        }
    }
}
