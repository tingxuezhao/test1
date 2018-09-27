package com.ruoyi.project.module.financeItems.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 财务科目表 finance_items
 * 
 * @author ruoyi
 * @date 2018-09-19
 */
public class FinanceItems extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 财务科目ID */
	private Integer id;
	/** 描述 */
	private String descn;
	/** 是否是预算 */
	private String isBudget;
	/** 名称 */
	private String name;
	/** 状态 */
	private String status;
	/** 分公司ID */
	private Integer subcompanyId;
	/** 小类别ID */
	private Integer itemTypeId;
	/** 类型 */
	private String type;

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setDescn(String descn) 
	{
		this.descn = descn;
	}

	public String getDescn() 
	{
		return descn;
	}
	public void setIsBudget(String isBudget) 
	{
		this.isBudget = isBudget;
	}

	public String getIsBudget() 
	{
		return isBudget;
	}
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}
	public void setSubcompanyId(Integer subcompanyId) 
	{
		this.subcompanyId = subcompanyId;
	}

	public Integer getSubcompanyId() 
	{
		return subcompanyId;
	}
	public void setItemTypeId(Integer itemTypeId) 
	{
		this.itemTypeId = itemTypeId;
	}

	public Integer getItemTypeId() 
	{
		return itemTypeId;
	}
	public void setType(String type) 
	{
		this.type = type;
	}

	public String getType() 
	{
		return type;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("descn", getDescn())
            .append("isBudget", getIsBudget())
            .append("name", getName())
            .append("status", getStatus())
            .append("subcompanyId", getSubcompanyId())
            .append("itemTypeId", getItemTypeId())
            .append("type", getType())
            .toString();
    }
}
