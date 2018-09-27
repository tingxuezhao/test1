package com.ruoyi.project.module.financeItems.controller;

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
import com.ruoyi.project.module.financeItems.domain.FinanceItems;
import com.ruoyi.project.module.financeItems.service.IFinanceItemsService;
import com.ruoyi.project.module.itemType.domain.ItemType;
import com.ruoyi.project.module.itemType.service.IItemTypeService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;

/**
 * 财务科目 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-09-19
 */
@Controller
@RequestMapping("/module/financeItems")
public class FinanceItemsController extends BaseController
{
    private String prefix = "module/financeItems";
	
	@Autowired
	private IFinanceItemsService financeItemsService;
	@Autowired
	private IItemTypeService itemTypeService;
	
	@RequiresPermissions("module:financeItems:view")
	@GetMapping()
	public String financeItems(ModelMap mmap)
	{
		ItemType itemType = new ItemType();
		List<ItemType> itemTypeList = itemTypeService.selectItemTypeList(itemType);
		mmap.addAttribute("itemTypeList", itemTypeList);
		
	    return prefix + "/financeItems";
	}
	
	/**
	 * 查询财务科目列表
	 */
	@RequiresPermissions("module:financeItems:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(FinanceItems financeItems, ModelMap mmap)
	{
		startPage();
        List<FinanceItems> list = financeItemsService.selectFinanceItemsList(financeItems);
		return getDataTable(list);
	}
	
	/**
	 * 新增财务科目
	 */
	@GetMapping("/add")
	public String add(ModelMap mmap)
	{
		ItemType itemType = new ItemType();
		List<ItemType> itemTypeList = itemTypeService.selectItemTypeList(itemType);
		mmap.addAttribute("itemTypeList", itemTypeList);
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存财务科目
	 */
	@RequiresPermissions("module:financeItems:add")
	@Log(title = "财务科目", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(FinanceItems financeItems)
	{		
		return toAjax(financeItemsService.insertFinanceItems(financeItems));
	}

	/**
	 * 修改财务科目
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		ItemType itemType = new ItemType();
		List<ItemType> itemTypeList = itemTypeService.selectItemTypeList(itemType);
		mmap.addAttribute("itemTypeList", itemTypeList);
		
		FinanceItems financeItems = financeItemsService.selectFinanceItemsById(id);
		mmap.put("financeItems", financeItems);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存财务科目
	 */
	@RequiresPermissions("module:financeItems:edit")
	@Log(title = "财务科目", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(FinanceItems financeItems)
	{		
		return toAjax(financeItemsService.updateFinanceItems(financeItems));
	}
	
	/**
	 * 查看财务科目
	 */
	@GetMapping("/view/{id}")
	public String view(@PathVariable("id") Integer id, ModelMap mmap)
	{
		ItemType itemType = new ItemType();
		List<ItemType> itemTypeList = itemTypeService.selectItemTypeList(itemType);
		mmap.addAttribute("itemTypeList", itemTypeList);
		
		FinanceItems financeItems = financeItemsService.selectFinanceItemsById(id);
		mmap.put("financeItems", financeItems);
	    return prefix + "/view";
	}
	
	/**
	 * 删除财务科目
	 */
	@RequiresPermissions("module:financeItems:remove")
	@Log(title = "财务科目", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(financeItemsService.deleteFinanceItemsByIds(ids));
	}
	
}
