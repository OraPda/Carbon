package com.zhonghui.mes.mapper;

import java.util.List;
import com.zhonghui.mes.domain.MesMaterialApply;
import com.zhonghui.mes.domain.MesMaterialApplyItem;

/**
 * 制造执行MES-领料申请Mapper接口
 * 
 * @author yang
 * @date 2024-03-31
 */
public interface MesMaterialApplyMapper 
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
     * 删除制造执行MES-领料申请
     * 
     * @param id 制造执行MES-领料申请主键
     * @return 结果
     */
    public int deleteMesMaterialApplyById(Long id);

    /**
     * 批量删除制造执行MES-领料申请
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMesMaterialApplyByIds(Long[] ids);

    /**
     * 批量删除制造执行MES-领料申请明细
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMesMaterialApplyItemByApplyIds(Long[] ids);
    
    /**
     * 批量新增制造执行MES-领料申请明细
     * 
     * @param mesMaterialApplyItemList 制造执行MES-领料申请明细列表
     * @return 结果
     */
    public int batchMesMaterialApplyItem(List<MesMaterialApplyItem> mesMaterialApplyItemList);
    

    /**
     * 通过制造执行MES-领料申请主键删除制造执行MES-领料申请明细信息
     * 
     * @param id 制造执行MES-领料申请ID
     * @return 结果
     */
    public int deleteMesMaterialApplyItemByApplyId(Long id);
}
