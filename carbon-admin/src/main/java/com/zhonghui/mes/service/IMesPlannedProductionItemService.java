package com.zhonghui.mes.service;

import java.util.List;
import com.zhonghui.mes.domain.MesPlannedProductionItem;

/**
 * 制造执行MES-计划排产明细Service接口
 * 
 * @author yang
 * @date 2024-04-03
 */
public interface IMesPlannedProductionItemService 
{
    /**
     * 查询制造执行MES-计划排产明细
     * 
     * @param id 制造执行MES-计划排产明细主键
     * @return 制造执行MES-计划排产明细
     */
    public MesPlannedProductionItem selectMesPlannedProductionItemById(Long id);

    /**
     * 查询制造执行MES-计划排产明细列表
     * 
     * @param mesPlannedProductionItem 制造执行MES-计划排产明细
     * @return 制造执行MES-计划排产明细集合
     */
    public List<MesPlannedProductionItem> selectMesPlannedProductionItemList(MesPlannedProductionItem mesPlannedProductionItem);

    /**
     * 新增制造执行MES-计划排产明细
     * 
     * @param mesPlannedProductionItem 制造执行MES-计划排产明细
     * @return 结果
     */
    public int insertMesPlannedProductionItem(MesPlannedProductionItem mesPlannedProductionItem);

    /**
     * 修改制造执行MES-计划排产明细
     * 
     * @param mesPlannedProductionItem 制造执行MES-计划排产明细
     * @return 结果
     */
    public int updateMesPlannedProductionItem(MesPlannedProductionItem mesPlannedProductionItem);

    /**
     * 批量删除制造执行MES-计划排产明细
     * 
     * @param ids 需要删除的制造执行MES-计划排产明细主键集合
     * @return 结果
     */
    public int deleteMesPlannedProductionItemByIds(Long[] ids);

    /**
     * 删除制造执行MES-计划排产明细信息
     * 
     * @param id 制造执行MES-计划排产明细主键
     * @return 结果
     */
    public int deleteMesPlannedProductionItemById(Long id);
}
