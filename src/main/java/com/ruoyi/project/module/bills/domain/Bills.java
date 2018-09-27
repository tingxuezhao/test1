package com.ruoyi.project.module.bills.domain;

import java.util.Date;

import javax.persistence.Transient;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 票据表 bills
 * 
 * @author ruoyi
 * @date 2018-09-20
 */
public class Bills extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 票据ID */
	private Integer id;
	/** 金额 */
	private Double amount;
	/** 编号 */
	private String billNum;
	/** 开票单位 */
	private String company;
	/**  */
	private String project;
	/** 取票人 */
	private String receiver;
	/** 票据类型 */
	private Integer typeId;
	/** 开票人 */
	private Integer drawerId;
	/** 项目 */
	private Integer projectId;
	/** 标题 */
	private String title;
	/** 票号 */
	private String billNum2;
	/** 类型：公司、项目部、外部、未归类票据 */
	private String type;
	/** 创建者 */
	private Integer creatorId;
	/**  */
	private String rate;
	/** 状态（0正常 1停用） */
	private String status;
	/** 创建者 */
	private String createBy;
	/** 创建时间 */
	private Date createTime;
	/** 更新者 */
	private String updateBy;
	/** 更新时间 */
	private Date updateTime;
	/** 备注 */
	private String remark;
	
	/** 开票人名字 */
	@Transient
	private String drawerName;
	/** 票据类型名称 */
	@Transient
	private String typeName;

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setAmount(Double amount) 
	{
		this.amount = amount;
	}

	public Double getAmount() 
	{
		return amount;
	}
	public void setBillNum(String billNum) 
	{
		this.billNum = billNum;
	}

	public String getBillNum() 
	{
		return billNum;
	}
	public void setCompany(String company) 
	{
		this.company = company;
	}

	public String getCompany() 
	{
		return company;
	}
	public void setProject(String project) 
	{
		this.project = project;
	}

	public String getProject() 
	{
		return project;
	}
	public void setReceiver(String receiver) 
	{
		this.receiver = receiver;
	}

	public String getReceiver() 
	{
		return receiver;
	}
	public void setTypeId(Integer typeId) 
	{
		this.typeId = typeId;
	}

	public Integer getTypeId() 
	{
		return typeId;
	}
	public void setDrawerId(Integer drawerId) 
	{
		this.drawerId = drawerId;
	}

	public Integer getDrawerId() 
	{
		return drawerId;
	}
	public void setProjectId(Integer projectId) 
	{
		this.projectId = projectId;
	}

	public Integer getProjectId() 
	{
		return projectId;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}

	public String getTitle() 
	{
		return title;
	}
	public void setBillNum2(String billNum2) 
	{
		this.billNum2 = billNum2;
	}

	public String getBillNum2() 
	{
		return billNum2;
	}
	public void setType(String type) 
	{
		this.type = type;
	}

	public String getType() 
	{
		return type;
	}
	public void setCreatorId(Integer creatorId) 
	{
		this.creatorId = creatorId;
	}

	public Integer getCreatorId() 
	{
		return creatorId;
	}
	public void setRate(String rate) 
	{
		this.rate = rate;
	}

	public String getRate() 
	{
		return rate;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}
	public void setCreateBy(String createBy) 
	{
		this.createBy = createBy;
	}

	public String getCreateBy() 
	{
		return createBy;
	}
	public void setCreateTime(Date createTime) 
	{
		this.createTime = createTime;
	}

	public Date getCreateTime() 
	{
		return createTime;
	}
	public void setUpdateBy(String updateBy) 
	{
		this.updateBy = updateBy;
	}

	public String getUpdateBy() 
	{
		return updateBy;
	}
	public void setUpdateTime(Date updateTime) 
	{
		this.updateTime = updateTime;
	}

	public Date getUpdateTime() 
	{
		return updateTime;
	}
	public void setRemark(String remark) 
	{
		this.remark = remark;
	}

	public String getRemark() 
	{
		return remark;
	}

    public String getDrawerName() {
		return drawerName;
	}

	public void setDrawerName(String drawerName) {
		this.drawerName = drawerName;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("amount", getAmount())
            .append("billNum", getBillNum())
            .append("company", getCompany())
            .append("project", getProject())
            .append("receiver", getReceiver())
            .append("typeId", getTypeId())
            .append("drawerId", getDrawerId())
            .append("projectId", getProjectId())
            .append("title", getTitle())
            .append("billNum2", getBillNum2())
            .append("type", getType())
            .append("creatorId", getCreatorId())
            .append("rate", getRate())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("drawerName", getDrawerName())
            .append("typeName", getTypeName())
            .toString();
    }
}
