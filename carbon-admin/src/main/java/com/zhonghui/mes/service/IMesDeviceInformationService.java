package com.zhonghui.mes.service;

import java.util.List;
import com.zhonghui.mes.domain.MesDeviceInformation;

/**
 * 制造执行MES-设备信息Service接口
 * 
 * @author yang
 * @date 2024-03-28
 */
public interface IMesDeviceInformationService 
{
    /**
     * 查询制造执行MES-设备信息
     * 
     * @param id 制造执行MES-设备信息主键
     * @return 制造执行MES-设备信息
     */
    public MesDeviceInformation selectMesDeviceInformationById(Long id);

    /**
     * 查询制造执行MES-设备信息列表
     * 
     * @param mesDeviceInformation 制造执行MES-设备信息
     * @return 制造执行MES-设备信息集合
     */
    public List<MesDeviceInformation> selectMesDeviceInformationList(MesDeviceInformation mesDeviceInformation);

    /**
     * 新增制造执行MES-设备信息
     * 
     * @param mesDeviceInformation 制造执行MES-设备信息
     * @return 结果
     */
    public int insertMesDeviceInformation(MesDeviceInformation mesDeviceInformation);

    /**
     * 修改制造执行MES-设备信息
     * 
     * @param mesDeviceInformation 制造执行MES-设备信息
     * @return 结果
     */
    public int updateMesDeviceInformation(MesDeviceInformation mesDeviceInformation);

    /**
     * 批量删除制造执行MES-设备信息
     * 
     * @param ids 需要删除的制造执行MES-设备信息主键集合
     * @return 结果
     */
    public int deleteMesDeviceInformationByIds(Long[] ids);

    /**
     * 删除制造执行MES-设备信息信息
     * 
     * @param id 制造执行MES-设备信息主键
     * @return 结果
     */
    public int deleteMesDeviceInformationById(Long id);
}
