package com.zhonghui.scm.service.impl;

import java.util.List;
import com.zhonghui.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhonghui.scm.mapper.ScmSaleCustomMapper;
import com.zhonghui.scm.domain.ScmSaleCustom;
import com.zhonghui.scm.service.IScmSaleCustomService;

/**
 * 供应链SCM-销售管理-客户档案Service业务层处理
 * 
 * @author yang
 * @date 2024-04-13
 */
@Service
public class ScmSaleCustomServiceImpl implements IScmSaleCustomService 
{
    @Autowired
    private ScmSaleCustomMapper scmSaleCustomMapper;

    /**
     * 查询供应链SCM-销售管理-客户档案
     * 
     * @param id 供应链SCM-销售管理-客户档案主键
     * @return 供应链SCM-销售管理-客户档案
     */
    @Override
    public ScmSaleCustom selectScmSaleCustomById(Long id)
    {
        return scmSaleCustomMapper.selectScmSaleCustomById(id);
    }

    /**
     * 查询供应链SCM-销售管理-客户档案列表
     * 
     * @param scmSaleCustom 供应链SCM-销售管理-客户档案
     * @return 供应链SCM-销售管理-客户档案
     */
    @Override
    public List<ScmSaleCustom> selectScmSaleCustomList(ScmSaleCustom scmSaleCustom)
    {
        return scmSaleCustomMapper.selectScmSaleCustomList(scmSaleCustom);
    }

    /**
     * 新增供应链SCM-销售管理-客户档案
     * 
     * @param scmSaleCustom 供应链SCM-销售管理-客户档案
     * @return 结果
     */
    @Override
    public int insertScmSaleCustom(ScmSaleCustom scmSaleCustom)
    {
        scmSaleCustom.setCreateTime(DateUtils.getNowDate());
        return scmSaleCustomMapper.insertScmSaleCustom(scmSaleCustom);
    }

    /**
     * 修改供应链SCM-销售管理-客户档案
     * 
     * @param scmSaleCustom 供应链SCM-销售管理-客户档案
     * @return 结果
     */
    @Override
    public int updateScmSaleCustom(ScmSaleCustom scmSaleCustom)
    {
        return scmSaleCustomMapper.updateScmSaleCustom(scmSaleCustom);
    }

    /**
     * 批量删除供应链SCM-销售管理-客户档案
     * 
     * @param ids 需要删除的供应链SCM-销售管理-客户档案主键
     * @return 结果
     */
    @Override
    public int deleteScmSaleCustomByIds(Long[] ids)
    {
        return scmSaleCustomMapper.deleteScmSaleCustomByIds(ids);
    }

    /**
     * 删除供应链SCM-销售管理-客户档案信息
     * 
     * @param id 供应链SCM-销售管理-客户档案主键
     * @return 结果
     */
    @Override
    public int deleteScmSaleCustomById(Long id)
    {
        return scmSaleCustomMapper.deleteScmSaleCustomById(id);
    }
}
