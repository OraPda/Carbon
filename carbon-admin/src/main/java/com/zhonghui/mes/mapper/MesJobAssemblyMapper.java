package com.zhonghui.mes.mapper;

import java.util.List;
import com.zhonghui.mes.domain.MesJobAssembly;
import com.zhonghui.mes.domain.MesJobAssemblyItem;

/**
 * 制造执行MES-生产作业Mapper接口
 * 
 * @author yang
 * @date 2024-04-10
 */
public interface MesJobAssemblyMapper 
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
     * 删除制造执行MES-生产作业
     * 
     * @param id 制造执行MES-生产作业主键
     * @return 结果
     */
    public int deleteMesJobAssemblyById(Long id);

    /**
     * 批量删除制造执行MES-生产作业
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMesJobAssemblyByIds(Long[] ids);

    /**
     * 批量删除制造执行MES-生产作业明细
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMesJobAssemblyItemByJobIds(Long[] ids);
    
    /**
     * 批量新增制造执行MES-生产作业明细
     * 
     * @param mesJobAssemblyItemList 制造执行MES-生产作业明细列表
     * @return 结果
     */
    public int batchMesJobAssemblyItem(List<MesJobAssemblyItem> mesJobAssemblyItemList);
    

    /**
     * 通过制造执行MES-生产作业主键删除制造执行MES-生产作业明细信息
     * 
     * @param id 制造执行MES-生产作业ID
     * @return 结果
     */
    public int deleteMesJobAssemblyItemByJobId(Long id);
}
