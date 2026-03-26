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
import com.zhonghui.mes.domain.MesPlannedProduction;
import com.zhonghui.mes.service.IMesPlannedProductionService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 制造执行MES-计划排产Controller
 * 
 * @author yang
 * @date 2024-04-03
 */
@RestController
@RequestMapping("/mes/production")
public class MesPlannedProductionController extends BaseController
{
    @Autowired
    private IMesPlannedProductionService mesPlannedProductionService;

    /**
     * 查询制造执行MES-计划排产列表
     */
    @PreAuthorize("@ss.hasPermi('mes:production:list')")
    @GetMapping("/list")
    public TableDataInfo list(MesPlannedProduction mesPlannedProduction)
    {
        startPage();
        List<MesPlannedProduction> list = mesPlannedProductionService.selectMesPlannedProductionList(mesPlannedProduction);
        return getDataTable(list);
    }

    /**
     * 导出制造执行MES-计划排产列表
     */
    @PreAuthorize("@ss.hasPermi('mes:production:export')")
    @Log(title = "制造执行MES-计划排产", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesPlannedProduction mesPlannedProduction)
    {
        List<MesPlannedProduction> list = mesPlannedProductionService.selectMesPlannedProductionList(mesPlannedProduction);
        ExcelUtil<MesPlannedProduction> util = new ExcelUtil<MesPlannedProduction>(MesPlannedProduction.class);
        util.exportExcel(response, list, "制造执行MES-计划排产数据");
    }

    /**
     * 获取制造执行MES-计划排产详细信息
     */
    @PreAuthorize("@ss.hasPermi('mes:production:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(mesPlannedProductionService.selectMesPlannedProductionById(id));
    }

    /**
     * 新增制造执行MES-计划排产
     */
    @PreAuthorize("@ss.hasPermi('mes:production:add')")
    @Log(title = "制造执行MES-计划排产", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesPlannedProduction mesPlannedProduction)
    {
        return toAjax(mesPlannedProductionService.insertMesPlannedProduction(mesPlannedProduction));
    }

    /**
     * 修改制造执行MES-计划排产
     */
    @PreAuthorize("@ss.hasPermi('mes:production:edit')")
    @Log(title = "制造执行MES-计划排产", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesPlannedProduction mesPlannedProduction)
    {
        return toAjax(mesPlannedProductionService.updateMesPlannedProduction(mesPlannedProduction));
    }

    /**
     * 删除制造执行MES-计划排产
     */
    @PreAuthorize("@ss.hasPermi('mes:production:remove')")
    @Log(title = "制造执行MES-计划排产", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(mesPlannedProductionService.deleteMesPlannedProductionByIds(ids));
    }
}
