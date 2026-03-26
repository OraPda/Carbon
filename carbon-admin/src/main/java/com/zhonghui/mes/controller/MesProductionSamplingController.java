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
import com.zhonghui.mes.domain.MesProductionSampling;
import com.zhonghui.mes.service.IMesProductionSamplingService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 制造执行MES-质量管理-生产采样Controller
 * 
 * @author zhonghui
 * @date 2024-04-11
 */
@RestController
@RequestMapping("/mes/sampling")
public class MesProductionSamplingController extends BaseController
{
    @Autowired
    private IMesProductionSamplingService mesProductionSamplingService;

    /**
     * 查询制造执行MES-质量管理-生产采样列表
     */
    @PreAuthorize("@ss.hasPermi('mes:sampling:list')")
    @GetMapping("/list")
    public TableDataInfo list(MesProductionSampling mesProductionSampling)
    {
        startPage();
        List<MesProductionSampling> list = mesProductionSamplingService.selectMesProductionSamplingList(mesProductionSampling);
        return getDataTable(list);
    }

    /**
     * 导出制造执行MES-质量管理-生产采样列表
     */
    @PreAuthorize("@ss.hasPermi('mes:sampling:export')")
    @Log(title = "制造执行MES-质量管理-生产采样", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesProductionSampling mesProductionSampling)
    {
        List<MesProductionSampling> list = mesProductionSamplingService.selectMesProductionSamplingList(mesProductionSampling);
        ExcelUtil<MesProductionSampling> util = new ExcelUtil<MesProductionSampling>(MesProductionSampling.class);
        util.exportExcel(response, list, "制造执行MES-质量管理-生产采样数据");
    }

    /**
     * 获取制造执行MES-质量管理-生产采样详细信息
     */
    @PreAuthorize("@ss.hasPermi('mes:sampling:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(mesProductionSamplingService.selectMesProductionSamplingById(id));
    }

    /**
     * 新增制造执行MES-质量管理-生产采样
     */
    @PreAuthorize("@ss.hasPermi('mes:sampling:add')")
    @Log(title = "制造执行MES-质量管理-生产采样", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesProductionSampling mesProductionSampling)
    {
        return toAjax(mesProductionSamplingService.insertMesProductionSampling(mesProductionSampling));
    }

    /**
     * 修改制造执行MES-质量管理-生产采样
     */
    @PreAuthorize("@ss.hasPermi('mes:sampling:edit')")
    @Log(title = "制造执行MES-质量管理-生产采样", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesProductionSampling mesProductionSampling)
    {
        return toAjax(mesProductionSamplingService.updateMesProductionSampling(mesProductionSampling));
    }

    /**
     * 删除制造执行MES-质量管理-生产采样
     */
    @PreAuthorize("@ss.hasPermi('mes:sampling:remove')")
    @Log(title = "制造执行MES-质量管理-生产采样", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(mesProductionSamplingService.deleteMesProductionSamplingByIds(ids));
    }
}
