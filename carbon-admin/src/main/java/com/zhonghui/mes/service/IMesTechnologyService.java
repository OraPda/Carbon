package com.zhonghui.mes.service;

import java.util.List;
import com.zhonghui.mes.domain.MesTechnology;

/**
 * 制造执行MES-工艺建模Service接口
 * 
 * @author yang
 * @date 2024-03-28
 */
public interface IMesTechnologyService 
{
    /**
     * 查询制造执行MES-工艺建模
     * 
     * @param id 制造执行MES-工艺建模主键
     * @return 制造执行MES-工艺建模
     */
    public MesTechnology selectMesTechnologyById(String id);

    /**
     * 查询制造执行MES-工艺建模列表
     * 
     * @param mesTechnology 制造执行MES-工艺建模
     * @return 制造执行MES-工艺建模集合
     */
    public List<MesTechnology> selectMesTechnologyList(MesTechnology mesTechnology);

    /**
     * 新增制造执行MES-工艺建模
     * 
     * @param mesTechnology 制造执行MES-工艺建模
     * @return 结果
     */
    public int insertMesTechnology(MesTechnology mesTechnology);

    /**
     * 修改制造执行MES-工艺建模
     * 
     * @param mesTechnology 制造执行MES-工艺建模
     * @return 结果
     */
    public int updateMesTechnology(MesTechnology mesTechnology);

    /**
     * 批量删除制造执行MES-工艺建模
     * 
     * @param ids 需要删除的制造执行MES-工艺建模主键集合
     * @return 结果
     */
    public int deleteMesTechnologyByIds(String[] ids);

    /**
     * 删除制造执行MES-工艺建模信息
     * 
     * @param id 制造执行MES-工艺建模主键
     * @return 结果
     */
    public int deleteMesTechnologyById(String id);
}
