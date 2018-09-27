package com.ruoyi.project.module.costbills.controller;

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
import com.ruoyi.project.module.costbills.domain.Costbills;
import com.ruoyi.project.module.costbills.service.ICostbillsService;
import com.ruoyi.project.system.dict.service.IDictDataService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.framework.web.domain.AjaxResult;

/**
 * 成本发票 信息操作处理
 * 
 * @author ruoyi
 * @date 2018-09-25
 */
@Controller
@RequestMapping("/module/costbills")
public class CostbillsController extends BaseController
{
    private String prefix = "module/costbills";
	
	@Autowired
	private ICostbillsService costbillsService;
	@Autowired
	private IDictDataService dictDataService;
	
	@RequiresPermissions("module:costbills:view")
	@GetMapping()
	public String costbills()
	{
	    return prefix + "/costbills";
	}
	
	/**
	 * 查询成本发票列表
	 */
	@RequiresPermissions("module:costbills:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Costbills costbills)
	{
		startPage();
        List<Costbills> list = costbillsService.selectCostbillsList(costbills);
		return getDataTable(list);
	}
	
	/**
	 * 分公司
	 * @return
	 */
	@RequiresPermissions("module:costbills:view")
	@GetMapping("/costbillsSub")
	public String costbillsSub()
	{
	    return prefix + "/costbillsSub";
	}
	
	/**
	 * 查询分公司成本发票列表
	 */
	@RequiresPermissions("module:costbills:list")
	@PostMapping("/costbillsSubList")
	@ResponseBody
	public TableDataInfo costbillsSubList(Costbills costbills)
	{
		startPage();
		costbills.setType("sub");
        List<Costbills> list = costbillsService.selectCostbillsList(costbills);
		return getDataTable(list);
	}
	
	/**
	 * 外部人员
	 * @return
	 */
	@RequiresPermissions("module:costbills:view")
	@GetMapping("/costbillsExt")
	public String costbillsExt()
	{
	    return prefix + "/costbillsExt";
	}
	
	/**
	 * 查询外部人员成本发票列表
	 */
	@RequiresPermissions("module:costbills:list")
	@PostMapping("/costbillsExtList")
	@ResponseBody
	public TableDataInfo costbillsExtList(Costbills costbills)
	{
		startPage();
		costbills.setType("ext");
        List<Costbills> list = costbillsService.selectCostbillsList(costbills);
		return getDataTable(list);
	}
	
	/**
	 * 施工人员
	 * @return
	 */
	@RequiresPermissions("module:costbills:view")
	@GetMapping("/costbillsSup")
	public String costbillsSup()
	{
	    return prefix + "/costbillsSup";
	}
	
	/**
	 * 查询施工人员成本发票列表
	 */
	@RequiresPermissions("module:costbills:list")
	@PostMapping("/costbillsSupList")
	@ResponseBody
	public TableDataInfo costbillsSupList(Costbills costbills)
	{
		startPage();
		costbills.setType("sup");
        List<Costbills> list = costbillsService.selectCostbillsList(costbills);
		return getDataTable(list);
	}
	
	/**
	 * 新增成本发票
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存成本发票
	 */
	@RequiresPermissions("module:costbills:add")
	@Log(title = "成本发票", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Costbills costbills)
	{		
		return toAjax(costbillsService.insertCostbills(costbills));
	}
	/**
	 * 新增分公司成本发票
	 */
	@GetMapping("/addSub")
	public String addSub()
	{
		return prefix + "/addSub";
	}
	
	/**
	 * 新增分公司保存成本发票
	 */
	@RequiresPermissions("module:costbills:add")
	@Log(title = "成本发票", businessType = BusinessType.INSERT)
	@PostMapping("/addSub")
	@ResponseBody
	public AjaxResult addSubSave(Costbills costbills)
	{		
		costbills.setType("sub");
		return toAjax(costbillsService.insertCostbills(costbills));
	}
	/**
	 * 新增外部人员成本发票
	 */
	@GetMapping("/addExt")
	public String addExt()
	{
		return prefix + "/addExt";
	}
	
	/**
	 * 新增外部人员保存成本发票
	 */
	@RequiresPermissions("module:costbills:add")
	@Log(title = "成本发票", businessType = BusinessType.INSERT)
	@PostMapping("/addExt")
	@ResponseBody
	public AjaxResult addExtSave(Costbills costbills)
	{		
		costbills.setType("ext");
		return toAjax(costbillsService.insertCostbills(costbills));
	}
	/**
	 * 新增施工人员成本发票
	 */
	@GetMapping("/addSup")
	public String addSup()
	{
		return prefix + "/addSup";
	}
	
	/**
	 * 新增施工人员保存成本发票
	 */
	@RequiresPermissions("module:costbills:add")
	@Log(title = "成本发票", businessType = BusinessType.INSERT)
	@PostMapping("/addSup")
	@ResponseBody
	public AjaxResult addSupSave(Costbills costbills)
	{		
		costbills.setType("sup");
		return toAjax(costbillsService.insertCostbills(costbills));
	}

	/**
	 * 修改成本发票
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		Costbills costbills = costbillsService.selectCostbillsById(id);
		mmap.put("costbills", costbills);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存成本发票
	 */
	@RequiresPermissions("module:costbills:edit")
	@Log(title = "成本发票", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Costbills costbills)
	{		
		return toAjax(costbillsService.updateCostbills(costbills));
	}
	
	/**
	 * 查看成本发票
	 */
	@GetMapping("/view/{id}")
	public String view(@PathVariable("id") Integer id, ModelMap mmap)
	{
		Costbills costbills = costbillsService.selectCostbillsById(id);
		if(costbills != null){
			//获取字典中发票类型名称
			String typeName = dictDataService.selectDictLabel("invoiceType",costbills.getTypeId().toString());
			costbills.setTypeName(typeName);
			//获取字典中税率名称
			String rateName = dictDataService.selectDictLabel("costbill_rate",costbills.getRate().toString());
			costbills.setRateName(rateName);
			switch (costbills.getType()) {
			case "sub":
				costbills.setCostTypeName("分公司");
				costbills.setProBill("");//${model.subCompany.name}
				break;
			case "ext":
				costbills.setCostTypeName("外部人员");
				costbills.setProBill("");//${model.extBusiness.name}
				break;
			case "sup":
				costbills.setCostTypeName("施工人员");
				costbills.setProBill("");//${model.supplier.name}
				break;
			default:
				costbills.setCostTypeName("");
				costbills.setProBill("");
				break;
			}
		}
		
		mmap.put("costbills", costbills);
	    return prefix + "/view";
	}
	
	/**
	 * 删除成本发票
	 */
	@RequiresPermissions("module:costbills:remove")
	@Log(title = "成本发票", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(costbillsService.deleteCostbillsByIds(ids));
	}
	
}
