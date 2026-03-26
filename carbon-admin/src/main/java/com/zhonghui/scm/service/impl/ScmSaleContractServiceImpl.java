package com.zhonghui.scm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.zhonghui.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.zhonghui.scm.domain.ScmSaleContractItem;
import com.zhonghui.scm.mapper.ScmSaleContractMapper;
import com.zhonghui.scm.domain.ScmSaleContract;
import com.zhonghui.scm.service.IScmSaleContractService;

/**
 * 供应链SCM-销售管理-销售合同Service业务层处理
 * 
 * @author zhonghui
 * @date 2024-04-12
 */
@Service
public class ScmSaleContractServiceImpl implements IScmSaleContractService 
{
    @Autowired
    private ScmSaleContractMapper scmSaleContractMapper;

    /**
     * 查询供应链SCM-销售管理-销售合同
     * 
     * @param id 供应链SCM-销售管理-销售合同主键
     * @return 供应链SCM-销售管理-销售合同
     */
    @Override
    public ScmSaleContract selectScmSaleContractById(Long id)
    {
        return scmSaleContractMapper.selectScmSaleContractById(id);
    }

    /**
     * 查询供应链SCM-销售管理-销售合同列表
     * 
     * @param scmSaleContract 供应链SCM-销售管理-销售合同
     * @return 供应链SCM-销售管理-销售合同
     */
    @Override
    public List<ScmSaleContract> selectScmSaleContractList(ScmSaleContract scmSaleContract)
    {
        return scmSaleContractMapper.selectScmSaleContractList(scmSaleContract);
    }

    /**
     * 新增供应链SCM-销售管理-销售合同
     * 
     * @param scmSaleContract 供应链SCM-销售管理-销售合同
     * @return 结果
     */
    @Transactional
    @Override
    public int insertScmSaleContract(ScmSaleContract scmSaleContract)
    {
        int rows = scmSaleContractMapper.insertScmSaleContract(scmSaleContract);
        insertScmSaleContractItem(scmSaleContract);
        return rows;
    }

    /**
     * 修改供应链SCM-销售管理-销售合同
     * 
     * @param scmSaleContract 供应链SCM-销售管理-销售合同
     * @return 结果
     */
    @Transactional
    @Override
    public int updateScmSaleContract(ScmSaleContract scmSaleContract)
    {
        scmSaleContractMapper.deleteScmSaleContractItemById(scmSaleContract.getId());
        insertScmSaleContractItem(scmSaleContract);
        return scmSaleContractMapper.updateScmSaleContract(scmSaleContract);
    }

    /**
     * 批量删除供应链SCM-销售管理-销售合同
     * 
     * @param ids 需要删除的供应链SCM-销售管理-销售合同主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteScmSaleContractByIds(Long[] ids)
    {
        scmSaleContractMapper.deleteScmSaleContractItemByIds(ids);
        return scmSaleContractMapper.deleteScmSaleContractByIds(ids);
    }

    /**
     * 删除供应链SCM-销售管理-销售合同信息
     * 
     * @param id 供应链SCM-销售管理-销售合同主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteScmSaleContractById(Long id)
    {
        scmSaleContractMapper.deleteScmSaleContractItemById(id);
        return scmSaleContractMapper.deleteScmSaleContractById(id);
    }

    /**
     * 新增供应链SCM-销售管理-销售合同子信息
     * 
     * @param scmSaleContract 供应链SCM-销售管理-销售合同对象
     */
    public void insertScmSaleContractItem(ScmSaleContract scmSaleContract)
    {
        List<ScmSaleContractItem> scmSaleContractItemList = scmSaleContract.getScmSaleContractItemList();
        Long id = scmSaleContract.getId();
        if (StringUtils.isNotNull(scmSaleContractItemList))
        {
            List<ScmSaleContractItem> list = new ArrayList<ScmSaleContractItem>();
            for (ScmSaleContractItem scmSaleContractItem : scmSaleContractItemList)
            {
                scmSaleContractItem.setId(id);
                list.add(scmSaleContractItem);
            }
            if (list.size() > 0)
            {
                scmSaleContractMapper.batchScmSaleContractItem(list);
            }
        }
    }
}
