package com.zhonghui.wms.service;

import java.util.List;
import com.zhonghui.wms.domain.WmsOutboundApplicationDetails;

/**
 * 智能仓储WMS-出库申请明细Service接口
 * 
 * @author yang
 * @date 2024-04-16
 */
public interface IWmsOutboundApplicationDetailsService 
{
    /**
     * 查询智能仓储WMS-出库申请明细
     * 
     * @param id 智能仓储WMS-出库申请明细主键
     * @return 智能仓储WMS-出库申请明细
     */
    public WmsOutboundApplicationDetails selectWmsOutboundApplicationDetailsById(String id);

    /**
     * 查询智能仓储WMS-出库申请明细列表
     * 
     * @param wmsOutboundApplicationDetails 智能仓储WMS-出库申请明细
     * @return 智能仓储WMS-出库申请明细集合
     */
    public List<WmsOutboundApplicationDetails> selectWmsOutboundApplicationDetailsList(WmsOutboundApplicationDetails wmsOutboundApplicationDetails);

    /**
     * 新增智能仓储WMS-出库申请明细
     * 
     * @param wmsOutboundApplicationDetails 智能仓储WMS-出库申请明细
     * @return 结果
     */
    public int insertWmsOutboundApplicationDetails(WmsOutboundApplicationDetails wmsOutboundApplicationDetails);

    /**
     * 修改智能仓储WMS-出库申请明细
     * 
     * @param wmsOutboundApplicationDetails 智能仓储WMS-出库申请明细
     * @return 结果
     */
    public int updateWmsOutboundApplicationDetails(WmsOutboundApplicationDetails wmsOutboundApplicationDetails);

    /**
     * 批量删除智能仓储WMS-出库申请明细
     * 
     * @param ids 需要删除的智能仓储WMS-出库申请明细主键集合
     * @return 结果
     */
    public int deleteWmsOutboundApplicationDetailsByIds(String[] ids);

    /**
     * 删除智能仓储WMS-出库申请明细信息
     * 
     * @param id 智能仓储WMS-出库申请明细主键
     * @return 结果
     */
    public int deleteWmsOutboundApplicationDetailsById(String id);
}
