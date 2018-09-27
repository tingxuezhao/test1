package com.ruoyi.project.module.billTypes.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.module.billTypes.mapper.BillTypesMapper;
import com.ruoyi.project.module.billTypes.domain.BillTypes;
import com.ruoyi.project.module.billTypes.service.IBillTypesService;
import com.ruoyi.common.support.Convert;

/**
 * 票据类型 服务层实现
 * 
 * @author ruoyi
 * @date 2018-09-19
 */
@Service
public class BillTypesServiceImpl implements IBillTypesService 
{
	@Autowired
	private BillTypesMapper billTypesMapper;

	/**
     * 查询票据类型信息
     * 
     * @param id 票据类型ID
     * @return 票据类型信息
     */
    @Override
	public BillTypes selectBillTypesById(Integer id)
	{
	    return billTypesMapper.selectBillTypesById(id);
	}
	
	/**
     * 查询票据类型列表
     * 
     * @param billTypes 票据类型信息
     * @return 票据类型集合
     */
	@Override
	public List<BillTypes> selectBillTypesList(BillTypes billTypes)
	{
	    return billTypesMapper.selectBillTypesList(billTypes);
	}
	
    /**
     * 新增票据类型
     * 
     * @param billTypes 票据类型信息
     * @return 结果
     */
	@Override
	public int insertBillTypes(BillTypes billTypes)
	{
	    return billTypesMapper.insertBillTypes(billTypes);
	}
	
	/**
     * 修改票据类型
     * 
     * @param billTypes 票据类型信息
     * @return 结果
     */
	@Override
	public int updateBillTypes(BillTypes billTypes)
	{
	    return billTypesMapper.updateBillTypes(billTypes);
	}

	/**
     * 删除票据类型对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteBillTypesByIds(String ids)
	{
		return billTypesMapper.deleteBillTypesByIds(Convert.toStrArray(ids));
	}
	
}
