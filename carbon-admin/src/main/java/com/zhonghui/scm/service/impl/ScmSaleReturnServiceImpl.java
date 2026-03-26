package com.zhonghui.scm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.zhonghui.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.zhonghui.scm.domain.ScmSaleReturnItem;
import com.zhonghui.scm.mapper.ScmSaleReturnMapper;
import com.zhonghui.scm.domain.ScmSaleReturn;
import com.zhonghui.scm.service.IScmSaleReturnService;

/**
 * 供应链SCM-销售管理-销售退货Service业务层处理
 * 
 * @author yang
 * @date 2024-04-13
 */
@Service
public class ScmSaleReturnServiceImpl implements IScmSaleReturnService 
{
    @Autowired
    private ScmSaleReturnMapper scmSaleReturnMapper;

    /**
     * 查询供应链SCM-销售管理-销售退货
     * 
     * @param id 供应链SCM-销售管理-销售退货主键
     * @return 供应链SCM-销售管理-销售退货
     */
    @Override
    public ScmSaleReturn selectScmSaleReturnById(Long id)
    {
        return scmSaleReturnMapper.selectScmSaleReturnById(id);
    }

    /**
     * 查询供应链SCM-销售管理-销售退货列表
     * 
     * @param scmSaleReturn 供应链SCM-销售管理-销售退货
     * @return 供应链SCM-销售管理-销售退货
     */
    @Override
    public List<ScmSaleReturn> selectScmSaleReturnList(ScmSaleReturn scmSaleReturn)
    {
        return scmSaleReturnMapper.selectScmSaleReturnList(scmSaleReturn);
    }

    /**
     * 新增供应链SCM-销售管理-销售退货
     * 
     * @param scmSaleReturn 供应链SCM-销售管理-销售退货
     * @return 结果
     */
    @Transactional
    @Override
    public int insertScmSaleReturn(ScmSaleReturn scmSaleReturn)
    {
        int rows = scmSaleReturnMapper.insertScmSaleReturn(scmSaleReturn);
        insertScmSaleReturnItem(scmSaleReturn);
        return rows;
    }

    /**
     * 修改供应链SCM-销售管理-销售退货
     * 
     * @param scmSaleReturn 供应链SCM-销售管理-销售退货
     * @return 结果
     */
    @Transactional
    @Override
    public int updateScmSaleReturn(ScmSaleReturn scmSaleReturn)
    {
        scmSaleReturnMapper.deleteScmSaleReturnItemByReturnId(scmSaleReturn.getId());
        insertScmSaleReturnItem(scmSaleReturn);
        return scmSaleReturnMapper.updateScmSaleReturn(scmSaleReturn);
    }

    /**
     * 批量删除供应链SCM-销售管理-销售退货
     * 
     * @param ids 需要删除的供应链SCM-销售管理-销售退货主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteScmSaleReturnByIds(Long[] ids)
    {
        scmSaleReturnMapper.deleteScmSaleReturnItemByReturnIds(ids);
        return scmSaleReturnMapper.deleteScmSaleReturnByIds(ids);
    }

    /**
     * 删除供应链SCM-销售管理-销售退货信息
     * 
     * @param id 供应链SCM-销售管理-销售退货主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteScmSaleReturnById(Long id)
    {
        scmSaleReturnMapper.deleteScmSaleReturnItemByReturnId(id);
        return scmSaleReturnMapper.deleteScmSaleReturnById(id);
    }

    /**
     * 新增供应链SCM-销售管理-销售退货子信息
     * 
     * @param scmSaleReturn 供应链SCM-销售管理-销售退货对象
     */
    public void insertScmSaleReturnItem(ScmSaleReturn scmSaleReturn)
    {
        List<ScmSaleReturnItem> scmSaleReturnItemList = scmSaleReturn.getScmSaleReturnItemList();
        Long id = scmSaleReturn.getId();
        if (StringUtils.isNotNull(scmSaleReturnItemList))
        {
            List<ScmSaleReturnItem> list = new ArrayList<ScmSaleReturnItem>();
            for (ScmSaleReturnItem scmSaleReturnItem : scmSaleReturnItemList)
            {
                scmSaleReturnItem.setReturnId(id);
                list.add(scmSaleReturnItem);
            }
            if (list.size() > 0)
            {
                scmSaleReturnMapper.batchScmSaleReturnItem(list);
            }
        }
    }
}
