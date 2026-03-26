package com.zhonghui.mes.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhonghui.mes.mapper.MesProductInspectorMapper;
import com.zhonghui.mes.domain.MesProductInspector;
import com.zhonghui.mes.service.IMesProductInspectorService;

/**
 * 制造执行MES-质量管理-产品检验
Service业务层处理
 * 
 * @author yang
 * @date 2024-04-09
 */
@Service
public class MesProductInspectorServiceImpl implements IMesProductInspectorService 
{
    @Autowired
    private MesProductInspectorMapper mesProductInspectorMapper;

    /**
     * 查询制造执行MES-质量管理-产品检验

     * 
     * @param id 制造执行MES-质量管理-产品检验
主键
     * @return 制造执行MES-质量管理-产品检验

     */
    @Override
    public MesProductInspector selectMesProductInspectorById(Long id)
    {
        return mesProductInspectorMapper.selectMesProductInspectorById(id);
    }

    /**
     * 查询制造执行MES-质量管理-产品检验
列表
     * 
     * @param mesProductInspector 制造执行MES-质量管理-产品检验

     * @return 制造执行MES-质量管理-产品检验

     */
    @Override
    public List<MesProductInspector> selectMesProductInspectorList(MesProductInspector mesProductInspector)
    {
        return mesProductInspectorMapper.selectMesProductInspectorList(mesProductInspector);
    }

    /**
     * 新增制造执行MES-质量管理-产品检验

     * 
     * @param mesProductInspector 制造执行MES-质量管理-产品检验

     * @return 结果
     */
    @Override
    public int insertMesProductInspector(MesProductInspector mesProductInspector)
    {
        return mesProductInspectorMapper.insertMesProductInspector(mesProductInspector);
    }

    /**
     * 修改制造执行MES-质量管理-产品检验

     * 
     * @param mesProductInspector 制造执行MES-质量管理-产品检验

     * @return 结果
     */
    @Override
    public int updateMesProductInspector(MesProductInspector mesProductInspector)
    {
        return mesProductInspectorMapper.updateMesProductInspector(mesProductInspector);
    }

    /**
     * 批量删除制造执行MES-质量管理-产品检验

     * 
     * @param ids 需要删除的制造执行MES-质量管理-产品检验
主键
     * @return 结果
     */
    @Override
    public int deleteMesProductInspectorByIds(Long[] ids)
    {
        return mesProductInspectorMapper.deleteMesProductInspectorByIds(ids);
    }

    /**
     * 删除制造执行MES-质量管理-产品检验
信息
     * 
     * @param id 制造执行MES-质量管理-产品检验
主键
     * @return 结果
     */
    @Override
    public int deleteMesProductInspectorById(Long id)
    {
        return mesProductInspectorMapper.deleteMesProductInspectorById(id);
    }
}
