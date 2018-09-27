package com.ruoyi.project.module.itemType.mapper;

import com.ruoyi.project.module.itemType.domain.ItemType;
import java.util.List;	

/**
 * 财务科目子类别 数据层
 * 
 * @author ruoyi
 * @date 2018-09-19
 */
public interface ItemTypeMapper 
{
	/**
     * 查询财务科目子类别信息
     * 
     * @param id 财务科目子类别ID
     * @return 财务科目子类别信息
     */
	public ItemType selectItemTypeById(Integer id);
	
	/**
     * 查询财务科目子类别列表
     * 
     * @param itemType 财务科目子类别信息
     * @return 财务科目子类别集合
     */
	public List<ItemType> selectItemTypeList(ItemType itemType);
	
	/**
     * 新增财务科目子类别
     * 
     * @param itemType 财务科目子类别信息
     * @return 结果
     */
	public int insertItemType(ItemType itemType);
	
	/**
     * 修改财务科目子类别
     * 
     * @param itemType 财务科目子类别信息
     * @return 结果
     */
	public int updateItemType(ItemType itemType);
	
	/**
     * 删除财务科目子类别
     * 
     * @param id 财务科目子类别ID
     * @return 结果
     */
	public int deleteItemTypeById(Integer id);
	
	/**
     * 批量删除财务科目子类别
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteItemTypeByIds(String[] ids);
	
}