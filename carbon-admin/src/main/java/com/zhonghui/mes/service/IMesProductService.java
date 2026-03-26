package com.zhonghui.mes.service;

import java.util.List;
import com.zhonghui.mes.domain.MesProduct;

/**
 * 制造执行MES-产品建模Service接口
 * 
 * @author yang
 * @date 2024-04-01
 */
public interface IMesProductService 
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
     * 批量删除制造执行MES-产品建模
     * 
     * @param ids 需要删除的制造执行MES-产品建模主键集合
     * @return 结果
     */
    public int deleteMesProductByIds(String[] ids);

    /**
     * 删除制造执行MES-产品建模信息
     * 
     * @param id 制造执行MES-产品建模主键
     * @return 结果
     */
    public int deleteMesProductById(String id);
}
