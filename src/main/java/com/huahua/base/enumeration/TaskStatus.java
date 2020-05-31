package com.huahua.base.enumeration;
/**
 * 提取状态
 * @author wangyl7
 *
 */
public enum TaskStatus {
	notake("notake","07010000-0109"/*@res "待提取"*/),
	taken("taken","07010000-0110"/*@res "已提取"*/),
	adjust("adjust","07010000-0090"/*@res "申请调整"*/),
	handon("handon","07010000-0088"/*@res "挂起"*/),
	reject("reject","07010000-0096"/*@res "驳回"*/),//影像、会计初审和审核和复核公用这个状态
	sscapprove("sscapprove","07010000-0094"/*@res "审核"*/),
	dispatch("dispatch","07010000-0111"/*@res "待派单"*/),
	unsscapprove("unsscapprove","07010000-0112"/*@res "被取消审核"*/),//影像、会计初审和审核和复核公用这个状态
	outerhandon("outerhandon","07010000-0122"/*@res "外部挂起"*/),
	makebill("makebill","07010000-0129"/*@res "SSC制单"*/),
	waitingscan("waitingscan","07010000-0127"/*@res "待影像扫描"*/),
	scanned("scanned","07010000-0130"/*@res "扫描完成"*/),
	waitingaccount("waitingaccount","07010000-0128"/*@res "待会计初审"*/),
	accounted("accounted","07010000-0131"/*@res "会计初审"*/),
	
	//云原生审批和取消审批失败
	sscapprove_failure("sscapprove_failure","审核失败"/*@res "审核失败"*/),
	unsscapprove_failure("unsscapprove_failure","取消审批失败"/*@res "取消审批失败"*/);
	


	private String value;
	private String name;

	private TaskStatus(String value,String name){
		this.value = value;
		this.name = name;
	}

	public String getValue(){
		return this.value;
	}

	public String getName(){
		return this.name;
	}
}