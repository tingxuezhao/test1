package com.ruoyi.project.module.financeItems.service;

import com.ruoyi.project.module.financeItems.domain.FinanceItems;
import java.util.List;

/**
 * 财务科目 服务层
 * 
 * @author ruoyi
 * @date 2018-09-19
 */
public interface IFinanceItemsService 
{
	/**
     * 查询财务科目信息
     * 
     * @param id 财务科目ID
     * @return 财务科目信息
     */
	public FinanceItems selectFinanceItemsById(Integer id);
	
	/**
     * 查询财务科目列表
     * 
     * @param financeItems 财务科目信息
     * @return 财务科目集合
     */
	public List<FinanceItems> selectFinanceItemsList(FinanceItems financeItems);
	
	/**
     * 新增财务科目
     * 
     * @param financeItems 财务科目信息
     * @return 结果
     */
	public int insertFinanceItems(FinanceItems financeItems);
	
	/**
     * 修改财务科目
     * 
     * @param financeItems 财务科目信息
     * @return 结果
     */
	public int updateFinanceItems(FinanceItems financeItems);
		
	/**
     * 删除财务科目信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteFinanceItemsByIds(String ids);
	
}
