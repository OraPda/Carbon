package com.zhonghui.mes.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhonghui.mes.mapper.MesProductionCompletionMapper;
import com.zhonghui.mes.domain.MesProductionCompletion;
import com.zhonghui.mes.service.IMesProductionCompletionService;

/**
 * 制造执行MES-生产完工单Service业务层处理
 * 
 * @author yang
 * @date 2024-04-09
 */
@Service
public class MesProductionCompletionServiceImpl implements IMesProductionCompletionService 
{
    @Autowired
    private MesProductionCompletionMapper mesProductionCompletionMapper;

    /**
     * 查询制造执行MES-生产完工单
     * 
     * @param id 制造执行MES-生产完工单主键
     * @return 制造执行MES-生产完工单
     */
    @Override
    public MesProductionCompletion selectMesProductionCompletionById(Long id)
    {
        return mesProductionCompletionMapper.selectMesProductionCompletionById(id);
    }

    /**
     * 查询制造执行MES-生产完工单列表
     * 
     * @param mesProductionCompletion 制造执行MES-生产完工单
     * @return 制造执行MES-生产完工单
     */
    @Override
    public List<MesProductionCompletion> selectMesProductionCompletionList(MesProductionCompletion mesProductionCompletion)
    {
        return mesProductionCompletionMapper.selectMesProductionCompletionList(mesProductionCompletion);
    }

    /**
     * 新增制造执行MES-生产完工单
     * 
     * @param mesProductionCompletion 制造执行MES-生产完工单
     * @return 结果
     */
    @Override
    public int insertMesProductionCompletion(MesProductionCompletion mesProductionCompletion)
    {
        return mesProductionCompletionMapper.insertMesProductionCompletion(mesProductionCompletion);
    }

    /**
     * 修改制造执行MES-生产完工单
     * 
     * @param mesProductionCompletion 制造执行MES-生产完工单
     * @return 结果
     */
    @Override
    public int updateMesProductionCompletion(MesProductionCompletion mesProductionCompletion)
    {
        return mesProductionCompletionMapper.updateMesProductionCompletion(mesProductionCompletion);
    }

    /**
     * 批量删除制造执行MES-生产完工单
     * 
     * @param ids 需要删除的制造执行MES-生产完工单主键
     * @return 结果
     */
    @Override
    public int deleteMesProductionCompletionByIds(Long[] ids)
    {
        return mesProductionCompletionMapper.deleteMesProductionCompletionByIds(ids);
    }

    /**
     * 删除制造执行MES-生产完工单信息
     * 
     * @param id 制造执行MES-生产完工单主键
     * @return 结果
     */
    @Override
    public int deleteMesProductionCompletionById(Long id)
    {
        return mesProductionCompletionMapper.deleteMesProductionCompletionById(id);
    }
}
