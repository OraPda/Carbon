package com.zhonghui.mes.domain;

import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 制造执行MES-质量管理-质检标准对象 mes_inspection_standards
 * 
 * @author yang
 * @date 2024-04-10
 */
public class MesInspectionStandards extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    @Excel(name = "编号")
    private Long id;

    /** 物料id */
    private Long materialId;

    /** 检验项目名称 */
    @Excel(name = "检验项目名称")
    private String checkItem;

    /** 检验类型：0来料检验，1产品检验，2生产采样 */
    @Excel(name = "检验类型：0来料检验，1产品检验，2生产采样")
    private Long checkType;

    /** 标准值上限 */
    @Excel(name = "标准值上限")
    private Long upLimit;

    /** 标准值下限 */
    @Excel(name = "标准值下限")
    private Long lowerLimit;

    private String materialName;
    private String materialModel;
    private String materialSpecifications;
    private String materialUnit;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setMaterialId(Long materialId) 
    {
        this.materialId = materialId;
    }

    public Long getMaterialId() 
    {
        return materialId;
    }
    public void setCheckItem(String checkItem) 
    {
        this.checkItem = checkItem;
    }

    public String getCheckItem() 
    {
        return checkItem;
    }
    public void setCheckType(Long checkType) 
    {
        this.checkType = checkType;
    }

    public Long getCheckType() 
    {
        return checkType;
    }
    public void setUpLimit(Long upLimit) 
    {
        this.upLimit = upLimit;
    }

    public Long getUpLimit() 
    {
        return upLimit;
    }
    public void setLowerLimit(Long lowerLimit) 
    {
        this.lowerLimit = lowerLimit;
    }

    public Long getLowerLimit() 
    {
        return lowerLimit;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("materialId", getMaterialId())
            .append("checkItem", getCheckItem())
            .append("checkType", getCheckType())
            .append("upLimit", getUpLimit())
            .append("lowerLimit", getLowerLimit())
            .append("remark", getRemark())
            .toString();
    }
}
