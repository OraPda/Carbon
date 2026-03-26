package com.zhonghui.scm.service;

import java.util.List;
import com.zhonghui.scm.domain.ScmSaleReturn;

/**
 * 供应链SCM-销售管理-销售退货Service接口
 * 
 * @author yang
 * @date 2024-04-13
 */
public interface IScmSaleReturnService 
{
    /**
     * 查询供应链SCM-销售管理-销售退货
     * 
     * @param id 供应链SCM-销售管理-销售退货主键
     * @return 供应链SCM-销售管理-销售退货
     */
    public ScmSaleReturn selectScmSaleReturnById(Long id);

    /**
     * 查询供应链SCM-销售管理-销售退货列表
     * 
     * @param scmSaleReturn 供应链SCM-销售管理-销售退货
     * @return 供应链SCM-销售管理-销售退货集合
     */
    public List<ScmSaleReturn> selectScmSaleReturnList(ScmSaleReturn scmSaleReturn);

    /**
     * 新增供应链SCM-销售管理-销售退货
     * 
     * @param scmSaleReturn 供应链SCM-销售管理-销售退货
     * @return 结果
     */
    public int insertScmSaleReturn(ScmSaleReturn scmSaleReturn);

    /**
     * 修改供应链SCM-销售管理-销售退货
     * 
     * @param scmSaleReturn 供应链SCM-销售管理-销售退货
     * @return 结果
     */
    public int updateScmSaleReturn(ScmSaleReturn scmSaleReturn);

    /**
     * 批量删除供应链SCM-销售管理-销售退货
     * 
     * @param ids 需要删除的供应链SCM-销售管理-销售退货主键集合
     * @return 结果
     */
    public int deleteScmSaleReturnByIds(Long[] ids);

    /**
     * 删除供应链SCM-销售管理-销售退货信息
     * 
     * @param id 供应链SCM-销售管理-销售退货主键
     * @return 结果
     */
    public int deleteScmSaleReturnById(Long id);
}
