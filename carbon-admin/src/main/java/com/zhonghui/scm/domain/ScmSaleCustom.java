package com.zhonghui.scm.domain;

import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 供应链SCM-销售管理-客户档案对象 scm_sale_custom
 * 
 * @author yang
 * @date 2024-04-13
 */
public class ScmSaleCustom extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String customName;

    /** 公司地址 */
    @Excel(name = "公司地址")
    private String address;

    /** 联系人 */
    @Excel(name = "联系人")
    private String linkman;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String linkmanPhoneNumber;

    /** 客户分类,0-核心客户,1-普通客户 */
    @Excel(name = "客户分类,0-核心客户,1-普通客户")
    private Long customType;

    /** 信用等级 */
    @Excel(name = "信用等级")
    private Long creditLevel;

    /** 状态 */
    @Excel(name = "状态")
    private Long status;

    /** 简称 */
    @Excel(name = "简称")
    private String abbreviation;

    /** 邮编 */
    @Excel(name = "邮编")
    private String zipCode;

    /** 电话 */
    @Excel(name = "电话")
    private String phoneNumber;

    /** 开户银行 */
    @Excel(name = "开户银行")
    private String accountsBank;

    /** 银行账号 */
    @Excel(name = "银行账号")
    private String bankAccount;

    /** 税号 */
    @Excel(name = "税号")
    private String taxId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCustomName(String customName) 
    {
        this.customName = customName;
    }

    public String getCustomName() 
    {
        return customName;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setLinkman(String linkman) 
    {
        this.linkman = linkman;
    }

    public String getLinkman() 
    {
        return linkman;
    }
    public void setLinkmanPhoneNumber(String linkmanPhoneNumber) 
    {
        this.linkmanPhoneNumber = linkmanPhoneNumber;
    }

    public String getLinkmanPhoneNumber() 
    {
        return linkmanPhoneNumber;
    }
    public void setCustomType(Long customType) 
    {
        this.customType = customType;
    }

    public Long getCustomType() 
    {
        return customType;
    }
    public void setCreditLevel(Long creditLevel) 
    {
        this.creditLevel = creditLevel;
    }

    public Long getCreditLevel() 
    {
        return creditLevel;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }
    public void setAbbreviation(String abbreviation) 
    {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() 
    {
        return abbreviation;
    }
    public void setZipCode(String zipCode) 
    {
        this.zipCode = zipCode;
    }

    public String getZipCode() 
    {
        return zipCode;
    }
    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }
    public void setAccountsBank(String accountsBank) 
    {
        this.accountsBank = accountsBank;
    }

    public String getAccountsBank() 
    {
        return accountsBank;
    }
    public void setBankAccount(String bankAccount) 
    {
        this.bankAccount = bankAccount;
    }

    public String getBankAccount() 
    {
        return bankAccount;
    }
    public void setTaxId(String taxId) 
    {
        this.taxId = taxId;
    }

    public String getTaxId() 
    {
        return taxId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("customName", getCustomName())
            .append("address", getAddress())
            .append("linkman", getLinkman())
            .append("linkmanPhoneNumber", getLinkmanPhoneNumber())
            .append("customType", getCustomType())
            .append("creditLevel", getCreditLevel())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .append("abbreviation", getAbbreviation())
            .append("zipCode", getZipCode())
            .append("phoneNumber", getPhoneNumber())
            .append("accountsBank", getAccountsBank())
            .append("bankAccount", getBankAccount())
            .append("taxId", getTaxId())
            .append("remark", getRemark())
            .toString();
    }
}
