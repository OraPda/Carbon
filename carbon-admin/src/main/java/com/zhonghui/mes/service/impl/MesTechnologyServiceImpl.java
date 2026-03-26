package com.zhonghui.mes.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhonghui.mes.mapper.MesTechnologyMapper;
import com.zhonghui.mes.domain.MesTechnology;
import com.zhonghui.mes.service.IMesTechnologyService;

/**
 * 制造执行MES-工艺建模Service业务层处理
 * 
 * @author yang
 * @date 2024-03-28
 */
@Service
public class MesTechnologyServiceImpl implements IMesTechnologyService 
{
    @Autowired
    private MesTechnologyMapper mesTechnologyMapper;

    /**
     * 查询制造执行MES-工艺建模
     * 
     * @param id 制造执行MES-工艺建模主键
     * @return 制造执行MES-工艺建模
     */
    @Override
    public MesTechnology selectMesTechnologyById(String id)
    {
        return mesTechnologyMapper.selectMesTechnologyById(id);
    }

    /**
     * 查询制造执行MES-工艺建模列表
     * 
     * @param mesTechnology 制造执行MES-工艺建模
     * @return 制造执行MES-工艺建模
     */
    @Override
    public List<MesTechnology> selectMesTechnologyList(MesTechnology mesTechnology)
    {
        return mesTechnologyMapper.selectMesTechnologyList(mesTechnology);
    }

    /**
     * 新增制造执行MES-工艺建模
     * 
     * @param mesTechnology 制造执行MES-工艺建模
     * @return 结果
     */
    @Override
    public int insertMesTechnology(MesTechnology mesTechnology)
    {
        return mesTechnologyMapper.insertMesTechnology(mesTechnology);
    }

    /**
     * 修改制造执行MES-工艺建模
     * 
     * @param mesTechnology 制造执行MES-工艺建模
     * @return 结果
     */
    @Override
    public int updateMesTechnology(MesTechnology mesTechnology)
    {
        return mesTechnologyMapper.updateMesTechnology(mesTechnology);
    }

    /**
     * 批量删除制造执行MES-工艺建模
     * 
     * @param ids 需要删除的制造执行MES-工艺建模主键
     * @return 结果
     */
    @Override
    public int deleteMesTechnologyByIds(String[] ids)
    {
        return mesTechnologyMapper.deleteMesTechnologyByIds(ids);
    }

    /**
     * 删除制造执行MES-工艺建模信息
     * 
     * @param id 制造执行MES-工艺建模主键
     * @return 结果
     */
    @Override
    public int deleteMesTechnologyById(String id)
    {
        return mesTechnologyMapper.deleteMesTechnologyById(id);
    }
}
