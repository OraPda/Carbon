package com.zhonghui.wms.mapper;

import java.util.List;
import com.zhonghui.wms.domain.WmsOutboundApplication;
import com.zhonghui.wms.domain.WmsOutboundApplicationDetails;

/**
 * 智能仓储WMS-出库申请Mapper接口
 * 
 * @author yang
 * @date 2024-04-15
 */
public interface WmsOutboundApplicationMapper 
{
    /**
     * 查询智能仓储WMS-出库申请
     * 
     * @param id 智能仓储WMS-出库申请主键
     * @return 智能仓储WMS-出库申请
     */
    public WmsOutboundApplication selectWmsOutboundApplicationById(String id);

    /**
     * 查询智能仓储WMS-出库申请列表
     * 
     * @param wmsOutboundApplication 智能仓储WMS-出库申请
     * @return 智能仓储WMS-出库申请集合
     */
    public  List<WmsOutboundApplication> selectWmsOutboundApplicationList(WmsOutboundApplication wmsOutboundApplication);

    /**
     * 新增智能仓储WMS-出库申请
     * 
     * @param wmsOutboundApplication 智能仓储WMS-出库申请
     * @return 结果
     */
    public int insertWmsOutboundApplication(WmsOutboundApplication wmsOutboundApplication);

    /**
     * 修改智能仓储WMS-出库申请
     * 
     * @param wmsOutboundApplication 智能仓储WMS-出库申请
     * @return 结果
     */
    public int updateWmsOutboundApplication(WmsOutboundApplication wmsOutboundApplication);

    /**
     * 删除智能仓储WMS-出库申请
     * 
     * @param id 智能仓储WMS-出库申请主键
     * @return 结果
     */
    public int deleteWmsOutboundApplicationById(String id);

    /**
     * 批量删除智能仓储WMS-出库申请
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWmsOutboundApplicationByIds(String[] ids);

    /**
     * 批量删除智能仓储WMS-出库申请明细
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWmsOutboundApplicationDetailsByOutboundApplicationIds(String[] ids);
    
    /**
     * 批量新增智能仓储WMS-出库申请明细
     * 
     * @param wmsOutboundApplicationDetailsList 智能仓储WMS-出库申请明细列表
     * @return 结果
     */
    public int batchWmsOutboundApplicationDetails(List<WmsOutboundApplicationDetails> wmsOutboundApplicationDetailsList);
    

    /**
     * 通过智能仓储WMS-出库申请主键删除智能仓储WMS-出库申请明细信息
     * 
     * @param id 智能仓储WMS-出库申请ID
     * @return 结果
     */
    public int deleteWmsOutboundApplicationDetailsByOutboundApplicationId(String id);
}
