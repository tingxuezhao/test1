package com.ruoyi.project.module.itemType.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 财务科目子类别表 item_type
 * 
 * @author ruoyi
 * @date 2018-09-19
 */
public class ItemType extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 财务科目子类别ID */
	private Integer id;
	/** 财务科目子类别名称 */
	private String name;
	/**  */
	private Integer typeOrder;
	/** 财务科目子类别子公司ID */
	private Integer subcompanyId;
	/** 财务科目子类别状态 */
	private String status;
	/** 财务科目子类别标识 */
	private String workloadMark;

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
	public void setTypeOrder(Integer typeOrder) 
	{
		this.typeOrder = typeOrder;
	}

	public Integer getTypeOrder() 
	{
		return typeOrder;
	}
	public void setSubcompanyId(Integer subcompanyId) 
	{
		this.subcompanyId = subcompanyId;
	}

	public Integer getSubcompanyId() 
	{
		return subcompanyId;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}
	public void setWorkloadMark(String workloadMark) 
	{
		this.workloadMark = workloadMark;
	}

	public String getWorkloadMark() 
	{
		return workloadMark;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("typeOrder", getTypeOrder())
            .append("subcompanyId", getSubcompanyId())
            .append("status", getStatus())
            .append("workloadMark", getWorkloadMark())
            .toString();
    }
}
