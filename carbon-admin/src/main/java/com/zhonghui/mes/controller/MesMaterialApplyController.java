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
import com.zhonghui.mes.domain.MesMaterialApply;
import com.zhonghui.mes.service.IMesMaterialApplyService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 制造执行MES-领料申请Controller
 * 
 * @author yang
 * @date 2024-03-31
 */
@RestController
@RequestMapping("/mes/apply")
public class MesMaterialApplyController extends BaseController
{
    @Autowired
    private IMesMaterialApplyService mesMaterialApplyService;

    /**
     * 查询制造执行MES-领料申请列表
     */
    @PreAuthorize("@ss.hasPermi('mes:apply:list')")
    @GetMapping("/list")
    public TableDataInfo list(MesMaterialApply mesMaterialApply)
    {
        startPage();
        List<MesMaterialApply> list = mesMaterialApplyService.selectMesMaterialApplyList(mesMaterialApply);
        return getDataTable(list);
    }

    /**
     * 导出制造执行MES-领料申请列表
     */
    @PreAuthorize("@ss.hasPermi('mes:apply:export')")
    @Log(title = "制造执行MES-领料申请", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesMaterialApply mesMaterialApply)
    {
        List<MesMaterialApply> list = mesMaterialApplyService.selectMesMaterialApplyList(mesMaterialApply);
        ExcelUtil<MesMaterialApply> util = new ExcelUtil<MesMaterialApply>(MesMaterialApply.class);
        util.exportExcel(response, list, "制造执行MES-领料申请数据");
    }

    /**
     * 获取制造执行MES-领料申请详细信息
     */
    @PreAuthorize("@ss.hasPermi('mes:apply:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(mesMaterialApplyService.selectMesMaterialApplyById(id));
    }

    /**
     * 新增制造执行MES-领料申请
     */
    @PreAuthorize("@ss.hasPermi('mes:apply:add')")
    @Log(title = "制造执行MES-领料申请", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesMaterialApply mesMaterialApply)
    {
        return toAjax(mesMaterialApplyService.insertMesMaterialApply(mesMaterialApply));
    }

    /**
     * 修改制造执行MES-领料申请
     */
    @PreAuthorize("@ss.hasPermi('mes:apply:edit')")
    @Log(title = "制造执行MES-领料申请", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesMaterialApply mesMaterialApply)
    {
        return toAjax(mesMaterialApplyService.updateMesMaterialApply(mesMaterialApply));
    }

    /**
     * 删除制造执行MES-领料申请
     */
    @PreAuthorize("@ss.hasPermi('mes:apply:remove')")
    @Log(title = "制造执行MES-领料申请", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(mesMaterialApplyService.deleteMesMaterialApplyByIds(ids));
    }
}
