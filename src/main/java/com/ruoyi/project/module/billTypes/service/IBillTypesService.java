package com.ruoyi.project.module.billTypes.service;

import com.ruoyi.project.module.billTypes.domain.BillTypes;
import java.util.List;

/**
 * 票据类型 服务层
 * 
 * @author ruoyi
 * @date 2018-09-19
 */
public interface IBillTypesService 
{
	/**
     * 查询票据类型信息
     * 
     * @param id 票据类型ID
     * @return 票据类型信息
     */
	public BillTypes selectBillTypesById(Integer id);
	
	/**
     * 查询票据类型列表
     * 
     * @param billTypes 票据类型信息
     * @return 票据类型集合
     */
	public List<BillTypes> selectBillTypesList(BillTypes billTypes);
	
	/**
     * 新增票据类型
     * 
     * @param billTypes 票据类型信息
     * @return 结果
     */
	public int insertBillTypes(BillTypes billTypes);
	
	/**
     * 修改票据类型
     * 
     * @param billTypes 票据类型信息
     * @return 结果
     */
	public int updateBillTypes(BillTypes billTypes);
		
	/**
     * 删除票据类型信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteBillTypesByIds(String ids);
	
}
