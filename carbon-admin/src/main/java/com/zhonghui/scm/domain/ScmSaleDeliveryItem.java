package com.zhonghui.scm.domain;

import java.math.BigDecimal;
import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 供应链SCM-销售管理-销售发货子对象 scm_sale_delivery_item
 * 
 * @author yang
 * @date 2024-04-13
 */
public class ScmSaleDeliveryItem extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 销售退货id */
    @Excel(name = "销售退货id")
    private Long deliveryId;

    /** 物料id */
    @Excel(name = "物料id")
    private Long materialId;

    /** 价格 */
    @Excel(name = "价格")
    private BigDecimal amount;

    /** 订货数量 */
    @Excel(name = "订货数量")
    private Long orderQuantity;

    /** 发货数量 */
    @Excel(name = "发货数量")
    private Long deliveryNum;

    /** 退货数量 */
    @Excel(name = "退货数量")
    private Long returnNum;

    /** 备注 */
    @Excel(name = "备注")
    private String note;

    private String materialName;
    private String materialModel;
    private String materialSpecifications;
    private String materialUnit;
    private String materialPrice;



    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDeliveryId(Long deliveryId) 
    {
        this.deliveryId = deliveryId;
    }

    public Long getDeliveryId() 
    {
        return deliveryId;
    }
    public void setMaterialId(Long materialId) 
    {
        this.materialId = materialId;
    }

    public Long getMaterialId() 
    {
        return materialId;
    }
    public void setAmount(BigDecimal amount) 
    {
        this.amount = amount;
    }

    public BigDecimal getAmount() 
    {
        return amount;
    }
    public void setOrderQuantity(Long orderQuantity) 
    {
        this.orderQuantity = orderQuantity;
    }

    public Long getOrderQuantity() 
    {
        return orderQuantity;
    }
    public void setDeliveryNum(Long deliveryNum) 
    {
        this.deliveryNum = deliveryNum;
    }

    public Long getDeliveryNum() 
    {
        return deliveryNum;
    }
    public void setReturnNum(Long returnNum) 
    {
        this.returnNum = returnNum;
    }

    public Long getReturnNum() 
    {
        return returnNum;
    }
    public void setNote(String note) 
    {
        this.note = note;
    }

    public String getNote() 
    {
        return note;
    }

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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("deliveryId", getDeliveryId())
            .append("materialId", getMaterialId())
            .append("amount", getAmount())
            .append("orderQuantity", getOrderQuantity())
            .append("deliveryNum", getDeliveryNum())
            .append("returnNum", getReturnNum())
            .append("note", getNote())
            .toString();
    }
}
