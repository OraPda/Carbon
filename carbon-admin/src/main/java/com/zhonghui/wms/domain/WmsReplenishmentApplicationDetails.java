package com.zhonghui.wms.domain;

import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 智能仓储WMS-补货申请明细对象 wms_replenishment_application_details
 * 
 * @author zhonghui
 * @date 2024-04-12
 */
public class WmsReplenishmentApplicationDetails extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 补货申请明细ID */
    private Long id;

    /** 补货申请ID */
    @Excel(name = "补货申请ID")
    private Long replenishmentApplicationId;

    /** 物料ID */
    @Excel(name = "物料ID")
    private Long materialId;

    /** 补货数量 */
    @Excel(name = "补货数量")
    private Long replenishmentNumber;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setReplenishmentApplicationId(Long replenishmentApplicationId) 
    {
        this.replenishmentApplicationId = replenishmentApplicationId;
    }

    public Long getReplenishmentApplicationId() 
    {
        return replenishmentApplicationId;
    }
    public void setMaterialId(Long materialId) 
    {
        this.materialId = materialId;
    }

    public Long getMaterialId() 
    {
        return materialId;
    }
    public void setReplenishmentNumber(Long replenishmentNumber) 
    {
        this.replenishmentNumber = replenishmentNumber;
    }

    public Long getReplenishmentNumber() 
    {
        return replenishmentNumber;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("replenishmentApplicationId", getReplenishmentApplicationId())
            .append("materialId", getMaterialId())
            .append("replenishmentNumber", getReplenishmentNumber())
            .append("remark", getRemark())
            .toString();
    }
}
