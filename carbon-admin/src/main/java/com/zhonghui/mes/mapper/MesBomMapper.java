package com.zhonghui.mes.mapper;

import java.util.List;
import com.zhonghui.mes.domain.MesBom;
import com.zhonghui.mes.domain.MesBomDetailItem;

/**
 * 制造执行MES-BOMMapper接口
 * 
 * @author yang
 * @date 2024-04-03
 */
public interface MesBomMapper 
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
     * 删除制造执行MES-BOM
     * 
     * @param id 制造执行MES-BOM主键
     * @return 结果
     */
    public int deleteMesBomById(String id);

    /**
     * 批量删除制造执行MES-BOM
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMesBomByIds(String[] ids);

    /**
     * 批量删除制造执行MES-BOM明细信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMesBomDetailItemByBomIds(String[] ids);
    
    /**
     * 批量新增制造执行MES-BOM明细信息
     * 
     * @param mesBomDetailItemList 制造执行MES-BOM明细信息列表
     * @return 结果
     */
    public int batchMesBomDetailItem(List<MesBomDetailItem> mesBomDetailItemList);
    

    /**
     * 通过制造执行MES-BOM主键删除制造执行MES-BOM明细信息信息
     * 
     * @param id 制造执行MES-BOMID
     * @return 结果
     */
    public int deleteMesBomDetailItemByBomId(String id);

    /**
     * 通过产品id查询BOM列表
     *
     * @param productId 产品id数组
     * @return 结果
     */
    public List<MesBom> selectMesBomListByProductIds(Long[] productId);

}
