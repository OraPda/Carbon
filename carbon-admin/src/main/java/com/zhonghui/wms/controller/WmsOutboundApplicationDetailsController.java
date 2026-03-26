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
import com.zhonghui.wms.domain.WmsOutboundApplicationDetails;
import com.zhonghui.wms.service.IWmsOutboundApplicationDetailsService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 智能仓储WMS-出库申请明细Controller
 * 
 * @author yang
 * @date 2024-04-16
 */
@RestController
@RequestMapping("/wms/details")
public class WmsOutboundApplicationDetailsController extends BaseController
{
    @Autowired
    private IWmsOutboundApplicationDetailsService wmsOutboundApplicationDetailsService;

    /**
     * 查询智能仓储WMS-出库申请明细列表
     */
    @PreAuthorize("@ss.hasPermi('wms:details:list')")
    @GetMapping("/list")
    public TableDataInfo list(WmsOutboundApplicationDetails wmsOutboundApplicationDetails)
    {
        startPage();
        List<WmsOutboundApplicationDetails> list = wmsOutboundApplicationDetailsService.selectWmsOutboundApplicationDetailsList(wmsOutboundApplicationDetails);
        return getDataTable(list);
    }

    /**
     * 导出智能仓储WMS-出库申请明细列表
     */
    @PreAuthorize("@ss.hasPermi('wms:details:export')")
    @Log(title = "智能仓储WMS-出库申请明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, WmsOutboundApplicationDetails wmsOutboundApplicationDetails)
    {
        List<WmsOutboundApplicationDetails> list = wmsOutboundApplicationDetailsService.selectWmsOutboundApplicationDetailsList(wmsOutboundApplicationDetails);
        ExcelUtil<WmsOutboundApplicationDetails> util = new ExcelUtil<WmsOutboundApplicationDetails>(WmsOutboundApplicationDetails.class);
        util.exportExcel(response, list, "智能仓储WMS-出库申请明细数据");
    }

    /**
     * 获取智能仓储WMS-出库申请明细详细信息
     */
    @PreAuthorize("@ss.hasPermi('wms:details:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(wmsOutboundApplicationDetailsService.selectWmsOutboundApplicationDetailsById(id));
    }

    /**
     * 新增智能仓储WMS-出库申请明细
     */
    @PreAuthorize("@ss.hasPermi('wms:details:add')")
    @Log(title = "智能仓储WMS-出库申请明细", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WmsOutboundApplicationDetails wmsOutboundApplicationDetails)
    {
        return toAjax(wmsOutboundApplicationDetailsService.insertWmsOutboundApplicationDetails(wmsOutboundApplicationDetails));
    }

    /**
     * 修改智能仓储WMS-出库申请明细
     */
    @PreAuthorize("@ss.hasPermi('wms:details:edit')")
    @Log(title = "智能仓储WMS-出库申请明细", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WmsOutboundApplicationDetails wmsOutboundApplicationDetails)
    {
        return toAjax(wmsOutboundApplicationDetailsService.updateWmsOutboundApplicationDetails(wmsOutboundApplicationDetails));
    }

    /**
     * 删除智能仓储WMS-出库申请明细
     */
    @PreAuthorize("@ss.hasPermi('wms:details:remove')")
    @Log(title = "智能仓储WMS-出库申请明细", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(wmsOutboundApplicationDetailsService.deleteWmsOutboundApplicationDetailsByIds(ids));
    }
}
