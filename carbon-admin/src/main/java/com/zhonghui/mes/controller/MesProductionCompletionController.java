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
import com.zhonghui.mes.domain.MesProductionCompletion;
import com.zhonghui.mes.service.IMesProductionCompletionService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 制造执行MES-生产完工单Controller
 * 
 * @author yang
 * @date 2024-04-09
 */
@RestController
@RequestMapping("/mes/completion")
public class MesProductionCompletionController extends BaseController
{
    @Autowired
    private IMesProductionCompletionService mesProductionCompletionService;

    /**
     * 查询制造执行MES-生产完工单列表
     */
    @PreAuthorize("@ss.hasPermi('mes:completion:list')")
    @GetMapping("/list")
    public TableDataInfo list(MesProductionCompletion mesProductionCompletion)
    {
        startPage();
        List<MesProductionCompletion> list = mesProductionCompletionService.selectMesProductionCompletionList(mesProductionCompletion);
        return getDataTable(list);
    }

    /**
     * 导出制造执行MES-生产完工单列表
     */
    @PreAuthorize("@ss.hasPermi('mes:completion:export')")
    @Log(title = "制造执行MES-生产完工单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MesProductionCompletion mesProductionCompletion)
    {
        List<MesProductionCompletion> list = mesProductionCompletionService.selectMesProductionCompletionList(mesProductionCompletion);
        ExcelUtil<MesProductionCompletion> util = new ExcelUtil<MesProductionCompletion>(MesProductionCompletion.class);
        util.exportExcel(response, list, "制造执行MES-生产完工单数据");
    }

    /**
     * 获取制造执行MES-生产完工单详细信息
     */
    @PreAuthorize("@ss.hasPermi('mes:completion:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(mesProductionCompletionService.selectMesProductionCompletionById(id));
    }

    /**
     * 新增制造执行MES-生产完工单
     */
    @PreAuthorize("@ss.hasPermi('mes:completion:add')")
    @Log(title = "制造执行MES-生产完工单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MesProductionCompletion mesProductionCompletion)
    {
        return toAjax(mesProductionCompletionService.insertMesProductionCompletion(mesProductionCompletion));
    }

    /**
     * 修改制造执行MES-生产完工单
     */
    @PreAuthorize("@ss.hasPermi('mes:completion:edit')")
    @Log(title = "制造执行MES-生产完工单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MesProductionCompletion mesProductionCompletion)
    {
        return toAjax(mesProductionCompletionService.updateMesProductionCompletion(mesProductionCompletion));
    }

    /**
     * 删除制造执行MES-生产完工单
     */
    @PreAuthorize("@ss.hasPermi('mes:completion:remove')")
    @Log(title = "制造执行MES-生产完工单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(mesProductionCompletionService.deleteMesProductionCompletionByIds(ids));
    }
}
