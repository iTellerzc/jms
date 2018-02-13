package com.hongao.jms.listener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.alibaba.fastjson.JSONObject;
import com.hongao.jms.dto.event.HaJmsEvent;

/**
 * 测试topic监听器
 * @author iTeller_zc
 *
 * @date 2018年2月13日 上午9:52:32
 */
public class TestTopicListener2 implements MessageListener{

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public void onMessage(Message message) {
		System.out.println("consumer2");
		if(message instanceof ObjectMessage){
			ObjectMessage objectMessage = (ObjectMessage)message;
			try {
				HaJmsEvent haJmsTopic = (HaJmsEvent) (objectMessage.getObject());
				logger.info("receive haJmsTopic:{}!", JSONObject.toJSONString(haJmsTopic));
			} catch (JMSException e) {
				logger.error("convert message meet error!");
				e.printStackTrace();
			}
		}
	}

}
