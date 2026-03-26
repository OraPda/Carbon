package com.zhonghui.mes.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhonghui.mes.mapper.MesDeviceInformationMapper;
import com.zhonghui.mes.domain.MesDeviceInformation;
import com.zhonghui.mes.service.IMesDeviceInformationService;

/**
 * 制造执行MES-设备信息Service业务层处理
 * 
 * @author yang
 * @date 2024-03-28
 */
@Service
public class MesDeviceInformationServiceImpl implements IMesDeviceInformationService 
{
    @Autowired
    private MesDeviceInformationMapper mesDeviceInformationMapper;

    /**
     * 查询制造执行MES-设备信息
     * 
     * @param id 制造执行MES-设备信息主键
     * @return 制造执行MES-设备信息
     */
    @Override
    public MesDeviceInformation selectMesDeviceInformationById(Long id)
    {
        return mesDeviceInformationMapper.selectMesDeviceInformationById(id);
    }

    /**
     * 查询制造执行MES-设备信息列表
     * 
     * @param mesDeviceInformation 制造执行MES-设备信息
     * @return 制造执行MES-设备信息
     */
    @Override
    public List<MesDeviceInformation> selectMesDeviceInformationList(MesDeviceInformation mesDeviceInformation)
    {
        return mesDeviceInformationMapper.selectMesDeviceInformationList(mesDeviceInformation);
    }

    /**
     * 新增制造执行MES-设备信息
     * 
     * @param mesDeviceInformation 制造执行MES-设备信息
     * @return 结果
     */
    @Override
    public int insertMesDeviceInformation(MesDeviceInformation mesDeviceInformation)
    {
        return mesDeviceInformationMapper.insertMesDeviceInformation(mesDeviceInformation);
    }

    /**
     * 修改制造执行MES-设备信息
     * 
     * @param mesDeviceInformation 制造执行MES-设备信息
     * @return 结果
     */
    @Override
    public int updateMesDeviceInformation(MesDeviceInformation mesDeviceInformation)
    {
        return mesDeviceInformationMapper.updateMesDeviceInformation(mesDeviceInformation);
    }

    /**
     * 批量删除制造执行MES-设备信息
     * 
     * @param ids 需要删除的制造执行MES-设备信息主键
     * @return 结果
     */
    @Override
    public int deleteMesDeviceInformationByIds(Long[] ids)
    {
        return mesDeviceInformationMapper.deleteMesDeviceInformationByIds(ids);
    }

    /**
     * 删除制造执行MES-设备信息信息
     * 
     * @param id 制造执行MES-设备信息主键
     * @return 结果
     */
    @Override
    public int deleteMesDeviceInformationById(Long id)
    {
        return mesDeviceInformationMapper.deleteMesDeviceInformationById(id);
    }
}
