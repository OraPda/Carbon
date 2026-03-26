package com.zhonghui.scm.controller;

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
import com.zhonghui.scm.domain.ScmSaleOrder;
import com.zhonghui.scm.service.IScmSaleOrderService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 供应链SCM-销售管理-销售订单Controller
 * 
 * @author zhonghui
 * @date 2024-04-13
 */
@RestController
@RequestMapping("/scm/order")
public class ScmSaleOrderController extends BaseController
{
    @Autowired
    private IScmSaleOrderService scmSaleOrderService;

    /**
     * 查询供应链SCM-销售管理-销售订单列表
     */
    @PreAuthorize("@ss.hasPermi('scm:order:list')")
    @GetMapping("/list")
    public TableDataInfo list(ScmSaleOrder scmSaleOrder)
    {
        startPage();
        List<ScmSaleOrder> list = scmSaleOrderService.selectScmSaleOrderList(scmSaleOrder);
        return getDataTable(list);
    }

    /**
     * 导出供应链SCM-销售管理-销售订单列表
     */
    @PreAuthorize("@ss.hasPermi('scm:order:export')")
    @Log(title = "供应链SCM-销售管理-销售订单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ScmSaleOrder scmSaleOrder)
    {
        List<ScmSaleOrder> list = scmSaleOrderService.selectScmSaleOrderList(scmSaleOrder);
        ExcelUtil<ScmSaleOrder> util = new ExcelUtil<ScmSaleOrder>(ScmSaleOrder.class);
        util.exportExcel(response, list, "供应链SCM-销售管理-销售订单数据");
    }

    /**
     * 获取供应链SCM-销售管理-销售订单详细信息
     */
    @PreAuthorize("@ss.hasPermi('scm:order:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(scmSaleOrderService.selectScmSaleOrderById(id));
    }

    /**
     * 新增供应链SCM-销售管理-销售订单
     */
    @PreAuthorize("@ss.hasPermi('scm:order:add')")
    @Log(title = "供应链SCM-销售管理-销售订单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ScmSaleOrder scmSaleOrder)
    {
        return toAjax(scmSaleOrderService.insertScmSaleOrder(scmSaleOrder));
    }

    /**
     * 修改供应链SCM-销售管理-销售订单
     */
    @PreAuthorize("@ss.hasPermi('scm:order:edit')")
    @Log(title = "供应链SCM-销售管理-销售订单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ScmSaleOrder scmSaleOrder)
    {
        return toAjax(scmSaleOrderService.updateScmSaleOrder(scmSaleOrder));
    }

    /**
     * 删除供应链SCM-销售管理-销售订单
     */
    @PreAuthorize("@ss.hasPermi('scm:order:remove')")
    @Log(title = "供应链SCM-销售管理-销售订单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(scmSaleOrderService.deleteScmSaleOrderByIds(ids));
    }
}
