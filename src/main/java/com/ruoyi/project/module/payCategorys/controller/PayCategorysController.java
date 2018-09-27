package com.ruoyi.project.module.payCategorys.controller;

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
import com.ruoyi.project.module.payCategorys.domain.PayCategorys;
import com.ruoyi.project.module.payCategorys.service.IPayCategorysService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;

/**
 * 付款方式 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-09-19
 */
@Controller
@RequestMapping("/module/payCategorys")
public class PayCategorysController extends BaseController
{
    private String prefix = "module/payCategorys";
	
	@Autowired
	private IPayCategorysService payCategorysService;
	
	@RequiresPermissions("module:payCategorys:view")
	@GetMapping()
	public String payCategorys()
	{
	    return prefix + "/payCategorys";
	}
	
	/**
	 * 查询付款方式列表
	 */
	@RequiresPermissions("module:payCategorys:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(PayCategorys payCategorys)
	{
		startPage();
        List<PayCategorys> list = payCategorysService.selectPayCategorysList(payCategorys);
		return getDataTable(list);
	}
	
	/**
	 * 新增付款方式
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存付款方式
	 */
	@RequiresPermissions("module:payCategorys:add")
	@Log(title = "付款方式", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(PayCategorys payCategorys)
	{		
		return toAjax(payCategorysService.insertPayCategorys(payCategorys));
	}

	/**
	 * 修改付款方式
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		PayCategorys payCategorys = payCategorysService.selectPayCategorysById(id);
		mmap.put("payCategorys", payCategorys);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存付款方式
	 */
	@RequiresPermissions("module:payCategorys:edit")
	@Log(title = "付款方式", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(PayCategorys payCategorys)
	{		
		return toAjax(payCategorysService.updatePayCategorys(payCategorys));
	}
	
	/**
	 * 查看付款方式
	 */
	@GetMapping("/view/{id}")
	public String view(@PathVariable("id") Integer id, ModelMap mmap)
	{
		PayCategorys payCategorys = payCategorysService.selectPayCategorysById(id);
		mmap.put("payCategorys", payCategorys);
	    return prefix + "/view";
	}
	
	/**
	 * 删除付款方式
	 */
	@RequiresPermissions("module:payCategorys:remove")
	@Log(title = "付款方式", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(payCategorysService.deletePayCategorysByIds(ids));
	}
	
}
