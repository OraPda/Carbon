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
import com.zhonghui.mes.domain.MesJobAssembly;
import com.zhonghui.mes.service.IMesJobAssemblyService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 制造执行MES-生产作业Controller
 * 
 * @author yang
 * @date 2024-04-10
 */
@RestController
@RequestMapping("/mes/assembly")
public class MesJobAssemblyController extends BaseController
{
    @Autowired
    private IMesJobAssemblyService mesJobAssemblyService;

    /**
     * 查询制造执行MES-生产作业列表
     */
    @PreAuthorize("@ss.hasPermi('mes:assembly:list')")
    @GetMapping("/list")
    public TableDataInfo list(MesJobAssembly mesJobAssembly)
    {
        startPage();
        List<MesJobAssembly> list = mesJobAssemblyService.selectMesJobAssemblyList(mesJobAssembly);
        return getDataTable(list);
    }

    /**
     * 导出制造执行MES-生产作业列表
     */
    @PreAuthorize("@ss.hasPermi('mes:assembly:export')")
    @Log(title = "制造执行MES-生产作业", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesJobAssembly mesJobAssembly)
    {
        List<MesJobAssembly> list = mesJobAssemblyService.selectMesJobAssemblyList(mesJobAssembly);
        ExcelUtil<MesJobAssembly> util = new ExcelUtil<MesJobAssembly>(MesJobAssembly.class);
        util.exportExcel(response, list, "制造执行MES-生产作业数据");
    }

    /**
     * 获取制造执行MES-生产作业详细信息
     */
    @PreAuthorize("@ss.hasPermi('mes:assembly:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(mesJobAssemblyService.selectMesJobAssemblyById(id));
    }

    /**
     * 新增制造执行MES-生产作业
     */
    @PreAuthorize("@ss.hasPermi('mes:assembly:add')")
    @Log(title = "制造执行MES-生产作业", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesJobAssembly mesJobAssembly)
    {
        return toAjax(mesJobAssemblyService.insertMesJobAssembly(mesJobAssembly));
    }

    /**
     * 修改制造执行MES-生产作业
     */
    @PreAuthorize("@ss.hasPermi('mes:assembly:edit')")
    @Log(title = "制造执行MES-生产作业", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesJobAssembly mesJobAssembly)
    {
        return toAjax(mesJobAssemblyService.updateMesJobAssembly(mesJobAssembly));
    }

    /**
     * 删除制造执行MES-生产作业
     */
    @PreAuthorize("@ss.hasPermi('mes:assembly:remove')")
    @Log(title = "制造执行MES-生产作业", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(mesJobAssemblyService.deleteMesJobAssemblyByIds(ids));
    }
}
