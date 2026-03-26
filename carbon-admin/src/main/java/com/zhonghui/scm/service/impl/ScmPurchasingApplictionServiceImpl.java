package com.zhonghui.scm.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.zhonghui.common.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.zhonghui.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.zhonghui.scm.domain.ScmPurchasingApplictionDetail;
import com.zhonghui.scm.mapper.ScmPurchasingApplictionMapper;
import com.zhonghui.scm.domain.ScmPurchasingAppliction;
import com.zhonghui.scm.service.IScmPurchasingApplictionService;

/**
 * 供应链SCM-采购管理-采购申请Service业务层处理
 * 
 * @author yang
 * @date 2024-04-14
 */
@Service
public class ScmPurchasingApplictionServiceImpl implements IScmPurchasingApplictionService 
{
    @Autowired
    private ScmPurchasingApplictionMapper scmPurchasingApplictionMapper;

    /**
     * 查询供应链SCM-采购管理-采购申请
     * 
     * @param id 供应链SCM-采购管理-采购申请主键
     * @return 供应链SCM-采购管理-采购申请
     */
    @Override
    public ScmPurchasingAppliction selectScmPurchasingApplictionById(Long id)
    {
        return scmPurchasingApplictionMapper.selectScmPurchasingApplictionById(id);
    }

    /**
     * 查询供应链SCM-采购管理-采购申请列表
     * 
     * @param scmPurchasingAppliction 供应链SCM-采购管理-采购申请
     * @return 供应链SCM-采购管理-采购申请
     */
    @Override
    public List<ScmPurchasingAppliction> selectScmPurchasingApplictionList(ScmPurchasingAppliction scmPurchasingAppliction)
    {
        return scmPurchasingApplictionMapper.selectScmPurchasingApplictionList(scmPurchasingAppliction);
    }

    /**
     * 新增供应链SCM-采购管理-采购申请
     * 
     * @param scmPurchasingAppliction 供应链SCM-采购管理-采购申请
     * @return 结果
     */
    @Transactional
    @Override
    public int insertScmPurchasingAppliction(ScmPurchasingAppliction scmPurchasingAppliction)
    {
        int rows = scmPurchasingApplictionMapper.insertScmPurchasingAppliction(scmPurchasingAppliction);
        insertScmPurchasingApplictionDetail(scmPurchasingAppliction);
        return rows;
    }

    /**
     * 修改供应链SCM-采购管理-采购申请
     * 
     * @param scmPurchasingAppliction 供应链SCM-采购管理-采购申请
     * @return 结果
     */
    @Transactional
    @Override
    public int updateScmPurchasingAppliction(ScmPurchasingAppliction scmPurchasingAppliction)
    {
//        设置时间
        scmPurchasingAppliction.setApprovedDate(new Date());
//        scmPurchasingAppliction.setApprovedId(Long.valueOf(1));
        scmPurchasingAppliction.setApprovedId(SecurityUtils.getLoginUser().getUserId());
        scmPurchasingApplictionMapper.deleteScmPurchasingApplictionDetailByPurchasingApplicationId(scmPurchasingAppliction.getId());
        insertScmPurchasingApplictionDetail(scmPurchasingAppliction);
        return scmPurchasingApplictionMapper.updateScmPurchasingAppliction(scmPurchasingAppliction);
    }

    /**
     * 批量删除供应链SCM-采购管理-采购申请
     * 
     * @param ids 需要删除的供应链SCM-采购管理-采购申请主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteScmPurchasingApplictionByIds(Long[] ids)
    {
        scmPurchasingApplictionMapper.deleteScmPurchasingApplictionDetailByPurchasingApplicationIds(ids);
        return scmPurchasingApplictionMapper.deleteScmPurchasingApplictionByIds(ids);
    }

    /**
     * 删除供应链SCM-采购管理-采购申请信息
     * 
     * @param id 供应链SCM-采购管理-采购申请主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteScmPurchasingApplictionById(Long id)
    {
        scmPurchasingApplictionMapper.deleteScmPurchasingApplictionDetailByPurchasingApplicationId(id);
        return scmPurchasingApplictionMapper.deleteScmPurchasingApplictionById(id);
    }

    /**
     * 新增供应链SCM-采购管理-采购申请明细信息
     * 
     * @param scmPurchasingAppliction 供应链SCM-采购管理-采购申请对象
     */
    public void insertScmPurchasingApplictionDetail(ScmPurchasingAppliction scmPurchasingAppliction)
    {
        List<ScmPurchasingApplictionDetail> scmPurchasingApplictionDetailList = scmPurchasingAppliction.getScmPurchasingApplictionDetailList();
        Long id = scmPurchasingAppliction.getId();
        if (StringUtils.isNotNull(scmPurchasingApplictionDetailList))
        {
            List<ScmPurchasingApplictionDetail> list = new ArrayList<ScmPurchasingApplictionDetail>();
            for (ScmPurchasingApplictionDetail scmPurchasingApplictionDetail : scmPurchasingApplictionDetailList)
            {
                scmPurchasingApplictionDetail.setPurchasingApplicationId(id);
                list.add(scmPurchasingApplictionDetail);
            }
            if (list.size() > 0)
            {
                scmPurchasingApplictionMapper.batchScmPurchasingApplictionDetail(list);
            }
        }
    }

}
