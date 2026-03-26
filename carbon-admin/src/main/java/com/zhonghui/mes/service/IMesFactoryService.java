package com.zhonghui.mes.service;

import java.util.List;
import com.zhonghui.mes.domain.MesFactory;

/**
 * 制造执行MES-工厂建模Service接口
 * 
 * @author yang
 * @date 2024-04-04
 */
public interface IMesFactoryService 
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
     * 批量删除制造执行MES-工厂建模
     * 
     * @param ids 需要删除的制造执行MES-工厂建模主键集合
     * @return 结果
     */
    public int deleteMesFactoryByIds(String[] ids);

    /**
     * 删除制造执行MES-工厂建模信息
     * 
     * @param id 制造执行MES-工厂建模主键
     * @return 结果
     */
    public int deleteMesFactoryById(String id);
}
