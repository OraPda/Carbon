package com.zhonghui.mes.domain;

import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 制造执行MES-BOM明细信息对象 mes_bom_detail_item
 * 
 * @author yang
 * @date 2024-04-03
 */
public class MesBomDetailItem extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private String id;

    /** BomId */
    @Excel(name = "BomId")
    private Long bomId;

    /** 物料id */
    @Excel(name = "物料id")
    private Long materialId;

    /** 用量 */
    @Excel(name = "用量")
    private Long dosage;


    private String subMaterialName;
    private String subMaterialModel;
    private String subMaterialSpecifications;
    private String subMaterialType;
    private String subMaterialUnit;
    private String modeName;
    private String usedQuantity;

    public String getUsedQuantity() {
        return usedQuantity;
    }

    public void setUsedQuantity(String usedQuantity) {
        this.usedQuantity = usedQuantity;
    }

    public String getSubMaterialName() {
        return subMaterialName;
    }

    public void setSubMaterialName(String subMaterialName) {
        this.subMaterialName = subMaterialName;
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

    public String getSubMaterialType() {
        return subMaterialType;
    }

    public void setSubMaterialType(String subMaterialType) {
        this.subMaterialType = subMaterialType;
    }

    public String getSubMaterialUnit() {
        return subMaterialUnit;
    }

    public void setSubMaterialUnit(String subMaterialUnit) {
        this.subMaterialUnit = subMaterialUnit;
    }

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setBomId(Long bomId) 
    {
        this.bomId = bomId;
    }

    public Long getBomId() 
    {
        return bomId;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("bomId", getBomId())
            .append("materialId", getMaterialId())
            .append("dosage", getDosage())
            .append("remark", getRemark())
            .toString();
    }
}
