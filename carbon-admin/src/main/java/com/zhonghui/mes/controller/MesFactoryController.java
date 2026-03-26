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
import com.zhonghui.mes.domain.MesFactory;
import com.zhonghui.mes.service.IMesFactoryService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 制造执行MES-工厂建模Controller
 * 
 * @author yang
 * @date 2024-04-04
 */
@RestController
@RequestMapping("/mes/factory")
public class MesFactoryController extends BaseController
{
    @Autowired
    private IMesFactoryService mesFactoryService;

    /**
     * 查询制造执行MES-工厂建模列表
     */
    @PreAuthorize("@ss.hasPermi('mes:factory:list')")
    @GetMapping("/list")
    public TableDataInfo list(MesFactory mesFactory)
    {
        startPage();
        List<MesFactory> list = mesFactoryService.selectMesFactoryList(mesFactory);
        return getDataTable(list);
    }

    /**
     * 查询工厂建模列表不分页
     */
    @GetMapping("/getList")
    public BaseResult<List<MesFactory>> getList(MesFactory mesFactory){
        return BaseResult.success(mesFactoryService.selectMesFactoryList(mesFactory));
    }

    /**
     * 导出制造执行MES-工厂建模列表
     */
    @PreAuthorize("@ss.hasPermi('mes:factory:export')")
    @Log(title = "制造执行MES-工厂建模", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesFactory mesFactory)
    {
        List<MesFactory> list = mesFactoryService.selectMesFactoryList(mesFactory);
        ExcelUtil<MesFactory> util = new ExcelUtil<MesFactory>(MesFactory.class);
        util.exportExcel(response, list, "制造执行MES-工厂建模数据");
    }

    /**
     * 获取制造执行MES-工厂建模详细信息
     */
    @PreAuthorize("@ss.hasPermi('mes:factory:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(mesFactoryService.selectMesFactoryById(id));
    }

    /**
     * 新增制造执行MES-工厂建模
     */
    @PreAuthorize("@ss.hasPermi('mes:factory:add')")
    @Log(title = "制造执行MES-工厂建模", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesFactory mesFactory)
    {
        return toAjax(mesFactoryService.insertMesFactory(mesFactory));
    }

    /**
     * 修改制造执行MES-工厂建模
     */
    @PreAuthorize("@ss.hasPermi('mes:factory:edit')")
    @Log(title = "制造执行MES-工厂建模", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesFactory mesFactory)
    {
        return toAjax(mesFactoryService.updateMesFactory(mesFactory));
    }

    /**
     * 删除制造执行MES-工厂建模
     */
    @PreAuthorize("@ss.hasPermi('mes:factory:remove')")
    @Log(title = "制造执行MES-工厂建模", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(mesFactoryService.deleteMesFactoryByIds(ids));
    }
}
