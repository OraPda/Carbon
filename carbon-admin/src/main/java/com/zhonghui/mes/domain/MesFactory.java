package com.zhonghui.mes.domain;

import java.util.List;
import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 制造执行MES-工厂建模对象 mes_factory
 * 
 * @author yang
 * @date 2024-04-04
 */
public class MesFactory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private String id;

    /** 生产线名称 */
    @Excel(name = "生产线名称")
    private String productionLine;

    /** 描述 */
    @Excel(name = "描述")
    private String factoryDescribe;

    /** 物料ID */
    @Excel(name = "物料ID")
    private Long materialId;

    /** 制造执行MES-工厂建模设备信息子信息 */
    private List<MesFactoryDeviceItem> mesFactoryDeviceItemList;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setProductionLine(String productionLine) 
    {
        this.productionLine = productionLine;
    }

    public String getProductionLine() 
    {
        return productionLine;
    }
    public void setFactoryDescribe(String factoryDescribe) 
    {
        this.factoryDescribe = factoryDescribe;
    }

    public String getFactoryDescribe() 
    {
        return factoryDescribe;
    }
    public void setMaterialId(Long materialId) 
    {
        this.materialId = materialId;
    }

    public Long getMaterialId() 
    {
        return materialId;
    }

    public List<MesFactoryDeviceItem> getMesFactoryDeviceItemList()
    {
        return mesFactoryDeviceItemList;
    }

    public void setMesFactoryDeviceItemList(List<MesFactoryDeviceItem> mesFactoryDeviceItemList)
    {
        this.mesFactoryDeviceItemList = mesFactoryDeviceItemList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("productionLine", getProductionLine())
            .append("factoryDescribe", getFactoryDescribe())
            .append("materialId", getMaterialId())
            .append("mesFactoryDeviceItemList", getMesFactoryDeviceItemList())
            .toString();
    }
}
