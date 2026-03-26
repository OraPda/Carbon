package com.zhonghui.wms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.zhonghui.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.zhonghui.wms.domain.WmsReplenishmentApplicationDetails;
import com.zhonghui.wms.mapper.WmsReplenishmentApplicationMapper;
import com.zhonghui.wms.domain.WmsReplenishmentApplication;
import com.zhonghui.wms.service.IWmsReplenishmentApplicationService;

/**
 * 智能仓储WMS-补货申请Service业务层处理
 * 
 * @author zhonghui
 * @date 2024-04-12
 */
@Service
public class WmsReplenishmentApplicationServiceImpl implements IWmsReplenishmentApplicationService 
{
    @Autowired
    private WmsReplenishmentApplicationMapper wmsReplenishmentApplicationMapper;

    /**
     * 查询智能仓储WMS-补货申请
     * 
     * @param id 智能仓储WMS-补货申请主键
     * @return 智能仓储WMS-补货申请
     */
    @Override
    public WmsReplenishmentApplication selectWmsReplenishmentApplicationById(Long id)
    {
        return wmsReplenishmentApplicationMapper.selectWmsReplenishmentApplicationById(id);
    }

    /**
     * 查询智能仓储WMS-补货申请列表
     * 
     * @param wmsReplenishmentApplication 智能仓储WMS-补货申请
     * @return 智能仓储WMS-补货申请
     */
    @Override
    public List<WmsReplenishmentApplication> selectWmsReplenishmentApplicationList(WmsReplenishmentApplication wmsReplenishmentApplication)
    {
        return wmsReplenishmentApplicationMapper.selectWmsReplenishmentApplicationList(wmsReplenishmentApplication);
    }

    /**
     * 新增智能仓储WMS-补货申请
     * 
     * @param wmsReplenishmentApplication 智能仓储WMS-补货申请
     * @return 结果
     */
    @Transactional
    @Override
    public int insertWmsReplenishmentApplication(WmsReplenishmentApplication wmsReplenishmentApplication)
    {
        int rows = wmsReplenishmentApplicationMapper.insertWmsReplenishmentApplication(wmsReplenishmentApplication);
        insertWmsReplenishmentApplicationDetails(wmsReplenishmentApplication);
        return rows;
    }

    /**
     * 修改智能仓储WMS-补货申请
     * 
     * @param wmsReplenishmentApplication 智能仓储WMS-补货申请
     * @return 结果
     */
    @Transactional
    @Override
    public int updateWmsReplenishmentApplication(WmsReplenishmentApplication wmsReplenishmentApplication)
    {
        wmsReplenishmentApplicationMapper.deleteWmsReplenishmentApplicationDetailsById(wmsReplenishmentApplication.getId());
        insertWmsReplenishmentApplicationDetails(wmsReplenishmentApplication);
        return wmsReplenishmentApplicationMapper.updateWmsReplenishmentApplication(wmsReplenishmentApplication);
    }

    /**
     * 批量删除智能仓储WMS-补货申请
     * 
     * @param ids 需要删除的智能仓储WMS-补货申请主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteWmsReplenishmentApplicationByIds(Long[] ids)
    {
        wmsReplenishmentApplicationMapper.deleteWmsReplenishmentApplicationDetailsByIds(ids);
        return wmsReplenishmentApplicationMapper.deleteWmsReplenishmentApplicationByIds(ids);
    }

    /**
     * 删除智能仓储WMS-补货申请信息
     * 
     * @param id 智能仓储WMS-补货申请主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteWmsReplenishmentApplicationById(Long id)
    {
        wmsReplenishmentApplicationMapper.deleteWmsReplenishmentApplicationDetailsById(id);
        return wmsReplenishmentApplicationMapper.deleteWmsReplenishmentApplicationById(id);
    }

    /**
     * 新增智能仓储WMS-补货申请明细信息
     * 
     * @param wmsReplenishmentApplication 智能仓储WMS-补货申请对象
     */
    public void insertWmsReplenishmentApplicationDetails(WmsReplenishmentApplication wmsReplenishmentApplication)
    {
        List<WmsReplenishmentApplicationDetails> wmsReplenishmentApplicationDetailsList = wmsReplenishmentApplication.getWmsReplenishmentApplicationDetailsList();
        Long id = wmsReplenishmentApplication.getId();
        if (StringUtils.isNotNull(wmsReplenishmentApplicationDetailsList))
        {
            List<WmsReplenishmentApplicationDetails> list = new ArrayList<WmsReplenishmentApplicationDetails>();
            for (WmsReplenishmentApplicationDetails wmsReplenishmentApplicationDetails : wmsReplenishmentApplicationDetailsList)
            {
                wmsReplenishmentApplicationDetails.setId(id);
                list.add(wmsReplenishmentApplicationDetails);
            }
            if (list.size() > 0)
            {
                wmsReplenishmentApplicationMapper.batchWmsReplenishmentApplicationDetails(list);
            }
        }
    }
}
