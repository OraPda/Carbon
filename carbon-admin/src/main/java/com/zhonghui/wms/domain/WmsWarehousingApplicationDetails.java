package com.zhonghui.wms.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 智能仓储WMS-入库申请明细对象 wms_warehousing_application_details
 * 
 * @author zhonghui
 * @date 2024-04-12
 */
public class WmsWarehousingApplicationDetails extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 入库申请id */
    @Excel(name = "入库申请id")
    private Long warehousingApplicationId;

    /** 物料ID */
    @Excel(name = "物料ID")
    private Long materialId;

    /** 仓库ID */
    @Excel(name = "仓库ID")
    private Long warehouseId;

    /** 库区ID */
    @Excel(name = "库区ID")
    private Long warehouseAreaId;

    /** 库位ID */
    @Excel(name = "库位ID")
    private Long warehouseSeatId;

    /** 到货数量 */
    @Excel(name = "到货数量")
    private Long arrivalNum;

    /** 入库数量 */
    @Excel(name = "入库数量")
    private Long receiptNum;

    /** 生产批号 */
    @Excel(name = "生产批号")
    private String batchNumber;

    /** 生产日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "生产日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date manufactureDate;

    /** 生产单位 */
    @Excel(name = "生产单位")
    private String productionUnit;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setWarehousingApplicationId(Long warehousingApplicationId) 
    {
        this.warehousingApplicationId = warehousingApplicationId;
    }

    public Long getWarehousingApplicationId() 
    {
        return warehousingApplicationId;
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
    public void setArrivalNum(Long arrivalNum) 
    {
        this.arrivalNum = arrivalNum;
    }

    public Long getArrivalNum() 
    {
        return arrivalNum;
    }
    public void setReceiptNum(Long receiptNum) 
    {
        this.receiptNum = receiptNum;
    }

    public Long getReceiptNum() 
    {
        return receiptNum;
    }
    public void setBatchNumber(String batchNumber) 
    {
        this.batchNumber = batchNumber;
    }

    public String getBatchNumber() 
    {
        return batchNumber;
    }
    public void setManufactureDate(Date manufactureDate) 
    {
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() 
    {
        return manufactureDate;
    }
    public void setProductionUnit(String productionUnit) 
    {
        this.productionUnit = productionUnit;
    }

    public String getProductionUnit() 
    {
        return productionUnit;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("warehousingApplicationId", getWarehousingApplicationId())
            .append("materialId", getMaterialId())
            .append("warehouseId", getWarehouseId())
            .append("warehouseAreaId", getWarehouseAreaId())
            .append("warehouseSeatId", getWarehouseSeatId())
            .append("arrivalNum", getArrivalNum())
            .append("receiptNum", getReceiptNum())
            .append("batchNumber", getBatchNumber())
            .append("manufactureDate", getManufactureDate())
            .append("productionUnit", getProductionUnit())
            .toString();
    }
}
