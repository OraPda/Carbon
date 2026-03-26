package com.zhonghui.mes.mapper;

import java.util.List;
import com.zhonghui.mes.domain.MesProduct;
import com.zhonghui.mes.domain.MesProductMaterialItem;

/**
 * 制造执行MES-产品建模Mapper接口
 * 
 * @author yang
 * @date 2024-04-01
 */
public interface MesProductMapper 
{
    /**
     * 查询制造执行MES-产品建模
     * 
     * @param id 制造执行MES-产品建模主键
     * @return 制造执行MES-产品建模
     */
    public MesProduct selectMesProductById(String id);

    /**
     * 查询制造执行MES-产品建模列表
     * 
     * @param mesProduct 制造执行MES-产品建模
     * @return 制造执行MES-产品建模集合
     */
    public List<MesProduct> selectMesProductList(MesProduct mesProduct);

    /**
     * 新增制造执行MES-产品建模
     * 
     * @param mesProduct 制造执行MES-产品建模
     * @return 结果
     */
    public int insertMesProduct(MesProduct mesProduct);

    /**
     * 修改制造执行MES-产品建模
     * 
     * @param mesProduct 制造执行MES-产品建模
     * @return 结果
     */
    public int updateMesProduct(MesProduct mesProduct);

    /**
     * 删除制造执行MES-产品建模
     * 
     * @param id 制造执行MES-产品建模主键
     * @return 结果
     */
    public int deleteMesProductById(String id);

    /**
     * 批量删除制造执行MES-产品建模
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMesProductByIds(String[] ids);

    /**
     * 批量删除制造执行MES-产品建模明细信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMesProductMaterialItemByProductIds(String[] ids);
    
    /**
     * 批量新增制造执行MES-产品建模明细信息
     * 
     * @param mesProductMaterialItemList 制造执行MES-产品建模明细信息列表
     * @return 结果
     */
    public int batchMesProductMaterialItem(List<MesProductMaterialItem> mesProductMaterialItemList);
    

    /**
     * 通过制造执行MES-产品建模主键删除制造执行MES-产品建模明细信息信息
     * 
     * @param id 制造执行MES-产品建模ID
     * @return 结果
     */
    public int deleteMesProductMaterialItemByProductId(String id);

    /**
     * 通过物料id查询产品列表
     *
     * @param materialId 物料id数组
     * @return 结果
     */
    public List<MesProduct> selectMesProductByMaterialIds(Long[] materialId);
}
