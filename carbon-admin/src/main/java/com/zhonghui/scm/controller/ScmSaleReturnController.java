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
import com.zhonghui.scm.domain.ScmSaleReturn;
import com.zhonghui.scm.service.IScmSaleReturnService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 供应链SCM-销售管理-销售退货Controller
 * 
 * @author yang
 * @date 2024-04-13
 */
@RestController
@RequestMapping("/scm/return")
public class ScmSaleReturnController extends BaseController
{
    @Autowired
    private IScmSaleReturnService scmSaleReturnService;

    /**
     * 查询供应链SCM-销售管理-销售退货列表
     */
    @PreAuthorize("@ss.hasPermi('scm:return:list')")
    @GetMapping("/list")
    public TableDataInfo list(ScmSaleReturn scmSaleReturn)
    {
        startPage();
        List<ScmSaleReturn> list = scmSaleReturnService.selectScmSaleReturnList(scmSaleReturn);
        return getDataTable(list);
    }

    /**
     * 导出供应链SCM-销售管理-销售退货列表
     */
    @PreAuthorize("@ss.hasPermi('scm:return:export')")
    @Log(title = "供应链SCM-销售管理-销售退货", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ScmSaleReturn scmSaleReturn)
    {
        List<ScmSaleReturn> list = scmSaleReturnService.selectScmSaleReturnList(scmSaleReturn);
        ExcelUtil<ScmSaleReturn> util = new ExcelUtil<ScmSaleReturn>(ScmSaleReturn.class);
        util.exportExcel(response, list, "供应链SCM-销售管理-销售退货数据");
    }

    /**
     * 获取供应链SCM-销售管理-销售退货详细信息
     */
    @PreAuthorize("@ss.hasPermi('scm:return:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(scmSaleReturnService.selectScmSaleReturnById(id));
    }

    /**
     * 新增供应链SCM-销售管理-销售退货
     */
    @PreAuthorize("@ss.hasPermi('scm:return:add')")
    @Log(title = "供应链SCM-销售管理-销售退货", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ScmSaleReturn scmSaleReturn)
    {
        return toAjax(scmSaleReturnService.insertScmSaleReturn(scmSaleReturn));
    }

    /**
     * 修改供应链SCM-销售管理-销售退货
     */
    @PreAuthorize("@ss.hasPermi('scm:return:edit')")
    @Log(title = "供应链SCM-销售管理-销售退货", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ScmSaleReturn scmSaleReturn)
    {
        return toAjax(scmSaleReturnService.updateScmSaleReturn(scmSaleReturn));
    }

    /**
     * 删除供应链SCM-销售管理-销售退货
     */
    @PreAuthorize("@ss.hasPermi('scm:return:remove')")
    @Log(title = "供应链SCM-销售管理-销售退货", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(scmSaleReturnService.deleteScmSaleReturnByIds(ids));
    }
}
