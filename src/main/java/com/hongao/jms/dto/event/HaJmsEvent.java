package com.hongao.jms.dto.event;

import java.io.Serializable;

/**
 * 事件
 * @author iTeller_zc
 *
 * @date 2017年12月11日 上午9:55:18
 */
public class HaJmsEvent implements Serializable{
	
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
	 * 事件类型
	 */
	private String eventType;
	
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

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	
}
