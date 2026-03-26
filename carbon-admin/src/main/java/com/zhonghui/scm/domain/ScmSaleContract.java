package com.zhonghui.scm.domain;

import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 供应链SCM-销售管理-销售合同对象 scm_sale_contract
 * 
 * @author zhonghui
 * @date 2024-04-12
 */
public class ScmSaleContract extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    @Excel(name = "编号")
    private Long id;

    /** 合同编号 */
    private String contractNumber;

    /** 销售订单id */
    private Long orderId;

    /** 客户id */
    private Long customId;

    /** 送货方式 */
    private Integer shipping;

    /** 收货地址 */
    private String address;

    /** 签订日期 */
    private Date signingDate;

    /** 申请人id */
    @Excel(name = "申请人id")
    private Long applyId;

    /** 申请时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applyDate;

    /** 申请状态 */
    @Excel(name = "申请状态")
    private String applyStatus;

    /** 审核人id */
    @Excel(name = "审核人id")
    private Long auditorId;

    /** 审核时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "审核时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date auditTime;

    /** 审核状态 */
    @Excel(name = "审核状态")
    private String auditStatus;

    /** 金额合计 */
    @Excel(name = "金额合计")
    private Long totalAmount;

    /** 审核意见 */
    private String auditorComments;

    private String orderNo;
    private String deliveryDate;
    private String customName;
    private String linkman;
    private String applyName;
    private String auditorName;
    private String linkmanPhoneNumber;
    private String salesManId;
    /** 供应链SCM-销售管理-销售合同子信息 */
    private List<ScmSaleContractItem> scmSaleContractItemList;

    public String getSalesManId() {
        return salesManId;
    }

    public void setSalesManId(String salesManId) {
        this.salesManId = salesManId;
    }

    public String getLinkmanPhoneNumber() {
        return linkmanPhoneNumber;
    }

    public void setLinkmanPhoneNumber(String linkmanPhoneNumber) {
        this.linkmanPhoneNumber = linkmanPhoneNumber;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getApplyName() {
        return applyName;
    }

    public void setApplyName(String applyName) {
        this.applyName = applyName;
    }

    public String getAuditorName() {
        return auditorName;
    }

    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setContractNumber(String contractNumber) 
    {
        this.contractNumber = contractNumber;
    }

    public String getContractNumber() 
    {
        return contractNumber;
    }
    public void setOrderId(Long orderId) 
    {
        this.orderId = orderId;
    }

    public Long getOrderId() 
    {
        return orderId;
    }
    public void setCustomId(Long customId) 
    {
        this.customId = customId;
    }

    public Long getCustomId() 
    {
        return customId;
    }
    public void setShipping(Integer shipping) 
    {
        this.shipping = shipping;
    }

    public Integer getShipping() 
    {
        return shipping;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setSigningDate(Date signingDate) 
    {
        this.signingDate = signingDate;
    }

    public Date getSigningDate() 
    {
        return signingDate;
    }
    public void setApplyId(Long applyId) 
    {
        this.applyId = applyId;
    }

    public Long getApplyId() 
    {
        return applyId;
    }
    public void setApplyDate(Date applyDate) 
    {
        this.applyDate = applyDate;
    }

    public Date getApplyDate() 
    {
        return applyDate;
    }
    public void setApplyStatus(String applyStatus) 
    {
        this.applyStatus = applyStatus;
    }

    public String getApplyStatus() 
    {
        return applyStatus;
    }
    public void setAuditorId(Long auditorId) 
    {
        this.auditorId = auditorId;
    }

    public Long getAuditorId() 
    {
        return auditorId;
    }
    public void setAuditTime(Date auditTime) 
    {
        this.auditTime = auditTime;
    }

    public Date getAuditTime() 
    {
        return auditTime;
    }
    public void setAuditStatus(String auditStatus) 
    {
        this.auditStatus = auditStatus;
    }

    public String getAuditStatus() 
    {
        return auditStatus;
    }
    public void setTotalAmount(Long totalAmount) 
    {
        this.totalAmount = totalAmount;
    }

    public Long getTotalAmount() 
    {
        return totalAmount;
    }
    public void setAuditorComments(String auditorComments) 
    {
        this.auditorComments = auditorComments;
    }

    public String getAuditorComments() 
    {
        return auditorComments;
    }

    public List<ScmSaleContractItem> getScmSaleContractItemList()
    {
        return scmSaleContractItemList;
    }

    public void setScmSaleContractItemList(List<ScmSaleContractItem> scmSaleContractItemList)
    {
        this.scmSaleContractItemList = scmSaleContractItemList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("contractNumber", getContractNumber())
            .append("orderId", getOrderId())
            .append("customId", getCustomId())
            .append("shipping", getShipping())
            .append("address", getAddress())
            .append("signingDate", getSigningDate())
            .append("applyId", getApplyId())
            .append("applyDate", getApplyDate())
            .append("applyStatus", getApplyStatus())
            .append("auditorId", getAuditorId())
            .append("auditTime", getAuditTime())
            .append("auditStatus", getAuditStatus())
            .append("totalAmount", getTotalAmount())
            .append("auditorComments", getAuditorComments())
            .append("remark", getRemark())
            .append("scmSaleContractItemList", getScmSaleContractItemList())
            .toString();
    }
}
