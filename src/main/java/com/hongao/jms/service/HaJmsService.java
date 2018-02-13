package com.hongao.jms.service;

import com.hongao.jms.dto.base.HaJmsMsg;
import com.hongao.jms.dto.event.HaJmsEvent;
import com.hongao.parent.exception.HaBizException;

/**
 * 消息服务
 * @author iTeller_zc
 *
 * @date 2017年12月11日 上午9:29:07
 */
public interface HaJmsService {
	
	/**
	 * 发布点对点消息
	 * @param haJmsMsg
	 * @throws HaBizException
	 */
	public void publishMsg(HaJmsMsg haJmsMsg) throws HaBizException;
	
	/**
	 * 发布订阅消息
	 * @param haJmsEvent
	 * @throws HaBizException
	 */
	public void publishTopic(HaJmsEvent haJmsEvent) throws HaBizException;
	
}
