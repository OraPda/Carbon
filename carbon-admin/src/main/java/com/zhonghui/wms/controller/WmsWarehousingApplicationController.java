package com.zhonghui.wms.controller;

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
import com.zhonghui.wms.domain.WmsWarehousingApplication;
import com.zhonghui.wms.service.IWmsWarehousingApplicationService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 智能仓储WMS-入库申请Controller
 * 
 * @author zhonghui
 * @date 2024-04-12
 */
@RestController
@RequestMapping("/wms/warehousingApplication")
public class WmsWarehousingApplicationController extends BaseController
{
    @Autowired
    private IWmsWarehousingApplicationService wmsWarehousingApplicationService;

    /**
     * 查询智能仓储WMS-入库申请列表
     */
    @PreAuthorize("@ss.hasPermi('wms:warehousingApplication:list')")
    @GetMapping("/list")
    public TableDataInfo list(WmsWarehousingApplication wmsWarehousingApplication)
    {
        startPage();
        List<WmsWarehousingApplication> list = wmsWarehousingApplicationService.selectWmsWarehousingApplicationList(wmsWarehousingApplication);
        return getDataTable(list);
    }

    /**
     * 导出智能仓储WMS-入库申请列表
     */
    @PreAuthorize("@ss.hasPermi('wms:warehousingApplication:export')")
    @Log(title = "智能仓储WMS-入库申请", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, WmsWarehousingApplication wmsWarehousingApplication)
    {
        List<WmsWarehousingApplication> list = wmsWarehousingApplicationService.selectWmsWarehousingApplicationList(wmsWarehousingApplication);
        ExcelUtil<WmsWarehousingApplication> util = new ExcelUtil<WmsWarehousingApplication>(WmsWarehousingApplication.class);
        util.exportExcel(response, list, "智能仓储WMS-入库申请数据");
    }

    /**
     * 获取智能仓储WMS-入库申请详细信息
     */
    @PreAuthorize("@ss.hasPermi('wms:warehousingApplication:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(wmsWarehousingApplicationService.selectWmsWarehousingApplicationById(id));
    }

    /**
     * 新增智能仓储WMS-入库申请
     */
    @PreAuthorize("@ss.hasPermi('wms:warehousingApplication:add')")
    @Log(title = "智能仓储WMS-入库申请", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WmsWarehousingApplication wmsWarehousingApplication)
    {
        return toAjax(wmsWarehousingApplicationService.insertWmsWarehousingApplication(wmsWarehousingApplication));
    }

    /**
     * 修改智能仓储WMS-入库申请
     */
    @PreAuthorize("@ss.hasPermi('wms:warehousingApplication:edit')")
    @Log(title = "智能仓储WMS-入库申请", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WmsWarehousingApplication wmsWarehousingApplication)
    {
        return toAjax(wmsWarehousingApplicationService.updateWmsWarehousingApplication(wmsWarehousingApplication));
    }

    /**
     * 删除智能仓储WMS-入库申请
     */
    @PreAuthorize("@ss.hasPermi('wms:warehousingApplication:remove')")
    @Log(title = "智能仓储WMS-入库申请", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(wmsWarehousingApplicationService.deleteWmsWarehousingApplicationByIds(ids));
    }
}
