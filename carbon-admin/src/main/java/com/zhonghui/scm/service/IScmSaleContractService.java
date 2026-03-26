package com.zhonghui.scm.service;

import java.util.List;
import com.zhonghui.scm.domain.ScmSaleContract;

/**
 * 供应链SCM-销售管理-销售合同Service接口
 * 
 * @author zhonghui
 * @date 2024-04-12
 */
public interface IScmSaleContractService 
{
    /**
     * 查询供应链SCM-销售管理-销售合同
     * 
     * @param id 供应链SCM-销售管理-销售合同主键
     * @return 供应链SCM-销售管理-销售合同
     */
    public ScmSaleContract selectScmSaleContractById(Long id);

    /**
     * 查询供应链SCM-销售管理-销售合同列表
     * 
     * @param scmSaleContract 供应链SCM-销售管理-销售合同
     * @return 供应链SCM-销售管理-销售合同集合
     */
    public List<ScmSaleContract> selectScmSaleContractList(ScmSaleContract scmSaleContract);

    /**
     * 新增供应链SCM-销售管理-销售合同
     * 
     * @param scmSaleContract 供应链SCM-销售管理-销售合同
     * @return 结果
     */
    public int insertScmSaleContract(ScmSaleContract scmSaleContract);

    /**
     * 修改供应链SCM-销售管理-销售合同
     * 
     * @param scmSaleContract 供应链SCM-销售管理-销售合同
     * @return 结果
     */
    public int updateScmSaleContract(ScmSaleContract scmSaleContract);

    /**
     * 批量删除供应链SCM-销售管理-销售合同
     * 
     * @param ids 需要删除的供应链SCM-销售管理-销售合同主键集合
     * @return 结果
     */
    public int deleteScmSaleContractByIds(Long[] ids);

    /**
     * 删除供应链SCM-销售管理-销售合同信息
     * 
     * @param id 供应链SCM-销售管理-销售合同主键
     * @return 结果
     */
    public int deleteScmSaleContractById(Long id);
}
