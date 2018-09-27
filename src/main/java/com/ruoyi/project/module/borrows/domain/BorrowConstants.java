package com.ruoyi.project.module.borrows.domain;

/**
 * 借款管理常量类.
 */
public final class BorrowConstants {
	private BorrowConstants() {
	}

	/**
	 * 借款单号前缀
	 */
	public static final String BORROW_SINGLE_PREFIX = "JK-";
	
	// aud_status状态[0:未提交,1:待审批,2:未通过,3: 已通过]
	/**
	 * 未提交：0
	 */
	public static final String STATUS_PENDING = "0";

	/**
	 * 审批中：1
	 */
	public static final String STATUS_AUDITING = "1";

	/**
	 * 未通过：2
	 */
	public static final String STATUS_NOPASS = "2";
	
	/**
	 * 已通过：3
	 */
	public static final String STATUS_PASS= "3";
	
	/**
	 * 财务通知：4
	 */
	public static final String STATUS_NOTICE= "4";

	/**
	 * 未还款
	 */
	public static final String  UNBORROW = "0" ;
	
	/**
	 * 以还款
	 */
	public static final String BORROWED = "1";
	
	/**
	 * 报销冲抵借款
	 */
	public static final String OFFSET = "2";
	
	/**
	 * 付款冲抵借款
	 */
	public static final String PAYOFFSET = "3";
}
