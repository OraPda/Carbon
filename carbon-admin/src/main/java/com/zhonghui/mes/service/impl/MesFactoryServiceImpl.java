package com.zhonghui.mes.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.zhonghui.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.zhonghui.mes.domain.MesFactoryDeviceItem;
import com.zhonghui.mes.mapper.MesFactoryMapper;
import com.zhonghui.mes.domain.MesFactory;
import com.zhonghui.mes.service.IMesFactoryService;

/**
 * 制造执行MES-工厂建模Service业务层处理
 * 
 * @author yang
 * @date 2024-04-04
 */
@Service
public class MesFactoryServiceImpl implements IMesFactoryService 
{
    @Autowired
    private MesFactoryMapper mesFactoryMapper;

    /**
     * 查询制造执行MES-工厂建模
     * 
     * @param id 制造执行MES-工厂建模主键
     * @return 制造执行MES-工厂建模
     */
    @Override
    public MesFactory selectMesFactoryById(String id)
    {
        return mesFactoryMapper.selectMesFactoryById(id);
    }

    /**
     * 查询制造执行MES-工厂建模列表
     * 
     * @param mesFactory 制造执行MES-工厂建模
     * @return 制造执行MES-工厂建模
     */
    @Override
    public List<MesFactory> selectMesFactoryList(MesFactory mesFactory)
    {
        return mesFactoryMapper.selectMesFactoryList(mesFactory);
    }

    /**
     * 新增制造执行MES-工厂建模
     * 
     * @param mesFactory 制造执行MES-工厂建模
     * @return 结果
     */
    @Transactional
    @Override
    public int insertMesFactory(MesFactory mesFactory)
    {
        int rows = mesFactoryMapper.insertMesFactory(mesFactory);
        insertMesFactoryDeviceItem(mesFactory);
        return rows;
    }

    /**
     * 修改制造执行MES-工厂建模
     * 
     * @param mesFactory 制造执行MES-工厂建模
     * @return 结果
     */
    @Transactional
    @Override
    public int updateMesFactory(MesFactory mesFactory)
    {
        mesFactoryMapper.deleteMesFactoryDeviceItemByFactoryId(mesFactory.getId());
        insertMesFactoryDeviceItem(mesFactory);
        return mesFactoryMapper.updateMesFactory(mesFactory);
    }

    /**
     * 批量删除制造执行MES-工厂建模
     * 
     * @param ids 需要删除的制造执行MES-工厂建模主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteMesFactoryByIds(String[] ids)
    {
        mesFactoryMapper.deleteMesFactoryDeviceItemByFactoryIds(ids);
        return mesFactoryMapper.deleteMesFactoryByIds(ids);
    }

    /**
     * 删除制造执行MES-工厂建模信息
     * 
     * @param id 制造执行MES-工厂建模主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteMesFactoryById(String id)
    {
        mesFactoryMapper.deleteMesFactoryDeviceItemByFactoryId(id);
        return mesFactoryMapper.deleteMesFactoryById(id);
    }

    /**
     * 新增制造执行MES-工厂建模设备信息子信息
     * 
     * @param mesFactory 制造执行MES-工厂建模对象
     */
    public void insertMesFactoryDeviceItem(MesFactory mesFactory)
    {
        List<MesFactoryDeviceItem> mesFactoryDeviceItemList = mesFactory.getMesFactoryDeviceItemList();
        String id = mesFactory.getId();
        if (StringUtils.isNotNull(mesFactoryDeviceItemList))
        {
            List<MesFactoryDeviceItem> list = new ArrayList<MesFactoryDeviceItem>();
            for (MesFactoryDeviceItem mesFactoryDeviceItem : mesFactoryDeviceItemList)
            {
                mesFactoryDeviceItem.setFactoryId(Long.valueOf(id));
                list.add(mesFactoryDeviceItem);
            }
            if (list.size() > 0)
            {
                mesFactoryMapper.batchMesFactoryDeviceItem(list);
            }
        }
    }
}
