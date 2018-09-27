package com.ruoyi.project.module.borrows.mapper;

import com.ruoyi.project.module.borrows.domain.Borrows;
import java.util.List;

import org.apache.ibatis.annotations.Param;	

/**
 * 借款 数据层
 * 
 * @author ruoyi
 * @date 2018-09-26
 */
public interface BorrowsMapper 
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
     * 删除借款
     * 
     * @param id 借款ID
     * @return 结果
     */
	public int deleteBorrowsById(Integer id);
	
	/**
     * 批量删除借款
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteBorrowsByIds(String[] ids);

	/**
	 * 查询借款单号
	 * @param str
	 * @return
	 */
	public List<Borrows> findByBorrowsNum(@Param("str") String str);
	
}