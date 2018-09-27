package com.ruoyi.project.module.bills.service;

import com.ruoyi.project.module.bills.domain.Bills;
import java.util.List;

/**
 * 票据 服务层
 * 
 * @author ruoyi
 * @date 2018-09-20
 */
public interface IBillsService 
{
	/**
     * 查询票据信息
     * 
     * @param id 票据ID
     * @return 票据信息
     */
	public Bills selectBillsById(Integer id);
	
	/**
     * 查询票据列表
     * 
     * @param bills 票据信息
     * @return 票据集合
     */
	public List<Bills> selectBillsList(Bills bills);
	
	/**
     * 新增票据
     * 
     * @param bills 票据信息
     * @return 结果
     */
	public int insertBills(Bills bills);
	
	/**
     * 修改票据
     * 
     * @param bills 票据信息
     * @return 结果
     */
	public int updateBills(Bills bills);
		
	/**
     * 删除票据信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteBillsByIds(String ids);

	public List<Bills> selectBillsByType(String string);
	
}
