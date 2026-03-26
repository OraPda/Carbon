package com.zhonghui.scm.domain;

import java.math.BigDecimal;
import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 供应链SCM-销售管理-销售合同子对象 scm_sale_contract_item
 * 
 * @author zhonghui
 * @date 2024-04-12
 */
public class ScmSaleContractItem extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 销售合同id */
    private Long contractId;

    /** 物料id */
    private Long materialId;

    /** 订货数量 */
    @Excel(name = "订货数量")
    private Long orderQuantity;
    private String OrderNo;
    private String SubDeliveryDate;
    private String subCustomName;
    private String subApplyName;
    private String subAuditName;
    private String linkman;
    private String linkmanPhoneNumber;
    private String materialName;
    private String materialModel;
    private String materialSpecifications;
    private String materialUnit;
    private String materialPrice;
    /** 金额 */
    @Excel(name = "金额")
    private BigDecimal amount;

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMaterialModel() {
        return materialModel;
    }

    public void setMaterialModel(String materialModel) {
        this.materialModel = materialModel;
    }

    public String getMaterialSpecifications() {
        return materialSpecifications;
    }

    public void setMaterialSpecifications(String materialSpecifications) {
        this.materialSpecifications = materialSpecifications;
    }

    public String getMaterialUnit() {
        return materialUnit;
    }

    public void setMaterialUnit(String materialUnit) {
        this.materialUnit = materialUnit;
    }

    public String getMaterialPrice() {
        return materialPrice;
    }

    public void setMaterialPrice(String materialPrice) {
        this.materialPrice = materialPrice;
    }

    public String getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(String subOrderNo) {
        this.OrderNo = OrderNo;
    }

    public String getSubDeliveryDate() {
        return SubDeliveryDate;
    }

    public void setSubDeliveryDate(String SubDeliveryDate) {
        this.SubDeliveryDate = SubDeliveryDate;
    }

    public String getSubCustomName() {
        return subCustomName;
    }

    public void setSubCustomName(String subCustomName) {
        this.subCustomName = subCustomName;
    }

    public String getSubApplyName() {
        return subApplyName;
    }

    public void setSubApplyName(String subApplyName) {
        this.subApplyName = subApplyName;
    }

    public String getSubAuditName() {
        return subAuditName;
    }

    public void setSubAuditName(String subAuditName) {
        this.subAuditName = subAuditName;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setContractId(Long contractId) 
    {
        this.contractId = contractId;
    }

    public Long getContractId() 
    {
        return contractId;
    }
    public void setMaterialId(Long materialId) 
    {
        this.materialId = materialId;
    }

    public Long getMaterialId() 
    {
        return materialId;
    }
    public void setOrderQuantity(Long orderQuantity) 
    {
        this.orderQuantity = orderQuantity;
    }

    public Long getOrderQuantity() 
    {
        return orderQuantity;
    }
    public void setAmount(BigDecimal amount) 
    {
        this.amount = amount;
    }

    public BigDecimal getAmount() 
    {
        return amount;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getLinkmanPhoneNumber() {
        return linkmanPhoneNumber;
    }

    public void setLinkmanPhoneNumber(String linkmanPhoneNumber) {
        this.linkmanPhoneNumber = linkmanPhoneNumber;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("contractId", getContractId())
            .append("materialId", getMaterialId())
            .append("orderQuantity", getOrderQuantity())
            .append("amount", getAmount())
            .append("remark", getRemark())
            .toString();
    }
}
