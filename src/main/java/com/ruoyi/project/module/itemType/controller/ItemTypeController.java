package com.ruoyi.project.module.itemType.controller;

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
import com.ruoyi.project.module.itemType.domain.ItemType;
import com.ruoyi.project.module.itemType.service.IItemTypeService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;

/**
 * 财务科目子类别 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-09-19
 */
@Controller
@RequestMapping("/module/itemType")
public class ItemTypeController extends BaseController
{
    private String prefix = "module/itemType";
	
	@Autowired
	private IItemTypeService itemTypeService;
	
	@RequiresPermissions("module:itemType:view")
	@GetMapping()
	public String itemType()
	{
	    return prefix + "/itemType";
	}
	
	/**
	 * 查询财务科目子类别列表
	 */
	@RequiresPermissions("module:itemType:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(ItemType itemType)
	{
		startPage();
        List<ItemType> list = itemTypeService.selectItemTypeList(itemType);
		return getDataTable(list);
	}
	
	/**
	 * 新增财务科目子类别
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存财务科目子类别
	 */
	@RequiresPermissions("module:itemType:add")
	@Log(title = "财务科目子类别", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(ItemType itemType)
	{		
		return toAjax(itemTypeService.insertItemType(itemType));
	}

	/**
	 * 修改财务科目子类别
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		ItemType itemType = itemTypeService.selectItemTypeById(id);
		mmap.put("itemType", itemType);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存财务科目子类别
	 */
	@RequiresPermissions("module:itemType:edit")
	@Log(title = "财务科目子类别", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(ItemType itemType)
	{		
		return toAjax(itemTypeService.updateItemType(itemType));
	}
	
	/**
	 * 查看财务科目子类别
	 */
	@GetMapping("/view/{id}")
	public String view(@PathVariable("id") Integer id, ModelMap mmap)
	{
		ItemType itemType = itemTypeService.selectItemTypeById(id);
		mmap.put("itemType", itemType);
	    return prefix + "/view";
	}
	
	/**
	 * 删除财务科目子类别
	 */
	@RequiresPermissions("module:itemType:remove")
	@Log(title = "财务科目子类别", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(itemTypeService.deleteItemTypeByIds(ids));
	}
	
}
