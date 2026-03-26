package com.zhonghui.mes.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 制造执行MES-生产完工单对象 mes_production_completion
 * 
 * @author yang
 * @date 2024-04-09
 */
public class MesProductionCompletion extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    @Excel(name = "编号")
    private Long id;

    /** 单号 */
    @Excel(name = "单号")
    private String oddNumbers;

    /** 生产作业id */
    @Excel(name = "生产作业id")
    private Long jobId;

    /** 产品id */
    private Long materialId;

    /** 完工日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "完工日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date completionDate;

    /** 生产数量 */
    @Excel(name = "生产数量")
    private Long quantity;

    /** 生产批号 */
    @Excel(name = "生产批号")
    private String batchNumber;

    /** 状态 */
    @Excel(name = "状态")
    private Long status;

    private String materialName;
    private String materialModel;
    private String materialSpecifications;
    private String materialUnit;
    private String productionName;
    private String jobName;
    private String planNumber;


    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setOddNumbers(String oddNumbers) 
    {
        this.oddNumbers = oddNumbers;
    }

    public String getOddNumbers() 
    {
        return oddNumbers;
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
    public void setCompletionDate(Date completionDate) 
    {
        this.completionDate = completionDate;
    }

    public Date getCompletionDate() 
    {
        return completionDate;
    }
    public void setQuantity(Long quantity) 
    {
        this.quantity = quantity;
    }

    public Long getQuantity() 
    {
        return quantity;
    }
    public void setBatchNumber(String batchNumber) 
    {
        this.batchNumber = batchNumber;
    }

    public String getBatchNumber() 
    {
        return batchNumber;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
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

    public String getProductionName() {
        return productionName;
    }

    public void setProductionName(String productionName) {
        this.productionName = productionName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getPlanNumber() {
        return planNumber;
    }

    public void setPlanNumber(String planNumber) {
        this.planNumber = planNumber;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("oddNumbers", getOddNumbers())
            .append("jobId", getJobId())
            .append("materialId", getMaterialId())
            .append("completionDate", getCompletionDate())
            .append("quantity", getQuantity())
            .append("batchNumber", getBatchNumber())
            .append("status", getStatus())
            .append("remark", getRemark())
            .toString();
    }
}
