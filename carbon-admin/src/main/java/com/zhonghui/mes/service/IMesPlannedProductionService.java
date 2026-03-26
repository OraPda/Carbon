package com.zhonghui.mes.service;

import java.util.List;
import com.zhonghui.mes.domain.MesPlannedProduction;

/**
 * 制造执行MES-计划排产Service接口
 * 
 * @author yang
 * @date 2024-04-03
 */
public interface IMesPlannedProductionService 
{
    /**
     * 查询制造执行MES-计划排产
     * 
     * @param id 制造执行MES-计划排产主键
     * @return 制造执行MES-计划排产
     */
    public MesPlannedProduction selectMesPlannedProductionById(Long id);

    /**
     * 查询制造执行MES-计划排产列表
     * 
     * @param mesPlannedProduction 制造执行MES-计划排产
     * @return 制造执行MES-计划排产集合
     */
    public List<MesPlannedProduction> selectMesPlannedProductionList(MesPlannedProduction mesPlannedProduction);

    /**
     * 新增制造执行MES-计划排产
     * 
     * @param mesPlannedProduction 制造执行MES-计划排产
     * @return 结果
     */
    public int insertMesPlannedProduction(MesPlannedProduction mesPlannedProduction);

    /**
     * 修改制造执行MES-计划排产
     * 
     * @param mesPlannedProduction 制造执行MES-计划排产
     * @return 结果
     */
    public int updateMesPlannedProduction(MesPlannedProduction mesPlannedProduction);

    /**
     * 批量删除制造执行MES-计划排产
     * 
     * @param ids 需要删除的制造执行MES-计划排产主键集合
     * @return 结果
     */
    public int deleteMesPlannedProductionByIds(Long[] ids);

    /**
     * 删除制造执行MES-计划排产信息
     * 
     * @param id 制造执行MES-计划排产主键
     * @return 结果
     */
    public int deleteMesPlannedProductionById(Long id);
}
