package com.zhonghui.scm.domain;

import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 供应链SCM-采购管理-采购申请对象 scm_purchasing_appliction
 * 
 * @author yang
 * @date 2024-04-14
 */
public class ScmPurchasingAppliction extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    @Excel(name = "主键")
    private Long id;

    /** 申请单号 */
    @Excel(name = "申请单号")
    private String applicationNo;

    /** 申请类型 */
    @Excel(name = "申请类型")
    private Long applicationType;

    /** 计划ID */
    private Long purchasingPlanId;

    /** 补货单号 */
    private Long replenishmentId;

    /** 申请人id */
    @Excel(name = "申请人id")
    private Long applicantId;

    /** 申请日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applicantDate;

    /** 申请状态:0未提交,1待审核,2已审核 */
    @Excel(name = "申请状态:0未提交,1待审核,2已审核")
    private Long applicantStatus;

    /** 审核人id */
    @Excel(name = "审核人id")
    private Long approvedId;

    /** 审核日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "审核日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date approvedDate;

    /** 审核状态:0驳回,1通过 */
    @Excel(name = "审核状态:0驳回,1通过")
    private Long approvedStatus;

    /** 审核意见 */
    private String approvedComments;

    private String documentNumber;
    private String replenishmentNumber;

    private String applicantName;
    private String approvedName;

    /** 供应链SCM-采购管理-采购申请明细信息 */
    private List<ScmPurchasingApplictionDetail> scmPurchasingApplictionDetailList;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setApplicationNo(String applicationNo) 
    {
        this.applicationNo = applicationNo;
    }

    public String getApplicationNo() 
    {
        return applicationNo;
    }
    public void setApplicationType(Long applicationType) 
    {
        this.applicationType = applicationType;
    }

    public Long getApplicationType() 
    {
        return applicationType;
    }
    public void setPurchasingPlanId(Long purchasingPlanId) 
    {
        this.purchasingPlanId = purchasingPlanId;
    }

    public Long getPurchasingPlanId() 
    {
        return purchasingPlanId;
    }
    public void setReplenishmentId(Long replenishmentId) 
    {
        this.replenishmentId = replenishmentId;
    }

    public Long getReplenishmentId() 
    {
        return replenishmentId;
    }
    public void setApplicantId(Long applicantId) 
    {
        this.applicantId = applicantId;
    }

    public Long getApplicantId() 
    {
        return applicantId;
    }
    public void setApplicantDate(Date applicantDate) 
    {
        this.applicantDate = applicantDate;
    }

    public Date getApplicantDate() 
    {
        return applicantDate;
    }
    public void setApplicantStatus(Long applicantStatus) 
    {
        this.applicantStatus = applicantStatus;
    }

    public Long getApplicantStatus() 
    {
        return applicantStatus;
    }
    public void setApprovedId(Long approvedId) 
    {
        this.approvedId = approvedId;
    }

    public Long getApprovedId() 
    {
        return approvedId;
    }
    public void setApprovedDate(Date approvedDate) 
    {
        this.approvedDate = approvedDate;
    }

    public Date getApprovedDate() 
    {
        return approvedDate;
    }
    public void setApprovedStatus(Long approvedStatus) 
    {
        this.approvedStatus = approvedStatus;
    }

    public Long getApprovedStatus() 
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

    public List<ScmPurchasingApplictionDetail> getScmPurchasingApplictionDetailList()
    {
        return scmPurchasingApplictionDetailList;
    }

    public void setScmPurchasingApplictionDetailList(List<ScmPurchasingApplictionDetail> scmPurchasingApplictionDetailList)
    {
        this.scmPurchasingApplictionDetailList = scmPurchasingApplictionDetailList;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getReplenishmentNumber() {
        return replenishmentNumber;
    }

    public void setReplenishmentNumber(String replenishmentNumber) {
        this.replenishmentNumber = replenishmentNumber;
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
            .append("applicationNo", getApplicationNo())
            .append("applicationType", getApplicationType())
            .append("purchasingPlanId", getPurchasingPlanId())
            .append("replenishmentId", getReplenishmentId())
            .append("applicantId", getApplicantId())
            .append("applicantDate", getApplicantDate())
            .append("applicantStatus", getApplicantStatus())
            .append("approvedId", getApprovedId())
            .append("approvedDate", getApprovedDate())
            .append("approvedStatus", getApprovedStatus())
            .append("approvedComments", getApprovedComments())
            .append("remark", getRemark())
            .append("scmPurchasingApplictionDetailList", getScmPurchasingApplictionDetailList())
            .toString();
    }
}
