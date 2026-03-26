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
import com.zhonghui.mes.domain.MesErrorManagement;
import com.zhonghui.mes.service.IMesErrorManagementService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 制造执行MES-质量管理-防错管理Controller
 * 
 * @author yang
 * @date 2024-04-12
 */
@RestController
@RequestMapping("/mes/management")
public class MesErrorManagementController extends BaseController
{
    @Autowired
    private IMesErrorManagementService mesErrorManagementService;

    /**
     * 查询制造执行MES-质量管理-防错管理列表
     */
    @PreAuthorize("@ss.hasPermi('mes:management:list')")
    @GetMapping("/list")
    public TableDataInfo list(MesErrorManagement mesErrorManagement)
    {
        startPage();
        List<MesErrorManagement> list = mesErrorManagementService.selectMesErrorManagementList(mesErrorManagement);
        return getDataTable(list);
    }

    /**
     * 导出制造执行MES-质量管理-防错管理列表
     */
    @PreAuthorize("@ss.hasPermi('mes:management:export')")
    @Log(title = "制造执行MES-质量管理-防错管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesErrorManagement mesErrorManagement)
    {
        List<MesErrorManagement> list = mesErrorManagementService.selectMesErrorManagementList(mesErrorManagement);
        ExcelUtil<MesErrorManagement> util = new ExcelUtil<MesErrorManagement>(MesErrorManagement.class);
        util.exportExcel(response, list, "制造执行MES-质量管理-防错管理数据");
    }

    /**
     * 获取制造执行MES-质量管理-防错管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('mes:management:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(mesErrorManagementService.selectMesErrorManagementById(id));
    }

    /**
     * 新增制造执行MES-质量管理-防错管理
     */
    @PreAuthorize("@ss.hasPermi('mes:management:add')")
    @Log(title = "制造执行MES-质量管理-防错管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesErrorManagement mesErrorManagement)
    {
        return toAjax(mesErrorManagementService.insertMesErrorManagement(mesErrorManagement));
    }

    /**
     * 修改制造执行MES-质量管理-防错管理
     */
    @PreAuthorize("@ss.hasPermi('mes:management:edit')")
    @Log(title = "制造执行MES-质量管理-防错管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesErrorManagement mesErrorManagement)
    {
        return toAjax(mesErrorManagementService.updateMesErrorManagement(mesErrorManagement));
    }

    /**
     * 删除制造执行MES-质量管理-防错管理
     */
    @PreAuthorize("@ss.hasPermi('mes:management:remove')")
    @Log(title = "制造执行MES-质量管理-防错管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(mesErrorManagementService.deleteMesErrorManagementByIds(ids));
    }
}
