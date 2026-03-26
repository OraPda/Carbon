package com.zhonghui.mes.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zhonghui.common.annotation.Log;
import com.zhonghui.common.core.controller.BaseController;
import com.zhonghui.common.core.domain.AjaxResult;
import com.zhonghui.common.enums.BusinessType;
import com.zhonghui.mes.domain.MesProduct;
import com.zhonghui.mes.service.IMesProductService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 制造执行MES-产品建模Controller
 * 
 * @author yang
 * @date 2024-04-01
 */
@RestController
@RequestMapping("/mes/product")
public class MesProductController extends BaseController
{
    @Autowired
    private IMesProductService mesProductService;

    /**
     * 查询制造执行MES-产品建模列表
     */
    @PreAuthorize("@ss.hasPermi('mes:product:list')")
    @GetMapping("/list")
    public TableDataInfo list(MesProduct mesProduct)
    {
        startPage();
        List<MesProduct> list = mesProductService.selectMesProductList(mesProduct);
        return getDataTable(list);
    }

    /**
     * 导出制造执行MES-产品建模列表
     */
    @PreAuthorize("@ss.hasPermi('mes:product:export')")
    @Log(title = "制造执行MES-产品建模", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesProduct mesProduct)
    {
        List<MesProduct> list = mesProductService.selectMesProductList(mesProduct);
        ExcelUtil<MesProduct> util = new ExcelUtil<MesProduct>(MesProduct.class);
        util.exportExcel(response, list, "制造执行MES-产品建模数据");
    }

    /**
     * 获取制造执行MES-产品建模详细信息
     */
    @PreAuthorize("@ss.hasPermi('mes:product:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(mesProductService.selectMesProductById(id));
    }

    /**
     * 新增制造执行MES-产品建模
     */
    @PreAuthorize("@ss.hasPermi('mes:product:add')")
    @Log(title = "制造执行MES-产品建模", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesProduct mesProduct)
    {
        return toAjax(mesProductService.insertMesProduct(mesProduct));
    }

    /**
     * 修改制造执行MES-产品建模
     */
    @PreAuthorize("@ss.hasPermi('mes:product:edit')")
    @Log(title = "制造执行MES-产品建模", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesProduct mesProduct)
    {
        return toAjax(mesProductService.updateMesProduct(mesProduct));
    }

    /**
     * 删除制造执行MES-产品建模
     */
    @PreAuthorize("@ss.hasPermi('mes:product:remove')")
    @Log(title = "制造执行MES-产品建模", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(mesProductService.deleteMesProductByIds(ids));
    }
}
