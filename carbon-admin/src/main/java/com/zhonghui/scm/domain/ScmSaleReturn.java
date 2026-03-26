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
 * 供应链SCM-销售管理-销售退货对象 scm_sale_return
 * 
 * @author yang
 * @date 2024-04-13
 */
public class ScmSaleReturn extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    @Excel(name = "编号")
    private Long id;

    /** 退货单号 */
    @Excel(name = "退货单号")
    private String returnNo;

    /** 发货id */
    private Long deliveryId;

    /** 合同id */
    private Long contractId;

    /** 客户id */
    private Long customId;

    /** 退货日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "退货日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date returnDate;

    /** 退货金额 */
    @Excel(name = "退货金额")
    private BigDecimal returnAmount;

    /** 退货原因 */
    private String reason;

    /** 入库状态:0未入库,1已入库,2入库中 */
    @Excel(name = "入库状态:0未入库,1已入库,2入库中")
    private Long status;

    private String deliveryNo;
    private String shipping;
    private String contractNumber;
    private String customName;
    private String deliveryDate;


    /** 供应链SCM-销售管理-销售退货子信息 */
    private List<ScmSaleReturnItem> scmSaleReturnItemList;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setReturnNo(String returnNo) 
    {
        this.returnNo = returnNo;
    }

    public String getReturnNo() 
    {
        return returnNo;
    }
    public void setDeliveryId(Long deliveryId) 
    {
        this.deliveryId = deliveryId;
    }

    public Long getDeliveryId() 
    {
        return deliveryId;
    }
    public void setContractId(Long contractId) 
    {
        this.contractId = contractId;
    }

    public Long getContractId() 
    {
        return contractId;
    }
    public void setCustomId(Long customId) 
    {
        this.customId = customId;
    }

    public Long getCustomId() 
    {
        return customId;
    }
    public void setReturnDate(Date returnDate) 
    {
        this.returnDate = returnDate;
    }

    public Date getReturnDate() 
    {
        return returnDate;
    }
    public void setReturnAmount(BigDecimal returnAmount) 
    {
        this.returnAmount = returnAmount;
    }

    public BigDecimal getReturnAmount() 
    {
        return returnAmount;
    }
    public void setReason(String reason) 
    {
        this.reason = reason;
    }

    public String getReason() 
    {
        return reason;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    public List<ScmSaleReturnItem> getScmSaleReturnItemList()
    {
        return scmSaleReturnItemList;
    }

    public void setScmSaleReturnItemList(List<ScmSaleReturnItem> scmSaleReturnItemList)
    {
        this.scmSaleReturnItemList = scmSaleReturnItemList;
    }

    public String getDeliveryNo() {
        return deliveryNo;
    }

    public void setDeliveryNo(String deliveryNo) {
        this.deliveryNo = deliveryNo;
    }

    public String getShipping() {
        return shipping;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("returnNo", getReturnNo())
            .append("deliveryId", getDeliveryId())
            .append("contractId", getContractId())
            .append("customId", getCustomId())
            .append("returnDate", getReturnDate())
            .append("returnAmount", getReturnAmount())
            .append("reason", getReason())
            .append("status", getStatus())
            .append("remark", getRemark())
            .append("scmSaleReturnItemList", getScmSaleReturnItemList())
            .toString();
    }
}
