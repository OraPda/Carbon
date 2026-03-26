package com.zhonghui.mes.mapper;

import java.util.List;
import com.zhonghui.mes.domain.MesProductionPlan;
import com.zhonghui.mes.domain.MesProductionPlanItem;

/**
 * 制造执行MES-生产计划Mapper接口
 * 
 * @author yang
 * @date 2024-04-04
 */
public interface MesProductionPlanMapper 
{
    /**
     * 查询制造执行MES-生产计划
     * 
     * @param id 制造执行MES-生产计划主键
     * @return 制造执行MES-生产计划
     */
    public MesProductionPlan selectMesProductionPlanById(Long id);

    /**
     * 查询制造执行MES-生产计划列表
     * 
     * @param mesProductionPlan 制造执行MES-生产计划
     * @return 制造执行MES-生产计划集合
     */
    public List<MesProductionPlan> selectMesProductionPlanList(MesProductionPlan mesProductionPlan);

    /**
     * 新增制造执行MES-生产计划
     * 
     * @param mesProductionPlan 制造执行MES-生产计划
     * @return 结果
     */
    public int insertMesProductionPlan(MesProductionPlan mesProductionPlan);

    /**
     * 修改制造执行MES-生产计划
     * 
     * @param mesProductionPlan 制造执行MES-生产计划
     * @return 结果
     */
    public int updateMesProductionPlan(MesProductionPlan mesProductionPlan);

    /**
     * 删除制造执行MES-生产计划
     * 
     * @param id 制造执行MES-生产计划主键
     * @return 结果
     */
    public int deleteMesProductionPlanById(Long id);

    /**
     * 批量删除制造执行MES-生产计划
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMesProductionPlanByIds(Long[] ids);

    /**
     * 批量删除制造执行MES-生产计划明细
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMesProductionPlanItemByPlanIds(Long[] ids);
    
    /**
     * 批量新增制造执行MES-生产计划明细
     * 
     * @param mesProductionPlanItemList 制造执行MES-生产计划明细列表
     * @return 结果
     */
    public int batchMesProductionPlanItem(List<MesProductionPlanItem> mesProductionPlanItemList);
    

    /**
     * 通过制造执行MES-生产计划主键删除制造执行MES-生产计划明细信息
     * 
     * @param id 制造执行MES-生产计划ID
     * @return 结果
     */
    public int deleteMesProductionPlanItemByPlanId(Long id);
}
