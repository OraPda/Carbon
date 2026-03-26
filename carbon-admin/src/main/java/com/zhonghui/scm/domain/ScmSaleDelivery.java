package com.zhonghui.scm.domain;

import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 供应链SCM-销售管理-销售发货对象 scm_sale_delivery
 * 
 * @author yang
 * @date 2024-04-13
 */
public class ScmSaleDelivery extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 发货单号 */
    @Excel(name = "发货单号")
    private String deliveryNo;

    /** 合同编号 */
    @Excel(name = "合同编号")
    private Long contractId;

    /** 客户id */
    @Excel(name = "客户id")
    private Long customId;

    /** 送货方式 */
    @Excel(name = "送货方式")
    private Long shipping;

    /** 交货日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "交货日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deliveryDate;

    /** 收货地址 */
    @Excel(name = "收货地址")
    private String address;

    /** 联系人 */
    @Excel(name = "联系人")
    private String linkman;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String contactWay;

    /** 出库状态 */
    @Excel(name = "出库状态")
    private String status;


    private String contractNo;


    private String customName;


    /** 供应链SCM-销售管理-销售发货子信息 */
    private List<ScmSaleDeliveryItem> scmSaleDeliveryItemList;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDeliveryNo(String deliveryNo) 
    {
        this.deliveryNo = deliveryNo;
    }

    public String getDeliveryNo() 
    {
        return deliveryNo;
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
    public void setShipping(Long shipping) 
    {
        this.shipping = shipping;
    }

    public Long getShipping() 
    {
        return shipping;
    }
    public void setDeliveryDate(Date deliveryDate) 
    {
        this.deliveryDate = deliveryDate;
    }

    public Date getDeliveryDate() 
    {
        return deliveryDate;
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
    public void setContactWay(String contactWay) 
    {
        this.contactWay = contactWay;
    }

    public String getContactWay() 
    {
        return contactWay;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    public List<ScmSaleDeliveryItem> getScmSaleDeliveryItemList()
    {
        return scmSaleDeliveryItemList;
    }

    public void setScmSaleDeliveryItemList(List<ScmSaleDeliveryItem> scmSaleDeliveryItemList)
    {
        this.scmSaleDeliveryItemList = scmSaleDeliveryItemList;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("deliveryNo", getDeliveryNo())
            .append("contractId", getContractId())
            .append("customId", getCustomId())
            .append("shipping", getShipping())
            .append("deliveryDate", getDeliveryDate())
            .append("address", getAddress())
            .append("linkman", getLinkman())
            .append("contactWay", getContactWay())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .append("remark", getRemark())
            .append("scmSaleDeliveryItemList", getScmSaleDeliveryItemList())
            .toString();
    }
}
