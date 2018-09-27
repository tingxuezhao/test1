package com.ruoyi.project.module.bills.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.module.bills.mapper.BillsMapper;
import com.ruoyi.project.module.bills.domain.Bills;
import com.ruoyi.project.module.bills.service.IBillsService;
import com.ruoyi.common.support.Convert;

/**
 * 票据 服务层实现
 * 
 * @author ruoyi
 * @date 2018-09-20
 */
@Service
public class BillsServiceImpl implements IBillsService 
{
	@Autowired
	private BillsMapper billsMapper;

	/**
     * 查询票据信息
     * 
     * @param id 票据ID
     * @return 票据信息
     */
    @Override
	public Bills selectBillsById(Integer id)
	{
	    return billsMapper.selectBillsById(id);
	}
	
	/**
     * 查询票据列表
     * 
     * @param bills 票据信息
     * @return 票据集合
     */
	@Override
	public List<Bills> selectBillsList(Bills bills)
	{
	    return billsMapper.selectBillsList(bills);
	}
	
    /**
     * 新增票据
     * 
     * @param bills 票据信息
     * @return 结果
     */
	@Override
	public int insertBills(Bills bills)
	{
	    return billsMapper.insertBills(bills);
	}
	
	/**
     * 修改票据
     * 
     * @param bills 票据信息
     * @return 结果
     */
	@Override
	public int updateBills(Bills bills)
	{
	    return billsMapper.updateBills(bills);
	}

	/**
     * 删除票据对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteBillsByIds(String ids)
	{
		return billsMapper.deleteBillsByIds(Convert.toStrArray(ids));
	}

	/**
	 * 根据类型查询
	 */
	@Override
	public List<Bills> selectBillsByType(String type) {
		return billsMapper.selectBillsByType(type);
	}
	
}
