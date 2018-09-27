package com.ruoyi.project.module.payCategorys.service;

import com.ruoyi.project.module.payCategorys.domain.PayCategorys;
import java.util.List;

/**
 * 付款方式 服务层
 * 
 * @author ruoyi
 * @date 2018-09-19
 */
public interface IPayCategorysService 
{
	/**
     * 查询付款方式信息
     * 
     * @param id 付款方式ID
     * @return 付款方式信息
     */
	public PayCategorys selectPayCategorysById(Integer id);
	
	/**
     * 查询付款方式列表
     * 
     * @param payCategorys 付款方式信息
     * @return 付款方式集合
     */
	public List<PayCategorys> selectPayCategorysList(PayCategorys payCategorys);
	
	/**
     * 新增付款方式
     * 
     * @param payCategorys 付款方式信息
     * @return 结果
     */
	public int insertPayCategorys(PayCategorys payCategorys);
	
	/**
     * 修改付款方式
     * 
     * @param payCategorys 付款方式信息
     * @return 结果
     */
	public int updatePayCategorys(PayCategorys payCategorys);
		
	/**
     * 删除付款方式信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deletePayCategorysByIds(String ids);
	
}
