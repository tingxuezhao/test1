package com.ruoyi.project.module.billTypes.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.module.billTypes.domain.BillTypes;
import com.ruoyi.project.module.billTypes.service.IBillTypesService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;

/**
 * 票据类型 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-09-19
 */
@Controller
@RequestMapping("/module/billTypes")
public class BillTypesController extends BaseController
{
    private String prefix = "module/billTypes";
	
	@Autowired
	private IBillTypesService billTypesService;
	
	@RequiresPermissions("module:billTypes:view")
	@GetMapping()
	public String billTypes()
	{
	    return prefix + "/billTypes";
	}
	
	/**
	 * 查询票据类型列表
	 */
	@RequiresPermissions("module:billTypes:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(BillTypes billTypes)
	{
		startPage();
        List<BillTypes> list = billTypesService.selectBillTypesList(billTypes);
		return getDataTable(list);
	}
	
	/**
	 * 新增票据类型
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存票据类型
	 */
	@RequiresPermissions("module:billTypes:add")
	@Log(title = "票据类型", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(BillTypes billTypes)
	{		
		return toAjax(billTypesService.insertBillTypes(billTypes));
	}

	/**
	 * 修改票据类型
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		BillTypes billTypes = billTypesService.selectBillTypesById(id);
		mmap.put("billTypes", billTypes);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存票据类型
	 */
	@RequiresPermissions("module:billTypes:edit")
	@Log(title = "票据类型", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(BillTypes billTypes)
	{		
		return toAjax(billTypesService.updateBillTypes(billTypes));
	}
	
	/**
	 * 查看票据类型
	 */
	@GetMapping("/view/{id}")
	public String view(@PathVariable("id") Integer id, ModelMap mmap)
	{
		BillTypes billTypes = billTypesService.selectBillTypesById(id);
		mmap.put("billTypes", billTypes);
	    return prefix + "/view";
	}
	
	/**
	 * 删除票据类型
	 */
	@RequiresPermissions("module:billTypes:remove")
	@Log(title = "票据类型", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(billTypesService.deleteBillTypesByIds(ids));
	}
	
}
