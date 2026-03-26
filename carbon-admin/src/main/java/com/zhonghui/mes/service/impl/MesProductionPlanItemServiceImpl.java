package com.zhonghui.mes.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhonghui.mes.mapper.MesProductionPlanItemMapper;
import com.zhonghui.mes.domain.MesProductionPlanItem;
import com.zhonghui.mes.service.IMesProductionPlanItemService;

/**
 * 制造执行MES-生产计划明细Service业务层处理
 * 
 * @author yang
 * @date 2024-04-09
 */
@Service
public class MesProductionPlanItemServiceImpl implements IMesProductionPlanItemService 
{
    @Autowired
    private MesProductionPlanItemMapper mesProductionPlanItemMapper;

    /**
     * 查询制造执行MES-生产计划明细
     * 
     * @param id 制造执行MES-生产计划明细主键
     * @return 制造执行MES-生产计划明细
     */
    @Override
    public MesProductionPlanItem selectMesProductionPlanItemById(Long id)
    {
        return mesProductionPlanItemMapper.selectMesProductionPlanItemById(id);
    }

    /**
     * 查询制造执行MES-生产计划明细列表
     * 
     * @param mesProductionPlanItem 制造执行MES-生产计划明细
     * @return 制造执行MES-生产计划明细
     */
    @Override
    public List<MesProductionPlanItem> selectMesProductionPlanItemList(MesProductionPlanItem mesProductionPlanItem)
    {
        return mesProductionPlanItemMapper.selectMesProductionPlanItemList(mesProductionPlanItem);
    }

    /**
     * 新增制造执行MES-生产计划明细
     * 
     * @param mesProductionPlanItem 制造执行MES-生产计划明细
     * @return 结果
     */
    @Override
    public int insertMesProductionPlanItem(MesProductionPlanItem mesProductionPlanItem)
    {
        return mesProductionPlanItemMapper.insertMesProductionPlanItem(mesProductionPlanItem);
    }

    /**
     * 修改制造执行MES-生产计划明细
     * 
     * @param mesProductionPlanItem 制造执行MES-生产计划明细
     * @return 结果
     */
    @Override
    public int updateMesProductionPlanItem(MesProductionPlanItem mesProductionPlanItem)
    {
        return mesProductionPlanItemMapper.updateMesProductionPlanItem(mesProductionPlanItem);
    }

    /**
     * 批量删除制造执行MES-生产计划明细
     * 
     * @param ids 需要删除的制造执行MES-生产计划明细主键
     * @return 结果
     */
    @Override
    public int deleteMesProductionPlanItemByIds(Long[] ids)
    {
        return mesProductionPlanItemMapper.deleteMesProductionPlanItemByIds(ids);
    }

    /**
     * 删除制造执行MES-生产计划明细信息
     * 
     * @param id 制造执行MES-生产计划明细主键
     * @return 结果
     */
    @Override
    public int deleteMesProductionPlanItemById(Long id)
    {
        return mesProductionPlanItemMapper.deleteMesProductionPlanItemById(id);
    }
}
