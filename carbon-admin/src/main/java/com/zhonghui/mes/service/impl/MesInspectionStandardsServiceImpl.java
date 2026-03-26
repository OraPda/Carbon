package com.zhonghui.mes.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhonghui.mes.mapper.MesInspectionStandardsMapper;
import com.zhonghui.mes.domain.MesInspectionStandards;
import com.zhonghui.mes.service.IMesInspectionStandardsService;

/**
 * 制造执行MES-质量管理-质检标准Service业务层处理
 * 
 * @author yang
 * @date 2024-04-10
 */
@Service
public class MesInspectionStandardsServiceImpl implements IMesInspectionStandardsService 
{
    @Autowired
    private MesInspectionStandardsMapper mesInspectionStandardsMapper;

    /**
     * 查询制造执行MES-质量管理-质检标准
     * 
     * @param id 制造执行MES-质量管理-质检标准主键
     * @return 制造执行MES-质量管理-质检标准
     */
    @Override
    public MesInspectionStandards selectMesInspectionStandardsById(Long id)
    {
        return mesInspectionStandardsMapper.selectMesInspectionStandardsById(id);
    }

    /**
     * 查询制造执行MES-质量管理-质检标准列表
     * 
     * @param mesInspectionStandards 制造执行MES-质量管理-质检标准
     * @return 制造执行MES-质量管理-质检标准
     */
    @Override
    public List<MesInspectionStandards> selectMesInspectionStandardsList(MesInspectionStandards mesInspectionStandards)
    {
        return mesInspectionStandardsMapper.selectMesInspectionStandardsList(mesInspectionStandards);
    }

    /**
     * 新增制造执行MES-质量管理-质检标准
     * 
     * @param mesInspectionStandards 制造执行MES-质量管理-质检标准
     * @return 结果
     */
    @Override
    public int insertMesInspectionStandards(MesInspectionStandards mesInspectionStandards)
    {
        return mesInspectionStandardsMapper.insertMesInspectionStandards(mesInspectionStandards);
    }

    /**
     * 修改制造执行MES-质量管理-质检标准
     * 
     * @param mesInspectionStandards 制造执行MES-质量管理-质检标准
     * @return 结果
     */
    @Override
    public int updateMesInspectionStandards(MesInspectionStandards mesInspectionStandards)
    {
        return mesInspectionStandardsMapper.updateMesInspectionStandards(mesInspectionStandards);
    }

    /**
     * 批量删除制造执行MES-质量管理-质检标准
     * 
     * @param ids 需要删除的制造执行MES-质量管理-质检标准主键
     * @return 结果
     */
    @Override
    public int deleteMesInspectionStandardsByIds(Long[] ids)
    {
        return mesInspectionStandardsMapper.deleteMesInspectionStandardsByIds(ids);
    }

    /**
     * 删除制造执行MES-质量管理-质检标准信息
     * 
     * @param id 制造执行MES-质量管理-质检标准主键
     * @return 结果
     */
    @Override
    public int deleteMesInspectionStandardsById(Long id)
    {
        return mesInspectionStandardsMapper.deleteMesInspectionStandardsById(id);
    }
}
