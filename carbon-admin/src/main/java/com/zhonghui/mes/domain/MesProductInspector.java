package com.zhonghui.mes.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 制造执行MES-质量管理-产品检验
 对象 mes_product_inspector
 *
 * @author yang
 * @date 2024-04-11
 */
public class MesProductInspector extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    @Excel(name = "编号")
    private Long id;

    /** 流水号 */
    @Excel(name = "流水号")
    private String serialNumber;

    /** 完工单号 */
    @Excel(name = "完工单号")
    private Long productionCompletionId;

    /** 标准ID */
    private Long standardsId;

    /** 抽检数量 */
    @Excel(name = "抽检数量")
    private Long sampleQuantity;

    /** 检验值 */
    private Long inspectionValue;

    /** 检验结果(0-不合格,1-合格) */
    @Excel(name = "检验结果(0-不合格,1-合格)")
    private Integer result;

    /** 检验人 */
    @Excel(name = "检验人")
    private Long checkUserId;

    private String checkItem;
    private String oddNumbers;
    private String jobName;
    private String manufactureDate;
    private String planNumber;
    private String productionLine;
    private String materialName;
    private String checkUserName;
    private String lowerLimit;
    private String upLimit;
    private String batchNumber;
    private String quantity;
    /** 检验时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "检验时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date inspectorTime;

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getCheckItem() {
        return checkItem;
    }

    public void setCheckItem(String checkItem) {
        this.checkItem = checkItem;
    }

    public String getOddNumbers() {
        return oddNumbers;
    }

    public void setOddNumbers(String oddNumbers) {
        this.oddNumbers = oddNumbers;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getPlanNumber() {
        return planNumber;
    }

    public void setPlanNumber(String planNumber) {
        this.planNumber = planNumber;
    }

    public String getProductionLine() {
        return productionLine;
    }

    public void setProductionLine(String productionLine) {
        this.productionLine = productionLine;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getCheckUserName() {
        return checkUserName;
    }

    public void setCheckUserName(String checkUserName) {
        this.checkUserName = checkUserName;
    }

    public String getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(String lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public String getUpLimit() {
        return upLimit;
    }

    public void setUpLimit(String upLimit) {
        this.upLimit = upLimit;
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
    public void setProductionCompletionId(Long productionCompletionId)
    {
        this.productionCompletionId = productionCompletionId;
    }

    public Long getProductionCompletionId()
    {
        return productionCompletionId;
    }
    public void setStandardsId(Long standardsId)
    {
        this.standardsId = standardsId;
    }

    public Long getStandardsId()
    {
        return standardsId;
    }
    public void setSampleQuantity(Long sampleQuantity)
    {
        this.sampleQuantity = sampleQuantity;
    }

    public Long getSampleQuantity()
    {
        return sampleQuantity;
    }
    public void setInspectionValue(Long inspectionValue)
    {
        this.inspectionValue = inspectionValue;
    }

    public Long getInspectionValue()
    {
        return inspectionValue;
    }
    public void setResult(Integer result)
    {
        this.result = result;
    }

    public Integer getResult()
    {
        return result;
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
                .append("productionCompletionId", getProductionCompletionId())
                .append("standardsId", getStandardsId())
                .append("sampleQuantity", getSampleQuantity())
                .append("inspectionValue", getInspectionValue())
                .append("result", getResult())
                .append("checkUserId", getCheckUserId())
                .append("inspectorTime", getInspectorTime())
                .append("remark", getRemark())
                .toString();
    }
}
