package com.ruoyi.project.module.itemType.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.module.itemType.mapper.ItemTypeMapper;
import com.ruoyi.project.module.itemType.domain.ItemType;
import com.ruoyi.project.module.itemType.service.IItemTypeService;
import com.ruoyi.common.support.Convert;

/**
 * 财务科目子类别 服务层实现
 * 
 * @author ruoyi
 * @date 2018-09-19
 */
@Service
public class ItemTypeServiceImpl implements IItemTypeService 
{
	@Autowired
	private ItemTypeMapper itemTypeMapper;

	/**
     * 查询财务科目子类别信息
     * 
     * @param id 财务科目子类别ID
     * @return 财务科目子类别信息
     */
    @Override
	public ItemType selectItemTypeById(Integer id)
	{
	    return itemTypeMapper.selectItemTypeById(id);
	}
	
	/**
     * 查询财务科目子类别列表
     * 
     * @param itemType 财务科目子类别信息
     * @return 财务科目子类别集合
     */
	@Override
	public List<ItemType> selectItemTypeList(ItemType itemType)
	{
	    return itemTypeMapper.selectItemTypeList(itemType);
	}
	
    /**
     * 新增财务科目子类别
     * 
     * @param itemType 财务科目子类别信息
     * @return 结果
     */
	@Override
	public int insertItemType(ItemType itemType)
	{
	    return itemTypeMapper.insertItemType(itemType);
	}
	
	/**
     * 修改财务科目子类别
     * 
     * @param itemType 财务科目子类别信息
     * @return 结果
     */
	@Override
	public int updateItemType(ItemType itemType)
	{
	    return itemTypeMapper.updateItemType(itemType);
	}

	/**
     * 删除财务科目子类别对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteItemTypeByIds(String ids)
	{
		return itemTypeMapper.deleteItemTypeByIds(Convert.toStrArray(ids));
	}
	
}
