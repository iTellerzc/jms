package com.hongao.jms.dto.base;

import java.io.Serializable;

/**
 * 消息
 * @author iTeller_zc
 *
 * @date 2017年12月11日 上午9:58:56
 */
public class HaJmsMsg implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 商户编号
	 */
	private String partyId;
	
	/**
	 * 用户编号
	 */
	private Long userId;
	
	/**
	 * 消息类型
	 */
	private String msgType;
	
	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

}
