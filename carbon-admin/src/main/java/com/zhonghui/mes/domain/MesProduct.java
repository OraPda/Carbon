package com.zhonghui.mes.domain;

import java.util.List;
import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 制造执行MES-产品建模对象 mes_product
 * 
 * @author yang
 * @date 2024-04-01
 */
public class MesProduct extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    @Excel(name = "编号")
    private String id;

    /** 模型名称 */
    @Excel(name = "模型名称")
    private String modeName;

    /** 物料id */
    private Long materialId;


    private String materialName;

    /** 型号 */
    private String materialModel;

    /** 物料id */
    private String materialSpecifications;

    private String materialUnit;

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

    /** 制造执行MES-产品建模明细信息信息 */
    private List<MesProductMaterialItem> mesProductMaterialItemList;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setModeName(String modeName) 
    {
        this.modeName = modeName;
    }

    public String getModeName() 
    {
        return modeName;
    }
    public void setMaterialId(Long materialId) 
    {
        this.materialId = materialId;
    }

    public Long getMaterialId() 
    {
        return materialId;
    }

    public List<MesProductMaterialItem> getMesProductMaterialItemList()
    {
        return mesProductMaterialItemList;
    }

    public void setMesProductMaterialItemList(List<MesProductMaterialItem> mesProductMaterialItemList)
    {
        this.mesProductMaterialItemList = mesProductMaterialItemList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("modeName", getModeName())
            .append("materialId", getMaterialId())
            .append("remark", getRemark())
            .append("mesProductMaterialItemList", getMesProductMaterialItemList())
            .toString();
    }
}
