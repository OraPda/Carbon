package com.zhonghui.mes.service.impl;

import java.util.List;

import com.zhonghui.mes.domain.MesProduct;
import com.zhonghui.mes.domain.MesProductionPlan;
import com.zhonghui.mes.mapper.MesProductMapper;
import com.zhonghui.mes.mapper.MesProductionPlanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.zhonghui.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.zhonghui.mes.domain.MesBomDetailItem;
import com.zhonghui.mes.mapper.MesBomMapper;
import com.zhonghui.mes.domain.MesBom;
import com.zhonghui.mes.service.IMesBomService;

/**
 * 制造执行MES-BOMService业务层处理
 * 
 * @author yang
 * @date 2024-04-03
 */
@Service
public class MesBomServiceImpl implements IMesBomService 
{
    @Autowired
    private MesBomMapper mesBomMapper;

    @Autowired
    private MesProductionPlanMapper mesProductionPlanMapper;

    @Autowired
    private MesProductMapper mesProductMapper;

    /**
     * 查询制造执行MES-BOM
     * 
     * @param id 制造执行MES-BOM主键
     * @return 制造执行MES-BOM
     */
    @Override
    public MesBom selectMesBomById(String id)
    {
        return mesBomMapper.selectMesBomById(id);
    }

    /**
     * 查询制造执行MES-BOM列表
     * 
     * @param mesBom 制造执行MES-BOM
     * @return 制造执行MES-BOM
     */
    @Override
    public List<MesBom> selectMesBomList(MesBom mesBom)
    {
        return mesBomMapper.selectMesBomList(mesBom);
    }

    /**
     * 新增制造执行MES-BOM
     * 
     * @param mesBom 制造执行MES-BOM
     * @return 结果
     */
    @Transactional
    @Override
    public int insertMesBom(MesBom mesBom)
    {
        int rows = mesBomMapper.insertMesBom(mesBom);
        insertMesBomDetailItem(mesBom);
        return rows;
    }

    /**
     * 修改制造执行MES-BOM
     * 
     * @param mesBom 制造执行MES-BOM
     * @return 结果
     */
    @Transactional
    @Override
    public int updateMesBom(MesBom mesBom)
    {
        mesBomMapper.deleteMesBomDetailItemByBomId(mesBom.getId());
        insertMesBomDetailItem(mesBom);
        return mesBomMapper.updateMesBom(mesBom);
    }

    /**
     * 批量删除制造执行MES-BOM
     * 
     * @param ids 需要删除的制造执行MES-BOM主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteMesBomByIds(String[] ids)
    {
        mesBomMapper.deleteMesBomDetailItemByBomIds(ids);
        return mesBomMapper.deleteMesBomByIds(ids);
    }

    /**
     * 删除制造执行MES-BOM信息
     * 
     * @param id 制造执行MES-BOM主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteMesBomById(String id)
    {
        mesBomMapper.deleteMesBomDetailItemByBomId(id);
        return mesBomMapper.deleteMesBomById(id);
    }

    /**
     * 新增制造执行MES-BOM明细信息信息
     * 
     * @param mesBom 制造执行MES-BOM对象
     */
    public void insertMesBomDetailItem(MesBom mesBom)
    {
        List<MesBomDetailItem> mesBomDetailItemList = mesBom.getMesBomDetailItemList();
        String id = mesBom.getId();
        if (StringUtils.isNotNull(mesBomDetailItemList))
        {
            List<MesBomDetailItem> list = new ArrayList<MesBomDetailItem>();
            for (MesBomDetailItem mesBomDetailItem : mesBomDetailItemList)
            {
                mesBomDetailItem.setBomId(Long.valueOf(id));
                list.add(mesBomDetailItem);
            }
            if (list.size() > 0)
            {
                mesBomMapper.batchMesBomDetailItem(list);
            }
        }
    }

    @Override
    public List<MesBom> selectMesBomListByMaterialId(Long id) {
        MesProductionPlan mesProductionPlan = mesProductionPlanMapper.selectMesProductionPlanById(id);
        Long[] materialIds = new Long[mesProductionPlan.getMesProductionPlanItemList().size()];
        for (int i = 0; i < mesProductionPlan.getMesProductionPlanItemList().size(); i++) {
            materialIds[i] = mesProductionPlan.getMesProductionPlanItemList().get(i).getMaterialId();
        }
        List<MesProduct> mesProducts = mesProductMapper.selectMesProductByMaterialIds(materialIds);
        Long[] productIds = new Long[mesProducts.size()];
        for (int i = 0; i < productIds.length; i++) {
            productIds[i] = Long.valueOf(mesProducts.get(i).getId());
        }
        return mesBomMapper.selectMesBomListByProductIds(productIds);
    }
}
