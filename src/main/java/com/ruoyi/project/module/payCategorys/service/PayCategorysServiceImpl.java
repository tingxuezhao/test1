package com.ruoyi.project.module.payCategorys.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.module.payCategorys.mapper.PayCategorysMapper;
import com.ruoyi.project.module.payCategorys.domain.PayCategorys;
import com.ruoyi.project.module.payCategorys.service.IPayCategorysService;
import com.ruoyi.common.support.Convert;

/**
 * 付款方式 服务层实现
 * 
 * @author ruoyi
 * @date 2018-09-19
 */
@Service
public class PayCategorysServiceImpl implements IPayCategorysService 
{
	@Autowired
	private PayCategorysMapper payCategorysMapper;

	/**
     * 查询付款方式信息
     * 
     * @param id 付款方式ID
     * @return 付款方式信息
     */
    @Override
	public PayCategorys selectPayCategorysById(Integer id)
	{
	    return payCategorysMapper.selectPayCategorysById(id);
	}
	
	/**
     * 查询付款方式列表
     * 
     * @param payCategorys 付款方式信息
     * @return 付款方式集合
     */
	@Override
	public List<PayCategorys> selectPayCategorysList(PayCategorys payCategorys)
	{
	    return payCategorysMapper.selectPayCategorysList(payCategorys);
	}
	
    /**
     * 新增付款方式
     * 
     * @param payCategorys 付款方式信息
     * @return 结果
     */
	@Override
	public int insertPayCategorys(PayCategorys payCategorys)
	{
	    return payCategorysMapper.insertPayCategorys(payCategorys);
	}
	
	/**
     * 修改付款方式
     * 
     * @param payCategorys 付款方式信息
     * @return 结果
     */
	@Override
	public int updatePayCategorys(PayCategorys payCategorys)
	{
	    return payCategorysMapper.updatePayCategorys(payCategorys);
	}

	/**
     * 删除付款方式对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deletePayCategorysByIds(String ids)
	{
		return payCategorysMapper.deletePayCategorysByIds(Convert.toStrArray(ids));
	}
	
}
