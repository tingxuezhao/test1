package com.ruoyi.project.module.financeItems.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.module.financeItems.mapper.FinanceItemsMapper;
import com.ruoyi.project.module.financeItems.domain.FinanceItems;
import com.ruoyi.project.module.financeItems.service.IFinanceItemsService;
import com.ruoyi.common.support.Convert;

/**
 * 财务科目 服务层实现
 * 
 * @author ruoyi
 * @date 2018-09-19
 */
@Service
public class FinanceItemsServiceImpl implements IFinanceItemsService 
{
	@Autowired
	private FinanceItemsMapper financeItemsMapper;

	/**
     * 查询财务科目信息
     * 
     * @param id 财务科目ID
     * @return 财务科目信息
     */
    @Override
	public FinanceItems selectFinanceItemsById(Integer id)
	{
	    return financeItemsMapper.selectFinanceItemsById(id);
	}
	
	/**
     * 查询财务科目列表
     * 
     * @param financeItems 财务科目信息
     * @return 财务科目集合
     */
	@Override
	public List<FinanceItems> selectFinanceItemsList(FinanceItems financeItems)
	{
	    return financeItemsMapper.selectFinanceItemsList(financeItems);
	}
	
    /**
     * 新增财务科目
     * 
     * @param financeItems 财务科目信息
     * @return 结果
     */
	@Override
	public int insertFinanceItems(FinanceItems financeItems)
	{
	    return financeItemsMapper.insertFinanceItems(financeItems);
	}
	
	/**
     * 修改财务科目
     * 
     * @param financeItems 财务科目信息
     * @return 结果
     */
	@Override
	public int updateFinanceItems(FinanceItems financeItems)
	{
	    return financeItemsMapper.updateFinanceItems(financeItems);
	}

	/**
     * 删除财务科目对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteFinanceItemsByIds(String ids)
	{
		return financeItemsMapper.deleteFinanceItemsByIds(Convert.toStrArray(ids));
	}
	
}
