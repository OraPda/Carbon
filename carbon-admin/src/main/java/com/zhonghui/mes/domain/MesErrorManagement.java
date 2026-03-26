package com.zhonghui.mes.domain;

import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 制造执行MES-质量管理-防错管理对象 mes_error_management
 * 
 * @author yang
 * @date 2024-04-12
 */
public class MesErrorManagement extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 错误项 */
    @Excel(name = "错误项")
    private String errorItem;

    /** 错误类型 */
    @Excel(name = "错误类型")
    private Long errorType;

    /** 导致结果 */
    private String result;

    /** 预防手段 */
    private String preventiveMeasures;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setErrorItem(String errorItem) 
    {
        this.errorItem = errorItem;
    }

    public String getErrorItem() 
    {
        return errorItem;
    }
    public void setErrorType(Long errorType) 
    {
        this.errorType = errorType;
    }

    public Long getErrorType() 
    {
        return errorType;
    }
    public void setResult(String result) 
    {
        this.result = result;
    }

    public String getResult() 
    {
        return result;
    }
    public void setPreventiveMeasures(String preventiveMeasures) 
    {
        this.preventiveMeasures = preventiveMeasures;
    }

    public String getPreventiveMeasures() 
    {
        return preventiveMeasures;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("errorItem", getErrorItem())
            .append("errorType", getErrorType())
            .append("result", getResult())
            .append("preventiveMeasures", getPreventiveMeasures())
            .toString();
    }
}
