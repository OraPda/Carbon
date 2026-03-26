package com.zhonghui.scm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhonghui.scm.mapper.ScmPurchasingSupplierMapper;
import com.zhonghui.scm.domain.ScmPurchasingSupplier;
import com.zhonghui.scm.service.IScmPurchasingSupplierService;

/**
 * 供应链SCM-采购管理-供应商Service业务层处理
 * 
 * @author zhonghui
 * @date 2024-04-12
 */
@Service
public class ScmPurchasingSupplierServiceImpl implements IScmPurchasingSupplierService 
{
    @Autowired
    private ScmPurchasingSupplierMapper scmPurchasingSupplierMapper;

    /**
     * 查询供应链SCM-采购管理-供应商
     * 
     * @param id 供应链SCM-采购管理-供应商主键
     * @return 供应链SCM-采购管理-供应商
     */
    @Override
    public ScmPurchasingSupplier selectScmPurchasingSupplierById(Long id)
    {
        return scmPurchasingSupplierMapper.selectScmPurchasingSupplierById(id);
    }

    /**
     * 查询供应链SCM-采购管理-供应商列表
     * 
     * @param scmPurchasingSupplier 供应链SCM-采购管理-供应商
     * @return 供应链SCM-采购管理-供应商
     */
    @Override
    public List<ScmPurchasingSupplier> selectScmPurchasingSupplierList(ScmPurchasingSupplier scmPurchasingSupplier)
    {
        return scmPurchasingSupplierMapper.selectScmPurchasingSupplierList(scmPurchasingSupplier);
    }

    /**
     * 新增供应链SCM-采购管理-供应商
     * 
     * @param scmPurchasingSupplier 供应链SCM-采购管理-供应商
     * @return 结果
     */
    @Override
    public int insertScmPurchasingSupplier(ScmPurchasingSupplier scmPurchasingSupplier)
    {
        return scmPurchasingSupplierMapper.insertScmPurchasingSupplier(scmPurchasingSupplier);
    }

    /**
     * 修改供应链SCM-采购管理-供应商
     * 
     * @param scmPurchasingSupplier 供应链SCM-采购管理-供应商
     * @return 结果
     */
    @Override
    public int updateScmPurchasingSupplier(ScmPurchasingSupplier scmPurchasingSupplier)
    {
        return scmPurchasingSupplierMapper.updateScmPurchasingSupplier(scmPurchasingSupplier);
    }

    /**
     * 批量删除供应链SCM-采购管理-供应商
     * 
     * @param ids 需要删除的供应链SCM-采购管理-供应商主键
     * @return 结果
     */
    @Override
    public int deleteScmPurchasingSupplierByIds(Long[] ids)
    {
        return scmPurchasingSupplierMapper.deleteScmPurchasingSupplierByIds(ids);
    }

    /**
     * 删除供应链SCM-采购管理-供应商信息
     * 
     * @param id 供应链SCM-采购管理-供应商主键
     * @return 结果
     */
    @Override
    public int deleteScmPurchasingSupplierById(Long id)
    {
        return scmPurchasingSupplierMapper.deleteScmPurchasingSupplierById(id);
    }
}
