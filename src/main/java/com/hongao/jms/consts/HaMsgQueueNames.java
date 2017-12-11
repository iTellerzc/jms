package com.hongao.jms.consts;

/**
 * 消息队列名称
 * @author iTeller_zc
 *
 * @date 2017年12月11日 下午1:47:23
 */
public class HaMsgQueueNames {
	
	/**
	 * 测试队列
	 */
	public static final String TEST = "ha-test.queue";
	
	/**
	 * 注册队列
	 */
	public static final String REGISTER = "ha-register.queue";
	
	public static String getHaQueueName(String msgType){
		if(HaMsgTypes.TEST.equals(msgType)){
			return TEST;
		}else if(HaMsgTypes.REGISTER.equals(msgType)){
			return REGISTER;
		}
		return null;
	}
	
	private HaMsgQueueNames(){
		
	}
}
