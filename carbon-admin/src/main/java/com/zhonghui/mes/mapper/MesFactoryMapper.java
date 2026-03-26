package com.zhonghui.mes.mapper;

import java.util.List;
import com.zhonghui.mes.domain.MesFactory;
import com.zhonghui.mes.domain.MesFactoryDeviceItem;

/**
 * 制造执行MES-工厂建模Mapper接口
 * 
 * @author yang
 * @date 2024-04-04
 */
public interface MesFactoryMapper 
{
    /**
     * 查询制造执行MES-工厂建模
     * 
     * @param id 制造执行MES-工厂建模主键
     * @return 制造执行MES-工厂建模
     */
    public MesFactory selectMesFactoryById(String id);

    /**
     * 查询制造执行MES-工厂建模列表
     * 
     * @param mesFactory 制造执行MES-工厂建模
     * @return 制造执行MES-工厂建模集合
     */
    public List<MesFactory> selectMesFactoryList(MesFactory mesFactory);

    /**
     * 新增制造执行MES-工厂建模
     * 
     * @param mesFactory 制造执行MES-工厂建模
     * @return 结果
     */
    public int insertMesFactory(MesFactory mesFactory);

    /**
     * 修改制造执行MES-工厂建模
     * 
     * @param mesFactory 制造执行MES-工厂建模
     * @return 结果
     */
    public int updateMesFactory(MesFactory mesFactory);

    /**
     * 删除制造执行MES-工厂建模
     * 
     * @param id 制造执行MES-工厂建模主键
     * @return 结果
     */
    public int deleteMesFactoryById(String id);

    /**
     * 批量删除制造执行MES-工厂建模
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMesFactoryByIds(String[] ids);

    /**
     * 批量删除制造执行MES-工厂建模设备信息子
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMesFactoryDeviceItemByFactoryIds(String[] ids);
    
    /**
     * 批量新增制造执行MES-工厂建模设备信息子
     * 
     * @param mesFactoryDeviceItemList 制造执行MES-工厂建模设备信息子列表
     * @return 结果
     */
    public int batchMesFactoryDeviceItem(List<MesFactoryDeviceItem> mesFactoryDeviceItemList);
    

    /**
     * 通过制造执行MES-工厂建模主键删除制造执行MES-工厂建模设备信息子信息
     * 
     * @param id 制造执行MES-工厂建模ID
     * @return 结果
     */
    public int deleteMesFactoryDeviceItemByFactoryId(String id);
}
