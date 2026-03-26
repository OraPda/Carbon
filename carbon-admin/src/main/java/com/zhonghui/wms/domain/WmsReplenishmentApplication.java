package com.zhonghui.wms.domain;

import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 智能仓储WMS-补货申请对象 wms_replenishment_application
 * 
 * @author zhonghui
 * @date 2024-04-12
 */
public class WmsReplenishmentApplication extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 单据号 */
    @Excel(name = "单据号")
    private String documentNumber;

    /** 状态：0未采购1采购中2已采购 */
    @Excel(name = "状态：0未采购1采购中2已采购")
    private Integer status;

    /** 申请人 */
    @Excel(name = "申请人")
    private Long applicant;

    /** 申请日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applicationDate;

    /** 申请状态：0未提交1待审核2已审核 */
    @Excel(name = "申请状态：0未提交1待审核2已审核")
    private Integer applicationStatus;

    /** 审核人 */
    @Excel(name = "审核人")
    private Long approved;

    /** 审核日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "审核日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date approvedDate;

    /** 审核状态：0驳回1通过 */
    @Excel(name = "审核状态：0驳回1通过")
    private Integer approvedStatus;

    /** 审核意见 */
    @Excel(name = "审核意见")
    private String approvedComments;

    /** 生成采购申请 */
    @Excel(name = "生成采购申请")
    private Integer purchaseApplyFlag;
    private String applicantName;
    private String approvedName;
    /** 智能仓储WMS-补货申请明细信息 */
    private List<WmsReplenishmentApplicationDetails> wmsReplenishmentApplicationDetailsList;

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

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDocumentNumber(String documentNumber) 
    {
        this.documentNumber = documentNumber;
    }

    public String getDocumentNumber() 
    {
        return documentNumber;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setApplicant(Long applicant) 
    {
        this.applicant = applicant;
    }

    public Long getApplicant() 
    {
        return applicant;
    }
    public void setApplicationDate(Date applicationDate) 
    {
        this.applicationDate = applicationDate;
    }

    public Date getApplicationDate() 
    {
        return applicationDate;
    }
    public void setApplicationStatus(Integer applicationStatus) 
    {
        this.applicationStatus = applicationStatus;
    }

    public Integer getApplicationStatus() 
    {
        return applicationStatus;
    }
    public void setApproved(Long approved) 
    {
        this.approved = approved;
    }

    public Long getApproved() 
    {
        return approved;
    }
    public void setApprovedDate(Date approvedDate) 
    {
        this.approvedDate = approvedDate;
    }

    public Date getApprovedDate() 
    {
        return approvedDate;
    }
    public void setApprovedStatus(Integer approvedStatus) 
    {
        this.approvedStatus = approvedStatus;
    }

    public Integer getApprovedStatus() 
    {
        return approvedStatus;
    }
    public void setApprovedComments(String approvedComments) 
    {
        this.approvedComments = approvedComments;
    }

    public String getApprovedComments() 
    {
        return approvedComments;
    }
    public void setPurchaseApplyFlag(Integer purchaseApplyFlag) 
    {
        this.purchaseApplyFlag = purchaseApplyFlag;
    }

    public Integer getPurchaseApplyFlag() 
    {
        return purchaseApplyFlag;
    }

    public List<WmsReplenishmentApplicationDetails> getWmsReplenishmentApplicationDetailsList()
    {
        return wmsReplenishmentApplicationDetailsList;
    }

    public void setWmsReplenishmentApplicationDetailsList(List<WmsReplenishmentApplicationDetails> wmsReplenishmentApplicationDetailsList)
    {
        this.wmsReplenishmentApplicationDetailsList = wmsReplenishmentApplicationDetailsList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("documentNumber", getDocumentNumber())
            .append("status", getStatus())
            .append("applicant", getApplicant())
            .append("applicationDate", getApplicationDate())
            .append("applicationStatus", getApplicationStatus())
            .append("approved", getApproved())
            .append("approvedDate", getApprovedDate())
            .append("approvedStatus", getApprovedStatus())
            .append("approvedComments", getApprovedComments())
            .append("remark", getRemark())
            .append("purchaseApplyFlag", getPurchaseApplyFlag())
            .append("wmsReplenishmentApplicationDetailsList", getWmsReplenishmentApplicationDetailsList())
            .toString();
    }
}
