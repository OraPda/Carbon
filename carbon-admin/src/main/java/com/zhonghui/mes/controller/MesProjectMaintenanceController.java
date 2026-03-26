package com.zhonghui.mes.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.zhonghui.response.BaseResult;
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
import com.zhonghui.mes.domain.MesProjectMaintenance;
import com.zhonghui.mes.service.IMesProjectMaintenanceService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 制造执行MES-项目维护Controller
 * 
 * @author zhonghui
 * @date 2024-03-28
 */
@RestController
@RequestMapping("/mes/maintenance")
public class MesProjectMaintenanceController extends BaseController
{
    @Autowired
    private IMesProjectMaintenanceService mesProjectMaintenanceService;

    /**
     * 查询制造执行MES-项目维护列表
     */
    @PreAuthorize("@ss.hasPermi('mes:maintenance:list')")
    @GetMapping("/list")
    public TableDataInfo list(MesProjectMaintenance mesProjectMaintenance)
    {
        startPage();
        List<MesProjectMaintenance> list = mesProjectMaintenanceService.selectMesProjectMaintenanceList(mesProjectMaintenance);
        return getDataTable(list);
    }

    /**
     * 导出制造执行MES-项目维护列表
     */
    @PreAuthorize("@ss.hasPermi('mes:maintenance:export')")
    @Log(title = "制造执行MES-项目维护", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesProjectMaintenance mesProjectMaintenance)
    {
        List<MesProjectMaintenance> list = mesProjectMaintenanceService.selectMesProjectMaintenanceList(mesProjectMaintenance);
        ExcelUtil<MesProjectMaintenance> util = new ExcelUtil<MesProjectMaintenance>(MesProjectMaintenance.class);
        util.exportExcel(response, list, "制造执行MES-项目维护数据");
    }

    /**
     * 查询项目维护列表(不分页)
     */
    @GetMapping("/getList")
    public BaseResult<List<MesProjectMaintenance>> getList(MesProjectMaintenance mesProjectMaintenance)
    {
        return BaseResult.success(mesProjectMaintenanceService.selectMesProjectMaintenanceList(mesProjectMaintenance));
    }


    /**
     * 获取制造执行MES-项目维护详细信息
     */
    @PreAuthorize("@ss.hasPermi('mes:maintenance:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(mesProjectMaintenanceService.selectMesProjectMaintenanceById(id));
    }

    /**
     * 新增制造执行MES-项目维护
     */
    @PreAuthorize("@ss.hasPermi('mes:maintenance:add')")
    @Log(title = "制造执行MES-项目维护", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesProjectMaintenance mesProjectMaintenance)
    {
        return toAjax(mesProjectMaintenanceService.insertMesProjectMaintenance(mesProjectMaintenance));
    }

    /**
     * 修改制造执行MES-项目维护
     */
    @PreAuthorize("@ss.hasPermi('mes:maintenance:edit')")
    @Log(title = "制造执行MES-项目维护", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesProjectMaintenance mesProjectMaintenance)
    {
        return toAjax(mesProjectMaintenanceService.updateMesProjectMaintenance(mesProjectMaintenance));
    }

    /**
     * 删除制造执行MES-项目维护
     */
    @PreAuthorize("@ss.hasPermi('mes:maintenance:remove')")
    @Log(title = "制造执行MES-项目维护", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(mesProjectMaintenanceService.deleteMesProjectMaintenanceByIds(ids));
    }
}
