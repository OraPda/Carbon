package com.zhonghui.mes.service;

import java.util.List;
import com.zhonghui.mes.domain.MesProductInspector;

/**
 * 制造执行MES-质量管理-产品检验
Service接口
 * 
 * @author yang
 * @date 2024-04-09
 */
public interface IMesProductInspectorService 
{
    /**
     * 查询制造执行MES-质量管理-产品检验

     * 
     * @param id 制造执行MES-质量管理-产品检验
主键
     * @return 制造执行MES-质量管理-产品检验

     */
    public MesProductInspector selectMesProductInspectorById(Long id);

    /**
     * 查询制造执行MES-质量管理-产品检验
列表
     * 
     * @param mesProductInspector 制造执行MES-质量管理-产品检验

     * @return 制造执行MES-质量管理-产品检验
集合
     */
    public List<MesProductInspector> selectMesProductInspectorList(MesProductInspector mesProductInspector);

    /**
     * 新增制造执行MES-质量管理-产品检验

     * 
     * @param mesProductInspector 制造执行MES-质量管理-产品检验

     * @return 结果
     */
    public int insertMesProductInspector(MesProductInspector mesProductInspector);

    /**
     * 修改制造执行MES-质量管理-产品检验

     * 
     * @param mesProductInspector 制造执行MES-质量管理-产品检验

     * @return 结果
     */
    public int updateMesProductInspector(MesProductInspector mesProductInspector);

    /**
     * 批量删除制造执行MES-质量管理-产品检验

     * 
     * @param ids 需要删除的制造执行MES-质量管理-产品检验
主键集合
     * @return 结果
     */
    public int deleteMesProductInspectorByIds(Long[] ids);

    /**
     * 删除制造执行MES-质量管理-产品检验
信息
     * 
     * @param id 制造执行MES-质量管理-产品检验
主键
     * @return 结果
     */
    public int deleteMesProductInspectorById(Long id);
}
