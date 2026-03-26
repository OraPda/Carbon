package com.zhonghui.mes.domain;

import java.util.List;
import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 制造执行MES-BOM对象 mes_bom
 * 
 * @author yang
 * @date 2024-04-03
 */
public class MesBom extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private String id;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 描述 */
    private String bomDescribe;

    /** 产品建模id */
    private Long productId;

    /** 物料id */
    private Long materialId;

    private String modeName;

    private String materialName;

    private String materialModel;

    private String materialSpecifications;

    private String materialUnit;

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
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

    /** 制造执行MES-BOM明细信息信息 */
    private List<MesBomDetailItem> mesBomDetailItemList;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setBomDescribe(String bomDescribe) 
    {
        this.bomDescribe = bomDescribe;
    }

    public String getBomDescribe() 
    {
        return bomDescribe;
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

    public List<MesBomDetailItem> getMesBomDetailItemList()
    {
        return mesBomDetailItemList;
    }

    public void setMesBomDetailItemList(List<MesBomDetailItem> mesBomDetailItemList)
    {
        this.mesBomDetailItemList = mesBomDetailItemList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("bomDescribe", getBomDescribe())
            .append("productId", getProductId())
            .append("materialId", getMaterialId())
            .append("mesBomDetailItemList", getMesBomDetailItemList())
            .toString();
    }
}
