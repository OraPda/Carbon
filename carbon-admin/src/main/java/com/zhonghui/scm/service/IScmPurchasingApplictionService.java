package com.zhonghui.scm.service;

import java.util.List;
import com.zhonghui.scm.domain.ScmPurchasingAppliction;

/**
 * 供应链SCM-采购管理-采购申请Service接口
 * 
 * @author yang
 * @date 2024-04-14
 */
public interface IScmPurchasingApplictionService 
{
    /**
     * 查询供应链SCM-采购管理-采购申请
     * 
     * @param id 供应链SCM-采购管理-采购申请主键
     * @return 供应链SCM-采购管理-采购申请
     */
    public ScmPurchasingAppliction selectScmPurchasingApplictionById(Long id);

    /**
     * 查询供应链SCM-采购管理-采购申请列表
     * 
     * @param scmPurchasingAppliction 供应链SCM-采购管理-采购申请
     * @return 供应链SCM-采购管理-采购申请集合
     */
    public List<ScmPurchasingAppliction> selectScmPurchasingApplictionList(ScmPurchasingAppliction scmPurchasingAppliction);

    /**
     * 新增供应链SCM-采购管理-采购申请
     * 
     * @param scmPurchasingAppliction 供应链SCM-采购管理-采购申请
     * @return 结果
     */
    public int insertScmPurchasingAppliction(ScmPurchasingAppliction scmPurchasingAppliction);

    /**
     * 修改供应链SCM-采购管理-采购申请
     * 
     * @param scmPurchasingAppliction 供应链SCM-采购管理-采购申请
     * @return 结果
     */
    public int updateScmPurchasingAppliction(ScmPurchasingAppliction scmPurchasingAppliction);

    /**
     * 批量删除供应链SCM-采购管理-采购申请
     * 
     * @param ids 需要删除的供应链SCM-采购管理-采购申请主键集合
     * @return 结果
     */
    public int deleteScmPurchasingApplictionByIds(Long[] ids);

    /**
     * 删除供应链SCM-采购管理-采购申请信息
     * 
     * @param id 供应链SCM-采购管理-采购申请主键
     * @return 结果
     */
    public int deleteScmPurchasingApplictionById(Long id);
}
