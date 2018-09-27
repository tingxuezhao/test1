package com.ruoyi.project.module.costbills.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.module.costbills.mapper.CostbillsMapper;
import com.ruoyi.project.module.costbills.domain.Costbills;
import com.ruoyi.project.module.costbills.service.ICostbillsService;
import com.ruoyi.common.support.Convert;

/**
 * 成本发票 服务层实现
 * 
 * @author ruoyi
 * @date 2018-09-25
 */
@Service
public class CostbillsServiceImpl implements ICostbillsService 
{
	@Autowired
	private CostbillsMapper costbillsMapper;

	/**
     * 查询成本发票信息
     * 
     * @param id 成本发票ID
     * @return 成本发票信息
     */
    @Override
	public Costbills selectCostbillsById(Integer id)
	{
	    return costbillsMapper.selectCostbillsById(id);
	}
	
	/**
     * 查询成本发票列表
     * 
     * @param costbills 成本发票信息
     * @return 成本发票集合
     */
	@Override
	public List<Costbills> selectCostbillsList(Costbills costbills)
	{
	    return costbillsMapper.selectCostbillsList(costbills);
	}
	
    /**
     * 新增成本发票
     * 
     * @param costbills 成本发票信息
     * @return 结果
     */
	@Override
	public int insertCostbills(Costbills costbills)
	{
	    return costbillsMapper.insertCostbills(costbills);
	}
	
	/**
     * 修改成本发票
     * 
     * @param costbills 成本发票信息
     * @return 结果
     */
	@Override
	public int updateCostbills(Costbills costbills)
	{
	    return costbillsMapper.updateCostbills(costbills);
	}

	/**
     * 删除成本发票对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteCostbillsByIds(String ids)
	{
		return costbillsMapper.deleteCostbillsByIds(Convert.toStrArray(ids));
	}
	
}
