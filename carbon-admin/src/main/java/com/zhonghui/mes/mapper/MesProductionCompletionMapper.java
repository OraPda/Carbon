package com.zhonghui.mes.mapper;

import java.util.List;
import com.zhonghui.mes.domain.MesProductionCompletion;

/**
 * 制造执行MES-生产完工单Mapper接口
 * 
 * @author yang
 * @date 2024-04-09
 */
public interface MesProductionCompletionMapper 
{
    /**
     * 查询制造执行MES-生产完工单
     * 
     * @param id 制造执行MES-生产完工单主键
     * @return 制造执行MES-生产完工单
     */
    public MesProductionCompletion selectMesProductionCompletionById(Long id);

    /**
     * 查询制造执行MES-生产完工单列表
     * 
     * @param mesProductionCompletion 制造执行MES-生产完工单
     * @return 制造执行MES-生产完工单集合
     */
    public List<MesProductionCompletion> selectMesProductionCompletionList(MesProductionCompletion mesProductionCompletion);

    /**
     * 新增制造执行MES-生产完工单
     * 
     * @param mesProductionCompletion 制造执行MES-生产完工单
     * @return 结果
     */
    public int insertMesProductionCompletion(MesProductionCompletion mesProductionCompletion);

    /**
     * 修改制造执行MES-生产完工单
     * 
     * @param mesProductionCompletion 制造执行MES-生产完工单
     * @return 结果
     */
    public int updateMesProductionCompletion(MesProductionCompletion mesProductionCompletion);

    /**
     * 删除制造执行MES-生产完工单
     * 
     * @param id 制造执行MES-生产完工单主键
     * @return 结果
     */
    public int deleteMesProductionCompletionById(Long id);

    /**
     * 批量删除制造执行MES-生产完工单
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMesProductionCompletionByIds(Long[] ids);
}
