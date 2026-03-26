package com.zhonghui.mes.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.zhonghui.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.zhonghui.mes.domain.MesPlannedProductionItem;
import com.zhonghui.mes.mapper.MesPlannedProductionMapper;
import com.zhonghui.mes.domain.MesPlannedProduction;
import com.zhonghui.mes.service.IMesPlannedProductionService;

/**
 * 制造执行MES-计划排产Service业务层处理
 * 
 * @author yang
 * @date 2024-04-03
 */
@Service
public class MesPlannedProductionServiceImpl implements IMesPlannedProductionService 
{
    @Autowired
    private MesPlannedProductionMapper mesPlannedProductionMapper;

    /**
     * 查询制造执行MES-计划排产
     * 
     * @param id 制造执行MES-计划排产主键
     * @return 制造执行MES-计划排产
     */
    @Override
    public MesPlannedProduction selectMesPlannedProductionById(Long id)
    {
        return mesPlannedProductionMapper.selectMesPlannedProductionById(id);
    }

    /**
     * 查询制造执行MES-计划排产列表
     * 
     * @param mesPlannedProduction 制造执行MES-计划排产
     * @return 制造执行MES-计划排产
     */
    @Override
    public List<MesPlannedProduction> selectMesPlannedProductionList(MesPlannedProduction mesPlannedProduction)
    {
        return mesPlannedProductionMapper.selectMesPlannedProductionList(mesPlannedProduction);
    }

    /**
     * 新增制造执行MES-计划排产
     * 
     * @param mesPlannedProduction 制造执行MES-计划排产
     * @return 结果
     */
    @Transactional
    @Override
    public int insertMesPlannedProduction(MesPlannedProduction mesPlannedProduction)
    {
        int rows = mesPlannedProductionMapper.insertMesPlannedProduction(mesPlannedProduction);
        insertMesPlannedProductionItem(mesPlannedProduction);
        return rows;
    }

    /**
     * 修改制造执行MES-计划排产
     * 
     * @param mesPlannedProduction 制造执行MES-计划排产
     * @return 结果
     */
    @Transactional
    @Override
    public int updateMesPlannedProduction(MesPlannedProduction mesPlannedProduction)
    {
        mesPlannedProductionMapper.deleteMesPlannedProductionItemByProductionId(mesPlannedProduction.getId());
        insertMesPlannedProductionItem(mesPlannedProduction);
        return mesPlannedProductionMapper.updateMesPlannedProduction(mesPlannedProduction);
    }

    /**
     * 批量删除制造执行MES-计划排产
     * 
     * @param ids 需要删除的制造执行MES-计划排产主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteMesPlannedProductionByIds(Long[] ids)
    {
        mesPlannedProductionMapper.deleteMesPlannedProductionItemByProductionIds(ids);
        return mesPlannedProductionMapper.deleteMesPlannedProductionByIds(ids);
    }

    /**
     * 删除制造执行MES-计划排产信息
     * 
     * @param id 制造执行MES-计划排产主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteMesPlannedProductionById(Long id)
    {
        mesPlannedProductionMapper.deleteMesPlannedProductionItemByProductionId(id);
        return mesPlannedProductionMapper.deleteMesPlannedProductionById(id);
    }

    /**
     * 新增制造执行MES-计划排产明细信息
     * 
     * @param mesPlannedProduction 制造执行MES-计划排产对象
     */
    public void insertMesPlannedProductionItem(MesPlannedProduction mesPlannedProduction)
    {
        List<MesPlannedProductionItem> mesPlannedProductionItemList = mesPlannedProduction.getMesPlannedProductionItemList();
        Long id = mesPlannedProduction.getId();
        if (StringUtils.isNotNull(mesPlannedProductionItemList))
        {
            List<MesPlannedProductionItem> list = new ArrayList<MesPlannedProductionItem>();
            for (MesPlannedProductionItem mesPlannedProductionItem : mesPlannedProductionItemList)
            {
                mesPlannedProductionItem.setProductionId(id);
                list.add(mesPlannedProductionItem);
            }
            if (list.size() > 0)
            {
                mesPlannedProductionMapper.batchMesPlannedProductionItem(list);
            }
        }
    }
}
