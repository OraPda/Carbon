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
import com.zhonghui.mes.domain.MesProductionPlan;
import com.zhonghui.mes.service.IMesProductionPlanService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 制造执行MES-生产计划Controller
 * 
 * @author yang
 * @date 2024-04-04
 */
@RestController
@RequestMapping("/mes/plan")
public class MesProductionPlanController extends BaseController
{
    @Autowired
    private IMesProductionPlanService mesProductionPlanService;

    /**
     * 查询制造执行MES-生产计划列表
     */
    @PreAuthorize("@ss.hasPermi('mes:plan:list')")
    @GetMapping("/list")
    public TableDataInfo list(MesProductionPlan mesProductionPlan)
    {
        startPage();
        List<MesProductionPlan> list = mesProductionPlanService.selectMesProductionPlanList(mesProductionPlan);
        return getDataTable(list);
    }

    /**
     * 导出制造执行MES-生产计划列表
     */
    @PreAuthorize("@ss.hasPermi('mes:plan:export')")
    @Log(title = "制造执行MES-生产计划", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesProductionPlan mesProductionPlan)
    {
        List<MesProductionPlan> list = mesProductionPlanService.selectMesProductionPlanList(mesProductionPlan);
        ExcelUtil<MesProductionPlan> util = new ExcelUtil<MesProductionPlan>(MesProductionPlan.class);
        util.exportExcel(response, list, "制造执行MES-生产计划数据");
    }

    /**
     * 获取制造执行MES-生产计划详细信息
     */
    @PreAuthorize("@ss.hasPermi('mes:plan:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(mesProductionPlanService.selectMesProductionPlanById(id));
    }

    /**
     * 新增制造执行MES-生产计划
     */
    @PreAuthorize("@ss.hasPermi('mes:plan:add')")
    @Log(title = "制造执行MES-生产计划", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesProductionPlan mesProductionPlan)
    {
        return toAjax(mesProductionPlanService.insertMesProductionPlan(mesProductionPlan));
    }

    /**
     * 修改制造执行MES-生产计划
     */
    @PreAuthorize("@ss.hasPermi('mes:plan:edit')")
    @Log(title = "制造执行MES-生产计划", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesProductionPlan mesProductionPlan)
    {
        return toAjax(mesProductionPlanService.updateMesProductionPlan(mesProductionPlan));
    }

    /**
     * 删除制造执行MES-生产计划
     */
    @PreAuthorize("@ss.hasPermi('mes:plan:remove')")
    @Log(title = "制造执行MES-生产计划", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(mesProductionPlanService.deleteMesProductionPlanByIds(ids));
    }
}
