package com.zhonghui.wms.domain;

import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 智能仓储WMS-出库申请对象 wms_outbound_application
 * 
 * @author yang
 * @date 2024-04-15
 */
public class WmsOutboundApplication extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    @Excel(name = "编号")
    private String id;

    /** 单据号 */
    @Excel(name = "单据号")
    private String documentNo;

    /** 关联单据号id */
    @Excel(name = "关联单据号id")
    private Long documentNoId;

    /** 业务类型: */
    @Excel(name = "业务类型:")
    private Long businessType;

    /** 客户编号 */
    private Long customerId;

    /** 单据状态：0未分拣1已分拣2已盘点3已发货 */
    private Long documentStatus;

    /** 合同类型: */
    @Excel(name = "合同类型:")
    private Long contractType;

    /** 申请类型: */
    @Excel(name = "申请类型:")
    private Long applicationType;

    /** 申请人 */
    @Excel(name = "申请人")
    private Long applicant;

    /** 申请日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applicationDate;

    /** 申请状态 */
    @Excel(name = "申请状态")
    private Long applicationStatus;

    /** 审核人 */
    @Excel(name = "审核人")
    private Long approved;

    /** 审核日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "审核日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date approvedDate;

    /** 审核状态 */
    @Excel(name = "审核状态")
    private Long approvedStatus;

    /** 审核意见 */
    private String approvedComments;

    /** 关联单据号*/
    private String AssociationDocumentNo;

    private String customName;
    private String applicantName;
    private String approvedName;
    private String contractNumber;

    /** 智能仓储WMS-出库申请明细信息 */
    private List<WmsOutboundApplicationDetails> wmsOutboundApplicationDetailsList;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setDocumentNo(String documentNo) 
    {
        this.documentNo = documentNo;
    }

    public String getDocumentNo() 
    {
        return documentNo;
    }
    public void setDocumentNoId(Long documentNoId) 
    {
        this.documentNoId = documentNoId;
    }

    public Long getDocumentNoId() 
    {
        return documentNoId;
    }
    public void setBusinessType(Long businessType) 
    {
        this.businessType = businessType;
    }

    public Long getBusinessType() 
    {
        return businessType;
    }
    public void setCustomerId(Long customerId) 
    {
        this.customerId = customerId;
    }

    public Long getCustomerId() 
    {
        return customerId;
    }
    public void setDocumentStatus(Long documentStatus) 
    {
        this.documentStatus = documentStatus;
    }

    public Long getDocumentStatus() 
    {
        return documentStatus;
    }
    public void setContractType(Long contractType) 
    {
        this.contractType = contractType;
    }

    public Long getContractType() 
    {
        return contractType;
    }
    public void setApplicationType(Long applicationType) 
    {
        this.applicationType = applicationType;
    }

    public Long getApplicationType() 
    {
        return applicationType;
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
    public void setApplicationStatus(Long applicationStatus) 
    {
        this.applicationStatus = applicationStatus;
    }

    public Long getApplicationStatus() 
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

    public List<WmsOutboundApplicationDetails> getWmsOutboundApplicationDetailsList()
    {
        return wmsOutboundApplicationDetailsList;
    }

    public void setWmsOutboundApplicationDetailsList(List<WmsOutboundApplicationDetails> wmsOutboundApplicationDetailsList)
    {
        this.wmsOutboundApplicationDetailsList = wmsOutboundApplicationDetailsList;
    }

    public String getAssociationDocumentNo() {
        return AssociationDocumentNo;
    }

    public void setAssociationDocumentNo(String associationDocumentNo) {
        AssociationDocumentNo = associationDocumentNo;
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
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

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("documentNo", getDocumentNo())
            .append("documentNoId", getDocumentNoId())
            .append("businessType", getBusinessType())
            .append("customerId", getCustomerId())
            .append("documentStatus", getDocumentStatus())
            .append("contractType", getContractType())
            .append("applicationType", getApplicationType())
            .append("applicant", getApplicant())
            .append("applicationDate", getApplicationDate())
            .append("applicationStatus", getApplicationStatus())
            .append("approved", getApproved())
            .append("approvedDate", getApprovedDate())
            .append("approvedStatus", getApprovedStatus())
            .append("approvedComments", getApprovedComments())
            .append("remark", getRemark())
            .append("wmsOutboundApplicationDetailsList", getWmsOutboundApplicationDetailsList())
            .toString();
    }
}
