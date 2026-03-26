package com.zhonghui.mes.domain;

import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 制造执行MES-生产作业明细对象 mes_job_assembly_item
 * 
 * @author yang
 * @date 2024-04-10
 */
public class MesJobAssemblyItem extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 作业编号 */
    @Excel(name = "作业编号")
    private Long jobId;

    /** 物料档案编号 */
    @Excel(name = "物料档案编号")
    private Long materialId;

    /** 消耗数量 */
    @Excel(name = "消耗数量")
    private Long usageQuantity;


    private String serialNo;
    private String planNumber;
    private String subMaterialName;
    private String subMaterialModel;
    private String subMaterialSpecifications;
    private String subMaterialUnit;


    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setJobId(Long jobId) 
    {
        this.jobId = jobId;
    }

    public Long getJobId() 
    {
        return jobId;
    }
    public void setMaterialId(Long materialId) 
    {
        this.materialId = materialId;
    }

    public Long getMaterialId() 
    {
        return materialId;
    }
    public void setUsageQuantity(Long usageQuantity) 
    {
        this.usageQuantity = usageQuantity;
    }

    public Long getUsageQuantity() 
    {
        return usageQuantity;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getPlanNumber() {
        return planNumber;
    }

    public void setPlanNumber(String planNumber) {
        this.planNumber = planNumber;
    }

    public String getSubMaterialName() {
        return subMaterialName;
    }

    public void setSubMaterialName(String subMaterialName) {
        this.subMaterialName = subMaterialName;
    }

    public String getSubMaterialModel() {
        return subMaterialModel;
    }

    public void setSubMaterialModel(String subMaterialModel) {
        this.subMaterialModel = subMaterialModel;
    }

    public String getSubMaterialSpecifications() {
        return subMaterialSpecifications;
    }

    public void setSubMaterialSpecifications(String subMaterialSpecifications) {
        this.subMaterialSpecifications = subMaterialSpecifications;
    }

    public String getSubMaterialUnit() {
        return subMaterialUnit;
    }

    public void setSubMaterialUnit(String subMaterialUnit) {
        this.subMaterialUnit = subMaterialUnit;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("jobId", getJobId())
            .append("materialId", getMaterialId())
            .append("usageQuantity", getUsageQuantity())
            .append("remark", getRemark())
            .toString();
    }
}
