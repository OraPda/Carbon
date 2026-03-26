package com.zhonghui.mes.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 制造执行MES-质量管理-生产采样对象 mes_production_sampling
 * 
 * @author zhonghui
 * @date 2024-04-11
 */
public class MesProductionSampling extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    @Excel(name = "编号")
    private Long id;

    /** 流水号 */
    @Excel(name = "流水号")
    private String serialNumber;

    /** 作业装配id */
    private Long jobId;

    /** 物料id */
    private Long materialId;

    /** 检验标准id */
    private Long inspectionId;

    /** 生产数量 */
    @Excel(name = "生产数量")
    private Long quantity;

    /** 采样数量 */
    @Excel(name = "采样数量")
    private Long samplesNumber;

    /** 检验值 */
    @Excel(name = "检验值")
    private Long inspectionValue;

    /** 检验结果 */
    @Excel(name = "检验结果")
    private Integer inspectionResults;

    /** 检验人 */
    @Excel(name = "检验人")
    private Long checkUserId;

    private String jobName;
    private String materialName;
    private String materialModel;
    private String materialSpecifications;
    private String materialUnit;
    private String planNumber;
    private String checkItem;
    private String upLimit;
    private String lowerLimit;
    private String userName;
    private String checkUserName;
    /** 检验时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "检验时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date inspectorTime;

    public String getCheckUserName() {
        return checkUserName;
    }

    public void setCheckUserName(String checkUserName) {
        this.checkUserName = checkUserName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
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

    public String getPlanNumber() {
        return planNumber;
    }

    public void setPlanNumber(String planNumber) {
        this.planNumber = planNumber;
    }

    public String getCheckItem() {
        return checkItem;
    }

    public void setCheckItem(String checkItem) {
        this.checkItem = checkItem;
    }

    public String getUpLimit() {
        return upLimit;
    }

    public void setUpLimit(String upLimit) {
        this.upLimit = upLimit;
    }

    public String getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(String lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSerialNumber(String serialNumber) 
    {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() 
    {
        return serialNumber;
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
    public void setInspectionId(Long inspectionId) 
    {
        this.inspectionId = inspectionId;
    }

    public Long getInspectionId() 
    {
        return inspectionId;
    }
    public void setQuantity(Long quantity) 
    {
        this.quantity = quantity;
    }

    public Long getQuantity() 
    {
        return quantity;
    }
    public void setSamplesNumber(Long samplesNumber) 
    {
        this.samplesNumber = samplesNumber;
    }

    public Long getSamplesNumber() 
    {
        return samplesNumber;
    }
    public void setInspectionValue(Long inspectionValue) 
    {
        this.inspectionValue = inspectionValue;
    }

    public Long getInspectionValue() 
    {
        return inspectionValue;
    }
    public void setInspectionResults(Integer inspectionResults) 
    {
        this.inspectionResults = inspectionResults;
    }

    public Integer getInspectionResults() 
    {
        return inspectionResults;
    }
    public void setCheckUserId(Long checkUserId) 
    {
        this.checkUserId = checkUserId;
    }

    public Long getCheckUserId() 
    {
        return checkUserId;
    }
    public void setInspectorTime(Date inspectorTime) 
    {
        this.inspectorTime = inspectorTime;
    }

    public Date getInspectorTime() 
    {
        return inspectorTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("serialNumber", getSerialNumber())
            .append("jobId", getJobId())
            .append("materialId", getMaterialId())
            .append("inspectionId", getInspectionId())
            .append("quantity", getQuantity())
            .append("samplesNumber", getSamplesNumber())
            .append("inspectionValue", getInspectionValue())
            .append("inspectionResults", getInspectionResults())
            .append("checkUserId", getCheckUserId())
            .append("inspectorTime", getInspectorTime())
            .append("remark", getRemark())
            .toString();
    }
}
