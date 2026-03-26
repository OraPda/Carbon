package com.zhonghui.mes.service;

import java.util.List;
import com.zhonghui.mes.domain.MesProductionPlan;

/**
 * 制造执行MES-生产计划Service接口
 * 
 * @author yang
 * @date 2024-04-04
 */
public interface IMesProductionPlanService 
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
     * 批量删除制造执行MES-生产计划
     * 
     * @param ids 需要删除的制造执行MES-生产计划主键集合
     * @return 结果
     */
    public int deleteMesProductionPlanByIds(Long[] ids);

    /**
     * 删除制造执行MES-生产计划信息
     * 
     * @param id 制造执行MES-生产计划主键
     * @return 结果
     */
    public int deleteMesProductionPlanById(Long id);
}
