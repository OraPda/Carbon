package com.zhonghui.scm.mapper;

import java.util.List;
import com.zhonghui.scm.domain.ScmSaleReturn;
import com.zhonghui.scm.domain.ScmSaleReturnItem;

/**
 * 供应链SCM-销售管理-销售退货Mapper接口
 * 
 * @author yang
 * @date 2024-04-13
 */
public interface ScmSaleReturnMapper 
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
     * 删除供应链SCM-销售管理-销售退货
     * 
     * @param id 供应链SCM-销售管理-销售退货主键
     * @return 结果
     */
    public int deleteScmSaleReturnById(Long id);

    /**
     * 批量删除供应链SCM-销售管理-销售退货
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteScmSaleReturnByIds(Long[] ids);

    /**
     * 批量删除供应链SCM-销售管理-销售退货子
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteScmSaleReturnItemByReturnIds(Long[] ids);
    
    /**
     * 批量新增供应链SCM-销售管理-销售退货子
     * 
     * @param scmSaleReturnItemList 供应链SCM-销售管理-销售退货子列表
     * @return 结果
     */
    public int batchScmSaleReturnItem(List<ScmSaleReturnItem> scmSaleReturnItemList);
    

    /**
     * 通过供应链SCM-销售管理-销售退货主键删除供应链SCM-销售管理-销售退货子信息
     * 
     * @param id 供应链SCM-销售管理-销售退货ID
     * @return 结果
     */
    public int deleteScmSaleReturnItemByReturnId(Long id);
}
