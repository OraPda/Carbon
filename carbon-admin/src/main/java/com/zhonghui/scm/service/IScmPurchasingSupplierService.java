package com.zhonghui.scm.service;

import java.util.List;
import com.zhonghui.scm.domain.ScmPurchasingSupplier;

/**
 * 供应链SCM-采购管理-供应商Service接口
 * 
 * @author zhonghui
 * @date 2024-04-12
 */
public interface IScmPurchasingSupplierService 
{
    /**
     * 查询供应链SCM-采购管理-供应商
     * 
     * @param id 供应链SCM-采购管理-供应商主键
     * @return 供应链SCM-采购管理-供应商
     */
    public ScmPurchasingSupplier selectScmPurchasingSupplierById(Long id);

    /**
     * 查询供应链SCM-采购管理-供应商列表
     * 
     * @param scmPurchasingSupplier 供应链SCM-采购管理-供应商
     * @return 供应链SCM-采购管理-供应商集合
     */
    public List<ScmPurchasingSupplier> selectScmPurchasingSupplierList(ScmPurchasingSupplier scmPurchasingSupplier);

    /**
     * 新增供应链SCM-采购管理-供应商
     * 
     * @param scmPurchasingSupplier 供应链SCM-采购管理-供应商
     * @return 结果
     */
    public int insertScmPurchasingSupplier(ScmPurchasingSupplier scmPurchasingSupplier);

    /**
     * 修改供应链SCM-采购管理-供应商
     * 
     * @param scmPurchasingSupplier 供应链SCM-采购管理-供应商
     * @return 结果
     */
    public int updateScmPurchasingSupplier(ScmPurchasingSupplier scmPurchasingSupplier);

    /**
     * 批量删除供应链SCM-采购管理-供应商
     * 
     * @param ids 需要删除的供应链SCM-采购管理-供应商主键集合
     * @return 结果
     */
    public int deleteScmPurchasingSupplierByIds(Long[] ids);

    /**
     * 删除供应链SCM-采购管理-供应商信息
     * 
     * @param id 供应链SCM-采购管理-供应商主键
     * @return 结果
     */
    public int deleteScmPurchasingSupplierById(Long id);
}
