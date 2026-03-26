package com.zhonghui.mes.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.zhonghui.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.zhonghui.mes.domain.MesJobAssemblyItem;
import com.zhonghui.mes.mapper.MesJobAssemblyMapper;
import com.zhonghui.mes.domain.MesJobAssembly;
import com.zhonghui.mes.service.IMesJobAssemblyService;

/**
 * 制造执行MES-生产作业Service业务层处理
 * 
 * @author yang
 * @date 2024-04-10
 */
@Service
public class MesJobAssemblyServiceImpl implements IMesJobAssemblyService 
{
    @Autowired
    private MesJobAssemblyMapper mesJobAssemblyMapper;

    /**
     * 查询制造执行MES-生产作业
     * 
     * @param id 制造执行MES-生产作业主键
     * @return 制造执行MES-生产作业
     */
    @Override
    public MesJobAssembly selectMesJobAssemblyById(Long id)
    {
        return mesJobAssemblyMapper.selectMesJobAssemblyById(id);
    }

    /**
     * 查询制造执行MES-生产作业列表
     * 
     * @param mesJobAssembly 制造执行MES-生产作业
     * @return 制造执行MES-生产作业
     */
    @Override
    public List<MesJobAssembly> selectMesJobAssemblyList(MesJobAssembly mesJobAssembly)
    {
        return mesJobAssemblyMapper.selectMesJobAssemblyList(mesJobAssembly);
    }

    /**
     * 新增制造执行MES-生产作业
     * 
     * @param mesJobAssembly 制造执行MES-生产作业
     * @return 结果
     */
    @Transactional
    @Override
    public int insertMesJobAssembly(MesJobAssembly mesJobAssembly)
    {
        int rows = mesJobAssemblyMapper.insertMesJobAssembly(mesJobAssembly);
        insertMesJobAssemblyItem(mesJobAssembly);
        return rows;
    }

    /**
     * 修改制造执行MES-生产作业
     * 
     * @param mesJobAssembly 制造执行MES-生产作业
     * @return 结果
     */
    @Transactional
    @Override
    public int updateMesJobAssembly(MesJobAssembly mesJobAssembly)
    {
        mesJobAssemblyMapper.deleteMesJobAssemblyItemByJobId(mesJobAssembly.getId());
        insertMesJobAssemblyItem(mesJobAssembly);
        return mesJobAssemblyMapper.updateMesJobAssembly(mesJobAssembly);
    }

    /**
     * 批量删除制造执行MES-生产作业
     * 
     * @param ids 需要删除的制造执行MES-生产作业主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteMesJobAssemblyByIds(Long[] ids)
    {
        mesJobAssemblyMapper.deleteMesJobAssemblyItemByJobIds(ids);
        return mesJobAssemblyMapper.deleteMesJobAssemblyByIds(ids);
    }

    /**
     * 删除制造执行MES-生产作业信息
     * 
     * @param id 制造执行MES-生产作业主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteMesJobAssemblyById(Long id)
    {
        mesJobAssemblyMapper.deleteMesJobAssemblyItemByJobId(id);
        return mesJobAssemblyMapper.deleteMesJobAssemblyById(id);
    }

    /**
     * 新增制造执行MES-生产作业明细信息
     * 
     * @param mesJobAssembly 制造执行MES-生产作业对象
     */
    public void insertMesJobAssemblyItem(MesJobAssembly mesJobAssembly)
    {
        List<MesJobAssemblyItem> mesJobAssemblyItemList = mesJobAssembly.getMesJobAssemblyItemList();
        Long id = mesJobAssembly.getId();
        if (StringUtils.isNotNull(mesJobAssemblyItemList))
        {
            List<MesJobAssemblyItem> list = new ArrayList<MesJobAssemblyItem>();
            for (MesJobAssemblyItem mesJobAssemblyItem : mesJobAssemblyItemList)
            {
                mesJobAssemblyItem.setJobId(id);
                list.add(mesJobAssemblyItem);
            }
            if (list.size() > 0)
            {
                mesJobAssemblyMapper.batchMesJobAssemblyItem(list);
            }
        }
    }
}
