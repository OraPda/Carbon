package com.zhonghui.mes.mapper;

import java.util.List;
import com.zhonghui.mes.domain.MesProductionSampling;

/**
 * 制造执行MES-质量管理-生产采样Mapper接口
 * 
 * @author zhonghui
 * @date 2024-04-11
 */
public interface MesProductionSamplingMapper 
{
    /**
     * 查询制造执行MES-质量管理-生产采样
     * 
     * @param id 制造执行MES-质量管理-生产采样主键
     * @return 制造执行MES-质量管理-生产采样
     */
    public MesProductionSampling selectMesProductionSamplingById(Long id);

    /**
     * 查询制造执行MES-质量管理-生产采样列表
     * 
     * @param mesProductionSampling 制造执行MES-质量管理-生产采样
     * @return 制造执行MES-质量管理-生产采样集合
     */
    public List<MesProductionSampling> selectMesProductionSamplingList(MesProductionSampling mesProductionSampling);

    /**
     * 新增制造执行MES-质量管理-生产采样
     * 
     * @param mesProductionSampling 制造执行MES-质量管理-生产采样
     * @return 结果
     */
    public int insertMesProductionSampling(MesProductionSampling mesProductionSampling);

    /**
     * 修改制造执行MES-质量管理-生产采样
     * 
     * @param mesProductionSampling 制造执行MES-质量管理-生产采样
     * @return 结果
     */
    public int updateMesProductionSampling(MesProductionSampling mesProductionSampling);

    /**
     * 删除制造执行MES-质量管理-生产采样
     * 
     * @param id 制造执行MES-质量管理-生产采样主键
     * @return 结果
     */
    public int deleteMesProductionSamplingById(Long id);

    /**
     * 批量删除制造执行MES-质量管理-生产采样
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMesProductionSamplingByIds(Long[] ids);
}
