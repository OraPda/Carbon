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
import com.zhonghui.mes.domain.MesTechnology;
import com.zhonghui.mes.service.IMesTechnologyService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 制造执行MES-工艺建模Controller
 * 
 * @author yang
 * @date 2024-03-28
 */
@RestController
@RequestMapping("/mes/technology")
public class MesTechnologyController extends BaseController
{
    @Autowired
    private IMesTechnologyService mesTechnologyService;

    /**
     * 查询制造执行MES-工艺建模列表
     */
    @PreAuthorize("@ss.hasPermi('mes:technology:list')")
    @GetMapping("/list")
    public TableDataInfo list(MesTechnology mesTechnology)
    {
        startPage();
        List<MesTechnology> list = mesTechnologyService.selectMesTechnologyList(mesTechnology);
        return getDataTable(list);
    }

    /**
     * 查询工艺建模列表（不分页）
     */
    @GetMapping("getList")
    public BaseResult getList(MesTechnology mesTechnology){
        return BaseResult.success(mesTechnologyService.selectMesTechnologyList(mesTechnology));
    }


    /**
     * 导出制造执行MES-工艺建模列表
     */
    @PreAuthorize("@ss.hasPermi('mes:technology:export')")
    @Log(title = "制造执行MES-工艺建模", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesTechnology mesTechnology)
    {
        List<MesTechnology> list = mesTechnologyService.selectMesTechnologyList(mesTechnology);
        ExcelUtil<MesTechnology> util = new ExcelUtil<MesTechnology>(MesTechnology.class);
        util.exportExcel(response, list, "制造执行MES-工艺建模数据");
    }

    /**
     * 获取制造执行MES-工艺建模详细信息
     */
    @PreAuthorize("@ss.hasPermi('mes:technology:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(mesTechnologyService.selectMesTechnologyById(id));
    }

    /**
     * 新增制造执行MES-工艺建模
     */
    @PreAuthorize("@ss.hasPermi('mes:technology:add')")
    @Log(title = "制造执行MES-工艺建模", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesTechnology mesTechnology)
    {
        return toAjax(mesTechnologyService.insertMesTechnology(mesTechnology));
    }

    /**
     * 修改制造执行MES-工艺建模
     */
    @PreAuthorize("@ss.hasPermi('mes:technology:edit')")
    @Log(title = "制造执行MES-工艺建模", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesTechnology mesTechnology)
    {
        return toAjax(mesTechnologyService.updateMesTechnology(mesTechnology));
    }

    /**
     * 删除制造执行MES-工艺建模
     */
    @PreAuthorize("@ss.hasPermi('mes:technology:remove')")
    @Log(title = "制造执行MES-工艺建模", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(mesTechnologyService.deleteMesTechnologyByIds(ids));
    }
}
