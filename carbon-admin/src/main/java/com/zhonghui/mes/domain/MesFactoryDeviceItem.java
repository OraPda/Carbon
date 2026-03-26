package com.zhonghui.mes.domain;

import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 制造执行MES-工厂建模设备信息子对象 mes_factory_device_item
 * 
 * @author yang
 * @date 2024-04-04
 */
public class MesFactoryDeviceItem extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private String id;

    /** 工厂建模ID */
    @Excel(name = "工厂建模ID")
    private Long factoryId;

    /** 设备ID */
    @Excel(name = "设备ID")
    private Long deviceId;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setFactoryId(Long factoryId) 
    {
        this.factoryId = factoryId;
    }

    public Long getFactoryId() 
    {
        return factoryId;
    }
    public void setDeviceId(Long deviceId) 
    {
        this.deviceId = deviceId;
    }

    public Long getDeviceId() 
    {
        return deviceId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("factoryId", getFactoryId())
            .append("deviceId", getDeviceId())
            .toString();
    }
}
