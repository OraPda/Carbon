package com.zhonghui.mes.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhonghui.mes.mapper.MesPlannedProductionItemMapper;
import com.zhonghui.mes.domain.MesPlannedProductionItem;
import com.zhonghui.mes.service.IMesPlannedProductionItemService;

/**
 * 制造执行MES-计划排产明细Service业务层处理
 * 
 * @author yang
 * @date 2024-04-03
 */
@Service
public class MesPlannedProductionItemServiceImpl implements IMesPlannedProductionItemService 
{
    @Autowired
    private MesPlannedProductionItemMapper mesPlannedProductionItemMapper;

    /**
     * 查询制造执行MES-计划排产明细
     * 
     * @param id 制造执行MES-计划排产明细主键
     * @return 制造执行MES-计划排产明细
     */
    @Override
    public MesPlannedProductionItem selectMesPlannedProductionItemById(Long id)
    {
        return mesPlannedProductionItemMapper.selectMesPlannedProductionItemById(id);
    }

    /**
     * 查询制造执行MES-计划排产明细列表
     * 
     * @param mesPlannedProductionItem 制造执行MES-计划排产明细
     * @return 制造执行MES-计划排产明细
     */
    @Override
    public List<MesPlannedProductionItem> selectMesPlannedProductionItemList(MesPlannedProductionItem mesPlannedProductionItem)
    {
        return mesPlannedProductionItemMapper.selectMesPlannedProductionItemList(mesPlannedProductionItem);
    }

    /**
     * 新增制造执行MES-计划排产明细
     * 
     * @param mesPlannedProductionItem 制造执行MES-计划排产明细
     * @return 结果
     */
    @Override
    public int insertMesPlannedProductionItem(MesPlannedProductionItem mesPlannedProductionItem)
    {
        return mesPlannedProductionItemMapper.insertMesPlannedProductionItem(mesPlannedProductionItem);
    }

    /**
     * 修改制造执行MES-计划排产明细
     * 
     * @param mesPlannedProductionItem 制造执行MES-计划排产明细
     * @return 结果
     */
    @Override
    public int updateMesPlannedProductionItem(MesPlannedProductionItem mesPlannedProductionItem)
    {
        return mesPlannedProductionItemMapper.updateMesPlannedProductionItem(mesPlannedProductionItem);
    }

    /**
     * 批量删除制造执行MES-计划排产明细
     * 
     * @param ids 需要删除的制造执行MES-计划排产明细主键
     * @return 结果
     */
    @Override
    public int deleteMesPlannedProductionItemByIds(Long[] ids)
    {
        return mesPlannedProductionItemMapper.deleteMesPlannedProductionItemByIds(ids);
    }

    /**
     * 删除制造执行MES-计划排产明细信息
     * 
     * @param id 制造执行MES-计划排产明细主键
     * @return 结果
     */
    @Override
    public int deleteMesPlannedProductionItemById(Long id)
    {
        return mesPlannedProductionItemMapper.deleteMesPlannedProductionItemById(id);
    }
}
