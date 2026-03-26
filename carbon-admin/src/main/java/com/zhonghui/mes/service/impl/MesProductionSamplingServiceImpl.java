package com.zhonghui.mes.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhonghui.mes.mapper.MesProductionSamplingMapper;
import com.zhonghui.mes.domain.MesProductionSampling;
import com.zhonghui.mes.service.IMesProductionSamplingService;

/**
 * 制造执行MES-质量管理-生产采样Service业务层处理
 * 
 * @author zhonghui
 * @date 2024-04-11
 */
@Service
public class MesProductionSamplingServiceImpl implements IMesProductionSamplingService 
{
    @Autowired
    private MesProductionSamplingMapper mesProductionSamplingMapper;

    /**
     * 查询制造执行MES-质量管理-生产采样
     * 
     * @param id 制造执行MES-质量管理-生产采样主键
     * @return 制造执行MES-质量管理-生产采样
     */
    @Override
    public MesProductionSampling selectMesProductionSamplingById(Long id)
    {
        return mesProductionSamplingMapper.selectMesProductionSamplingById(id);
    }

    /**
     * 查询制造执行MES-质量管理-生产采样列表
     * 
     * @param mesProductionSampling 制造执行MES-质量管理-生产采样
     * @return 制造执行MES-质量管理-生产采样
     */
    @Override
    public List<MesProductionSampling> selectMesProductionSamplingList(MesProductionSampling mesProductionSampling)
    {
        return mesProductionSamplingMapper.selectMesProductionSamplingList(mesProductionSampling);
    }

    /**
     * 新增制造执行MES-质量管理-生产采样
     * 
     * @param mesProductionSampling 制造执行MES-质量管理-生产采样
     * @return 结果
     */
    @Override
    public int insertMesProductionSampling(MesProductionSampling mesProductionSampling)
    {
        //设置流水号
        mesProductionSampling.setSerialNumber(generateNumber("SCCY"));
        return mesProductionSamplingMapper.insertMesProductionSampling(mesProductionSampling);
    }

    /**
     * 修改制造执行MES-质量管理-生产采样
     * 
     * @param mesProductionSampling 制造执行MES-质量管理-生产采样
     * @return 结果
     */
    @Override
    public int updateMesProductionSampling(MesProductionSampling mesProductionSampling)
    {
        return mesProductionSamplingMapper.updateMesProductionSampling(mesProductionSampling);
    }

    /**
     * 批量删除制造执行MES-质量管理-生产采样
     * 
     * @param ids 需要删除的制造执行MES-质量管理-生产采样主键
     * @return 结果
     */
    @Override
    public int deleteMesProductionSamplingByIds(Long[] ids)
    {
        return mesProductionSamplingMapper.deleteMesProductionSamplingByIds(ids);
    }

    /**
     * 删除制造执行MES-质量管理-生产采样信息
     * 
     * @param id 制造执行MES-质量管理-生产采样主键
     * @return 结果
     */
    @Override
    public int deleteMesProductionSamplingById(Long id)
    {
        return mesProductionSamplingMapper.deleteMesProductionSamplingById(id);
    }
/**流水号新增函数需要记*/
    public String generateNumber(String number){
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return number+format.format(date);
    }
}
