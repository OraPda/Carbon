package com.zhonghui.mes.mapper;

import java.util.List;
import com.zhonghui.mes.domain.MesErrorManagement;

/**
 * 制造执行MES-质量管理-防错管理Mapper接口
 * 
 * @author yang
 * @date 2024-04-12
 */
public interface MesErrorManagementMapper 
{
    /**
     * 查询制造执行MES-质量管理-防错管理
     * 
     * @param id 制造执行MES-质量管理-防错管理主键
     * @return 制造执行MES-质量管理-防错管理
     */
    public MesErrorManagement selectMesErrorManagementById(Long id);

    /**
     * 查询制造执行MES-质量管理-防错管理列表
     * 
     * @param mesErrorManagement 制造执行MES-质量管理-防错管理
     * @return 制造执行MES-质量管理-防错管理集合
     */
    public List<MesErrorManagement> selectMesErrorManagementList(MesErrorManagement mesErrorManagement);

    /**
     * 新增制造执行MES-质量管理-防错管理
     * 
     * @param mesErrorManagement 制造执行MES-质量管理-防错管理
     * @return 结果
     */
    public int insertMesErrorManagement(MesErrorManagement mesErrorManagement);

    /**
     * 修改制造执行MES-质量管理-防错管理
     * 
     * @param mesErrorManagement 制造执行MES-质量管理-防错管理
     * @return 结果
     */
    public int updateMesErrorManagement(MesErrorManagement mesErrorManagement);

    /**
     * 删除制造执行MES-质量管理-防错管理
     * 
     * @param id 制造执行MES-质量管理-防错管理主键
     * @return 结果
     */
    public int deleteMesErrorManagementById(Long id);

    /**
     * 批量删除制造执行MES-质量管理-防错管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMesErrorManagementByIds(Long[] ids);
}
