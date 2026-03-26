package com.zhonghui.wms.domain;

import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.List;

/**
 * 智能仓储WMS-出库申请明细对象 wms_outbound_application_details
 * 
 * @author yang
 * @date 2024-04-16
 */
public class WmsOutboundApplicationDetails extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private String id;

    /** 出库申请id */
    @Excel(name = "出库申请id")
    private Long outboundApplicationId;

    /** 物料id */
    @Excel(name = "物料id")
    private Long materialId;

    /** 仓库编号 */
    @Excel(name = "仓库编号")
    private Long warehouseId;

    /** 库区编号 */
    @Excel(name = "库区编号")
    private Long warehouseAreaId;

    /** 库位编号 */
    @Excel(name = "库位编号")
    private Long warehouseSeatId;

    /** 出库数量 */
    @Excel(name = "出库数量")
    private Long outboundNumber;

    /** 生产批号 */
    @Excel(name = "生产批号")
    private String batchNumber;

    /** 库区列表 */
    @ApiModelProperty("库区列表")
    private List<WmsWarehouseArea> wmsWarehouseAreaList;

    /** 库位列表 */
    @ApiModelProperty("库位列表")
    private List<WmsWarehouseSeat> wmsWarehouseSeatList;

    private String materialName;
    private String materialCode;
    private BigDecimal materialPrice;
    private String materialUnit;
    private String materialSpecification;
    private String materialModel;


    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setOutboundApplicationId(Long outboundApplicationId) 
    {
        this.outboundApplicationId = outboundApplicationId;
    }

    public Long getOutboundApplicationId() 
    {
        return outboundApplicationId;
    }
    public void setMaterialId(Long materialId) 
    {
        this.materialId = materialId;
    }

    public Long getMaterialId() 
    {
        return materialId;
    }
    public void setWarehouseId(Long warehouseId) 
    {
        this.warehouseId = warehouseId;
    }

    public Long getWarehouseId() 
    {
        return warehouseId;
    }
    public void setWarehouseAreaId(Long warehouseAreaId) 
    {
        this.warehouseAreaId = warehouseAreaId;
    }

    public Long getWarehouseAreaId() 
    {
        return warehouseAreaId;
    }
    public void setWarehouseSeatId(Long warehouseSeatId) 
    {
        this.warehouseSeatId = warehouseSeatId;
    }

    public Long getWarehouseSeatId() 
    {
        return warehouseSeatId;
    }
    public void setOutboundNumber(Long outboundNumber) 
    {
        this.outboundNumber = outboundNumber;
    }

    public Long getOutboundNumber() 
    {
        return outboundNumber;
    }
    public void setBatchNumber(String batchNumber) 
    {
        this.batchNumber = batchNumber;
    }

    public String getBatchNumber() 
    {
        return batchNumber;
    }

    public List<WmsWarehouseArea> getWmsWarehouseAreaList() {
        return wmsWarehouseAreaList;
    }

    public void setWmsWarehouseAreaList(List<WmsWarehouseArea> wmsWarehouseAreaList) {
        this.wmsWarehouseAreaList = wmsWarehouseAreaList;
    }

    public List<WmsWarehouseSeat> getWmsWarehouseSeatList() {
        return wmsWarehouseSeatList;
    }

    public void setWmsWarehouseSeatList(List<WmsWarehouseSeat> wmsWarehouseSeatList) {
        this.wmsWarehouseSeatList = wmsWarehouseSeatList;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public BigDecimal getMaterialPrice() {
        return materialPrice;
    }

    public void setMaterialPrice(BigDecimal materialPrice) {
        this.materialPrice = materialPrice;
    }

    public String getMaterialUnit() {
        return materialUnit;
    }

    public void setMaterialUnit(String materialUnit) {
        this.materialUnit = materialUnit;
    }

    public String getMaterialSpecification() {
        return materialSpecification;
    }

    public void setMaterialSpecification(String materialSpecification) {
        this.materialSpecification = materialSpecification;
    }

    public String getMaterialModel() {
        return materialModel;
    }

    public void setMaterialModel(String materialModel) {
        this.materialModel = materialModel;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("outboundApplicationId", getOutboundApplicationId())
            .append("materialId", getMaterialId())
            .append("warehouseId", getWarehouseId())
            .append("warehouseAreaId", getWarehouseAreaId())
            .append("warehouseSeatId", getWarehouseSeatId())
            .append("outboundNumber", getOutboundNumber())
            .append("batchNumber", getBatchNumber())
            .toString();
    }
}
