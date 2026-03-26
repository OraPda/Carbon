package com.zhonghui.wms.mapper;

import java.util.List;
import com.zhonghui.wms.domain.WmsWarehousingApplication;
import com.zhonghui.wms.domain.WmsWarehousingApplicationDetails;

/**
 * 智能仓储WMS-入库申请Mapper接口
 * 
 * @author zhonghui
 * @date 2024-04-12
 */
public interface WmsWarehousingApplicationMapper 
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
     * 删除智能仓储WMS-入库申请
     * 
     * @param id 智能仓储WMS-入库申请主键
     * @return 结果
     */
    public int deleteWmsWarehousingApplicationById(Long id);

    /**
     * 批量删除智能仓储WMS-入库申请
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWmsWarehousingApplicationByIds(Long[] ids);

    /**
     * 批量删除智能仓储WMS-入库申请明细
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWmsWarehousingApplicationDetailsByIds(Long[] ids);
    
    /**
     * 批量新增智能仓储WMS-入库申请明细
     * 
     * @param wmsWarehousingApplicationDetailsList 智能仓储WMS-入库申请明细列表
     * @return 结果
     */
    public int batchWmsWarehousingApplicationDetails(List<WmsWarehousingApplicationDetails> wmsWarehousingApplicationDetailsList);
    

    /**
     * 通过智能仓储WMS-入库申请主键删除智能仓储WMS-入库申请明细信息
     * 
     * @param id 智能仓储WMS-入库申请ID
     * @return 结果
     */
    public int deleteWmsWarehousingApplicationDetailsById(Long id);
}
