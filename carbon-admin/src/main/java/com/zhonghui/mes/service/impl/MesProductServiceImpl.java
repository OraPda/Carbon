package com.zhonghui.mes.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.zhonghui.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.zhonghui.mes.domain.MesProductMaterialItem;
import com.zhonghui.mes.mapper.MesProductMapper;
import com.zhonghui.mes.domain.MesProduct;
import com.zhonghui.mes.service.IMesProductService;

/**
 * 制造执行MES-产品建模Service业务层处理
 * 
 * @author yang
 * @date 2024-04-01
 */
@Service
public class MesProductServiceImpl implements IMesProductService 
{
    @Autowired
    private MesProductMapper mesProductMapper;

    /**
     * 查询制造执行MES-产品建模
     * 
     * @param id 制造执行MES-产品建模主键
     * @return 制造执行MES-产品建模
     */
    @Override
    public MesProduct selectMesProductById(String id)
    {
        return mesProductMapper.selectMesProductById(id);
    }

    /**
     * 查询制造执行MES-产品建模列表
     * 
     * @param mesProduct 制造执行MES-产品建模
     * @return 制造执行MES-产品建模
     */
    @Override
    public List<MesProduct> selectMesProductList(MesProduct mesProduct)
    {
        return mesProductMapper.selectMesProductList(mesProduct);
    }

    /**
     * 新增制造执行MES-产品建模
     * 
     * @param mesProduct 制造执行MES-产品建模
     * @return 结果
     */
    @Transactional
    @Override
    public int insertMesProduct(MesProduct mesProduct)
    {
        int rows = mesProductMapper.insertMesProduct(mesProduct);
        insertMesProductMaterialItem(mesProduct);
        return rows;
    }

    /**
     * 修改制造执行MES-产品建模
     * 
     * @param mesProduct 制造执行MES-产品建模
     * @return 结果
     */
    @Transactional
    @Override
    public int updateMesProduct(MesProduct mesProduct)
    {
        mesProductMapper.deleteMesProductMaterialItemByProductId(mesProduct.getId());
        insertMesProductMaterialItem(mesProduct);
        return mesProductMapper.updateMesProduct(mesProduct);
    }

    /**
     * 批量删除制造执行MES-产品建模
     * 
     * @param ids 需要删除的制造执行MES-产品建模主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteMesProductByIds(String[] ids)
    {
        mesProductMapper.deleteMesProductMaterialItemByProductIds(ids);
        return mesProductMapper.deleteMesProductByIds(ids);
    }

    /**
     * 删除制造执行MES-产品建模信息
     * 
     * @param id 制造执行MES-产品建模主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteMesProductById(String id)
    {
        mesProductMapper.deleteMesProductMaterialItemByProductId(id);
        return mesProductMapper.deleteMesProductById(id);
    }

    /**
     * 新增制造执行MES-产品建模明细信息信息
     * 
     * @param mesProduct 制造执行MES-产品建模对象
     */
    public void insertMesProductMaterialItem(MesProduct mesProduct)
    {
        List<MesProductMaterialItem> mesProductMaterialItemList = mesProduct.getMesProductMaterialItemList();
        String id = mesProduct.getId();
        if (StringUtils.isNotNull(mesProductMaterialItemList))
        {
            List<MesProductMaterialItem> list = new ArrayList<MesProductMaterialItem>();
            for (MesProductMaterialItem mesProductMaterialItem : mesProductMaterialItemList)
            {
                mesProductMaterialItem.setProductId(Long.valueOf(id));
                list.add(mesProductMaterialItem);
            }
            if (list.size() > 0)
            {
                mesProductMapper.batchMesProductMaterialItem(list);
            }
        }
    }
}
