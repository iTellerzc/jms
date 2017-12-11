package com.hongao.jms.listener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.alibaba.fastjson.JSONObject;
import com.hongao.jms.dto.base.HaJmsMsg;

public class TestMessageListener implements MessageListener{

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public void onMessage(Message message) {
		if(message instanceof ObjectMessage){
			ObjectMessage objectMessage = (ObjectMessage)message;
			HaJmsMsg haJmsMsg;
			try {
				haJmsMsg = (HaJmsMsg) (objectMessage.getObject());
				logger.info("receive haJmsMsg:{}!", JSONObject.toJSONString(haJmsMsg));
			} catch (JMSException e) {
				logger.error("convert message meet error!");
				e.printStackTrace();
			}
		}
	}

}
