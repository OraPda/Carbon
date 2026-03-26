package com.zhonghui.mes.domain;

import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 制造执行MES-计划排产明细对象 mes_planned_production_item
 * 
 * @author yang
 * @date 2024-04-03
 */
public class MesPlannedProductionItem extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 计划排产id */
    @Excel(name = "计划排产id")
    private Long productionId;

    /** 物料档案id */
    @Excel(name = "物料档案id")
    private Long materialId;

    /** 需求数量 */
    @Excel(name = "需求数量")
    private Long dosage;

    /** 已用数量 */
    @Excel(name = "已用数量")
    private Long usedQuantity;

    /** 剩余数量 */
    @Excel(name = "剩余数量")
    private Long residueQuantity;


    private String technologyName;
    private String bomName;
    private String planNumber;
    private String planName;
    private String productionLine;
    private String subMaterialName;
    private String subMaterialUnit;
    private String subMaterialModel;
    private String subMaterialSpecifications;
    private String status;
    private String projectName;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    //    private String materialName;
//    private String materialUnit;
//    private String materialModel;
//    private String materialSpecifications;
//    private String quantityProduced;
//    private String manufactureDate;
//
//    public String getMaterialName() {
//        return materialName;
//    }
//
//    public void setMaterialName(String materialName) {
//        this.materialName = materialName;
//    }
//
//    public String getMaterialUnit() {
//        return materialUnit;
//    }
//
//    public void setMaterialUnit(String materialUnit) {
//        this.materialUnit = materialUnit;
//    }
//
//    public String getMaterialModel() {
//        return materialModel;
//    }
//
//    public void setMaterialModel(String materialModel) {
//        this.materialModel = materialModel;
//    }
//
//    public String getMaterialSpecifications() {
//        return materialSpecifications;
//    }
//
//    public void setMaterialSpecifications(String materialSpecifications) {
//        this.materialSpecifications = materialSpecifications;
//    }
//
//    public String getQuantityProduced() {
//        return quantityProduced;
//    }
//
//    public void setQuantityProduced(String quantityProduced) {
//        this.quantityProduced = quantityProduced;
//    }
//
//    public String getManufactureDate() {
//        return manufactureDate;
//    }
//
//    public void setManufactureDate(String manufactureDate) {
//        this.manufactureDate = manufactureDate;
//    }

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

    public String getSubMaterialName() {
        return subMaterialName;
    }

    public void setSubMaterialName(String subMaterialName) {
        this.subMaterialName = subMaterialName;
    }

    public String getSubMaterialUnit() {
        return subMaterialUnit;
    }

    public void setSubMaterialUnit(String subMaterialUnit) {
        this.subMaterialUnit = subMaterialUnit;
    }

    public String getSubMaterialModel() {
        return subMaterialModel;
    }

    public void setSubMaterialModel(String subMaterialModel) {
        this.subMaterialModel = subMaterialModel;
    }

    public String getSubMaterialSpecifications() {
        return subMaterialSpecifications;
    }

    public void setSubMaterialSpecifications(String subMaterialSpecifications) {
        this.subMaterialSpecifications = subMaterialSpecifications;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setProductionId(Long productionId) 
    {
        this.productionId = productionId;
    }

    public Long getProductionId() 
    {
        return productionId;
    }
    public void setMaterialId(Long materialId) 
    {
        this.materialId = materialId;
    }

    public Long getMaterialId() 
    {
        return materialId;
    }
    public void setDosage(Long dosage) 
    {
        this.dosage = dosage;
    }

    public Long getDosage() 
    {
        return dosage;
    }
    public void setUsedQuantity(Long usedQuantity) 
    {
        this.usedQuantity = usedQuantity;
    }

    public Long getUsedQuantity() 
    {
        return usedQuantity;
    }
    public void setResidueQuantity(Long residueQuantity) 
    {
        this.residueQuantity = residueQuantity;
    }

    public Long getResidueQuantity() 
    {
        return residueQuantity;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("productionId", getProductionId())
            .append("materialId", getMaterialId())
            .append("dosage", getDosage())
            .append("usedQuantity", getUsedQuantity())
            .append("residueQuantity", getResidueQuantity())
            .append("remark", getRemark())
            .toString();
    }
}
