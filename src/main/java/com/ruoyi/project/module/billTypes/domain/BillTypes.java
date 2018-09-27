package com.ruoyi.project.module.billTypes.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 票据类型表 bill_types
 * 
 * @author ruoyi
 * @date 2018-09-19
 */
public class BillTypes extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 票据类型ID */
	private Integer id;
	/** 票据名称 */
	private String name;
	/** 描述 */
	private String descn;

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	public void setDescn(String descn) 
	{
		this.descn = descn;
	}

	public String getDescn() 
	{
		return descn;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("descn", getDescn())
            .toString();
    }
}
