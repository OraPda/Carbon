package com.zhonghui.wms.mapper;

import java.util.List;
import com.zhonghui.wms.domain.WmsReplenishmentApplication;
import com.zhonghui.wms.domain.WmsReplenishmentApplicationDetails;

/**
 * 智能仓储WMS-补货申请Mapper接口
 * 
 * @author zhonghui
 * @date 2024-04-12
 */
public interface WmsReplenishmentApplicationMapper 
{
    /**
     * 查询智能仓储WMS-补货申请
     * 
     * @param id 智能仓储WMS-补货申请主键
     * @return 智能仓储WMS-补货申请
     */
    public WmsReplenishmentApplication selectWmsReplenishmentApplicationById(Long id);

    /**
     * 查询智能仓储WMS-补货申请列表
     * 
     * @param wmsReplenishmentApplication 智能仓储WMS-补货申请
     * @return 智能仓储WMS-补货申请集合
     */
    public List<WmsReplenishmentApplication> selectWmsReplenishmentApplicationList(WmsReplenishmentApplication wmsReplenishmentApplication);

    /**
     * 新增智能仓储WMS-补货申请
     * 
     * @param wmsReplenishmentApplication 智能仓储WMS-补货申请
     * @return 结果
     */
    public int insertWmsReplenishmentApplication(WmsReplenishmentApplication wmsReplenishmentApplication);

    /**
     * 修改智能仓储WMS-补货申请
     * 
     * @param wmsReplenishmentApplication 智能仓储WMS-补货申请
     * @return 结果
     */
    public int updateWmsReplenishmentApplication(WmsReplenishmentApplication wmsReplenishmentApplication);

    /**
     * 删除智能仓储WMS-补货申请
     * 
     * @param id 智能仓储WMS-补货申请主键
     * @return 结果
     */
    public int deleteWmsReplenishmentApplicationById(Long id);

    /**
     * 批量删除智能仓储WMS-补货申请
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWmsReplenishmentApplicationByIds(Long[] ids);

    /**
     * 批量删除智能仓储WMS-补货申请明细
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWmsReplenishmentApplicationDetailsByIds(Long[] ids);
    
    /**
     * 批量新增智能仓储WMS-补货申请明细
     * 
     * @param wmsReplenishmentApplicationDetailsList 智能仓储WMS-补货申请明细列表
     * @return 结果
     */
    public int batchWmsReplenishmentApplicationDetails(List<WmsReplenishmentApplicationDetails> wmsReplenishmentApplicationDetailsList);
    

    /**
     * 通过智能仓储WMS-补货申请主键删除智能仓储WMS-补货申请明细信息
     * 
     * @param id 智能仓储WMS-补货申请ID
     * @return 结果
     */
    public int deleteWmsReplenishmentApplicationDetailsById(Long id);
}
