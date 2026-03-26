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
import com.zhonghui.mes.domain.MesDeviceInformation;
import com.zhonghui.mes.service.IMesDeviceInformationService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 制造执行MES-设备信息Controller
 * 
 * @author yang
 * @date 2024-03-28
 */
@RestController
@RequestMapping("/mes/information")
public class MesDeviceInformationController extends BaseController
{
    @Autowired
    private IMesDeviceInformationService mesDeviceInformationService;

    /**
     * 查询制造执行MES-设备信息列表
     */
    @PreAuthorize("@ss.hasPermi('mes:information:list')")
    @GetMapping("/list")
    public TableDataInfo list(MesDeviceInformation mesDeviceInformation)
    {
        startPage();
        List<MesDeviceInformation> list = mesDeviceInformationService.selectMesDeviceInformationList(mesDeviceInformation);
        return getDataTable(list);
    }

    /**
     * 导出制造执行MES-设备信息列表
     */
    @PreAuthorize("@ss.hasPermi('mes:information:export')")
    @Log(title = "制造执行MES-设备信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesDeviceInformation mesDeviceInformation)
    {
        List<MesDeviceInformation> list = mesDeviceInformationService.selectMesDeviceInformationList(mesDeviceInformation);
        ExcelUtil<MesDeviceInformation> util = new ExcelUtil<MesDeviceInformation>(MesDeviceInformation.class);
        util.exportExcel(response, list, "制造执行MES-设备信息数据");
    }

    /**
     * 获取制造执行MES-设备信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('mes:information:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(mesDeviceInformationService.selectMesDeviceInformationById(id));
    }

    /**
     * 新增制造执行MES-设备信息
     */
    @PreAuthorize("@ss.hasPermi('mes:information:add')")
    @Log(title = "制造执行MES-设备信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesDeviceInformation mesDeviceInformation)
    {
        return toAjax(mesDeviceInformationService.insertMesDeviceInformation(mesDeviceInformation));
    }

    /**
     * 修改制造执行MES-设备信息
     */
    @PreAuthorize("@ss.hasPermi('mes:information:edit')")
    @Log(title = "制造执行MES-设备信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesDeviceInformation mesDeviceInformation)
    {
        return toAjax(mesDeviceInformationService.updateMesDeviceInformation(mesDeviceInformation));
    }

    /**
     * 删除制造执行MES-设备信息
     */
    @PreAuthorize("@ss.hasPermi('mes:information:remove')")
    @Log(title = "制造执行MES-设备信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(mesDeviceInformationService.deleteMesDeviceInformationByIds(ids));
    }
}
