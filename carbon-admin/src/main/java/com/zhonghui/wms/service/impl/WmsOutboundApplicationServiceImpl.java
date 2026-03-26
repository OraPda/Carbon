package com.zhonghui.wms.service.impl;

import java.util.List;

import com.zhonghui.mes.domain.MesMaterialApply;
import com.zhonghui.mes.mapper.MesMaterialApplyMapper;
import com.zhonghui.scm.domain.ScmSaleDelivery;
import com.zhonghui.scm.mapper.ScmSaleDeliveryMapper;
import com.zhonghui.wms.mapper.WmsMaterialMapper;
import com.zhonghui.wms.mapper.WmsWarehouseAreaMapper;
import com.zhonghui.wms.mapper.WmsWarehouseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.zhonghui.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.zhonghui.wms.domain.WmsOutboundApplicationDetails;
import com.zhonghui.wms.mapper.WmsOutboundApplicationMapper;
import com.zhonghui.wms.domain.WmsOutboundApplication;
import com.zhonghui.wms.service.IWmsOutboundApplicationService;

/**
 * 智能仓储WMS-出库申请Service业务层处理
 * 
 * @author yang
 * @date 2024-04-15
 */
@Service
public class WmsOutboundApplicationServiceImpl implements IWmsOutboundApplicationService 
{
    @Autowired
    private WmsOutboundApplicationMapper wmsOutboundApplicationMapper;

    @Autowired
    private MesMaterialApplyMapper mesMaterialApplyMapper;

    @Autowired
    private ScmSaleDeliveryMapper scmSaleDeliveryMapper;

    @Autowired
    private WmsWarehouseAreaMapper wmsWarehouseAreaMapper;

    @Autowired
    private WmsWarehouseMapper wmsWarehouseMapper;

    @Autowired
    private WmsMaterialMapper wmsMaterialMapper;
    /**
     * 查询智能仓储WMS-出库申请
     * 
     * @param id 智能仓储WMS-出库申请主键
     * @return 智能仓储WMS-出库申请
     */
    @Override
    public WmsOutboundApplication selectWmsOutboundApplicationById(String id)
    {
        WmsOutboundApplication wmsOutboundApplication =wmsOutboundApplicationMapper.selectWmsOutboundApplicationById(id);
        for(WmsOutboundApplicationDetails details: wmsOutboundApplication.getWmsOutboundApplicationDetailsList()){
            //遍历指定仓库中的库区和库位列表，用于前端查询时数据的回显
            details.setWmsWarehouseAreaList(wmsWarehouseMapper.selectWmsWarehouseById(details.getWarehouseId()).getWmsWarehouseAreaList());
            details.setWmsWarehouseSeatList(wmsWarehouseAreaMapper.selectWmsWarehouseAreaById(details.getWarehouseAreaId()).getWmsWarehouseSeatList());
            //获取物料信息
            details.setMaterialName(wmsMaterialMapper.selectWmsMaterialById(details.getMaterialId()).getMaterialName());
            details.setMaterialCode(wmsMaterialMapper.selectWmsMaterialById(details.getMaterialId()).getMaterialCode());
            details.setMaterialPrice(wmsMaterialMapper.selectWmsMaterialById(details.getMaterialId()).getMaterialPrice());
            details.setMaterialModel(wmsMaterialMapper.selectWmsMaterialById(details.getMaterialId()).getMaterialModel());
            details.setMaterialSpecification(wmsMaterialMapper.selectWmsMaterialById(details.getMaterialId()).getMaterialSpecifications());
            details.setMaterialUnit(wmsMaterialMapper.selectWmsMaterialById(details.getMaterialId()).getMaterialUnit());
        }
        //关联单据号
        getAssociationDocumentNo(wmsOutboundApplication);
        return wmsOutboundApplication;
    }

    /**
     * 查询智能仓储WMS-出库申请列表
     * 
     * @param wmsOutboundApplication 智能仓储WMS-出库申请
     * @return 智能仓储WMS-出库申请
     */
    @Override
    public List<WmsOutboundApplication> selectWmsOutboundApplicationList(WmsOutboundApplication wmsOutboundApplication)
    {
        //查询出库列表
        List<WmsOutboundApplication> list = wmsOutboundApplicationMapper.selectWmsOutboundApplicationList(wmsOutboundApplication);
        list.stream().forEach(item ->{
            //调用关联单据号方法
            getAssociationDocumentNo(item);
        });
        return list;
    }

