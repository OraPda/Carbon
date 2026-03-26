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
import com.zhonghui.mes.domain.MesProductInspector;
import com.zhonghui.mes.service.IMesProductInspectorService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 制造执行MES-质量管理-产品检验
Controller
 * 
 * @author yang
 * @date 2024-04-09
 */
@RestController
@RequestMapping("/mes/inspector")
public class MesProductInspectorController extends BaseController
{
    @Autowired
    private IMesProductInspectorService mesProductInspectorService;

    /**
     * 查询制造执行MES-质量管理-产品检验
列表
     */
    @PreAuthorize("@ss.hasPermi('mes:inspector:list')")
    @GetMapping("/list")
    public TableDataInfo list(MesProductInspector mesProductInspector)
    {
        startPage();
        List<MesProductInspector> list = mesProductInspectorService.selectMesProductInspectorList(mesProductInspector);
        return getDataTable(list);
    }

    /**
     * 导出制造执行MES-质量管理-产品检验列表
     */
    @PreAuthorize("@ss.hasPermi('mes:inspector:export')")
    @Log(title = "制造执行MES-质量管理-产品检验 ", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesProductInspector mesProductInspector)
    {
        List<MesProductInspector> list = mesProductInspectorService.selectMesProductInspectorList(mesProductInspector);
        ExcelUtil<MesProductInspector> util = new ExcelUtil<MesProductInspector>(MesProductInspector.class);
        util.exportExcel(response, list, "制造执行MES-质量管理-产品检验数据");
    }

    /**
     * 获取制造执行MES-质量管理-产品检验
详细信息
     */
    @PreAuthorize("@ss.hasPermi('mes:inspector:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(mesProductInspectorService.selectMesProductInspectorById(id));
    }

    /**
     * 新增制造执行MES-质量管理-产品检验

     */
    @PreAuthorize("@ss.hasPermi('mes:inspector:add')")
    @Log(title = "制造执行MES-质量管理-产品检验 ", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesProductInspector mesProductInspector)
    {
        return toAjax(mesProductInspectorService.insertMesProductInspector(mesProductInspector));
    }

    /**
     * 修改制造执行MES-质量管理-产品检验

     */
    @PreAuthorize("@ss.hasPermi('mes:inspector:edit')")
    @Log(title = "制造执行MES-质量管理-产品检验 ", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesProductInspector mesProductInspector)
    {
        return toAjax(mesProductInspectorService.updateMesProductInspector(mesProductInspector));
    }

    /**
     * 删除制造执行MES-质量管理-产品检验

     */
    @PreAuthorize("@ss.hasPermi('mes:inspector:remove')")
    @Log(title = "制造执行MES-质量管理-产品检验 ", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(mesProductInspectorService.deleteMesProductInspectorByIds(ids));
    }
}
