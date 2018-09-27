package com.ruoyi.project.module.borrows.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.module.borrows.mapper.BorrowsMapper;
import com.ruoyi.project.module.borrows.domain.Borrows;
import com.ruoyi.project.module.borrows.service.IBorrowsService;
import com.ruoyi.common.support.Convert;

/**
 * 借款 服务层实现
 * 
 * @author ruoyi
 * @date 2018-09-26
 */
@Service
public class BorrowsServiceImpl implements IBorrowsService 
{
	@Autowired
	private BorrowsMapper borrowsMapper;

	/**
     * 查询借款信息
     * 
     * @param id 借款ID
     * @return 借款信息
     */
    @Override
	public Borrows selectBorrowsById(Integer id)
	{
	    return borrowsMapper.selectBorrowsById(id);
	}
	
	/**
     * 查询借款列表
     * 
     * @param borrows 借款信息
     * @return 借款集合
     */
	@Override
	public List<Borrows> selectBorrowsList(Borrows borrows)
	{
	    return borrowsMapper.selectBorrowsList(borrows);
	}
	
    /**
     * 新增借款
     * 
     * @param borrows 借款信息
     * @return 结果
     */
	@Override
	public int insertBorrows(Borrows borrows)
	{
	    return borrowsMapper.insertBorrows(borrows);
	}
	
	/**
     * 修改借款
     * 
     * @param borrows 借款信息
     * @return 结果
     */
	@Override
	public int updateBorrows(Borrows borrows)
	{
	    return borrowsMapper.updateBorrows(borrows);
	}

	/**
     * 删除借款对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteBorrowsByIds(String ids)
	{
		return borrowsMapper.deleteBorrowsByIds(Convert.toStrArray(ids));
	}

	@Override
	public List<Borrows> findByBorrowsNum(String str) {
		return borrowsMapper.findByBorrowsNum(str);
	}
	
}
