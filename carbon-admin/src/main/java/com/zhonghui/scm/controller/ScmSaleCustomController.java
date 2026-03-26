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
import com.zhonghui.scm.domain.ScmSaleCustom;
import com.zhonghui.scm.service.IScmSaleCustomService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 供应链SCM-销售管理-客户档案Controller
 * 
 * @author yang
 * @date 2024-04-13
 */
@RestController
@RequestMapping("/scm/custom")
public class ScmSaleCustomController extends BaseController
{
    @Autowired
    private IScmSaleCustomService scmSaleCustomService;

    /**
     * 查询供应链SCM-销售管理-客户档案列表
     */
    @PreAuthorize("@ss.hasPermi('scm:custom:list')")
    @GetMapping("/list")
    public TableDataInfo list(ScmSaleCustom scmSaleCustom)
    {
        startPage();
        List<ScmSaleCustom> list = scmSaleCustomService.selectScmSaleCustomList(scmSaleCustom);
        return getDataTable(list);
    }

    /**
     * 导出供应链SCM-销售管理-客户档案列表
     */
    @PreAuthorize("@ss.hasPermi('scm:custom:export')")
    @Log(title = "供应链SCM-销售管理-客户档案", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ScmSaleCustom scmSaleCustom)
    {
        List<ScmSaleCustom> list = scmSaleCustomService.selectScmSaleCustomList(scmSaleCustom);
        ExcelUtil<ScmSaleCustom> util = new ExcelUtil<ScmSaleCustom>(ScmSaleCustom.class);
        util.exportExcel(response, list, "供应链SCM-销售管理-客户档案数据");
    }

    /**
     * 获取供应链SCM-销售管理-客户档案详细信息
     */
    @PreAuthorize("@ss.hasPermi('scm:custom:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(scmSaleCustomService.selectScmSaleCustomById(id));
    }

    /**
     * 新增供应链SCM-销售管理-客户档案
     */
    @PreAuthorize("@ss.hasPermi('scm:custom:add')")
    @Log(title = "供应链SCM-销售管理-客户档案", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ScmSaleCustom scmSaleCustom)
    {
        return toAjax(scmSaleCustomService.insertScmSaleCustom(scmSaleCustom));
    }

    /**
     * 修改供应链SCM-销售管理-客户档案
     */
    @PreAuthorize("@ss.hasPermi('scm:custom:edit')")
    @Log(title = "供应链SCM-销售管理-客户档案", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ScmSaleCustom scmSaleCustom)
    {
        return toAjax(scmSaleCustomService.updateScmSaleCustom(scmSaleCustom));
    }

    /**
     * 删除供应链SCM-销售管理-客户档案
     */
    @PreAuthorize("@ss.hasPermi('scm:custom:remove')")
    @Log(title = "供应链SCM-销售管理-客户档案", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(scmSaleCustomService.deleteScmSaleCustomByIds(ids));
    }
}
