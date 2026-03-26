package com.zhonghui.scm.controller;

import java.util.Date;
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
import com.zhonghui.scm.domain.ScmPurchasingSupplier;
import com.zhonghui.scm.service.IScmPurchasingSupplierService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 供应链SCM-采购管理-供应商Controller
 * 
 * @author zhonghui
 * @date 2024-04-12
 */
@RestController
@RequestMapping("/scm/supplier")
public class ScmPurchasingSupplierController extends BaseController
{
    @Autowired
    private IScmPurchasingSupplierService scmPurchasingSupplierService;

    /**
     * 查询供应链SCM-采购管理-供应商列表
     */
    @PreAuthorize("@ss.hasPermi('scm:supplier:list')")
    @GetMapping("/list")
    public TableDataInfo list(ScmPurchasingSupplier scmPurchasingSupplier)
    {
        startPage();
        List<ScmPurchasingSupplier> list = scmPurchasingSupplierService.selectScmPurchasingSupplierList(scmPurchasingSupplier);
        return getDataTable(list);
    }

    /**
     * 导出供应链SCM-采购管理-供应商列表
     */
    @PreAuthorize("@ss.hasPermi('scm:supplier:export')")
    @Log(title = "供应链SCM-采购管理-供应商", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ScmPurchasingSupplier scmPurchasingSupplier)
    {
        List<ScmPurchasingSupplier> list = scmPurchasingSupplierService.selectScmPurchasingSupplierList(scmPurchasingSupplier);
        ExcelUtil<ScmPurchasingSupplier> util = new ExcelUtil<ScmPurchasingSupplier>(ScmPurchasingSupplier.class);
        util.exportExcel(response, list, "供应链SCM-采购管理-供应商数据");
    }

    /**
     * 获取供应链SCM-采购管理-供应商详细信息
     */
    @PreAuthorize("@ss.hasPermi('scm:supplier:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(scmPurchasingSupplierService.selectScmPurchasingSupplierById(id));
    }

    /**
     * 新增供应链SCM-采购管理-供应商
     */
    @PreAuthorize("@ss.hasPermi('scm:supplier:add')")
    @Log(title = "供应链SCM-采购管理-供应商", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ScmPurchasingSupplier scmPurchasingSupplier)
    {
        return toAjax(scmPurchasingSupplierService.insertScmPurchasingSupplier(scmPurchasingSupplier));
    }

    /**
     * 修改供应链SCM-采购管理-供应商
     */
    @PreAuthorize("@ss.hasPermi('scm:supplier:edit')")
    @Log(title = "供应链SCM-采购管理-供应商", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ScmPurchasingSupplier scmPurchasingSupplier)
    {
        scmPurchasingSupplier.setApprovedDate(new Date());
        return toAjax(scmPurchasingSupplierService.updateScmPurchasingSupplier(scmPurchasingSupplier));
    }

    /**
     * 删除供应链SCM-采购管理-供应商
     */
    @PreAuthorize("@ss.hasPermi('scm:supplier:remove')")
    @Log(title = "供应链SCM-采购管理-供应商", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(scmPurchasingSupplierService.deleteScmPurchasingSupplierByIds(ids));
    }
}
