package com.zhonghui.wms.controller;

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
import com.zhonghui.wms.domain.WmsReplenishmentApplication;
import com.zhonghui.wms.service.IWmsReplenishmentApplicationService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 智能仓储WMS-补货申请Controller
 *
 * @author zhonghui
 * @date 2024-04-12
 */
@RestController
@RequestMapping("/wms/replenishmentApplication")
public class WmsReplenishmentApplicationController extends BaseController
{
    @Autowired
    private IWmsReplenishmentApplicationService wmsReplenishmentApplicationService;

    /**
     * 查询智能仓储WMS-补货申请列表
     */
    @PreAuthorize("@ss.hasPermi('wms:replenishmentApplication:list')")
    @GetMapping("/list")
    public TableDataInfo list(WmsReplenishmentApplication wmsReplenishmentApplication)
    {
        startPage();
        List<WmsReplenishmentApplication> list = wmsReplenishmentApplicationService.selectWmsReplenishmentApplicationList(wmsReplenishmentApplication);
        return getDataTable(list);
    }

    /**
     * 导出智能仓储WMS-补货申请列表
     */
    @PreAuthorize("@ss.hasPermi('wms:replenishmentApplication:export')")
    @Log(title = "智能仓储WMS-补货申请", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, WmsReplenishmentApplication wmsReplenishmentApplication)
    {
        List<WmsReplenishmentApplication> list = wmsReplenishmentApplicationService.selectWmsReplenishmentApplicationList(wmsReplenishmentApplication);
        ExcelUtil<WmsReplenishmentApplication> util = new ExcelUtil<WmsReplenishmentApplication>(WmsReplenishmentApplication.class);
        util.exportExcel(response, list, "智能仓储WMS-补货申请数据");
    }

    /**
     * 获取智能仓储WMS-补货申请详细信息
     */
    @PreAuthorize("@ss.hasPermi('wms:replenishmentApplication:query')")
    @GetMapping(value = "/{id}")
    public BaseResult<WmsReplenishmentApplication> getInfo(@PathVariable("id") Long id)
    {
        return BaseResult.success(wmsReplenishmentApplicationService.selectWmsReplenishmentApplicationById(id));
    }

    /**
     * 新增智能仓储WMS-补货申请
     */
    @PreAuthorize("@ss.hasPermi('wms:replenishmentApplication:add')")
    @Log(title = "智能仓储WMS-补货申请", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WmsReplenishmentApplication wmsReplenishmentApplication)
    {
        return toAjax(wmsReplenishmentApplicationService.insertWmsReplenishmentApplication(wmsReplenishmentApplication));
    }

    /**
     * 修改智能仓储WMS-补货申请
     */
    @PreAuthorize("@ss.hasPermi('wms:replenishmentApplication:edit')")
    @Log(title = "智能仓储WMS-补货申请", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WmsReplenishmentApplication wmsReplenishmentApplication)
    {
        return toAjax(wmsReplenishmentApplicationService.updateWmsReplenishmentApplication(wmsReplenishmentApplication));
    }

    /**
     * 删除智能仓储WMS-补货申请
     */
    @PreAuthorize("@ss.hasPermi('wms:replenishmentApplication:remove')")
    @Log(title = "智能仓储WMS-补货申请", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(wmsReplenishmentApplicationService.deleteWmsReplenishmentApplicationByIds(ids));
    }
}
