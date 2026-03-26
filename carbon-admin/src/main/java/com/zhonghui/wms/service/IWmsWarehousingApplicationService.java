package com.zhonghui.wms.service;

import java.util.List;
import com.zhonghui.wms.domain.WmsWarehousingApplication;

/**
 * 智能仓储WMS-入库申请Service接口
 * 
 * @author zhonghui
 * @date 2024-04-12
 */
public interface IWmsWarehousingApplicationService 
{
    /**
     * 查询智能仓储WMS-入库申请
     * 
     * @param id 智能仓储WMS-入库申请主键
     * @return 智能仓储WMS-入库申请
     */
    public WmsWarehousingApplication selectWmsWarehousingApplicationById(Long id);

    /**
     * 查询智能仓储WMS-入库申请列表
     * 
     * @param wmsWarehousingApplication 智能仓储WMS-入库申请
     * @return 智能仓储WMS-入库申请集合
     */
    public List<WmsWarehousingApplication> selectWmsWarehousingApplicationList(WmsWarehousingApplication wmsWarehousingApplication);

    /**
     * 新增智能仓储WMS-入库申请
     * 
     * @param wmsWarehousingApplication 智能仓储WMS-入库申请
     * @return 结果
     */
    public int insertWmsWarehousingApplication(WmsWarehousingApplication wmsWarehousingApplication);

    /**
     * 修改智能仓储WMS-入库申请
     * 
     * @param wmsWarehousingApplication 智能仓储WMS-入库申请
     * @return 结果
     */
    public int updateWmsWarehousingApplication(WmsWarehousingApplication wmsWarehousingApplication);

    /**
     * 批量删除智能仓储WMS-入库申请
     * 
     * @param ids 需要删除的智能仓储WMS-入库申请主键集合
     * @return 结果
     */
    public int deleteWmsWarehousingApplicationByIds(Long[] ids);

    /**
     * 删除智能仓储WMS-入库申请信息
     * 
     * @param id 智能仓储WMS-入库申请主键
     * @return 结果
     */
    public int deleteWmsWarehousingApplicationById(Long id);
}
