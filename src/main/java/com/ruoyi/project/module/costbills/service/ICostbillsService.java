package com.ruoyi.project.module.costbills.service;

import com.ruoyi.project.module.costbills.domain.Costbills;
import java.util.List;

/**
 * 成本发票 服务层
 * 
 * @author ruoyi
 * @date 2018-09-25
 */
public interface ICostbillsService 
{
	/**
     * 查询成本发票信息
     * 
     * @param id 成本发票ID
     * @return 成本发票信息
     */
	public Costbills selectCostbillsById(Integer id);
	
	/**
     * 查询成本发票列表
     * 
     * @param costbills 成本发票信息
     * @return 成本发票集合
     */
	public List<Costbills> selectCostbillsList(Costbills costbills);
	
	/**
     * 新增成本发票
     * 
     * @param costbills 成本发票信息
     * @return 结果
     */
	public int insertCostbills(Costbills costbills);
	
	/**
     * 修改成本发票
     * 
     * @param costbills 成本发票信息
     * @return 结果
     */
	public int updateCostbills(Costbills costbills);
		
	/**
     * 删除成本发票信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteCostbillsByIds(String ids);
	
}
