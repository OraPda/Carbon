package com.zhonghui.mes.domain;

import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 制造执行MES-工艺建模对象 mes_technology
 * 
 * @author yang
 * @date 2024-03-28
 */
public class MesTechnology extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 工艺建模id */
    @Excel(name = "工艺建模id")
    private String id;

    /** 工艺名称 */
    @Excel(name = "工艺名称")
    private String technologyName;

    /** 产品id */
    private Long materialId;

    /** 单位耗电量 */
    @Excel(name = "单位耗电量")
    private Long unitPowerConsumption;

    /** 工艺描述 */
    private String technologyDescribe;


    private String materialName;
    private String materialModel;

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

    private String materialSpecifications;
    private String materialUnit;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setTechnologyName(String technologyName) 
    {
        this.technologyName = technologyName;
    }

    public String getTechnologyName() 
    {
        return technologyName;
    }
    public void setMaterialId(Long materialId) 
    {
        this.materialId = materialId;
    }

    public Long getMaterialId() 
    {
        return materialId;
    }
    public void setUnitPowerConsumption(Long unitPowerConsumption) 
    {
        this.unitPowerConsumption = unitPowerConsumption;
    }

    public Long getUnitPowerConsumption() 
    {
        return unitPowerConsumption;
    }
    public void setTechnologyDescribe(String technologyDescribe) 
    {
        this.technologyDescribe = technologyDescribe;
    }

    public String getTechnologyDescribe() 
    {
        return technologyDescribe;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("technologyName", getTechnologyName())
            .append("materialId", getMaterialId())
            .append("unitPowerConsumption", getUnitPowerConsumption())
            .append("remark", getRemark())
            .append("technologyDescribe", getTechnologyDescribe())
            .toString();
    }
}
