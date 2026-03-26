package com.zhonghui.mes.controller;

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
import com.zhonghui.mes.domain.MesBom;
import com.zhonghui.mes.service.IMesBomService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 制造执行MES-BOMController
 * 
 * @author yang
 * @date 2024-04-03
 */
@RestController
@RequestMapping("/mes/bom")
public class MesBomController extends BaseController
{
    @Autowired
    private IMesBomService mesBomService;

    /**
     * 查询制造执行MES-BOM列表
     */
    @PreAuthorize("@ss.hasPermi('mes:bom:list')")
    @GetMapping("/list")
    public TableDataInfo list(MesBom mesBom)
    {
        startPage();
        List<MesBom> list = mesBomService.selectMesBomList(mesBom);
        return getDataTable(list);
    }

    /**
     * 查询Bom列表(不分页)
     */
    @GetMapping("/getList")
    public BaseResult<List<MesBom>> getList(MesBom mesBom)
    {
        return BaseResult.success(mesBomService.selectMesBomList(mesBom));
    }

    /**
     * 导出制造执行MES-BOM列表
     */
    @PreAuthorize("@ss.hasPermi('mes:bom:export')")
    @Log(title = "制造执行MES-BOM", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesBom mesBom)
    {
        List<MesBom> list = mesBomService.selectMesBomList(mesBom);
        ExcelUtil<MesBom> util = new ExcelUtil<MesBom>(MesBom.class);
        util.exportExcel(response, list, "制造执行MES-BOM数据");
    }

    /**
     * 查询Bom列表(通过计划id)
     */
    @GetMapping(value = "/getListByMaterialId/{id}")
    public BaseResult<List<MesBom>> getListByMaterialId(@PathVariable("id") Long id)
    {
        return BaseResult.success(mesBomService.selectMesBomListByMaterialId(id));
    }

    /**
     * 获取制造执行MES-BOM详细信息
     */
    @PreAuthorize("@ss.hasPermi('mes:bom:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(mesBomService.selectMesBomById(id));
    }

    /**
     * 新增制造执行MES-BOM
     */
    @PreAuthorize("@ss.hasPermi('mes:bom:add')")
    @Log(title = "制造执行MES-BOM", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesBom mesBom)
    {
        return toAjax(mesBomService.insertMesBom(mesBom));
    }

    /**
     * 修改制造执行MES-BOM
     */
    @PreAuthorize("@ss.hasPermi('mes:bom:edit')")
    @Log(title = "制造执行MES-BOM", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesBom mesBom)
    {
        return toAjax(mesBomService.updateMesBom(mesBom));
    }

    /**
     * 删除制造执行MES-BOM
     */
    @PreAuthorize("@ss.hasPermi('mes:bom:remove')")
    @Log(title = "制造执行MES-BOM", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(mesBomService.deleteMesBomByIds(ids));
    }
}
