package com.ruoyi.project.module.costbills.domain;

import java.util.Date;

import javax.persistence.Transient;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 成本发票表 costbills
 * 
 * @author ruoyi
 * @date 2018-09-25
 */
public class Costbills extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 成本发票ID */
	private Integer id;
	/** 金额 */
	private Double amount;
	/** 发票号码 */
	private String billNum;
	/** 开票单位 */
	private String company;
	/** 备注 */
	private String fileIds;
	/**  */
	private Date lastTime;
	/** 预缴增值税 */
	private Double pre1;
	/** 预缴城建税 */
	private Double pre2;
	/** 预缴地方教育费附加 */
	private Double pre3;
	/** 预缴教育费附加 */
	private Double pre4;
	/** 预缴印花税 */
	private Double pre5;
	/** 预缴所得税 */
	private Double pre6;
	/** 税率 */
	private Integer rate;
	/** 取票人 */
	private String receiver;
	/** 税额 */
	private Double tax;
	/** 应税劳务 */
	private String title;
	/** 开票金额 */
	private Double total;
	/** 分公司、外部、施工人员 */
	private String type;
	/** 发票类型 */
	private Integer typeId;
	/** 创建者 */
	private Integer creatorId;
	/** 外部人员 */
	private Integer extId;
	/** 分公司 */
	private Integer subId;
	/** 施工人员 */
	private Integer supplierId;
	/** 状态（0正常 1停用） */
	private String status;
	/** 创建者 */
	private String createBy;
	/** 开具时间 */
	private Date createTime;
	/** 更新者 */
	private String updateBy;
	/** 更新时间 */
	private Date updateTime;
	/** 备注 */
	private String remark;
	
	@Transient
	private String typeName;
	@Transient
	private String rateName;
	@Transient
	private String costTypeName;
	@Transient
	private String proBill;

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
	public void setFileIds(String fileIds) 
	{
		this.fileIds = fileIds;
	}

	public String getFileIds() 
	{
		return fileIds;
	}
	public void setLastTime(Date lastTime) 
	{
		this.lastTime = lastTime;
	}

	public Date getLastTime() 
	{
		return lastTime;
	}
	public void setPre1(Double pre1) 
	{
		this.pre1 = pre1;
	}

	public Double getPre1() 
	{
		return pre1;
	}
	public void setPre2(Double pre2) 
	{
		this.pre2 = pre2;
	}

	public Double getPre2() 
	{
		return pre2;
	}
	public void setPre3(Double pre3) 
	{
		this.pre3 = pre3;
	}

	public Double getPre3() 
	{
		return pre3;
	}
	public void setPre4(Double pre4) 
	{
		this.pre4 = pre4;
	}

	public Double getPre4() 
	{
		return pre4;
	}
	public void setPre5(Double pre5) 
	{
		this.pre5 = pre5;
	}

	public Double getPre5() 
	{
		return pre5;
	}
	public void setPre6(Double pre6) 
	{
		this.pre6 = pre6;
	}

	public Double getPre6() 
	{
		return pre6;
	}
	public void setRate(Integer rate) 
	{
		this.rate = rate;
	}

	public Integer getRate() 
	{
		return rate;
	}
	public void setReceiver(String receiver) 
	{
		this.receiver = receiver;
	}

	public String getReceiver() 
	{
		return receiver;
	}
	public void setTax(Double tax) 
	{
		this.tax = tax;
	}

	public Double getTax() 
	{
		return tax;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}

	public String getTitle() 
	{
		return title;
	}
	public void setTotal(Double total) 
	{
		this.total = total;
	}

	public Double getTotal() 
	{
		return total;
	}
	public void setType(String type) 
	{
		this.type = type;
	}

	public String getType() 
	{
		return type;
	}
	public void setTypeId(Integer typeId) 
	{
		this.typeId = typeId;
	}

	public Integer getTypeId() 
	{
		return typeId;
	}
	public void setCreatorId(Integer creatorId) 
	{
		this.creatorId = creatorId;
	}

	public Integer getCreatorId() 
	{
		return creatorId;
	}
	public void setExtId(Integer extId) 
	{
		this.extId = extId;
	}

	public Integer getExtId() 
	{
		return extId;
	}
	public void setSubId(Integer subId) 
	{
		this.subId = subId;
	}

	public Integer getSubId() 
	{
		return subId;
	}
	public void setSupplierId(Integer supplierId) 
	{
		this.supplierId = supplierId;
	}

	public Integer getSupplierId() 
	{
		return supplierId;
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

    public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getRateName() {
		return rateName;
	}

	public void setRateName(String rateName) {
		this.rateName = rateName;
	}

	public String getCostTypeName() {
		return costTypeName;
	}

	public void setCostTypeName(String costTypeName) {
		this.costTypeName = costTypeName;
	}

	public String getProBill() {
		return proBill;
	}

	public void setProBill(String proBill) {
		this.proBill = proBill;
	}

	public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("amount", getAmount())
            .append("billNum", getBillNum())
            .append("company", getCompany())
            .append("fileIds", getFileIds())
            .append("lastTime", getLastTime())
            .append("pre1", getPre1())
            .append("pre2", getPre2())
            .append("pre3", getPre3())
            .append("pre4", getPre4())
            .append("pre5", getPre5())
            .append("pre6", getPre6())
            .append("rate", getRate())
            .append("receiver", getReceiver())
            .append("tax", getTax())
            .append("title", getTitle())
            .append("total", getTotal())
            .append("type", getType())
            .append("typeId", getTypeId())
            .append("creatorId", getCreatorId())
            .append("extId", getExtId())
            .append("subId", getSubId())
            .append("supplierId", getSupplierId())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("typeName", getTypeName())
            .append("rateName", getRateName())
            .append("costTypeName", getCostTypeName())
            .append("proBill", getProBill())
            .toString();
    }
}
