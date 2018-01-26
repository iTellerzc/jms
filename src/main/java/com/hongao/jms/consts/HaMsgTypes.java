package com.hongao.jms.consts;

/**
 * 消息类型(点对点)
 * @author iTeller_zc
 *
 * @date 2017年12月11日 上午9:52:36
 */
public class HaMsgTypes {
	
	/**
	 * 测试
	 */
	public static final String TEST = "test";
	
	/**
	 * 注册
	 */
	public static final String REGISTER = "register";
	
	/**
	 * 分润
	 */
	public static final String COMMISSION = "commission";
	
	public static boolean isLegal(String msgType){
		return TEST.equals(msgType) 
				|| REGISTER.equals(msgType)
				|| COMMISSION.equals(msgType);
	}
	
	private HaMsgTypes(){
		
	}
}
