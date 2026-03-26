package com.zhonghui.scm.service;

import java.util.List;
import com.zhonghui.scm.domain.ScmSaleDelivery;

/**
 * 供应链SCM-销售管理-销售发货Service接口
 * 
 * @author yang
 * @date 2024-04-13
 */
public interface IScmSaleDeliveryService 
{
    /**
     * 查询供应链SCM-销售管理-销售发货
     * 
     * @param id 供应链SCM-销售管理-销售发货主键
     * @return 供应链SCM-销售管理-销售发货
     */
    public ScmSaleDelivery selectScmSaleDeliveryById(Long id);

    /**
     * 查询供应链SCM-销售管理-销售发货列表
     * 
     * @param scmSaleDelivery 供应链SCM-销售管理-销售发货
     * @return 供应链SCM-销售管理-销售发货集合
     */
    public List<ScmSaleDelivery> selectScmSaleDeliveryList(ScmSaleDelivery scmSaleDelivery);

    /**
     * 新增供应链SCM-销售管理-销售发货
     * 
     * @param scmSaleDelivery 供应链SCM-销售管理-销售发货
     * @return 结果
     */
    public int insertScmSaleDelivery(ScmSaleDelivery scmSaleDelivery);

    /**
     * 修改供应链SCM-销售管理-销售发货
     * 
     * @param scmSaleDelivery 供应链SCM-销售管理-销售发货
     * @return 结果
     */
    public int updateScmSaleDelivery(ScmSaleDelivery scmSaleDelivery);

    /**
     * 批量删除供应链SCM-销售管理-销售发货
     * 
     * @param ids 需要删除的供应链SCM-销售管理-销售发货主键集合
     * @return 结果
     */
    public int deleteScmSaleDeliveryByIds(Long[] ids);

    /**
     * 删除供应链SCM-销售管理-销售发货信息
     * 
     * @param id 供应链SCM-销售管理-销售发货主键
     * @return 结果
     */
    public int deleteScmSaleDeliveryById(Long id);
}
