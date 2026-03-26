package com.zhonghui.mes.domain;

import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 制造执行MES-计划排产对象 mes_planned_production
 * 
 * @author yang
 * @date 2024-04-03
 */
public class MesPlannedProduction extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    @Excel(name = "编号")
    private Long id;

    /** 流水号 */
    @Excel(name = "流水号")
    private String serialNo;

    /** 生产计划id */
    private Long productionPlanId;

    /** 物料id */
    private Long materialId;

    /** bomid */
    private Long bomId;

    private Long projectId;



    /** 工厂id */
    private Long factoryId;

    /** 工艺id */
    private Long technologyId;

    /** 待产数量 */
    @Excel(name = "待产数量")
    private Long producedQuantity;

    /** 已产数量 */
    @Excel(name = "已产数量")
    private Long quantityProduced;

    /** 生产日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "生产日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date manufactureDate;

    /** 交货日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "交货日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deliveryDate;

    /** 发布状态：0未发布，1已下发 */
    @Excel(name = "发布状态：0未发布，1已下发")
    private Long status;

    /** 领料状态：0未领料，1已领料 */
    @Excel(name = "领料状态：0未领料，1已领料")
    private Long pickingStatus;

    private String materialName;
    private String materialUnit;
    private String materialModel;
    private String materialSpecifications;
    private String technologyName;
    private String bomName;
    private String planNumber;
    private String planName;
    private String productionLine;
    private String projectName;

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMaterialUnit() {
        return materialUnit;
    }

    public void setMaterialUnit(String materialUnit) {
        this.materialUnit = materialUnit;
    }

    public String getMaterialModel() {
        return materialModel;
    }

    public void setMaterialModel(String materialModel) {
        this.materialModel = materialModel;
    }

    public String getMaterialSpecifications() {
        return materialSpecifications;
    }

    public void setMaterialSpecifications(String materialSpecifications) {
        this.materialSpecifications = materialSpecifications;
    }

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }

    public String getBomName() {
        return bomName;
    }

    public void setBomName(String bomName) {
        this.bomName = bomName;
    }

    public String getPlanNumber() {
        return planNumber;
    }

    public void setPlanNumber(String planNumber) {
        this.planNumber = planNumber;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getProductionLine() {
        return productionLine;
    }

    public void setProductionLine(String productionLine) {
        this.productionLine = productionLine;
    }

    /** 制造执行MES-计划排产明细信息 */
    private List<MesPlannedProductionItem> mesPlannedProductionItemList;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSerialNo(String serialNo) 
    {
        this.serialNo = serialNo;
    }

    public String getSerialNo() 
    {
        return serialNo;
    }
    public void setProductionPlanId(Long productionPlanId) 
    {
        this.productionPlanId = productionPlanId;
    }

    public Long getProductionPlanId() 
    {
        return productionPlanId;
    }
    public void setMaterialId(Long materialId) 
    {
        this.materialId = materialId;
    }

    public Long getMaterialId() 
    {
        return materialId;
    }
    public void setBomId(Long bomId) 
    {
        this.bomId = bomId;
    }

    public Long getBomId() 
    {
        return bomId;
    }
    public void setFactoryId(Long factoryId) 
    {
        this.factoryId = factoryId;
    }

    public Long getFactoryId() 
    {
        return factoryId;
    }
    public void setTechnologyId(Long technologyId) 
    {
        this.technologyId = technologyId;
    }

    public Long getTechnologyId() 
    {
        return technologyId;
    }
    public void setProducedQuantity(Long producedQuantity) 
    {
        this.producedQuantity = producedQuantity;
    }

    public Long getProducedQuantity() 
    {
        return producedQuantity;
    }
    public void setQuantityProduced(Long quantityProduced) 
    {
        this.quantityProduced = quantityProduced;
    }

    public Long getQuantityProduced() 
    {
        return quantityProduced;
    }
    public void setManufactureDate(Date manufactureDate) 
    {
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() 
    {
        return manufactureDate;
    }
    public void setDeliveryDate(Date deliveryDate) 
    {
        this.deliveryDate = deliveryDate;
    }

    public Date getDeliveryDate() 
    {
        return deliveryDate;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }
    public void setPickingStatus(Long pickingStatus) 
    {
        this.pickingStatus = pickingStatus;
    }

    public Long getPickingStatus() 
    {
        return pickingStatus;
    }

    public List<MesPlannedProductionItem> getMesPlannedProductionItemList()
    {
        return mesPlannedProductionItemList;
    }

    public void setMesPlannedProductionItemList(List<MesPlannedProductionItem> mesPlannedProductionItemList)
    {
        this.mesPlannedProductionItemList = mesPlannedProductionItemList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("serialNo", getSerialNo())
            .append("productionPlanId", getProductionPlanId())
            .append("materialId", getMaterialId())
            .append("bomId", getBomId())
            .append("factoryId", getFactoryId())
            .append("technologyId", getTechnologyId())
            .append("producedQuantity", getProducedQuantity())
            .append("quantityProduced", getQuantityProduced())
            .append("manufactureDate", getManufactureDate())
            .append("deliveryDate", getDeliveryDate())
            .append("status", getStatus())
            .append("pickingStatus", getPickingStatus())
            .append("remark", getRemark())
            .append("mesPlannedProductionItemList", getMesPlannedProductionItemList())
            .toString();
    }
}
