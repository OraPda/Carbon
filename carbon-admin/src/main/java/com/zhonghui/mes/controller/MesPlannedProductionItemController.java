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
import com.zhonghui.mes.domain.MesPlannedProductionItem;
import com.zhonghui.mes.service.IMesPlannedProductionItemService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 制造执行MES-计划排产明细Controller
 * 
 * @author yang
 * @date 2024-04-03
 */
@RestController
@RequestMapping("/mes/item")
public class MesPlannedProductionItemController extends BaseController
{
    @Autowired
    private IMesPlannedProductionItemService mesPlannedProductionItemService;

    /**
     * 查询制造执行MES-计划排产明细列表
     */
    @PreAuthorize("@ss.hasPermi('mes:item:list')")
    @GetMapping("/list")
    public TableDataInfo list(MesPlannedProductionItem mesPlannedProductionItem)
    {
        startPage();
        List<MesPlannedProductionItem> list = mesPlannedProductionItemService.selectMesPlannedProductionItemList(mesPlannedProductionItem);
        return getDataTable(list);
    }

    /**
     * 导出制造执行MES-计划排产明细列表
     */
    @PreAuthorize("@ss.hasPermi('mes:item:export')")
    @Log(title = "制造执行MES-计划排产明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesPlannedProductionItem mesPlannedProductionItem)
    {
        List<MesPlannedProductionItem> list = mesPlannedProductionItemService.selectMesPlannedProductionItemList(mesPlannedProductionItem);
        ExcelUtil<MesPlannedProductionItem> util = new ExcelUtil<MesPlannedProductionItem>(MesPlannedProductionItem.class);
        util.exportExcel(response, list, "制造执行MES-计划排产明细数据");
    }

    /**
     * 获取制造执行MES-计划排产明细详细信息
     */
    @PreAuthorize("@ss.hasPermi('mes:item:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(mesPlannedProductionItemService.selectMesPlannedProductionItemById(id));
    }

    /**
     * 新增制造执行MES-计划排产明细
     */
    @PreAuthorize("@ss.hasPermi('mes:item:add')")
    @Log(title = "制造执行MES-计划排产明细", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesPlannedProductionItem mesPlannedProductionItem)
    {
        return toAjax(mesPlannedProductionItemService.insertMesPlannedProductionItem(mesPlannedProductionItem));
    }

    /**
     * 修改制造执行MES-计划排产明细
     */
    @PreAuthorize("@ss.hasPermi('mes:item:edit')")
    @Log(title = "制造执行MES-计划排产明细", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesPlannedProductionItem mesPlannedProductionItem)
    {
        return toAjax(mesPlannedProductionItemService.updateMesPlannedProductionItem(mesPlannedProductionItem));
    }

    /**
     * 删除制造执行MES-计划排产明细
     */
    @PreAuthorize("@ss.hasPermi('mes:item:remove')")
    @Log(title = "制造执行MES-计划排产明细", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(mesPlannedProductionItemService.deleteMesPlannedProductionItemByIds(ids));
    }
}
