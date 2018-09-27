package com.ruoyi.project.module.borrows.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
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
import com.ruoyi.project.module.borrows.domain.BorrowConstants;
import com.ruoyi.project.module.borrows.domain.Borrows;
import com.ruoyi.project.module.borrows.service.IBorrowsService;
import com.ruoyi.project.system.user.domain.User;
import com.ruoyi.project.system.user.service.IUserService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;

/**
 * 借款 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-09-26
 */
@Controller
@RequestMapping("/module/borrows")
public class BorrowsController extends BaseController
{
    private String prefix = "module/borrows";
	
	@Autowired
	private IBorrowsService borrowsService;
	@Autowired
	private IUserService userService;
	
	@RequiresPermissions("module:borrows:view")
	@GetMapping()
	public String borrows()
	{
	    return prefix + "/borrows";
	}
	
	/**
	 * 查询借款列表
	 */
	@RequiresPermissions("module:borrows:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Borrows borrows)
	{
		startPage();
        List<Borrows> list = borrowsService.selectBorrowsList(borrows);
        for(Borrows borrow:list){
        	User user = userService.selectUserById(borrow.getBorrowerId().longValue());
        	if(user != null){
        		borrow.setBorrowerName(user.getUserName());
        	}else{
        		borrow.setBorrowerName("");
        	}
        }
		return getDataTable(list);
	}
	
	/**
	 * 新增借款
	 */
	@GetMapping("/add")
	public String add(ModelMap mmap)
	{
		User user = getUser();
		mmap.put("borrowerName", user.getUserName());
		
		//到款单号自动生成
		/*Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String strDate = "JK-" + sdf.format(date);
		List<Borrows> list = borrowsService.findByBorrowsNum(strDate + "%");
		int lastNum = 0;
		for(Borrows borrow:list){
			String num = borrow.getBorrowNum().replace(strDate, "");
			int temp = Integer.valueOf(num);
			if(temp > lastNum){
				lastNum = temp;
			}
		}
		lastNum++;
		strDate += String.format("%04d", lastNum);*/
		
		//到款单号自动生成(旧oa方法)
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHss");
		String strDate = "JK-" + sdf.format(date);
		mmap.put("borrowNum", strDate);
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存借款
	 */
	@RequiresPermissions("module:borrows:add")
	@Log(title = "借款", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Borrows borrows)
	{
		//borrows.setApprovalStatus(FlowContants.APPROVAL_STATUS_DEFAULT);
		borrows.setAudStatus(BorrowConstants.STATUS_PENDING);
		borrows.setResidualAmount(borrows.getAmount());
		borrows.setPayStatus("0");
		borrows.setRepayStatus("0");
		User user = getUser();
		borrows.setBorrowerId(user.getUserId().intValue());
		return toAjax(borrowsService.insertBorrows(borrows));
	}

	/**
	 * 修改借款
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		Borrows borrows = borrowsService.selectBorrowsById(id);
		User user = userService.selectUserById(borrows.getBorrowerId().longValue());
		if(user != null){
			borrows.setBorrowerName(user.getUserName());
		}
		mmap.put("borrows", borrows);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存借款
	 */
	@RequiresPermissions("module:borrows:edit")
	@Log(title = "借款", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Borrows borrows)
	{
		//borrows.setApprovalStatus(FlowContants.APPROVAL_STATUS_DEFAULT);
		borrows.setAudStatus(BorrowConstants.STATUS_PENDING);
		borrows.setResidualAmount(borrows.getAmount());
		borrows.setPayStatus("0");
		borrows.setRepayStatus("0");
		User user = getUser();
		borrows.setBorrowerId(user.getUserId().intValue());
		return toAjax(borrowsService.updateBorrows(borrows));
	}
	
	/**
	 * 删除借款
	 */
	@RequiresPermissions("module:borrows:remove")
	@Log(title = "借款", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(borrowsService.deleteBorrowsByIds(ids));
	}
	
}
