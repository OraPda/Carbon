package com.zhonghui.mes.service;

import java.util.List;
import com.zhonghui.mes.domain.MesBom;

/**
 * 制造执行MES-BOMService接口
 * 
 * @author yang
 * @date 2024-04-03
 */
public interface IMesBomService 
{
    /**
     * 查询制造执行MES-BOM
     * 
     * @param id 制造执行MES-BOM主键
     * @return 制造执行MES-BOM
     */
    public MesBom selectMesBomById(String id);

    /**
     * 查询制造执行MES-BOM列表
     * 
     * @param mesBom 制造执行MES-BOM
     * @return 制造执行MES-BOM集合
     */
    public List<MesBom> selectMesBomList(MesBom mesBom);

    /**
     * 新增制造执行MES-BOM
     * 
     * @param mesBom 制造执行MES-BOM
     * @return 结果
     */
    public int insertMesBom(MesBom mesBom);

    /**
     * 修改制造执行MES-BOM
     * 
     * @param mesBom 制造执行MES-BOM
     * @return 结果
     */
    public int updateMesBom(MesBom mesBom);

    /**
     * 批量删除制造执行MES-BOM
     * 
     * @param ids 需要删除的制造执行MES-BOM主键集合
     * @return 结果
     */
    public int deleteMesBomByIds(String[] ids);

    /**
     * 删除制造执行MES-BOM信息
     * 
     * @param id 制造执行MES-BOM主键
     * @return 结果
     */
    public int deleteMesBomById(String id);

    /**
     * 查询bom信息
     * @param materialID
     * @return
     */


    public List<MesBom> selectMesBomListByMaterialId(Long id);
}
