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
import com.zhonghui.scm.domain.ScmSaleDelivery;
import com.zhonghui.scm.service.IScmSaleDeliveryService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 供应链SCM-销售管理-销售发货Controller
 * 
 * @author yang
 * @date 2024-04-13
 */
@RestController
@RequestMapping("/scm/delivery")
public class ScmSaleDeliveryController extends BaseController
{
    @Autowired
    private IScmSaleDeliveryService scmSaleDeliveryService;

    /**
     * 查询供应链SCM-销售管理-销售发货列表
     */
    @PreAuthorize("@ss.hasPermi('scm:delivery:list')")
    @GetMapping("/list")
    public TableDataInfo list(ScmSaleDelivery scmSaleDelivery)
    {
        startPage();
        List<ScmSaleDelivery> list = scmSaleDeliveryService.selectScmSaleDeliveryList(scmSaleDelivery);
        return getDataTable(list);
    }

    /**
     * 导出供应链SCM-销售管理-销售发货列表
     */
    @PreAuthorize("@ss.hasPermi('scm:delivery:export')")
    @Log(title = "供应链SCM-销售管理-销售发货", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ScmSaleDelivery scmSaleDelivery)
    {
        List<ScmSaleDelivery> list = scmSaleDeliveryService.selectScmSaleDeliveryList(scmSaleDelivery);
        ExcelUtil<ScmSaleDelivery> util = new ExcelUtil<ScmSaleDelivery>(ScmSaleDelivery.class);
        util.exportExcel(response, list, "供应链SCM-销售管理-销售发货数据");
    }

    /**
     * 获取供应链SCM-销售管理-销售发货详细信息
     */
    @PreAuthorize("@ss.hasPermi('scm:delivery:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(scmSaleDeliveryService.selectScmSaleDeliveryById(id));
    }

    /**
     * 新增供应链SCM-销售管理-销售发货
     */
    @PreAuthorize("@ss.hasPermi('scm:delivery:add')")
    @Log(title = "供应链SCM-销售管理-销售发货", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ScmSaleDelivery scmSaleDelivery)
    {
        return toAjax(scmSaleDeliveryService.insertScmSaleDelivery(scmSaleDelivery));
    }

    /**
     * 修改供应链SCM-销售管理-销售发货
     */
    @PreAuthorize("@ss.hasPermi('scm:delivery:edit')")
    @Log(title = "供应链SCM-销售管理-销售发货", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ScmSaleDelivery scmSaleDelivery)
    {
        return toAjax(scmSaleDeliveryService.updateScmSaleDelivery(scmSaleDelivery));
    }

    /**
     * 删除供应链SCM-销售管理-销售发货
     */
    @PreAuthorize("@ss.hasPermi('scm:delivery:remove')")
    @Log(title = "供应链SCM-销售管理-销售发货", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(scmSaleDeliveryService.deleteScmSaleDeliveryByIds(ids));
    }
}
