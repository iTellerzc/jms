package com.hongao.jms.consts;

/**
 * 消息队列名称
 * @author iTeller_zc
 *
 * @date 2017年12月11日 下午1:47:23
 */
@Deprecated
public class HaMsgQueueNames {
	
	/**
	 * 测试队列
	 */
	public static final String TEST = "ha-test.queue";
	
	/**
	 * 注册队列
	 */
	public static final String REGISTER = "ha-register.queue";
	
	/**
	 * 分润队列
	 */
	public static final String COMMISSION = "ha-comission.queue";
	
	public static String getHaQueueName(String msgType){
		if(HaMsgTypes.TEST.equals(msgType)){
			return TEST;
		}else if(HaMsgTypes.REGISTER.equals(msgType)){
			return REGISTER;
		}else if(HaMsgTypes.COMMISSION.equals(msgType)){
			return COMMISSION;
		}
		return null;
	}
	
	private HaMsgQueueNames(){
		
	}
}
