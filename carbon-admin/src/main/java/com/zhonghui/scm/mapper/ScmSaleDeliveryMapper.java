package com.zhonghui.scm.mapper;

import java.util.List;
import com.zhonghui.scm.domain.ScmSaleDelivery;
import com.zhonghui.scm.domain.ScmSaleDeliveryItem;

/**
 * 供应链SCM-销售管理-销售发货Mapper接口
 * 
 * @author yang
 * @date 2024-04-13
 */
public interface ScmSaleDeliveryMapper 
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
     * 删除供应链SCM-销售管理-销售发货
     * 
     * @param id 供应链SCM-销售管理-销售发货主键
     * @return 结果
     */
    public int deleteScmSaleDeliveryById(Long id);

    /**
     * 批量删除供应链SCM-销售管理-销售发货
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteScmSaleDeliveryByIds(Long[] ids);

    /**
     * 批量删除供应链SCM-销售管理-销售发货子
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteScmSaleDeliveryItemByDeliveryIds(Long[] ids);
    
    /**
     * 批量新增供应链SCM-销售管理-销售发货子
     * 
     * @param scmSaleDeliveryItemList 供应链SCM-销售管理-销售发货子列表
     * @return 结果
     */
    public int batchScmSaleDeliveryItem(List<ScmSaleDeliveryItem> scmSaleDeliveryItemList);
    

    /**
     * 通过供应链SCM-销售管理-销售发货主键删除供应链SCM-销售管理-销售发货子信息
     * 
     * @param id 供应链SCM-销售管理-销售发货ID
     * @return 结果
     */
    public int deleteScmSaleDeliveryItemByDeliveryId(Long id);
}
