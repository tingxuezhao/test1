package com.ruoyi.project.module.borrows.service;

import com.ruoyi.project.module.borrows.domain.Borrows;
import java.util.List;

/**
 * 借款 服务层
 * 
 * @author ruoyi
 * @date 2018-09-26
 */
public interface IBorrowsService 
{
	/**
     * 查询借款信息
     * 
     * @param id 借款ID
     * @return 借款信息
     */
	public Borrows selectBorrowsById(Integer id);
	
	/**
     * 查询借款列表
     * 
     * @param borrows 借款信息
     * @return 借款集合
     */
	public List<Borrows> selectBorrowsList(Borrows borrows);
	
	/**
     * 新增借款
     * 
     * @param borrows 借款信息
     * @return 结果
     */
	public int insertBorrows(Borrows borrows);
	
	/**
     * 修改借款
     * 
     * @param borrows 借款信息
     * @return 结果
     */
	public int updateBorrows(Borrows borrows);
		
	/**
     * 删除借款信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteBorrowsByIds(String ids);

	public List<Borrows> findByBorrowsNum(String str);
	
}
