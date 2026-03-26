package com.zhonghui.mes.domain;

import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 制造执行MES-生产计划对象 mes_production_plan
 * 
 * @author yang
 * @date 2024-04-04
 */
public class MesProductionPlan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 计划号 */
    @Excel(name = "计划号")
    private String planNumber;

    /** 订单编号 */
    @Excel(name = "订单编号")
    private Long saleOrderId;

    /** 项目编号 */
    @Excel(name = "项目编号")
    private Long projectId;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 交货日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "交货日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deliveryDate;

    /** 申请人 */
    @Excel(name = "申请人")
    private Long applicant;

    /** 申请时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applicantDate;

    /** 申请状态:0未提交,1待审核,2已审核 */
    @Excel(name = "申请状态:0未提交,1待审核,2已审核")
    private Long applicantStatus;

    /** 审核人 */
    @Excel(name = "审核人")
    private Long reviewer;

    /** 审核时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "审核时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date reviewerDate;

    /** 审核意见 */
    @Excel(name = "审核意见")
    private String reviewComments;

    /** 审核状态:0驳回,1通过 */
    @Excel(name = "审核状态:0驳回,1通过")
    private Long reviewerStatus;


    private String saleOrderNo;
    private String projectName;
    private String applicantName;
    private String reviewerName;

    /** 制造执行MES-生产计划明细信息 */
    private List<MesProductionPlanItem> mesProductionPlanItemList;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPlanNumber(String planNumber) 
    {
        this.planNumber = planNumber;
    }

    public String getPlanNumber() 
    {
        return planNumber;
    }
    public void setSaleOrderId(Long saleOrderId) 
    {
        this.saleOrderId = saleOrderId;
    }

    public Long getSaleOrderId() 
    {
        return saleOrderId;
    }
    public void setProjectId(Long projectId) 
    {
        this.projectId = projectId;
    }

    public Long getProjectId() 
    {
        return projectId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setDeliveryDate(Date deliveryDate) 
    {
        this.deliveryDate = deliveryDate;
    }

    public Date getDeliveryDate() 
    {
        return deliveryDate;
    }
    public void setApplicant(Long applicant) 
    {
        this.applicant = applicant;
    }

    public Long getApplicant() 
    {
        return applicant;
    }
    public void setApplicantDate(Date applicantDate) 
    {
        this.applicantDate = applicantDate;
    }

    public Date getApplicantDate() 
    {
        return applicantDate;
    }
    public void setApplicantStatus(Long applicantStatus) 
    {
        this.applicantStatus = applicantStatus;
    }

    public Long getApplicantStatus() 
    {
        return applicantStatus;
    }
    public void setReviewer(Long reviewer) 
    {
        this.reviewer = reviewer;
    }

    public Long getReviewer() 
    {
        return reviewer;
    }
    public void setReviewerDate(Date reviewerDate) 
    {
        this.reviewerDate = reviewerDate;
    }

    public Date getReviewerDate() 
    {
        return reviewerDate;
    }
    public void setReviewComments(String reviewComments) 
    {
        this.reviewComments = reviewComments;
    }

    public String getReviewComments() 
    {
        return reviewComments;
    }
    public void setReviewerStatus(Long reviewerStatus) 
    {
        this.reviewerStatus = reviewerStatus;
    }

    public Long getReviewerStatus() 
    {
        return reviewerStatus;
    }

    public List<MesProductionPlanItem> getMesProductionPlanItemList()
    {
        return mesProductionPlanItemList;
    }

    public void setMesProductionPlanItemList(List<MesProductionPlanItem> mesProductionPlanItemList)
    {
        this.mesProductionPlanItemList = mesProductionPlanItemList;
    }

    public String getSaleOrderNo() {
        return saleOrderNo;
    }

    public void setSaleOrderNo(String saleOrderNo) {
        this.saleOrderNo = saleOrderNo;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("planNumber", getPlanNumber())
            .append("saleOrderId", getSaleOrderId())
            .append("projectId", getProjectId())
            .append("name", getName())
            .append("deliveryDate", getDeliveryDate())
            .append("applicant", getApplicant())
            .append("applicantDate", getApplicantDate())
            .append("applicantStatus", getApplicantStatus())
            .append("reviewer", getReviewer())
            .append("reviewerDate", getReviewerDate())
            .append("reviewComments", getReviewComments())
            .append("reviewerStatus", getReviewerStatus())
            .append("remark", getRemark())
            .append("mesProductionPlanItemList", getMesProductionPlanItemList())
            .toString();
    }
}
