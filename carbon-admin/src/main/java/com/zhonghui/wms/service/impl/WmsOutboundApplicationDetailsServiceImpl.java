package com.zhonghui.wms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhonghui.wms.mapper.WmsOutboundApplicationDetailsMapper;
import com.zhonghui.wms.domain.WmsOutboundApplicationDetails;
import com.zhonghui.wms.service.IWmsOutboundApplicationDetailsService;

/**
 * 智能仓储WMS-出库申请明细Service业务层处理
 * 
 * @author yang
 * @date 2024-04-16
 */
@Service
public class WmsOutboundApplicationDetailsServiceImpl implements IWmsOutboundApplicationDetailsService 
{
    @Autowired
    private WmsOutboundApplicationDetailsMapper wmsOutboundApplicationDetailsMapper;

    /**
     * 查询智能仓储WMS-出库申请明细
     * 
     * @param id 智能仓储WMS-出库申请明细主键
     * @return 智能仓储WMS-出库申请明细
     */
    @Override
    public WmsOutboundApplicationDetails selectWmsOutboundApplicationDetailsById(String id)
    {
        return wmsOutboundApplicationDetailsMapper.selectWmsOutboundApplicationDetailsById(id);
    }

    /**
     * 查询智能仓储WMS-出库申请明细列表
     * 
     * @param wmsOutboundApplicationDetails 智能仓储WMS-出库申请明细
     * @return 智能仓储WMS-出库申请明细
     */
    @Override
    public List<WmsOutboundApplicationDetails> selectWmsOutboundApplicationDetailsList(WmsOutboundApplicationDetails wmsOutboundApplicationDetails)
    {
        return wmsOutboundApplicationDetailsMapper.selectWmsOutboundApplicationDetailsList(wmsOutboundApplicationDetails);
    }

    /**
     * 新增智能仓储WMS-出库申请明细
     * 
     * @param wmsOutboundApplicationDetails 智能仓储WMS-出库申请明细
     * @return 结果
     */
    @Override
    public int insertWmsOutboundApplicationDetails(WmsOutboundApplicationDetails wmsOutboundApplicationDetails)
    {
        return wmsOutboundApplicationDetailsMapper.insertWmsOutboundApplicationDetails(wmsOutboundApplicationDetails);
    }

    /**
     * 修改智能仓储WMS-出库申请明细
     * 
     * @param wmsOutboundApplicationDetails 智能仓储WMS-出库申请明细
     * @return 结果
     */
    @Override
    public int updateWmsOutboundApplicationDetails(WmsOutboundApplicationDetails wmsOutboundApplicationDetails)
    {
        return wmsOutboundApplicationDetailsMapper.updateWmsOutboundApplicationDetails(wmsOutboundApplicationDetails);
    }

    /**
     * 批量删除智能仓储WMS-出库申请明细
     * 
     * @param ids 需要删除的智能仓储WMS-出库申请明细主键
     * @return 结果
     */
    @Override
    public int deleteWmsOutboundApplicationDetailsByIds(String[] ids)
    {
        return wmsOutboundApplicationDetailsMapper.deleteWmsOutboundApplicationDetailsByIds(ids);
    }

    /**
     * 删除智能仓储WMS-出库申请明细信息
     * 
     * @param id 智能仓储WMS-出库申请明细主键
     * @return 结果
     */
    @Override
    public int deleteWmsOutboundApplicationDetailsById(String id)
    {
        return wmsOutboundApplicationDetailsMapper.deleteWmsOutboundApplicationDetailsById(id);
    }
}