    private void getAssociationDocumentNo(WmsOutboundApplication wmsOutboundApplication){
        //领料出库单据号
        if (wmsOutboundApplication.getBusinessType() == 1){
            MesMaterialApply apply = mesMaterialApplyMapper.selectMesMaterialApplyById(wmsOutboundApplication.getDocumentNoId());
            if (apply != null){
                wmsOutboundApplication.setAssociationDocumentNo(apply.getOddNumber());
            }
        }
        if (wmsOutboundApplication.getBusinessType() == 2){
            ScmSaleDelivery saleDelivery = scmSaleDeliveryMapper.selectScmSaleDeliveryById(wmsOutboundApplication.getDocumentNoId());
            if (saleDelivery != null){
                wmsOutboundApplication.setAssociationDocumentNo(saleDelivery.getContractNo());
                wmsOutboundApplication.setContractNumber(saleDelivery.getContractNo());
            }
        }
    }

    /**
     * 新增智能仓储WMS-出库申请
     * 
     * @param wmsOutboundApplication 智能仓储WMS-出库申请
     * @return 结果
     */
    @Transactional
    @Override
    public int insertWmsOutboundApplication(WmsOutboundApplication wmsOutboundApplication)
    {
        int rows = wmsOutboundApplicationMapper.insertWmsOutboundApplication(wmsOutboundApplication);
        insertWmsOutboundApplicationDetails(wmsOutboundApplication);
        return rows;
    }

    /**
     * 修改智能仓储WMS-出库申请
     * 
     * @param wmsOutboundApplication 智能仓储WMS-出库申请
     * @return 结果
     */
    @Transactional
    @Override
    public int updateWmsOutboundApplication(WmsOutboundApplication wmsOutboundApplication)
    {
        wmsOutboundApplicationMapper.deleteWmsOutboundApplicationDetailsByOutboundApplicationId(wmsOutboundApplication.getId());
        insertWmsOutboundApplicationDetails(wmsOutboundApplication);
        return wmsOutboundApplicationMapper.updateWmsOutboundApplication(wmsOutboundApplication);
    }

    /**
     * 批量删除智能仓储WMS-出库申请
     * 
     * @param ids 需要删除的智能仓储WMS-出库申请主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteWmsOutboundApplicationByIds(String[] ids)
    {
        wmsOutboundApplicationMapper.deleteWmsOutboundApplicationDetailsByOutboundApplicationIds(ids);
        return wmsOutboundApplicationMapper.deleteWmsOutboundApplicationByIds(ids);
    }

    /**
     * 删除智能仓储WMS-出库申请信息
     * 
     * @param id 智能仓储WMS-出库申请主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteWmsOutboundApplicationById(String id)
    {
        wmsOutboundApplicationMapper.deleteWmsOutboundApplicationDetailsByOutboundApplicationId(id);
        return wmsOutboundApplicationMapper.deleteWmsOutboundApplicationById(id);
    }

    /**
     * 新增智能仓储WMS-出库申请明细信息
     * 
     * @param wmsOutboundApplication 智能仓储WMS-出库申请对象
     */
    public void insertWmsOutboundApplicationDetails(WmsOutboundApplication wmsOutboundApplication)
    {
        List<WmsOutboundApplicationDetails> wmsOutboundApplicationDetailsList = wmsOutboundApplication.getWmsOutboundApplicationDetailsList();
        String id = wmsOutboundApplication.getId();
        if (StringUtils.isNotNull(wmsOutboundApplicationDetailsList))
        {
            List<WmsOutboundApplicationDetails> list = new ArrayList<WmsOutboundApplicationDetails>();
            for (WmsOutboundApplicationDetails wmsOutboundApplicationDetails : wmsOutboundApplicationDetailsList)
            {
                wmsOutboundApplicationDetails.setOutboundApplicationId(Long.valueOf(id));
                list.add(wmsOutboundApplicationDetails);
            }
            if (list.size() > 0)
            {
                wmsOutboundApplicationMapper.batchWmsOutboundApplicationDetails(list);
            }
        }
    }
}
