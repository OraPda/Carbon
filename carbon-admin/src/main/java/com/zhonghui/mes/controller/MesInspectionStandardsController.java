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
import com.zhonghui.mes.domain.MesInspectionStandards;
import com.zhonghui.mes.service.IMesInspectionStandardsService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 制造执行MES-质量管理-质检标准Controller
 * 
 * @author yang
 * @date 2024-04-10
 */
@RestController
@RequestMapping("/mes/standards")
public class MesInspectionStandardsController extends BaseController
{
    @Autowired
    private IMesInspectionStandardsService mesInspectionStandardsService;

    /**
     * 查询制造执行MES-质量管理-质检标准列表
     */
    @PreAuthorize("@ss.hasPermi('mes:standards:list')")
    @GetMapping("/list")
    public TableDataInfo list(MesInspectionStandards mesInspectionStandards)
    {
        startPage();
        List<MesInspectionStandards> list = mesInspectionStandardsService.selectMesInspectionStandardsList(mesInspectionStandards);
        return getDataTable(list);
    }

    /**
     * 导出制造执行MES-质量管理-质检标准列表
     */
    @PreAuthorize("@ss.hasPermi('mes:standards:export')")
    @Log(title = "制造执行MES-质量管理-质检标准", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesInspectionStandards mesInspectionStandards)
    {
        List<MesInspectionStandards> list = mesInspectionStandardsService.selectMesInspectionStandardsList(mesInspectionStandards);
        ExcelUtil<MesInspectionStandards> util = new ExcelUtil<MesInspectionStandards>(MesInspectionStandards.class);
        util.exportExcel(response, list, "制造执行MES-质量管理-质检标准数据");
    }

    /**
     * 获取制造执行MES-质量管理-质检标准详细信息
     */
    @PreAuthorize("@ss.hasPermi('mes:standards:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(mesInspectionStandardsService.selectMesInspectionStandardsById(id));
    }

    /**
     * 新增制造执行MES-质量管理-质检标准
     */
    @PreAuthorize("@ss.hasPermi('mes:standards:add')")
    @Log(title = "制造执行MES-质量管理-质检标准", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesInspectionStandards mesInspectionStandards)
    {
        return toAjax(mesInspectionStandardsService.insertMesInspectionStandards(mesInspectionStandards));
    }

    /**
     * 修改制造执行MES-质量管理-质检标准
     */
    @PreAuthorize("@ss.hasPermi('mes:standards:edit')")
    @Log(title = "制造执行MES-质量管理-质检标准", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesInspectionStandards mesInspectionStandards)
    {
        return toAjax(mesInspectionStandardsService.updateMesInspectionStandards(mesInspectionStandards));
    }

    /**
     * 删除制造执行MES-质量管理-质检标准
     */
    @PreAuthorize("@ss.hasPermi('mes:standards:remove')")
    @Log(title = "制造执行MES-质量管理-质检标准", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(mesInspectionStandardsService.deleteMesInspectionStandardsByIds(ids));
    }
}
