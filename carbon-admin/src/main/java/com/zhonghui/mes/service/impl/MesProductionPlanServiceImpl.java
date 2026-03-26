package com.zhonghui.mes.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.zhonghui.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.zhonghui.mes.domain.MesProductionPlanItem;
import com.zhonghui.mes.mapper.MesProductionPlanMapper;
import com.zhonghui.mes.domain.MesProductionPlan;
import com.zhonghui.mes.service.IMesProductionPlanService;

/**
 * 制造执行MES-生产计划Service业务层处理
 * 
 * @author yang
 * @date 2024-04-04
 */
@Service
public class MesProductionPlanServiceImpl implements IMesProductionPlanService 
{
    @Autowired
    private MesProductionPlanMapper mesProductionPlanMapper;

    /**
     * 查询制造执行MES-生产计划
     * 
     * @param id 制造执行MES-生产计划主键
     * @return 制造执行MES-生产计划
     */
    @Override
    public MesProductionPlan selectMesProductionPlanById(Long id)
    {
        return mesProductionPlanMapper.selectMesProductionPlanById(id);
    }

    /**
     * 查询制造执行MES-生产计划列表
     * 
     * @param mesProductionPlan 制造执行MES-生产计划
     * @return 制造执行MES-生产计划
     */
    @Override
    public List<MesProductionPlan> selectMesProductionPlanList(MesProductionPlan mesProductionPlan)
    {
        return mesProductionPlanMapper.selectMesProductionPlanList(mesProductionPlan);
    }

    /**
     * 新增制造执行MES-生产计划
     * 
     * @param mesProductionPlan 制造执行MES-生产计划
     * @return 结果
     */
    @Transactional
    @Override
    public int insertMesProductionPlan(MesProductionPlan mesProductionPlan)
    {
        int rows = mesProductionPlanMapper.insertMesProductionPlan(mesProductionPlan);
        insertMesProductionPlanItem(mesProductionPlan);
        return rows;
    }

    /**
     * 修改制造执行MES-生产计划
     * 
     * @param mesProductionPlan 制造执行MES-生产计划
     * @return 结果
     */
    @Transactional
    @Override
    public int updateMesProductionPlan(MesProductionPlan mesProductionPlan)
    {
        mesProductionPlanMapper.deleteMesProductionPlanItemByPlanId(mesProductionPlan.getId());
        insertMesProductionPlanItem(mesProductionPlan);
        return mesProductionPlanMapper.updateMesProductionPlan(mesProductionPlan);
    }

    /**
     * 批量删除制造执行MES-生产计划
     * 
     * @param ids 需要删除的制造执行MES-生产计划主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteMesProductionPlanByIds(Long[] ids)
    {
        mesProductionPlanMapper.deleteMesProductionPlanItemByPlanIds(ids);
        return mesProductionPlanMapper.deleteMesProductionPlanByIds(ids);
    }

    /**
     * 删除制造执行MES-生产计划信息
     * 
     * @param id 制造执行MES-生产计划主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteMesProductionPlanById(Long id)
    {
        mesProductionPlanMapper.deleteMesProductionPlanItemByPlanId(id);
        return mesProductionPlanMapper.deleteMesProductionPlanById(id);
    }

    /**
     * 新增制造执行MES-生产计划明细信息
     * 
     * @param mesProductionPlan 制造执行MES-生产计划对象
     */
    public void insertMesProductionPlanItem(MesProductionPlan mesProductionPlan)
    {
        List<MesProductionPlanItem> mesProductionPlanItemList = mesProductionPlan.getMesProductionPlanItemList();
        Long id = mesProductionPlan.getId();
        if (StringUtils.isNotNull(mesProductionPlanItemList))
        {
            List<MesProductionPlanItem> list = new ArrayList<MesProductionPlanItem>();
            for (MesProductionPlanItem mesProductionPlanItem : mesProductionPlanItemList)
            {
                mesProductionPlanItem.setPlanId(id);
                list.add(mesProductionPlanItem);
            }
            if (list.size() > 0)
            {
                mesProductionPlanMapper.batchMesProductionPlanItem(list);
            }
        }
    }
}
