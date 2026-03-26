package com.zhonghui.scm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.zhonghui.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.zhonghui.scm.domain.ScmSaleOrderItem;
import com.zhonghui.scm.mapper.ScmSaleOrderMapper;
import com.zhonghui.scm.domain.ScmSaleOrder;
import com.zhonghui.scm.service.IScmSaleOrderService;

/**
 * 供应链SCM-销售管理-销售订单Service业务层处理
 * 
 * @author zhonghui
 * @date 2024-04-13
 */
@Service
public class ScmSaleOrderServiceImpl implements IScmSaleOrderService 
{
    @Autowired
    private ScmSaleOrderMapper scmSaleOrderMapper;

    /**
     * 查询供应链SCM-销售管理-销售订单
     * 
     * @param id 供应链SCM-销售管理-销售订单主键
     * @return 供应链SCM-销售管理-销售订单
     */
    @Override
    public ScmSaleOrder selectScmSaleOrderById(Long id)
    {
        return scmSaleOrderMapper.selectScmSaleOrderById(id);
    }

    /**
     * 查询供应链SCM-销售管理-销售订单列表
     * 
     * @param scmSaleOrder 供应链SCM-销售管理-销售订单
     * @return 供应链SCM-销售管理-销售订单
     */
    @Override
    public List<ScmSaleOrder> selectScmSaleOrderList(ScmSaleOrder scmSaleOrder)
    {
        return scmSaleOrderMapper.selectScmSaleOrderList(scmSaleOrder);
    }

    /**
     * 新增供应链SCM-销售管理-销售订单
     * 
     * @param scmSaleOrder 供应链SCM-销售管理-销售订单
     * @return 结果
     */
    @Transactional
    @Override
    public int insertScmSaleOrder(ScmSaleOrder scmSaleOrder)
    {
        int rows = scmSaleOrderMapper.insertScmSaleOrder(scmSaleOrder);
        insertScmSaleOrderItem(scmSaleOrder);
        return rows;
    }

    /**
     * 修改供应链SCM-销售管理-销售订单
     * 
     * @param scmSaleOrder 供应链SCM-销售管理-销售订单
     * @return 结果
     */
    @Transactional
    @Override
    public int updateScmSaleOrder(ScmSaleOrder scmSaleOrder)
    {
        scmSaleOrderMapper.deleteScmSaleOrderItemById(scmSaleOrder.getId());
        insertScmSaleOrderItem(scmSaleOrder);
        return scmSaleOrderMapper.updateScmSaleOrder(scmSaleOrder);
    }

    /**
     * 批量删除供应链SCM-销售管理-销售订单
     * 
     * @param ids 需要删除的供应链SCM-销售管理-销售订单主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteScmSaleOrderByIds(Long[] ids)
    {
        scmSaleOrderMapper.deleteScmSaleOrderItemByIds(ids);
        return scmSaleOrderMapper.deleteScmSaleOrderByIds(ids);
    }

    /**
     * 删除供应链SCM-销售管理-销售订单信息
     * 
     * @param id 供应链SCM-销售管理-销售订单主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteScmSaleOrderById(Long id)
    {
        scmSaleOrderMapper.deleteScmSaleOrderItemById(id);
        return scmSaleOrderMapper.deleteScmSaleOrderById(id);
    }

    /**
     * 新增供应链SCM-销售管理-销售订单子信息
     * 
     * @param scmSaleOrder 供应链SCM-销售管理-销售订单对象
     */
    public void insertScmSaleOrderItem(ScmSaleOrder scmSaleOrder)
    {
        List<ScmSaleOrderItem> scmSaleOrderItemList = scmSaleOrder.getScmSaleOrderItemList();
        Long id = scmSaleOrder.getId();
        if (StringUtils.isNotNull(scmSaleOrderItemList))
        {
            List<ScmSaleOrderItem> list = new ArrayList<ScmSaleOrderItem>();
            for (ScmSaleOrderItem scmSaleOrderItem : scmSaleOrderItemList)
            {
                scmSaleOrderItem.setId(id);
                list.add(scmSaleOrderItem);
            }
            if (list.size() > 0)
            {
                scmSaleOrderMapper.batchScmSaleOrderItem(list);
            }
        }
    }
}
