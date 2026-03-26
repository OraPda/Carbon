package com.zhonghui.mes.mapper;

import java.util.List;
import com.zhonghui.mes.domain.MesPlannedProduction;
import com.zhonghui.mes.domain.MesPlannedProductionItem;

/**
 * 制造执行MES-计划排产Mapper接口
 * 
 * @author yang
 * @date 2024-04-03
 */
public interface MesPlannedProductionMapper 
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
     * 删除制造执行MES-计划排产
     * 
     * @param id 制造执行MES-计划排产主键
     * @return 结果
     */
    public int deleteMesPlannedProductionById(Long id);

    /**
     * 批量删除制造执行MES-计划排产
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMesPlannedProductionByIds(Long[] ids);

    /**
     * 批量删除制造执行MES-计划排产明细
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMesPlannedProductionItemByProductionIds(Long[] ids);
    
    /**
     * 批量新增制造执行MES-计划排产明细
     * 
     * @param mesPlannedProductionItemList 制造执行MES-计划排产明细列表
     * @return 结果
     */
    public int batchMesPlannedProductionItem(List<MesPlannedProductionItem> mesPlannedProductionItemList);
    

    /**
     * 通过制造执行MES-计划排产主键删除制造执行MES-计划排产明细信息
     * 
     * @param id 制造执行MES-计划排产ID
     * @return 结果
     */
    public int deleteMesPlannedProductionItemByProductionId(Long id);
}
