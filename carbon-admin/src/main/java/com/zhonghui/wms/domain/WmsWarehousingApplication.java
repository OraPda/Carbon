package com.zhonghui.wms.domain;

import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 智能仓储WMS-入库申请对象 wms_warehousing_application
 * 
 * @author zhonghui
 * @date 2024-04-12
 */
public class WmsWarehousingApplication extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    @Excel(name = "编号")
    private Long id;

    /** 单据号 */
    private String documentNo;

    /** 关联单据号 */
    @Excel(name = "关联单据号")
    private Long documentNoId;

    /** 申请人 */
    @Excel(name = "申请人")
    private Long applicant;

    /** 申请日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applicationDate;

    /** 申请状态 */
    @Excel(name = "申请状态")
    private Integer applicationStatus;

    /** 审核人 */
    @Excel(name = "审核人")
    private Long approved;

    /** 审核日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "审核日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date approvedDate;

    /** 审核状态 */
    @Excel(name = "审核状态")
    private Integer approvedStatus;

    /** 审核意见 */
    @Excel(name = "审核意见")
    private String approvedComments;

    /** 业务类型 */
    @Excel(name = "业务类型")
    private Integer businessType;

    /** 供应商编号 */
    @Excel(name = "供应商编号")
    private Integer supplierId;

    /** 合同类型 */
    @Excel(name = "合同类型")
    private Integer contractType;

    /** 申请类型 */
    @Excel(name = "申请类型")
    private Integer applicationType;

    /** 单据状态 */
    @Excel(name = "单据状态")
    private Integer documentStatus;
    @Excel(name = "合同号")
    private String contractNo;
    private String supplierName;
    private String userName;
    private String applicantName;
    /** 智能仓储WMS-入库申请明细信息 */
    private List<WmsWarehousingApplicationDetails> wmsWarehousingApplicationDetailsList;

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
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
    public void setBusinessType(Integer businessType) 
    {
        this.businessType = businessType;
    }

    public Integer getBusinessType() 
    {
        return businessType;
    }
    public void setSupplierId(Integer supplierId) 
    {
        this.supplierId = supplierId;
    }

    public Integer getSupplierId() 
    {
        return supplierId;
    }
    public void setContractType(Integer contractType) 
    {
        this.contractType = contractType;
    }

    public Integer getContractType() 
    {
        return contractType;
    }
    public void setApplicationType(Integer applicationType) 
    {
        this.applicationType = applicationType;
    }

    public Integer getApplicationType() 
    {
        return applicationType;
    }
    public void setDocumentStatus(Integer documentStatus) 
    {
        this.documentStatus = documentStatus;
    }

    public Integer getDocumentStatus() 
    {
        return documentStatus;
    }

    public List<WmsWarehousingApplicationDetails> getWmsWarehousingApplicationDetailsList()
    {
        return wmsWarehousingApplicationDetailsList;
    }

    public void setWmsWarehousingApplicationDetailsList(List<WmsWarehousingApplicationDetails> wmsWarehousingApplicationDetailsList)
    {
        this.wmsWarehousingApplicationDetailsList = wmsWarehousingApplicationDetailsList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("documentNo", getDocumentNo())
            .append("documentNoId", getDocumentNoId())
            .append("applicant", getApplicant())
            .append("applicationDate", getApplicationDate())
            .append("applicationStatus", getApplicationStatus())
            .append("approved", getApproved())
            .append("approvedDate", getApprovedDate())
            .append("approvedStatus", getApprovedStatus())
            .append("approvedComments", getApprovedComments())
            .append("remark", getRemark())
            .append("businessType", getBusinessType())
            .append("supplierId", getSupplierId())
            .append("contractType", getContractType())
            .append("applicationType", getApplicationType())
            .append("documentStatus", getDocumentStatus())
            .append("wmsWarehousingApplicationDetailsList", getWmsWarehousingApplicationDetailsList())
            .toString();
    }
}
