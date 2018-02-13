package com.hongao.jms.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSONObject;
import com.hongao.jms.consts.ErrorCodes;
import com.hongao.jms.consts.HaMsgTypes;
import com.hongao.jms.dto.base.HaJmsMsg;
import com.hongao.jms.dto.event.HaJmsEvent;
import com.hongao.jms.selector.HaMsgSelector;
import com.hongao.jms.service.HaJmsService;
import com.hongao.parent.exception.HaBizException;

/**
 * 
 * @author iTeller_zc
 *
 * @date 2017年12月11日 上午10:08:14
 */
@Service
public class HaJmsServiceImpl implements HaJmsService {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Autowired
	@Qualifier(value="jmsTopicTemplate")
	private JmsTemplate jmsTopicTemplate;
	
	@Autowired
	private HaMsgSelector haMsgSelector;
	
	@Override
	public void publishMsg(HaJmsMsg haJmsMsg) throws HaBizException {
		logger.info("send msg:{}", JSONObject.toJSONString(haJmsMsg));
		jmsTemplate.convertAndSend(haMsgSelector.select(haJmsMsg.getMsgType()), haJmsMsg);
//		jmsTemplate.send(destination, new MessageCreator() {
//			
//			@Override
//			public Message createMessage(Session session) throws JMSException {
//				return session.createObjectMessage(haJmsMsg);
//			}
//		});
	}

	@Override
	public void publishTopic(HaJmsEvent haJmsEvent) throws HaBizException {
		logger.info("send topic:{}", JSONObject.toJSONString(haJmsEvent));
		jmsTopicTemplate.convertAndSend(haMsgSelector.selectTopic(haJmsEvent.getEventType()), haJmsEvent);
	}

}
