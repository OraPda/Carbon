package com.zhonghui.mes.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhonghui.mes.mapper.MesProjectMaintenanceMapper;
import com.zhonghui.mes.domain.MesProjectMaintenance;
import com.zhonghui.mes.service.IMesProjectMaintenanceService;

/**
 * 制造执行MES-项目维护Service业务层处理
 * 
 * @author zhonghui
 * @date 2024-03-28
 */
@Service
public class MesProjectMaintenanceServiceImpl implements IMesProjectMaintenanceService 
{
    @Autowired
    private MesProjectMaintenanceMapper mesProjectMaintenanceMapper;

    /**
     * 查询制造执行MES-项目维护
     * 
     * @param id 制造执行MES-项目维护主键
     * @return 制造执行MES-项目维护
     */
    @Override
    public MesProjectMaintenance selectMesProjectMaintenanceById(String id)
    {
        return mesProjectMaintenanceMapper.selectMesProjectMaintenanceById(id);
    }

    /**
     * 查询制造执行MES-项目维护列表
     * 
     * @param mesProjectMaintenance 制造执行MES-项目维护
     * @return 制造执行MES-项目维护
     */
    @Override
    public List<MesProjectMaintenance> selectMesProjectMaintenanceList(MesProjectMaintenance mesProjectMaintenance)
    {
        return mesProjectMaintenanceMapper.selectMesProjectMaintenanceList(mesProjectMaintenance);
    }

    /**
     * 新增制造执行MES-项目维护
     * 
     * @param mesProjectMaintenance 制造执行MES-项目维护
     * @return 结果
     */
    @Override
    public int insertMesProjectMaintenance(MesProjectMaintenance mesProjectMaintenance)
    {
        return mesProjectMaintenanceMapper.insertMesProjectMaintenance(mesProjectMaintenance);
    }

    /**
     * 修改制造执行MES-项目维护
     * 
     * @param mesProjectMaintenance 制造执行MES-项目维护
     * @return 结果
     */
    @Override
    public int updateMesProjectMaintenance(MesProjectMaintenance mesProjectMaintenance)
    {
        return mesProjectMaintenanceMapper.updateMesProjectMaintenance(mesProjectMaintenance);
    }

    /**
     * 批量删除制造执行MES-项目维护
     * 
     * @param ids 需要删除的制造执行MES-项目维护主键
     * @return 结果
     */
    @Override
    public int deleteMesProjectMaintenanceByIds(String[] ids)
    {
        return mesProjectMaintenanceMapper.deleteMesProjectMaintenanceByIds(ids);
    }

    /**
     * 删除制造执行MES-项目维护信息
     * 
     * @param id 制造执行MES-项目维护主键
     * @return 结果
     */
    @Override
    public int deleteMesProjectMaintenanceById(String id)
    {
        return mesProjectMaintenanceMapper.deleteMesProjectMaintenanceById(id);
    }
}
