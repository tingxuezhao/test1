package com.ruoyi.project.module.bills.mapper;

import com.ruoyi.project.module.bills.domain.Bills;
import java.util.List;

import org.apache.ibatis.annotations.Param;	

/**
 * 票据 数据层
 * 
 * @author ruoyi
 * @date 2018-09-20
 */
public interface BillsMapper 
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
     * 删除票据
     * 
     * @param id 票据ID
     * @return 结果
     */
	public int deleteBillsById(Integer id);
	
	/**
     * 批量删除票据
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteBillsByIds(String[] ids);

	/**
	 * 根据类型查询数据
	 * @param type
	 * @return
	 */
	public List<Bills> selectBillsByType(@Param("type") String type);
	
}