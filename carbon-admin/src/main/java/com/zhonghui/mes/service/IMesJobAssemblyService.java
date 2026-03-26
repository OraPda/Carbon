package com.zhonghui.mes.service;

import java.util.List;
import com.zhonghui.mes.domain.MesJobAssembly;

/**
 * 制造执行MES-生产作业Service接口
 * 
 * @author yang
 * @date 2024-04-10
 */
public interface IMesJobAssemblyService 
{
    /**
     * 查询制造执行MES-生产作业
     * 
     * @param id 制造执行MES-生产作业主键
     * @return 制造执行MES-生产作业
     */
    public MesJobAssembly selectMesJobAssemblyById(Long id);

    /**
     * 查询制造执行MES-生产作业列表
     * 
     * @param mesJobAssembly 制造执行MES-生产作业
     * @return 制造执行MES-生产作业集合
     */
    public List<MesJobAssembly> selectMesJobAssemblyList(MesJobAssembly mesJobAssembly);

    /**
     * 新增制造执行MES-生产作业
     * 
     * @param mesJobAssembly 制造执行MES-生产作业
     * @return 结果
     */
    public int insertMesJobAssembly(MesJobAssembly mesJobAssembly);

    /**
     * 修改制造执行MES-生产作业
     * 
     * @param mesJobAssembly 制造执行MES-生产作业
     * @return 结果
     */
    public int updateMesJobAssembly(MesJobAssembly mesJobAssembly);

    /**
     * 批量删除制造执行MES-生产作业
     * 
     * @param ids 需要删除的制造执行MES-生产作业主键集合
     * @return 结果
     */
    public int deleteMesJobAssemblyByIds(Long[] ids);

    /**
     * 删除制造执行MES-生产作业信息
     * 
     * @param id 制造执行MES-生产作业主键
     * @return 结果
     */
    public int deleteMesJobAssemblyById(Long id);
}
