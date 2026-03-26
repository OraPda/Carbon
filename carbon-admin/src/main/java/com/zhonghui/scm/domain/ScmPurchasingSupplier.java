package com.zhonghui.scm.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 供应链SCM-采购管理-供应商对象 scm_purchasing_supplier
 * 
 * @author zhonghui
 * @date 2024-04-12
 */
public class ScmPurchasingSupplier extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 供应商名称 */
    @Excel(name = "供应商名称")
    private String supplierName;

    /** 简称 */
    @Excel(name = "简称")
    private String abbreviation;

    /** 公司地址 */
    @Excel(name = "公司地址")
    private String companyAddress;

    /** 公司电话 */
    @Excel(name = "公司电话")
    private String companyPhone;

    /** 联系人 */
    @Excel(name = "联系人")
    private String contacts;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String contactNumber;

    /** 开户银行 */
    @Excel(name = "开户银行")
    private String depositBank;

    /** 银行账号 */
    @Excel(name = "银行账号")
    private String bankAccount;

    /** 税号 */
    @Excel(name = "税号")
    private String dutyParagraph;

    /** 供应商分类 */
    @Excel(name = "供应商分类")
    private Integer supplierClassification;

    /** 供应商等级 */
    @Excel(name = "供应商等级")
    private Integer supplierLevel;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 申请人id */
    @Excel(name = "申请人id")
    private Long applicantId;

    /** 申请日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applicantDate;

    /** 申请状态 */
    @Excel(name = "申请状态")
    private Integer applicantStatus;

    /** 审核人id */
    @Excel(name = "审核人id")
    private Long approvedId;

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
    public void setSupplierName(String supplierName) 
    {
        this.supplierName = supplierName;
    }

    public String getSupplierName() 
    {
        return supplierName;
    }
    public void setAbbreviation(String abbreviation) 
    {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() 
    {
        return abbreviation;
    }
    public void setCompanyAddress(String companyAddress) 
    {
        this.companyAddress = companyAddress;
    }

    public String getCompanyAddress() 
    {
        return companyAddress;
    }
    public void setCompanyPhone(String companyPhone) 
    {
        this.companyPhone = companyPhone;
    }

    public String getCompanyPhone() 
    {
        return companyPhone;
    }
    public void setContacts(String contacts) 
    {
        this.contacts = contacts;
    }

    public String getContacts() 
    {
        return contacts;
    }
    public void setContactNumber(String contactNumber) 
    {
        this.contactNumber = contactNumber;
    }

    public String getContactNumber() 
    {
        return contactNumber;
    }
    public void setDepositBank(String depositBank) 
    {
        this.depositBank = depositBank;
    }

    public String getDepositBank() 
    {
        return depositBank;
    }
    public void setBankAccount(String bankAccount) 
    {
        this.bankAccount = bankAccount;
    }

    public String getBankAccount() 
    {
        return bankAccount;
    }
    public void setDutyParagraph(String dutyParagraph) 
    {
        this.dutyParagraph = dutyParagraph;
    }

    public String getDutyParagraph() 
    {
        return dutyParagraph;
    }
    public void setSupplierClassification(Integer supplierClassification) 
    {
        this.supplierClassification = supplierClassification;
    }

    public Integer getSupplierClassification() 
    {
        return supplierClassification;
    }
    public void setSupplierLevel(Integer supplierLevel) 
    {
        this.supplierLevel = supplierLevel;
    }

    public Integer getSupplierLevel() 
    {
        return supplierLevel;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
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
    public void setApplicantStatus(Integer applicantStatus) 
    {
        this.applicantStatus = applicantStatus;
    }

    public Integer getApplicantStatus() 
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
            .append("supplierName", getSupplierName())
            .append("abbreviation", getAbbreviation())
            .append("companyAddress", getCompanyAddress())
            .append("companyPhone", getCompanyPhone())
            .append("contacts", getContacts())
            .append("contactNumber", getContactNumber())
            .append("depositBank", getDepositBank())
            .append("bankAccount", getBankAccount())
            .append("dutyParagraph", getDutyParagraph())
            .append("supplierClassification", getSupplierClassification())
            .append("supplierLevel", getSupplierLevel())
            .append("status", getStatus())
            .append("applicantId", getApplicantId())
            .append("applicantDate", getApplicantDate())
            .append("applicantStatus", getApplicantStatus())
            .append("approvedId", getApprovedId())
            .append("approvedDate", getApprovedDate())
            .append("approvedStatus", getApprovedStatus())
            .append("approvedComments", getApprovedComments())
            .append("remark", getRemark())
            .toString();
    }
}
