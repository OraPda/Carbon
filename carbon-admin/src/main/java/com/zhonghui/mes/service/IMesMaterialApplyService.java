package com.zhonghui.mes.service;

import java.util.List;
import com.zhonghui.mes.domain.MesMaterialApply;

/**
 * 制造执行MES-领料申请Service接口
 * 
 * @author yang
 * @date 2024-03-31
 */
public interface IMesMaterialApplyService 
{
    /**
     * 查询制造执行MES-领料申请
     * 
     * @param id 制造执行MES-领料申请主键
     * @return 制造执行MES-领料申请
     */
    public MesMaterialApply selectMesMaterialApplyById(Long id);

    /**
     * 查询制造执行MES-领料申请列表
     * 
     * @param mesMaterialApply 制造执行MES-领料申请
     * @return 制造执行MES-领料申请集合
     */
    public List<MesMaterialApply> selectMesMaterialApplyList(MesMaterialApply mesMaterialApply);

    /**
     * 新增制造执行MES-领料申请
     * 
     * @param mesMaterialApply 制造执行MES-领料申请
     * @return 结果
     */
    public int insertMesMaterialApply(MesMaterialApply mesMaterialApply);

    /**
     * 修改制造执行MES-领料申请
     * 
     * @param mesMaterialApply 制造执行MES-领料申请
     * @return 结果
     */
    public int updateMesMaterialApply(MesMaterialApply mesMaterialApply);

    /**
     * 批量删除制造执行MES-领料申请
     * 
     * @param ids 需要删除的制造执行MES-领料申请主键集合
     * @return 结果
     */
    public int deleteMesMaterialApplyByIds(Long[] ids);

    /**
     * 删除制造执行MES-领料申请信息
     * 
     * @param id 制造执行MES-领料申请主键
     * @return 结果
     */
    public int deleteMesMaterialApplyById(Long id);
}
