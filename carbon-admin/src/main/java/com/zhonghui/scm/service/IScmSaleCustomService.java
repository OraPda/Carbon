package com.zhonghui.scm.service;

import java.util.List;
import com.zhonghui.scm.domain.ScmSaleCustom;

/**
 * 供应链SCM-销售管理-客户档案Service接口
 * 
 * @author yang
 * @date 2024-04-13
 */
public interface IScmSaleCustomService 
{
    /**
     * 查询供应链SCM-销售管理-客户档案
     * 
     * @param id 供应链SCM-销售管理-客户档案主键
     * @return 供应链SCM-销售管理-客户档案
     */
    public ScmSaleCustom selectScmSaleCustomById(Long id);

    /**
     * 查询供应链SCM-销售管理-客户档案列表
     * 
     * @param scmSaleCustom 供应链SCM-销售管理-客户档案
     * @return 供应链SCM-销售管理-客户档案集合
     */
    public List<ScmSaleCustom> selectScmSaleCustomList(ScmSaleCustom scmSaleCustom);

    /**
     * 新增供应链SCM-销售管理-客户档案
     * 
     * @param scmSaleCustom 供应链SCM-销售管理-客户档案
     * @return 结果
     */
    public int insertScmSaleCustom(ScmSaleCustom scmSaleCustom);

    /**
     * 修改供应链SCM-销售管理-客户档案
     * 
     * @param scmSaleCustom 供应链SCM-销售管理-客户档案
     * @return 结果
     */
    public int updateScmSaleCustom(ScmSaleCustom scmSaleCustom);

    /**
     * 批量删除供应链SCM-销售管理-客户档案
     * 
     * @param ids 需要删除的供应链SCM-销售管理-客户档案主键集合
     * @return 结果
     */
    public int deleteScmSaleCustomByIds(Long[] ids);

    /**
     * 删除供应链SCM-销售管理-客户档案信息
     * 
     * @param id 供应链SCM-销售管理-客户档案主键
     * @return 结果
     */
    public int deleteScmSaleCustomById(Long id);
}
