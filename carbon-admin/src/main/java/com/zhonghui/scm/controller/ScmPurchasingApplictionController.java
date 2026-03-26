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
import com.zhonghui.scm.domain.ScmPurchasingAppliction;
import com.zhonghui.scm.service.IScmPurchasingApplictionService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 供应链SCM-采购管理-采购申请Controller
 * 
 * @author yang
 * @date 2024-04-14
 */
@RestController
@RequestMapping("/scm/appliction")
public class ScmPurchasingApplictionController extends BaseController
{
    @Autowired
    private IScmPurchasingApplictionService scmPurchasingApplictionService;

    /**
     * 查询供应链SCM-采购管理-采购申请列表
     */
    @PreAuthorize("@ss.hasPermi('scm:appliction:list')")
    @GetMapping("/list")
    public TableDataInfo list(ScmPurchasingAppliction scmPurchasingAppliction)
    {
        startPage();
        List<ScmPurchasingAppliction> list = scmPurchasingApplictionService.selectScmPurchasingApplictionList(scmPurchasingAppliction);
        return getDataTable(list);
    }

    /**
     * 导出供应链SCM-采购管理-采购申请列表
     */
    @PreAuthorize("@ss.hasPermi('scm:appliction:export')")
    @Log(title = "供应链SCM-采购管理-采购申请", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ScmPurchasingAppliction scmPurchasingAppliction)
    {
        List<ScmPurchasingAppliction> list = scmPurchasingApplictionService.selectScmPurchasingApplictionList(scmPurchasingAppliction);
        ExcelUtil<ScmPurchasingAppliction> util = new ExcelUtil<ScmPurchasingAppliction>(ScmPurchasingAppliction.class);
        util.exportExcel(response, list, "供应链SCM-采购管理-采购申请数据");
    }

    /**
     * 获取供应链SCM-采购管理-采购申请详细信息
     */
    @PreAuthorize("@ss.hasPermi('scm:appliction:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(scmPurchasingApplictionService.selectScmPurchasingApplictionById(id));
    }

    /**
     * 新增供应链SCM-采购管理-采购申请
     */
    @PreAuthorize("@ss.hasPermi('scm:appliction:add')")
    @Log(title = "供应链SCM-采购管理-采购申请", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ScmPurchasingAppliction scmPurchasingAppliction)
    {
        return toAjax(scmPurchasingApplictionService.insertScmPurchasingAppliction(scmPurchasingAppliction));
    }

    /**
     * 修改供应链SCM-采购管理-采购申请
     */
    @PreAuthorize("@ss.hasPermi('scm:appliction:edit')")
    @Log(title = "供应链SCM-采购管理-采购申请", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ScmPurchasingAppliction scmPurchasingAppliction)
    {

        return toAjax(scmPurchasingApplictionService.updateScmPurchasingAppliction(scmPurchasingAppliction));
    }

    /**
     * 删除供应链SCM-采购管理-采购申请
     */
    @PreAuthorize("@ss.hasPermi('scm:appliction:remove')")
    @Log(title = "供应链SCM-采购管理-采购申请", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(scmPurchasingApplictionService.deleteScmPurchasingApplictionByIds(ids));
    }
}
