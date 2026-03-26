package com.zhonghui.mes.domain;

import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 制造执行MES-产品建模明细信息对象 mes_product_material_item
 * 
 * @author yang
 * @date 2024-04-01
 */
public class MesProductMaterialItem extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String id;

    /** 产品id */
    @Excel(name = "产品id")
    private Long productId;

    /** 物料id */
    @Excel(name = "物料id")
    private Long materialId;

    private String subMaterialName;

    /** 型号 */
    private String subMaterialModel;

    /** 物料id */
    private String subMaterialSpecifications;

    private String subMaterialUnit;

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

    public String getSubMaterialUnit() {
        return subMaterialUnit;
    }

    public void setSubMaterialUnit(String subMaterialUnit) {
        this.subMaterialUnit = subMaterialUnit;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setProductId(Long productId) 
    {
        this.productId = productId;
    }

    public Long getProductId() 
    {
        return productId;
    }
    public void setMaterialId(Long materialId) 
    {
        this.materialId = materialId;
    }

    public Long getMaterialId() 
    {
        return materialId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("productId", getProductId())
            .append("materialId", getMaterialId())
            .append("remark", getRemark())
            .toString();
    }
}
