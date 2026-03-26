package com.zhonghui.wms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.zhonghui.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.zhonghui.wms.domain.WmsWarehousingApplicationDetails;
import com.zhonghui.wms.mapper.WmsWarehousingApplicationMapper;
import com.zhonghui.wms.domain.WmsWarehousingApplication;
import com.zhonghui.wms.service.IWmsWarehousingApplicationService;

/**
 * 智能仓储WMS-入库申请Service业务层处理
 * 
 * @author zhonghui
 * @date 2024-04-12
 */
@Service
public class WmsWarehousingApplicationServiceImpl implements IWmsWarehousingApplicationService 
{
    @Autowired
    private WmsWarehousingApplicationMapper wmsWarehousingApplicationMapper;

    /**
     * 查询智能仓储WMS-入库申请
     * 
     * @param id 智能仓储WMS-入库申请主键
     * @return 智能仓储WMS-入库申请
     */
    @Override
    public WmsWarehousingApplication selectWmsWarehousingApplicationById(Long id)
    {
        return wmsWarehousingApplicationMapper.selectWmsWarehousingApplicationById(id);
    }

    /**
     * 查询智能仓储WMS-入库申请列表
     * 
     * @param wmsWarehousingApplication 智能仓储WMS-入库申请
     * @return 智能仓储WMS-入库申请
     */
    @Override
    public List<WmsWarehousingApplication> selectWmsWarehousingApplicationList(WmsWarehousingApplication wmsWarehousingApplication)
    {
        return wmsWarehousingApplicationMapper.selectWmsWarehousingApplicationList(wmsWarehousingApplication);
    }

    /**
     * 新增智能仓储WMS-入库申请
     * 
     * @param wmsWarehousingApplication 智能仓储WMS-入库申请
     * @return 结果
     */
    @Transactional
    @Override
    public int insertWmsWarehousingApplication(WmsWarehousingApplication wmsWarehousingApplication)
    {
        int rows = wmsWarehousingApplicationMapper.insertWmsWarehousingApplication(wmsWarehousingApplication);
        insertWmsWarehousingApplicationDetails(wmsWarehousingApplication);
        return rows;
    }

    /**
     * 修改智能仓储WMS-入库申请
     * 
     * @param wmsWarehousingApplication 智能仓储WMS-入库申请
     * @return 结果
     */
    @Transactional
    @Override
    public int updateWmsWarehousingApplication(WmsWarehousingApplication wmsWarehousingApplication)
    {
        wmsWarehousingApplicationMapper.deleteWmsWarehousingApplicationDetailsById(wmsWarehousingApplication.getId());
        insertWmsWarehousingApplicationDetails(wmsWarehousingApplication);
        return wmsWarehousingApplicationMapper.updateWmsWarehousingApplication(wmsWarehousingApplication);
    }

    /**
     * 批量删除智能仓储WMS-入库申请
     * 
     * @param ids 需要删除的智能仓储WMS-入库申请主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteWmsWarehousingApplicationByIds(Long[] ids)
    {
        wmsWarehousingApplicationMapper.deleteWmsWarehousingApplicationDetailsByIds(ids);
        return wmsWarehousingApplicationMapper.deleteWmsWarehousingApplicationByIds(ids);
    }

    /**
     * 删除智能仓储WMS-入库申请信息
     * 
     * @param id 智能仓储WMS-入库申请主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteWmsWarehousingApplicationById(Long id)
    {
        wmsWarehousingApplicationMapper.deleteWmsWarehousingApplicationDetailsById(id);
        return wmsWarehousingApplicationMapper.deleteWmsWarehousingApplicationById(id);
    }

    /**
     * 新增智能仓储WMS-入库申请明细信息
     * 
     * @param wmsWarehousingApplication 智能仓储WMS-入库申请对象
     */
    public void insertWmsWarehousingApplicationDetails(WmsWarehousingApplication wmsWarehousingApplication)
    {
        List<WmsWarehousingApplicationDetails> wmsWarehousingApplicationDetailsList = wmsWarehousingApplication.getWmsWarehousingApplicationDetailsList();
        Long id = wmsWarehousingApplication.getId();
        if (StringUtils.isNotNull(wmsWarehousingApplicationDetailsList))
        {
            List<WmsWarehousingApplicationDetails> list = new ArrayList<WmsWarehousingApplicationDetails>();
            for (WmsWarehousingApplicationDetails wmsWarehousingApplicationDetails : wmsWarehousingApplicationDetailsList)
            {
                wmsWarehousingApplicationDetails.setId(id);
                list.add(wmsWarehousingApplicationDetails);
            }
            if (list.size() > 0)
            {
                wmsWarehousingApplicationMapper.batchWmsWarehousingApplicationDetails(list);
            }
        }
    }
}
