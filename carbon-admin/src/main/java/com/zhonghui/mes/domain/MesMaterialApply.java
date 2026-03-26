package com.zhonghui.mes.domain;

import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.xml.crypto.Data;

/**
 * 制造执行MES-领料申请对象 mes_material_apply
 * 
 * @author yang
 * @date 2024-03-31
 */
public class MesMaterialApply extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    @Excel(name = "编号")
    private Long id;

    /** 领料单号 */
    @Excel(name = "领料单号")
    private String oddNumber;

    /** 计划排产id */
    @Excel(name = "计划排产id")
    private Long plannedProductionId;

    /** 领取日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "领取日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date collectionDate;

    /** 申请人id */
    @Excel(name = "申请人id")
    private Long applicant;

    /** 申请时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applicantDate;

    /** 申请状态:0未提交,1待审核,2已审核 */
    @Excel(name = "申请状态:0未提交,1待审核,2已审核")
    private Long applicantStatus;

    /** 审核人id */
    @Excel(name = "审核人id")
    private Long reviewer;

    /** 审核时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "审核时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date reviewerDate;

    /** 审核状态:0驳回,1通过 */
    @Excel(name = "审核状态:0驳回,1通过")
    private Long reviewerStatus;

    /** 审核意见 */
    @Excel(name = "审核意见")
    private String reviewComments;

    /** 状态:0未领料,1已领料,2已领料未检验,3已领料检验合格,4已领料检验未合格 */
    @Excel(name = "状态:0未领料,1已领料,2已领料未检验,3已领料检验合格,4已领料检验未合格")
    private Long status;

    /** 申请人审核人 */

    private String userName;

    /** 计划排产 */

    private String serialNo;

    /** 待产数量*/

    private String producedQuantity;

    /** 生产日期 */

    private Date manufactureDate;
    /** 产品名称 */

    private String materialName;

    /** 计划号*/
    private String planNumber;

    /**申请人*/
    private String applicantName;

    /**审核人*/
    private String reviewerName;


    /** 产品型号 */

    private String materialModel;

    /** 产品规格 */

    private String materialSpecifications;

    /** 产品单位 */

    private String materialUnit;

    public String getPlanNumber() {
        return planNumber;
    }

    public void setPlanNumber(String planNumber) {
        this.planNumber = planNumber;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getProducedQuantity() {
        return producedQuantity;
    }

    public void setProducedQuantity(String producedQuantity) {
        this.producedQuantity = producedQuantity;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    /** 制造执行MES-领料申请明细信息 */
    private List<MesMaterialApplyItem> mesMaterialApplyItemList;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setOddNumber(String oddNumber) 
    {
        this.oddNumber = oddNumber;
    }

    public String getOddNumber() 
    {
        return oddNumber;
    }
    public void setPlannedProductionId(Long plannedProductionId) 
    {
        this.plannedProductionId = plannedProductionId;
    }

    public Long getPlannedProductionId() 
    {
        return plannedProductionId;
    }
    public void setCollectionDate(Date collectionDate) 
    {
        this.collectionDate = collectionDate;
    }

    public Date getCollectionDate() 
    {
        return collectionDate;
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
    public void setReviewerStatus(Long reviewerStatus) 
    {
        this.reviewerStatus = reviewerStatus;
    }

    public Long getReviewerStatus() 
    {
        return reviewerStatus;
    }
    public void setReviewComments(String reviewComments) 
    {
        this.reviewComments = reviewComments;
    }

    public String getReviewComments() 
    {
        return reviewComments;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    public List<MesMaterialApplyItem> getMesMaterialApplyItemList()
    {
        return mesMaterialApplyItemList;
    }

    public void setMesMaterialApplyItemList(List<MesMaterialApplyItem> mesMaterialApplyItemList)
    {
        this.mesMaterialApplyItemList = mesMaterialApplyItemList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("oddNumber", getOddNumber())
            .append("plannedProductionId", getPlannedProductionId())
            .append("collectionDate", getCollectionDate())
            .append("applicant", getApplicant())
            .append("applicantDate", getApplicantDate())
            .append("applicantStatus", getApplicantStatus())
            .append("reviewer", getReviewer())
            .append("reviewerDate", getReviewerDate())
            .append("reviewerStatus", getReviewerStatus())
            .append("reviewComments", getReviewComments())
            .append("status", getStatus())
            .append("remark", getRemark())
            .append("mesMaterialApplyItemList", getMesMaterialApplyItemList())
            .toString();
    }
}
