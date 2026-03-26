package com.zhonghui.scm.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 供应链SCM-采购管理-采购申请明细对象 scm_purchasing_appliction_detail
 * 
 * @author yang
 * @date 2024-04-14
 */
public class ScmPurchasingApplictionDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 采购申请id */
    @Excel(name = "采购申请id")
    private Long purchasingApplicationId;

    /** 物料id */
    @Excel(name = "物料id")
    private Long materialId;

    /** 采购数量 */
    @Excel(name = "采购数量")
    private Long purchaseQuantity;

    /** 需求数量 */
    @Excel(name = "需求数量")
    private Long demandedQuantity;

    /** 需求日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "需求日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date demandedDate;


    private String materialName;
    private String materialModel;
    private String materialSpecifications;
    private String materialUnit;
    private String applicantName;
    private String approvedName;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPurchasingApplicationId(Long purchasingApplicationId) 
    {
        this.purchasingApplicationId = purchasingApplicationId;
    }

    public Long getPurchasingApplicationId() 
    {
        return purchasingApplicationId;
    }
    public void setMaterialId(Long materialId) 
    {
        this.materialId = materialId;
    }

    public Long getMaterialId() 
    {
        return materialId;
    }
    public void setPurchaseQuantity(Long purchaseQuantity) 
    {
        this.purchaseQuantity = purchaseQuantity;
    }

    public Long getPurchaseQuantity() 
    {
        return purchaseQuantity;
    }
    public void setDemandedQuantity(Long demandedQuantity) 
    {
        this.demandedQuantity = demandedQuantity;
    }

    public Long getDemandedQuantity() 
    {
        return demandedQuantity;
    }
    public void setDemandedDate(Date demandedDate) 
    {
        this.demandedDate = demandedDate;
    }

    public Date getDemandedDate() 
    {
        return demandedDate;
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

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getApprovedName() {
        return approvedName;
    }

    public void setApprovedName(String approvedName) {
        this.approvedName = approvedName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("purchasingApplicationId", getPurchasingApplicationId())
            .append("materialId", getMaterialId())
            .append("purchaseQuantity", getPurchaseQuantity())
            .append("demandedQuantity", getDemandedQuantity())
            .append("demandedDate", getDemandedDate())
            .append("remark", getRemark())
            .toString();
    }
}
