package com.zhonghui.mes.mapper;

import java.util.List;
import com.zhonghui.mes.domain.MesInspectionStandards;

/**
 * 制造执行MES-质量管理-质检标准Mapper接口
 * 
 * @author yang
 * @date 2024-04-10
 */
public interface MesInspectionStandardsMapper 
{
    /**
     * 查询制造执行MES-质量管理-质检标准
     * 
     * @param id 制造执行MES-质量管理-质检标准主键
     * @return 制造执行MES-质量管理-质检标准
     */
    public MesInspectionStandards selectMesInspectionStandardsById(Long id);

    /**
     * 查询制造执行MES-质量管理-质检标准列表
     * 
     * @param mesInspectionStandards 制造执行MES-质量管理-质检标准
     * @return 制造执行MES-质量管理-质检标准集合
     */
    public List<MesInspectionStandards> selectMesInspectionStandardsList(MesInspectionStandards mesInspectionStandards);

    /**
     * 新增制造执行MES-质量管理-质检标准
     * 
     * @param mesInspectionStandards 制造执行MES-质量管理-质检标准
     * @return 结果
     */
    public int insertMesInspectionStandards(MesInspectionStandards mesInspectionStandards);

    /**
     * 修改制造执行MES-质量管理-质检标准
     * 
     * @param mesInspectionStandards 制造执行MES-质量管理-质检标准
     * @return 结果
     */
    public int updateMesInspectionStandards(MesInspectionStandards mesInspectionStandards);

    /**
     * 删除制造执行MES-质量管理-质检标准
     * 
     * @param id 制造执行MES-质量管理-质检标准主键
     * @return 结果
     */
    public int deleteMesInspectionStandardsById(Long id);

    /**
     * 批量删除制造执行MES-质量管理-质检标准
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMesInspectionStandardsByIds(Long[] ids);
}
