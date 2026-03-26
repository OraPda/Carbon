package com.zhonghui.scm.mapper;

import java.util.List;
import com.zhonghui.scm.domain.ScmSaleContract;
import com.zhonghui.scm.domain.ScmSaleContractItem;

/**
 * 供应链SCM-销售管理-销售合同Mapper接口
 * 
 * @author zhonghui
 * @date 2024-04-12
 */
public interface ScmSaleContractMapper 
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
     * 删除供应链SCM-销售管理-销售合同
     * 
     * @param id 供应链SCM-销售管理-销售合同主键
     * @return 结果
     */
    public int deleteScmSaleContractById(Long id);

    /**
     * 批量删除供应链SCM-销售管理-销售合同
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteScmSaleContractByIds(Long[] ids);

    /**
     * 批量删除供应链SCM-销售管理-销售合同子
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteScmSaleContractItemByIds(Long[] ids);
    
    /**
     * 批量新增供应链SCM-销售管理-销售合同子
     * 
     * @param scmSaleContractItemList 供应链SCM-销售管理-销售合同子列表
     * @return 结果
     */
    public int batchScmSaleContractItem(List<ScmSaleContractItem> scmSaleContractItemList);
    

    /**
     * 通过供应链SCM-销售管理-销售合同主键删除供应链SCM-销售管理-销售合同子信息
     * 
     * @param id 供应链SCM-销售管理-销售合同ID
     * @return 结果
     */
    public int deleteScmSaleContractItemById(Long id);
}
