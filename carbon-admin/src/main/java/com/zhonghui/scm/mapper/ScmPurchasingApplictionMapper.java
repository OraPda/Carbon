package com.zhonghui.scm.mapper;

import java.util.List;
import com.zhonghui.scm.domain.ScmPurchasingAppliction;
import com.zhonghui.scm.domain.ScmPurchasingApplictionDetail;

/**
 * 供应链SCM-采购管理-采购申请Mapper接口
 * 
 * @author yang
 * @date 2024-04-14
 */
public interface ScmPurchasingApplictionMapper 
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
     * 删除供应链SCM-采购管理-采购申请
     * 
     * @param id 供应链SCM-采购管理-采购申请主键
     * @return 结果
     */
    public int deleteScmPurchasingApplictionById(Long id);

    /**
     * 批量删除供应链SCM-采购管理-采购申请
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteScmPurchasingApplictionByIds(Long[] ids);

    /**
     * 批量删除供应链SCM-采购管理-采购申请明细
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteScmPurchasingApplictionDetailByPurchasingApplicationIds(Long[] ids);
    
    /**
     * 批量新增供应链SCM-采购管理-采购申请明细
     * 
     * @param scmPurchasingApplictionDetailList 供应链SCM-采购管理-采购申请明细列表
     * @return 结果
     */
    public int batchScmPurchasingApplictionDetail(List<ScmPurchasingApplictionDetail> scmPurchasingApplictionDetailList);
    

    /**
     * 通过供应链SCM-采购管理-采购申请主键删除供应链SCM-采购管理-采购申请明细信息
     * 
     * @param id 供应链SCM-采购管理-采购申请ID
     * @return 结果
     */
    public int deleteScmPurchasingApplictionDetailByPurchasingApplicationId(Long id);
}
