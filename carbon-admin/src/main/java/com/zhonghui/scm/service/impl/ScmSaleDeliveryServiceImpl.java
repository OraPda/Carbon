package com.zhonghui.scm.service.impl;

import java.util.List;
import com.zhonghui.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.zhonghui.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.zhonghui.scm.domain.ScmSaleDeliveryItem;
import com.zhonghui.scm.mapper.ScmSaleDeliveryMapper;
import com.zhonghui.scm.domain.ScmSaleDelivery;
import com.zhonghui.scm.service.IScmSaleDeliveryService;

/**
 * 供应链SCM-销售管理-销售发货Service业务层处理
 * 
 * @author yang
 * @date 2024-04-13
 */
@Service
public class ScmSaleDeliveryServiceImpl implements IScmSaleDeliveryService 
{
    @Autowired
    private ScmSaleDeliveryMapper scmSaleDeliveryMapper;

    /**
     * 查询供应链SCM-销售管理-销售发货
     * 
     * @param id 供应链SCM-销售管理-销售发货主键
     * @return 供应链SCM-销售管理-销售发货
     */
    @Override
    public ScmSaleDelivery selectScmSaleDeliveryById(Long id)
    {
        return scmSaleDeliveryMapper.selectScmSaleDeliveryById(id);
    }

    /**
     * 查询供应链SCM-销售管理-销售发货列表
     * 
     * @param scmSaleDelivery 供应链SCM-销售管理-销售发货
     * @return 供应链SCM-销售管理-销售发货
     */
    @Override
    public List<ScmSaleDelivery> selectScmSaleDeliveryList(ScmSaleDelivery scmSaleDelivery)
    {
        return scmSaleDeliveryMapper.selectScmSaleDeliveryList(scmSaleDelivery);
    }

    /**
     * 新增供应链SCM-销售管理-销售发货
     * 
     * @param scmSaleDelivery 供应链SCM-销售管理-销售发货
     * @return 结果
     */
    @Transactional
    @Override
    public int insertScmSaleDelivery(ScmSaleDelivery scmSaleDelivery)
    {
        scmSaleDelivery.setCreateTime(DateUtils.getNowDate());
        int rows = scmSaleDeliveryMapper.insertScmSaleDelivery(scmSaleDelivery);
        insertScmSaleDeliveryItem(scmSaleDelivery);
        return rows;
    }

    /**
     * 修改供应链SCM-销售管理-销售发货
     * 
     * @param scmSaleDelivery 供应链SCM-销售管理-销售发货
     * @return 结果
     */
    @Transactional
    @Override
    public int updateScmSaleDelivery(ScmSaleDelivery scmSaleDelivery)
    {
        scmSaleDeliveryMapper.deleteScmSaleDeliveryItemByDeliveryId(scmSaleDelivery.getId());
        insertScmSaleDeliveryItem(scmSaleDelivery);
        return scmSaleDeliveryMapper.updateScmSaleDelivery(scmSaleDelivery);
    }

    /**
     * 批量删除供应链SCM-销售管理-销售发货
     * 
     * @param ids 需要删除的供应链SCM-销售管理-销售发货主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteScmSaleDeliveryByIds(Long[] ids)
    {
        scmSaleDeliveryMapper.deleteScmSaleDeliveryItemByDeliveryIds(ids);
        return scmSaleDeliveryMapper.deleteScmSaleDeliveryByIds(ids);
    }

    /**
     * 删除供应链SCM-销售管理-销售发货信息
     * 
     * @param id 供应链SCM-销售管理-销售发货主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteScmSaleDeliveryById(Long id)
    {
        scmSaleDeliveryMapper.deleteScmSaleDeliveryItemByDeliveryId(id);
        return scmSaleDeliveryMapper.deleteScmSaleDeliveryById(id);
    }

    /**
     * 新增供应链SCM-销售管理-销售发货子信息
     * 
     * @param scmSaleDelivery 供应链SCM-销售管理-销售发货对象
     */
    public void insertScmSaleDeliveryItem(ScmSaleDelivery scmSaleDelivery)
    {
        List<ScmSaleDeliveryItem> scmSaleDeliveryItemList = scmSaleDelivery.getScmSaleDeliveryItemList();
        Long id = scmSaleDelivery.getId();
        if (StringUtils.isNotNull(scmSaleDeliveryItemList))
        {
            List<ScmSaleDeliveryItem> list = new ArrayList<ScmSaleDeliveryItem>();
            for (ScmSaleDeliveryItem scmSaleDeliveryItem : scmSaleDeliveryItemList)
            {
                scmSaleDeliveryItem.setDeliveryId(id);
                list.add(scmSaleDeliveryItem);
            }
            if (list.size() > 0)
            {
                scmSaleDeliveryMapper.batchScmSaleDeliveryItem(list);
            }
        }
    }
}
