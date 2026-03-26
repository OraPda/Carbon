package com.zhonghui.mes.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 制造执行MES-生产计划明细对象 mes_production_plan_item
 * 
 * @author yang
 * @date 2024-04-09
 */
public class MesProductionPlanItem extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 生产计划id */
    @Excel(name = "生产计划id")
    private Long planId;

    /** 物料档案id */
    @Excel(name = "物料档案id")
    private Long materialId;

    /** 生产数量 */
    @Excel(name = "生产数量")
    private Long quantity;

    /** 生产日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "生产日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date manufacture;
    /** 产品 */
    @Excel(name = "产品")
    @ApiModelProperty("产品")
    private String materialName;

    /** 型号 */
    @Excel(name = "型号")
    @ApiModelProperty("型号")
    private String materialModel;

    /** 规格 */
    @Excel(name = "规格")
    @ApiModelProperty("规格")
    private String materialSpecifications;

    /** 单位 */
    @Excel(name = "单位")
    @ApiModelProperty("单位")
    private String materialUnit;

    /** 计划号 */
    @Excel(name = "计划号")
    @ApiModelProperty("计划号")
    private String planNumber;

    /** 项目名称 */
    @Excel(name = "项目名称")
    @ApiModelProperty("项目名称")
    private String projectName;

    /** 交货日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "交货日期", width = 30, dateFormat = "yyyy-MM-dd")
    @ApiModelProperty("交货日期")
    private Date deliveryDate;


    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPlanId(Long planId) 
    {
        this.planId = planId;
    }

    public Long getPlanId() 
    {
        return planId;
    }
    public void setMaterialId(Long materialId) 
    {
        this.materialId = materialId;
    }

    public Long getMaterialId() 
    {
        return materialId;
    }
    public void setQuantity(Long quantity) 
    {
        this.quantity = quantity;
    }

    public Long getQuantity() 
    {
        return quantity;
    }
    public void setManufacture(Date manufacture) 
    {
        this.manufacture = manufacture;
    }

    public Date getManufacture() 
    {
        return manufacture;
    }


    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
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

    public String getMaterialUnit() {
        return materialUnit;
    }

    public void setMaterialUnit(String materialUnit) {
        this.materialUnit = materialUnit;
    }

    public String getPlanNumber() {
        return planNumber;
    }

    public void setPlanNumber(String planNumber) {
        this.planNumber = planNumber;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("planId", getPlanId())
            .append("materialId", getMaterialId())
            .append("quantity", getQuantity())
            .append("manufacture", getManufacture())
            .toString();
    }
}
