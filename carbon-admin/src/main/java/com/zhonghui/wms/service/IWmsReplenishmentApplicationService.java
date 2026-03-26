package com.zhonghui.wms.service;

import java.util.List;
import com.zhonghui.wms.domain.WmsReplenishmentApplication;

/**
 * 智能仓储WMS-补货申请Service接口
 * 
 * @author zhonghui
 * @date 2024-04-12
 */
public interface IWmsReplenishmentApplicationService 
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
     * 批量删除智能仓储WMS-补货申请
     * 
     * @param ids 需要删除的智能仓储WMS-补货申请主键集合
     * @return 结果
     */
    public int deleteWmsReplenishmentApplicationByIds(Long[] ids);

    /**
     * 删除智能仓储WMS-补货申请信息
     * 
     * @param id 智能仓储WMS-补货申请主键
     * @return 结果
     */
    public int deleteWmsReplenishmentApplicationById(Long id);
}
