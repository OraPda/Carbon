package com.zhonghui.scm.controller;

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
import com.zhonghui.scm.domain.ScmSaleContract;
import com.zhonghui.scm.service.IScmSaleContractService;
import com.zhonghui.common.utils.poi.ExcelUtil;
import com.zhonghui.common.core.page.TableDataInfo;

/**
 * 供应链SCM-销售管理-销售合同Controller
 * 
 * @author zhonghui
 * @date 2024-04-12
 */
@RestController
@RequestMapping("/scm/contract")
public class ScmSaleContractController extends BaseController
{
    @Autowired
    private IScmSaleContractService scmSaleContractService;

    /**
     * 查询供应链SCM-销售管理-销售合同列表
     */
    @PreAuthorize("@ss.hasPermi('scm:contract:list')")
    @GetMapping("/list")
    public TableDataInfo list(ScmSaleContract scmSaleContract)
    {
        startPage();
        List<ScmSaleContract> list = scmSaleContractService.selectScmSaleContractList(scmSaleContract);
        return getDataTable(list);
    }

    /**
     * 导出供应链SCM-销售管理-销售合同列表
     */
    @PreAuthorize("@ss.hasPermi('scm:contract:export')")
    @Log(title = "供应链SCM-销售管理-销售合同", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ScmSaleContract scmSaleContract)
    {
        List<ScmSaleContract> list = scmSaleContractService.selectScmSaleContractList(scmSaleContract);
        ExcelUtil<ScmSaleContract> util = new ExcelUtil<ScmSaleContract>(ScmSaleContract.class);
        util.exportExcel(response, list, "供应链SCM-销售管理-销售合同数据");
    }

    /**
     * 获取供应链SCM-销售管理-销售合同详细信息
     */
    @PreAuthorize("@ss.hasPermi('scm:contract:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(scmSaleContractService.selectScmSaleContractById(id));
    }

    /**
     * 新增供应链SCM-销售管理-销售合同
     */
    @PreAuthorize("@ss.hasPermi('scm:contract:add')")
    @Log(title = "供应链SCM-销售管理-销售合同", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ScmSaleContract scmSaleContract)
    {
        return toAjax(scmSaleContractService.insertScmSaleContract(scmSaleContract));
    }

    /**
     * 修改供应链SCM-销售管理-销售合同
     */
    @PreAuthorize("@ss.hasPermi('scm:contract:edit')")
    @Log(title = "供应链SCM-销售管理-销售合同", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ScmSaleContract scmSaleContract)
    {
        return toAjax(scmSaleContractService.updateScmSaleContract(scmSaleContract));
    }

    /**
     * 删除供应链SCM-销售管理-销售合同
     */
    @PreAuthorize("@ss.hasPermi('scm:contract:remove')")
    @Log(title = "供应链SCM-销售管理-销售合同", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(scmSaleContractService.deleteScmSaleContractByIds(ids));
    }
}
