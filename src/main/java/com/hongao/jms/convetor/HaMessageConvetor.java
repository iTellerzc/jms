package com.hongao.jms.convetor;

import java.io.Serializable;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.jms.support.converter.MessageConverter;

/**
 * 消息转换器
 * @author iTeller_zc
 *
 * @date 2017年12月11日 上午10:42:35
 */
public class HaMessageConvetor implements MessageConverter {

	@Override
	public Message toMessage(Object object, Session session) throws JMSException, MessageConversionException {
		return session.createObjectMessage((Serializable)object);
	}

	@Override
	public Object fromMessage(Message message) throws JMSException, MessageConversionException {
		ObjectMessage objectMessage = (ObjectMessage) message;
		return objectMessage.getObject();
	}

}
