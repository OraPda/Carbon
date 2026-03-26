package com.zhonghui.wms.service;

import java.util.List;
import com.zhonghui.wms.domain.WmsOutboundApplication;

/**
 * 智能仓储WMS-出库申请Service接口
 * 
 * @author yang
 * @date 2024-04-15
 */
public interface IWmsOutboundApplicationService 
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
    public List<WmsOutboundApplication> selectWmsOutboundApplicationList(WmsOutboundApplication wmsOutboundApplication);

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
     * 批量删除智能仓储WMS-出库申请
     * 
     * @param ids 需要删除的智能仓储WMS-出库申请主键集合
     * @return 结果
     */
    public int deleteWmsOutboundApplicationByIds(String[] ids);

    /**
     * 删除智能仓储WMS-出库申请信息
     * 
     * @param id 智能仓储WMS-出库申请主键
     * @return 结果
     */
    public int deleteWmsOutboundApplicationById(String id);
}
