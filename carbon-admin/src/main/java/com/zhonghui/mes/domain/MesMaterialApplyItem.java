package com.zhonghui.mes.domain;

import com.zhonghui.common.annotation.Excel;
import com.zhonghui.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 制造执行MES-领料申请明细对象 mes_material_apply_item
 *
 * @author yang
 * @date 2024-03-31
 */
public class MesMaterialApplyItem extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Long id;

    /** 领料申请id */
    @Excel(name = "领料申请id")
    private Long applyId;

    /** 物料档案id */
    @Excel(name = "物料档案id")
    private Long materialId;

    /** 需求数量 */
    @Excel(name = "需求数量")
    private Long dosage;

    /** 已领数量 */
    @Excel(name = "已领数量")
    private Long receivedQuantity;

    /** 申请人审核人 */

    private String subUserName;

    /** 计划排产 */

    private String subSerialNo;

    /** 待产数量*/

    private String subProducedQuantity;

    /** 生产日期 */

    private Date subManufactureDate;
    /** 产品名称 */

    private String subMaterialName;

    /** 产品型号 */

    private String subMaterialModel;

    /** 产品规格 */

    private String subMaterialSpecifications;

    /** 产品单位 */

    private String subMaterialUnit;

    private String reviewerName;
    private String applicantName;

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getSubUserName() {
        return subUserName;
    }

    public void setSubUserName(String subUserName) {
        this.subUserName = subUserName;
    }

    public String getSubSerialNo() {
        return subSerialNo;
    }

    public void setSubSerialNo(String subSerialNo) {
        this.subSerialNo = subSerialNo;
    }

    public String getSubProducedQuantity() {
        return subProducedQuantity;
    }

    public void setSubProducedQuantity(String subProducedQuantity) {
        this.subProducedQuantity = subProducedQuantity;
    }

    public Date getSubManufactureDate() {
        return subManufactureDate;
    }

    public void setSubManufactureDate(Date subManufactureDate) {
        this.subManufactureDate = subManufactureDate;
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

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setApplyId(Long applyId)
    {
        this.applyId = applyId;
    }

    public Long getApplyId()
    {
        return applyId;
    }
    public void setMaterialId(Long materialId)
    {
        this.materialId = materialId;
    }

    public Long getMaterialId()
    {
        return materialId;
    }
    public void setDosage(Long dosage)
    {
        this.dosage = dosage;
    }

    public Long getDosage()
    {
        return dosage;
    }
    public void setReceivedQuantity(Long receivedQuantity)
    {
        this.receivedQuantity = receivedQuantity;
    }

    public Long getReceivedQuantity()
    {
        return receivedQuantity;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("applyId", getApplyId())
            .append("materialId", getMaterialId())
            .append("dosage", getDosage())
            .append("receivedQuantity", getReceivedQuantity())
            .append("remark", getRemark())
            .toString();
    }
}
