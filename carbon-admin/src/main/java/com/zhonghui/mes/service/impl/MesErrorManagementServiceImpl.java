package com.zhonghui.mes.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhonghui.mes.mapper.MesErrorManagementMapper;
import com.zhonghui.mes.domain.MesErrorManagement;
import com.zhonghui.mes.service.IMesErrorManagementService;

/**
 * 制造执行MES-质量管理-防错管理Service业务层处理
 * 
 * @author yang
 * @date 2024-04-12
 */
@Service
public class MesErrorManagementServiceImpl implements IMesErrorManagementService 
{
    @Autowired
    private MesErrorManagementMapper mesErrorManagementMapper;

    /**
     * 查询制造执行MES-质量管理-防错管理
     * 
     * @param id 制造执行MES-质量管理-防错管理主键
     * @return 制造执行MES-质量管理-防错管理
     */
    @Override
    public MesErrorManagement selectMesErrorManagementById(Long id)
    {
        return mesErrorManagementMapper.selectMesErrorManagementById(id);
    }

    /**
     * 查询制造执行MES-质量管理-防错管理列表
     * 
     * @param mesErrorManagement 制造执行MES-质量管理-防错管理
     * @return 制造执行MES-质量管理-防错管理
     */
    @Override
    public List<MesErrorManagement> selectMesErrorManagementList(MesErrorManagement mesErrorManagement)
    {
        return mesErrorManagementMapper.selectMesErrorManagementList(mesErrorManagement);
    }

    /**
     * 新增制造执行MES-质量管理-防错管理
     * 
     * @param mesErrorManagement 制造执行MES-质量管理-防错管理
     * @return 结果
     */
    @Override
    public int insertMesErrorManagement(MesErrorManagement mesErrorManagement)
    {
        return mesErrorManagementMapper.insertMesErrorManagement(mesErrorManagement);
    }

    /**
     * 修改制造执行MES-质量管理-防错管理
     * 
     * @param mesErrorManagement 制造执行MES-质量管理-防错管理
     * @return 结果
     */
    @Override
    public int updateMesErrorManagement(MesErrorManagement mesErrorManagement)
    {
        return mesErrorManagementMapper.updateMesErrorManagement(mesErrorManagement);
    }

    /**
     * 批量删除制造执行MES-质量管理-防错管理
     * 
     * @param ids 需要删除的制造执行MES-质量管理-防错管理主键
     * @return 结果
     */
    @Override
    public int deleteMesErrorManagementByIds(Long[] ids)
    {
        return mesErrorManagementMapper.deleteMesErrorManagementByIds(ids);
    }

    /**
     * 删除制造执行MES-质量管理-防错管理信息
     * 
     * @param id 制造执行MES-质量管理-防错管理主键
     * @return 结果
     */
    @Override
    public int deleteMesErrorManagementById(Long id)
    {
        return mesErrorManagementMapper.deleteMesErrorManagementById(id);
    }
}
