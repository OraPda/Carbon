package com.zhonghui.mes.mapper;

import java.util.List;
import com.zhonghui.mes.domain.MesProjectMaintenance;

/**
 * 制造执行MES-项目维护Mapper接口
 * 
 * @author zhonghui
 * @date 2024-03-28
 */
public interface MesProjectMaintenanceMapper 
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
     * 删除制造执行MES-项目维护
     * 
     * @param id 制造执行MES-项目维护主键
     * @return 结果
     */
    public int deleteMesProjectMaintenanceById(String id);

    /**
     * 批量删除制造执行MES-项目维护
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMesProjectMaintenanceByIds(String[] ids);
}
