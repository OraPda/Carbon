package com.zhonghui.scm.domain;

import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 供应链SCM-销售管理-销售订单对象 scm_sale_order
 * 
 * @author zhonghui
 * @date 2024-04-13
 */
public class ScmSaleOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    @Excel(name = "编号")
    private Long id;

    /** 订单编号 */
    @Excel(name = "订单编号")
    private String orderNo;

    /** 客户id */
    @Excel(name = "客户id")
    private Long customId;

    /** 金额合计 */
    @Excel(name = "金额合计")
    private BigDecimal totalAmount;

    /** 交货日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "交货日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deliveryDate;

    /** 申请人id */
    @Excel(name = "申请人id")
    private Long applyId;

    /** 申请时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applyDate;

    /** 申请状态 */
    @Excel(name = "申请状态")
    private Integer applyStatus;

    /** 审核人id */
    @Excel(name = "审核人id")
    private Long auditorId;

    /** 审核时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "审核时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date auditTime;

    /** 审核状态 */
    @Excel(name = "审核状态")
    private Integer auditStatus;

    /** 审核意见 */
    @Excel(name = "审核意见")
    private String auditComment;
    private String customName;
    /** 供应链SCM-销售管理-销售订单子信息 */
    private List<ScmSaleOrderItem> scmSaleOrderItemList;

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setOrderNo(String orderNo) 
    {
        this.orderNo = orderNo;
    }

    public String getOrderNo() 
    {
        return orderNo;
    }
    public void setCustomId(Long customId) 
    {
        this.customId = customId;
    }

    public Long getCustomId() 
    {
        return customId;
    }
    public void setTotalAmount(BigDecimal totalAmount) 
    {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getTotalAmount() 
    {
        return totalAmount;
    }
    public void setDeliveryDate(Date deliveryDate) 
    {
        this.deliveryDate = deliveryDate;
    }

    public Date getDeliveryDate() 
    {
        return deliveryDate;
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
    public void setApplyStatus(Integer applyStatus) 
    {
        this.applyStatus = applyStatus;
    }

    public Integer getApplyStatus() 
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
    public void setAuditStatus(Integer auditStatus) 
    {
        this.auditStatus = auditStatus;
    }

    public Integer getAuditStatus() 
    {
        return auditStatus;
    }
    public void setAuditComment(String auditComment) 
    {
        this.auditComment = auditComment;
    }

    public String getAuditComment() 
    {
        return auditComment;
    }

    public List<ScmSaleOrderItem> getScmSaleOrderItemList()
    {
        return scmSaleOrderItemList;
    }

    public void setScmSaleOrderItemList(List<ScmSaleOrderItem> scmSaleOrderItemList)
    {
        this.scmSaleOrderItemList = scmSaleOrderItemList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("orderNo", getOrderNo())
            .append("customId", getCustomId())
            .append("totalAmount", getTotalAmount())
            .append("deliveryDate", getDeliveryDate())
            .append("applyId", getApplyId())
            .append("applyDate", getApplyDate())
            .append("applyStatus", getApplyStatus())
            .append("auditorId", getAuditorId())
            .append("auditTime", getAuditTime())
            .append("auditStatus", getAuditStatus())
            .append("auditComment", getAuditComment())
            .append("remark", getRemark())
            .append("scmSaleOrderItemList", getScmSaleOrderItemList())
            .toString();
    }
}
