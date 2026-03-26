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
import com.zhonghui.mes.domain.MesProductionPlanItem;
import com.zhonghui.mes.service.IMesProductionPlanItemService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 制造执行MES-生产计划明细Controller
 * 
 * @author yang
 * @date 2024-04-09
 */
@RestController
@RequestMapping("/mes/planItem")
public class MesProductionPlanItemController extends BaseController
{
    @Autowired
    private IMesProductionPlanItemService mesProductionPlanItemService;

    /**
     * 查询制造执行MES-生产计划明细列表
     */
    @PreAuthorize("@ss.hasPermi('mes:planItem:list')")
    @GetMapping("/list")
    public TableDataInfo list(MesProductionPlanItem mesProductionPlanItem)
    {
        startPage();
        List<MesProductionPlanItem> list = mesProductionPlanItemService.selectMesProductionPlanItemList(mesProductionPlanItem);
        return getDataTable(list);
    }

    /**
     * 导出制造执行MES-生产计划明细列表
     */
    @PreAuthorize("@ss.hasPermi('mes:planItem:export')")
    @Log(title = "制造执行MES-生产计划明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesProductionPlanItem mesProductionPlanItem)
    {
        List<MesProductionPlanItem> list = mesProductionPlanItemService.selectMesProductionPlanItemList(mesProductionPlanItem);
        ExcelUtil<MesProductionPlanItem> util = new ExcelUtil<MesProductionPlanItem>(MesProductionPlanItem.class);
        util.exportExcel(response, list, "制造执行MES-生产计划明细数据");
    }

    /**
     * 获取制造执行MES-生产计划明细详细信息
     */
    @PreAuthorize("@ss.hasPermi('mes:planItem:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(mesProductionPlanItemService.selectMesProductionPlanItemById(id));
    }

    /**
     * 新增制造执行MES-生产计划明细
     */
    @PreAuthorize("@ss.hasPermi('mes:planItem:add')")
    @Log(title = "制造执行MES-生产计划明细", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesProductionPlanItem mesProductionPlanItem)
    {
        return toAjax(mesProductionPlanItemService.insertMesProductionPlanItem(mesProductionPlanItem));
    }

    /**
     * 修改制造执行MES-生产计划明细
     */
    @PreAuthorize("@ss.hasPermi('mes:planItem:edit')")
    @Log(title = "制造执行MES-生产计划明细", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesProductionPlanItem mesProductionPlanItem)
    {
        return toAjax(mesProductionPlanItemService.updateMesProductionPlanItem(mesProductionPlanItem));
    }

    /**
     * 删除制造执行MES-生产计划明细
     */
    @PreAuthorize("@ss.hasPermi('mes:planItem:remove')")
    @Log(title = "制造执行MES-生产计划明细", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(mesProductionPlanItemService.deleteMesProductionPlanItemByIds(ids));
    }
}
