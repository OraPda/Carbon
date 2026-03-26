package com.zhonghui.mes.service;

import java.util.List;
import com.zhonghui.mes.domain.MesProductionPlanItem;

/**
 * 制造执行MES-生产计划明细Service接口
 * 
 * @author yang
 * @date 2024-04-09
 */
public interface IMesProductionPlanItemService 
{
    /**
     * 查询制造执行MES-生产计划明细
     * 
     * @param id 制造执行MES-生产计划明细主键
     * @return 制造执行MES-生产计划明细
     */
    public MesProductionPlanItem selectMesProductionPlanItemById(Long id);

    /**
     * 查询制造执行MES-生产计划明细列表
     * 
     * @param mesProductionPlanItem 制造执行MES-生产计划明细
     * @return 制造执行MES-生产计划明细集合
     */
    public List<MesProductionPlanItem> selectMesProductionPlanItemList(MesProductionPlanItem mesProductionPlanItem);

    /**
     * 新增制造执行MES-生产计划明细
     * 
     * @param mesProductionPlanItem 制造执行MES-生产计划明细
     * @return 结果
     */
    public int insertMesProductionPlanItem(MesProductionPlanItem mesProductionPlanItem);

    /**
     * 修改制造执行MES-生产计划明细
     * 
     * @param mesProductionPlanItem 制造执行MES-生产计划明细
     * @return 结果
     */
    public int updateMesProductionPlanItem(MesProductionPlanItem mesProductionPlanItem);

    /**
     * 批量删除制造执行MES-生产计划明细
     * 
     * @param ids 需要删除的制造执行MES-生产计划明细主键集合
     * @return 结果
     */
    public int deleteMesProductionPlanItemByIds(Long[] ids);

    /**
     * 删除制造执行MES-生产计划明细信息
     * 
     * @param id 制造执行MES-生产计划明细主键
     * @return 结果
     */
    public int deleteMesProductionPlanItemById(Long id);
}
