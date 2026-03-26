package com.zhonghui.mes.service;

import java.util.List;
import com.zhonghui.mes.domain.MesProjectMaintenance;

/**
 * 制造执行MES-项目维护Service接口
 * 
 * @author zhonghui
 * @date 2024-03-28
 */
public interface IMesProjectMaintenanceService 
{
    /**
     * 查询制造执行MES-项目维护
     * 
     * @param id 制造执行MES-项目维护主键
     * @return 制造执行MES-项目维护
     */
    public MesProjectMaintenance selectMesProjectMaintenanceById(String id);

    /**
     * 查询制造执行MES-项目维护列表
     * 
     * @param mesProjectMaintenance 制造执行MES-项目维护
     * @return 制造执行MES-项目维护集合
     */
    public List<MesProjectMaintenance> selectMesProjectMaintenanceList(MesProjectMaintenance mesProjectMaintenance);

    /**
     * 新增制造执行MES-项目维护
     * 
     * @param mesProjectMaintenance 制造执行MES-项目维护
     * @return 结果
     */
    public int insertMesProjectMaintenance(MesProjectMaintenance mesProjectMaintenance);

    /**
     * 修改制造执行MES-项目维护
     * 
     * @param mesProjectMaintenance 制造执行MES-项目维护
     * @return 结果
     */
    public int updateMesProjectMaintenance(MesProjectMaintenance mesProjectMaintenance);

    /**
     * 批量删除制造执行MES-项目维护
     * 
     * @param ids 需要删除的制造执行MES-项目维护主键集合
     * @return 结果
     */
    public int deleteMesProjectMaintenanceByIds(String[] ids);

    /**
     * 删除制造执行MES-项目维护信息
     * 
     * @param id 制造执行MES-项目维护主键
     * @return 结果
     */
    public int deleteMesProjectMaintenanceById(String id);
}
