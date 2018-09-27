package com.ruoyi.project.module.borrows.domain;

import java.util.Date;

import javax.persistence.Transient;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 借款表 borrows
 * 
 * @author ruoyi
 * @date 2018-09-26
 */
public class Borrows extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 借款ID */
	private Integer id;
	/** 借款金额 */
	private Double amount;
	/** 审批状态 */
	private String audStatus;
	/** 借款单号 */
	private String borrowNum;
	/** 创建日期 */
	private Date createDate;
	/** 借出日期 */
	private Date payDate;
	/** 借出状态 0未放款，1已放款,2可放款 */
	private String payStatus;
	/** 借款理由 */
	private String purpose;
	/** 还款日期 */
	private Date repayDate;
	/** 还款状态 0：未还款 1：还款 */
	private String repayStatus;
	/** 借款人 */
	private Integer borrowerId;
	/** 项目 */
	private Integer projectId;
	/** 出纳人编码 */
	private Integer treasurerId;
	/** 应还金额 */
	private Double residualAmount;
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
	
	@Transient
	private String borrowerName;

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
	public void setAudStatus(String audStatus) 
	{
		this.audStatus = audStatus;
	}

	public String getAudStatus() 
	{
		return audStatus;
	}
	public void setBorrowNum(String borrowNum) 
	{
		this.borrowNum = borrowNum;
	}

	public String getBorrowNum() 
	{
		return borrowNum;
	}
	public void setCreateDate(Date createDate) 
	{
		this.createDate = createDate;
	}

	public Date getCreateDate() 
	{
		return createDate;
	}
	public void setPayDate(Date payDate) 
	{
		this.payDate = payDate;
	}

	public Date getPayDate() 
	{
		return payDate;
	}
	public void setPayStatus(String payStatus) 
	{
		this.payStatus = payStatus;
	}

	public String getPayStatus() 
	{
		return payStatus;
	}
	public void setPurpose(String purpose) 
	{
		this.purpose = purpose;
	}

	public String getPurpose() 
	{
		return purpose;
	}
	public void setRepayDate(Date repayDate) 
	{
		this.repayDate = repayDate;
	}

	public Date getRepayDate() 
	{
		return repayDate;
	}
	public void setRepayStatus(String repayStatus) 
	{
		this.repayStatus = repayStatus;
	}

	public String getRepayStatus() 
	{
		return repayStatus;
	}
	public void setBorrowerId(Integer borrowerId) 
	{
		this.borrowerId = borrowerId;
	}

	public Integer getBorrowerId() 
	{
		return borrowerId;
	}
	public void setProjectId(Integer projectId) 
	{
		this.projectId = projectId;
	}

	public Integer getProjectId() 
	{
		return projectId;
	}
	public void setTreasurerId(Integer treasurerId) 
	{
		this.treasurerId = treasurerId;
	}

	public Integer getTreasurerId() 
	{
		return treasurerId;
	}
	public void setResidualAmount(Double residualAmount) 
	{
		this.residualAmount = residualAmount;
	}

	public Double getResidualAmount() 
	{
		return residualAmount;
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

    public String getBorrowerName() {
		return borrowerName;
	}

	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}

	public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("amount", getAmount())
            .append("audStatus", getAudStatus())
            .append("borrowNum", getBorrowNum())
            .append("createDate", getCreateDate())
            .append("payDate", getPayDate())
            .append("payStatus", getPayStatus())
            .append("purpose", getPurpose())
            .append("repayDate", getRepayDate())
            .append("repayStatus", getRepayStatus())
            .append("borrowerId", getBorrowerId())
            .append("projectId", getProjectId())
            .append("treasurerId", getTreasurerId())
            .append("residualAmount", getResidualAmount())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("borrowerName", getBorrowerName())
            .toString();
    }
}
