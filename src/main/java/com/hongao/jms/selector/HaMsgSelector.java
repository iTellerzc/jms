package com.hongao.jms.selector;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Component;
import com.hongao.jms.consts.HaMsgQueueNames;

/**
 * 消息选择器
 * @author iTeller_zc
 *
 * @date 2017年12月11日 下午3:21:24
 */
@Component
public class HaMsgSelector {
	
	private Map<String, String> MSG_QUEUE_DESTINATION_PREFIX = new ConcurrentHashMap<String, String>();
	
	/**
	 * 获取队列实例名称
	 * @param msgType
	 * @return
	 */
	public synchronized String select(String msgType){
		if(MSG_QUEUE_DESTINATION_PREFIX.get(msgType) == null){
			MSG_QUEUE_DESTINATION_PREFIX.put(msgType, HaMsgQueueNames.getHaQueueName(msgType));
		}
		return MSG_QUEUE_DESTINATION_PREFIX.get(msgType);
	}
}
