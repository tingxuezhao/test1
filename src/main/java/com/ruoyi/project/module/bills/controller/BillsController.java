package com.ruoyi.project.module.bills.controller;

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
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.module.billTypes.domain.BillTypes;
import com.ruoyi.project.module.billTypes.service.IBillTypesService;
import com.ruoyi.project.module.bills.domain.Bills;
import com.ruoyi.project.module.bills.service.IBillsService;
import com.ruoyi.project.system.user.domain.User;
import com.ruoyi.project.system.user.service.IUserService;

/**
 * 票据 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-09-20
 */
@Controller
@RequestMapping("/module/bills")
public class BillsController extends BaseController
{
    private String prefix = "module/bills";
	
	@Autowired
	private IBillsService billsService;
	@Autowired
	private IBillTypesService billTypesService;
	@Autowired
	private IUserService userService;
	
	@RequiresPermissions("module:bills:view")
	@GetMapping()
	public String bills()
	{
	    return prefix + "/bills";
	}
	
	/**
	 * 查询票据列表
	 */
	@RequiresPermissions("module:bills:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Bills bills)
	{
		startPage();
        List<Bills> list = billsService.selectBillsList(bills);
		return getDataTable(list);
	}
	
	@RequiresPermissions("module:bills:view")
	@GetMapping("/billsCom")
	public String billsCom(ModelMap mmap)
	{
		BillTypes billTypes = new BillTypes();
		List<BillTypes> billTypesList = billTypesService.selectBillTypesList(billTypes);
		mmap.put("billTypesList", billTypesList);
	    return prefix + "/billsCom";
	}
	
	/**
	 * 查询公司票据列表
	 */
	@RequiresPermissions("module:bills:list")
	@PostMapping("/listCom")
	@ResponseBody
	public TableDataInfo listCom(Bills bills)
	{
		startPage();
		bills.setType("com");
		List<Bills> list = billsService.selectBillsList(bills);
        //List<Bills> list = billsService.selectBillsByType("com");
        for(Bills bill:list){
        	if(!"null".equals(String.valueOf(bill.getDrawerId())) && !"0".equals(String.valueOf(bill.getDrawerId()))) {  
        		User user = userService.selectUserById(bill.getDrawerId().longValue());
        		if(user != null){
        			bill.setDrawerName(user.getUserName());
        		}
        	}
        }
		return getDataTable(list);
	}
	
	@RequiresPermissions("module:bills:view")
	@GetMapping("/billsSub")
	public String billsSub(ModelMap mmap)
	{
		BillTypes billTypes = new BillTypes();
		List<BillTypes> billTypesList = billTypesService.selectBillTypesList(billTypes);
		mmap.put("billTypesList", billTypesList);
	    return prefix + "/billsSub";
	}
	
	/**
	 * 查询项目部票据列表
	 */
	@RequiresPermissions("module:bills:list")
	@PostMapping("/listSub")
	@ResponseBody
	public TableDataInfo listSub(Bills bills)
	{
		startPage();
		bills.setType("sub");
		List<Bills> list = billsService.selectBillsList(bills);
        //List<Bills> list = billsService.selectBillsByType("sub");
        for(Bills bill:list){
        	if(!"null".equals(String.valueOf(bill.getDrawerId())) && !"0".equals(String.valueOf(bill.getDrawerId()))) {  
        		User user = userService.selectUserById(bill.getDrawerId().longValue());
        		if(user != null){
        			bill.setDrawerName(user.getUserName());
        		}
        	}
        }
		return getDataTable(list);
	}
	
	@RequiresPermissions("module:bills:view")
	@GetMapping("/billsExt")
	public String billsExt(ModelMap mmap)
	{
		BillTypes billTypes = new BillTypes();
		List<BillTypes> billTypesList = billTypesService.selectBillTypesList(billTypes);
		mmap.put("billTypesList", billTypesList);
	    return prefix + "/billsExt";
	}
	
	/**
	 * 查询外部票据列表
	 */
	@RequiresPermissions("module:bills:list")
	@PostMapping("/listExt")
	@ResponseBody
	public TableDataInfo listExt(Bills bills)
	{
		startPage();
		bills.setType("ext");
		List<Bills> list = billsService.selectBillsList(bills);
        //List<Bills> list = billsService.selectBillsByType("ext");
        for(Bills bill:list){
        	if(!"null".equals(String.valueOf(bill.getDrawerId())) && !"0".equals(String.valueOf(bill.getDrawerId()))) {  
        		User user = userService.selectUserById(bill.getDrawerId().longValue());
        		if(user != null){
        			bill.setDrawerName(user.getUserName());
        		}
        	}
        }
		return getDataTable(list);
	}
	
	@RequiresPermissions("module:bills:view")
	@GetMapping("/billsUnc")
	public String billsUnc(ModelMap mmap)
	{
		BillTypes billTypes = new BillTypes();
		List<BillTypes> billTypesList = billTypesService.selectBillTypesList(billTypes);
		mmap.put("billTypesList", billTypesList);
	    return prefix + "/billsUnc";
	}
	
	/**
	 * 查询未归档票据列表
	 */
	@RequiresPermissions("module:bills:list")
	@PostMapping("/listUnc")
	@ResponseBody
	public TableDataInfo listUnc(Bills bills)
	{
		startPage();
		bills.setType("");
		List<Bills> list = billsService.selectBillsList(bills);
        //List<Bills> list = billsService.selectBillsByType("");
        for(Bills bill:list){
        	if(!"null".equals(String.valueOf(bill.getDrawerId())) && !"0".equals(String.valueOf(bill.getDrawerId()))) {  
        		User user = userService.selectUserById(bill.getDrawerId().longValue());
        		if(user != null){
        			bill.setDrawerName(user.getUserName());
        		}
        	}
        }
		return getDataTable(list);
	}
	
	/**
	 * 新增票据
	 */
	@GetMapping("/add")
	public String add(ModelMap mmap)
	{
		//票据类型
		BillTypes billTypes = new BillTypes();
		List<BillTypes> billTypesList = billTypesService.selectBillTypesList(billTypes);
		mmap.put("billTypesList", billTypesList);
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存票据
	 */
	@RequiresPermissions("module:bills:add")
	@Log(title = "票据", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Bills bills)
	{
		if("unc".equals(bills.getType())){
			bills.setType("");
		}
		return toAjax(billsService.insertBills(bills));
	}

	/**
	 * 修改票据
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		Bills bills = billsService.selectBillsById(id);
		if("".equals(bills.getType())){
			bills.setType("unc");
		}
		if(!"".equals(bills.getDrawerId())){
			User user = userService.selectUserById(bills.getDrawerId().longValue());
			if(user != null){
				bills.setDrawerName(user.getUserName());
			}else{
				bills.setDrawerName("");
			}
		}else{
			bills.setDrawerName("");
		}
		mmap.put("bills", bills);
		//票据类型
		BillTypes billTypes = new BillTypes();
		List<BillTypes> billTypesList = billTypesService.selectBillTypesList(billTypes);
		mmap.put("billTypesList", billTypesList);
	    return prefix + "/edit";
	}
	
	/**
	 * 查看票据
	 */
	@GetMapping("/view/{id}")
	public String view(@PathVariable("id") Integer id, ModelMap mmap)
	{
		Bills bills = billsService.selectBillsById(id);
		if(!"null".equals(String.valueOf(bills.getTypeId())) && !"0".equals(String.valueOf(bills.getTypeId()))) {  
			BillTypes billTypes = billTypesService.selectBillTypesById(bills.getTypeId());
			if(billTypes != null){
				bills.setTypeName(billTypes.getName());
			}
		}
		if(!"null".equals(String.valueOf(bills.getDrawerId())) && !"0".equals(String.valueOf(bills.getDrawerId()))) {  
			User user = userService.selectUserById(bills.getDrawerId().longValue());
    		if(user != null){
    			bills.setDrawerName(user.getUserName());
    		}
		}
		if("".equals(bills.getType())){
			bills.setType("unc");
		}
		mmap.put("bills", bills);
	    return prefix + "/view";
	}
	
	/**
	 * 修改保存票据
	 */
	@RequiresPermissions("module:bills:edit")
	@Log(title = "票据", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Bills bills)
	{
		if("unc".equals(bills.getType())){
			bills.setType("");
		}
		return toAjax(billsService.updateBills(bills));
	}
	
	/**
	 * 删除票据
	 */
	@RequiresPermissions("module:bills:remove")
	@Log(title = "票据", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{
		return toAjax(billsService.deleteBillsByIds(ids));
	}
	
}
