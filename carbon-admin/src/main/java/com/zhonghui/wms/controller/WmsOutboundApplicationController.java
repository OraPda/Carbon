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
import com.zhonghui.wms.domain.WmsOutboundApplication;
import com.zhonghui.wms.service.IWmsOutboundApplicationService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 智能仓储WMS-出库申请Controller
 * 
 * @author yang
 * @date 2024-04-15
 */
@RestController
@RequestMapping("/wms/application")
public class WmsOutboundApplicationController extends BaseController
{
    @Autowired
    private IWmsOutboundApplicationService wmsOutboundApplicationService;

    /**
     * 查询智能仓储WMS-出库申请列表
     */
    @PreAuthorize("@ss.hasPermi('wms:application:list')")
    @GetMapping("/list")
    public TableDataInfo list(WmsOutboundApplication wmsOutboundApplication)
    {
        startPage();
        List<WmsOutboundApplication> list = wmsOutboundApplicationService.selectWmsOutboundApplicationList(wmsOutboundApplication);
        return getDataTable(list);
    }

    /**
     * 导出智能仓储WMS-出库申请列表
     */
    @PreAuthorize("@ss.hasPermi('wms:application:export')")
    @Log(title = "智能仓储WMS-出库申请", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, WmsOutboundApplication wmsOutboundApplication)
    {
        List<WmsOutboundApplication> list = wmsOutboundApplicationService.selectWmsOutboundApplicationList(wmsOutboundApplication);
        ExcelUtil<WmsOutboundApplication> util = new ExcelUtil<WmsOutboundApplication>(WmsOutboundApplication.class);
        util.exportExcel(response, list, "智能仓储WMS-出库申请数据");
    }

    /**
     * 获取智能仓储WMS-出库申请详细信息
     */
    @PreAuthorize("@ss.hasPermi('wms:application:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(wmsOutboundApplicationService.selectWmsOutboundApplicationById(id));
    }

    /**
     * 新增智能仓储WMS-出库申请
     */
    @PreAuthorize("@ss.hasPermi('wms:application:add')")
    @Log(title = "智能仓储WMS-出库申请", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WmsOutboundApplication wmsOutboundApplication)
    {
        return toAjax(wmsOutboundApplicationService.insertWmsOutboundApplication(wmsOutboundApplication));
    }

    /**
     * 修改智能仓储WMS-出库申请
     */
    @PreAuthorize("@ss.hasPermi('wms:application:edit')")
    @Log(title = "智能仓储WMS-出库申请", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WmsOutboundApplication wmsOutboundApplication)
    {
        return toAjax(wmsOutboundApplicationService.updateWmsOutboundApplication(wmsOutboundApplication));
    }

    /**
     * 删除智能仓储WMS-出库申请
     */
    @PreAuthorize("@ss.hasPermi('wms:application:remove')")
    @Log(title = "智能仓储WMS-出库申请", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(wmsOutboundApplicationService.deleteWmsOutboundApplicationByIds(ids));
    }
}
