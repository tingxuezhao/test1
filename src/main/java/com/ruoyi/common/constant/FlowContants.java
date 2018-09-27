package com.ruoyi.common.constant;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 常量类，审批类型，状态
 * @author Zhaoxueting
 */
public class FlowContants {
	
	/**
	 * 字段名【项目】：project
	 */
	public static final String FIELD_PROJECT = "project";

	/**
	 * 字段名【投标】：bid
	 */
	public static final String FIELD_BID = "bid";

	/**
	 * 字段名【技术方案】：scheme
	 */
	public static final String FIELD_SCHEME = "scheme";

	/**
	 * 字段名【合同预算】：budget
	 */
	public static final String FIELD_BUDGET = "budget";

	/**
	 * 字段名【施工延期申请】：constructDelay
	 */
	public static final String FIELD_CONSTRUCT_DELAY = "constructDelay";

	/**
	 * 字段名【技术成果】：techFruit
	 */
	public static final String FIELD_TECH_FRUIT = "techFruit";

	/**
	 * 字段名【档案文件借阅】：archiveFileLend
	 */
	public static final String FIELD_ARCHIVEFILELEND = "archiveFileLend";

	/**
	 * 字段名【借款】：borrow
	 */
	public static final String FIELD_BORROW = "borrow";

	/**
	 * 字段名【报销】：reimb
	 */
	public static final String FIELD_REIMB = "reimb";

	/**
	 * 字段名【付款】：payment
	 */
	public static final String FIELD_PAYMENT = "payment";

	/**
	 * 字段名【资质】：qualification
	 */
	public static final String FIELD_QUALIFICATION = "qualification";

	/**
	 * 字段名【印章】：sealRecord
	 */
	public static final String FIELD_SEALRECORD = "sealRecord";

	/**
	 * 字段名【人员证书】：cerRecord
	 */
	public static final String FIELD_CERRECORD = "cerRecord";
	
	/**
	 * 字段名【招聘计划】：recPlan
	 */
	public static final String FIELD_RECPLAN = "recPlan";

	/**
	 * 字段名【招聘需求】：demand
	 */
	public static final String FIELD_DEMAND = "demand";
	
	/**
	 * 字段名【培训】：train
	 */
	public static final String FIELD_TRAIN = "train";
	public static final String FIELD_SUSPEND = "suspend";
	public static final String FIELD_FUTURE = "request";
	public static final String FIELD_WORKLOADKC = "workload_kc";
	
	/**
	 * 字段名【分包合同】：subContract
	 */
	public static final String FIELD_CONTRACT = "contract";
	
	/********************************************************************/
	/**
	 * 流程状态常量，结束,通过
	 */
	public static final String FLOW_STATUS_END = "end";

	/**
	 * 流程状态常量，开始
	 */
	public static final String FLOW_STATUS_START = "start";

	/**
	 * 流程状态常量，停止,未通过
	 */
	public static final String FLOW_STATUS_STOP = "stop";

	
	/**
	 * 抄送方式0：全部同意后 1：仅发起时  2：发起时、全部同意后都发送
	 */
	public static final String COPY_ALL = "0";
	public static final String COPY_START = "1";
	public static final String COPY_ALL_START = "2";
	
	/**
	 * 去重方式0：自动 1：保留最后一个 2：保留第一个
	 */
	public static final String DISTINCT_AUTO = "0";
	public static final String DISTINCT_LAST = "1";
	public static final String DISTINCT_FIRST = "2";
	
	/**
	 * 审批人类别0：主管 1：指定具体人员 2：角色
	 */
	public static final String APPROVAL_TYPE_MANAGE = "0";
	public static final String APPROVAL_TYPE_APPOINT = "1";
	public static final String APPROVAL_TYPE_ROLE = "2";
	
	/**
	 * 审批方式0：依次 1：会审 2：或审 3：发起人自选
	 */
	public static final String APPROVAL_WAY_TURN = "0";
	public static final String APPROVAL_WAY_ALL = "1";
	public static final String APPROVAL_WAY_OR = "2";
	public static final String APPROVAL_WAY_OPTIONAL = "3";
	
	/**
	 * 审批状态0：默认 1：pass 2：nopass 3：pending 4:without
	 */
	public static final String STATUS_DEFAULT = "0";
	public static final String STATUS_PASS = "1";
	public static final String STATUS_NOPASS = "2";
	public static final String STATUS_PENDING = "3";
	public static final String STATUS_WITHOUT = "4";
	
	/**
	 * 流程节点状态0：未完成 1：complete 2：during
	 */
	public static final String FLOW_NODE_DEFAULT = "0";
	public static final String FLOW_NODE_COMPLETE = "1";
	public static final String FLOW_NODE_DURING = "2";
	
	/**
	 * 流程状态0：未完成 1：complete 2：during
	 */
	public static final String FLOW_DEFAULT = "0";
	public static final String FLOW_COMPLETE = "1";
	public static final String FLOW_DURING = "2";
	
	/**
	 * 流程类型0：模板 1：自定义
	 */
	public static final String FLOW_TYPE_TEMPLATE = "0";
	public static final String FLOW_TYPE_CUSTOM = "1";

	/**
	 * 是否送审0：未送审 1：已送审
	 */
	public static final String APPROVAL_STATUS_DEFAULT = "0";
	public static final String APPROVAL_STATUS_DURING = "1";
	
	/**
	 * 流程节点常量Map
	 */
	public static final Map<String, String> STATUS_MAP = Collections
			.synchronizedMap(new LinkedHashMap<String, String>());

	static {
		STATUS_MAP.put(STATUS_PASS, "通过");
		STATUS_MAP.put(STATUS_NOPASS, "未通过");
		STATUS_MAP.put(STATUS_PENDING, "待审核");

	}

	/**
	 * 流程节点title常量Map
	 */
	public final static Map<String, String> TITLE_MAP = Collections
			.synchronizedMap(new LinkedHashMap<String, String>());
	static {
		TITLE_MAP.put(FIELD_PROJECT, "项目审批");
		TITLE_MAP.put(FIELD_SCHEME, "项目方案审批");
		TITLE_MAP.put(FIELD_BID, "项目投标审批");
		TITLE_MAP.put(FIELD_BUDGET, "项目合同预算审批");
		TITLE_MAP.put(FIELD_CONSTRUCT_DELAY, "施工延期审批");
		TITLE_MAP.put(FIELD_TECH_FRUIT, "项目技术成果审批");
		TITLE_MAP.put(FIELD_ARCHIVEFILELEND, "文件借阅审批");
		TITLE_MAP.put(FIELD_BORROW, "借款审批");
		TITLE_MAP.put(FIELD_REIMB, "报销审批");
		TITLE_MAP.put(FIELD_PAYMENT, "付款审批");
		TITLE_MAP.put(FIELD_QUALIFICATION, "资质审批");
		TITLE_MAP.put(FIELD_SEALRECORD, "印章审批");
		TITLE_MAP.put(FIELD_CERRECORD, "人员证书审批");
		TITLE_MAP.put(FIELD_RECPLAN, "招聘计划");
		TITLE_MAP.put(FIELD_DEMAND, "招聘需求");
		TITLE_MAP.put(FIELD_TRAIN, "培训");
		TITLE_MAP.put(FIELD_SUSPEND, "项目暂停施工审批");
		TITLE_MAP.put(FIELD_FUTURE, "平台问题修改和功能申请");
		TITLE_MAP.put(FIELD_WORKLOADKC, "勘察工作量审批");
		TITLE_MAP.put(FIELD_CONTRACT, "分包合同审批");
	}
}
