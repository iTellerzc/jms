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
	
	/**
	 * 队列名称缓存
	 */
	private Map<String, String> MSG_QUEUE_DESTINATION_CACHE = new ConcurrentHashMap<String, String>();
	
	/**
	 * topic名称缓存
	 */
	private Map<String, String> MSG_TOPIC_DESTINATION_CACHE = new ConcurrentHashMap<String, String>();
	
	/**
	 * 前缀
	 */
	private static final String PREFIX = "ha-";
	
	/**
	 * 队列后缀
	 */
	private static final String QUEUE_SUFFIX = ".queue";
	
	/**
	 * topic后缀
	 */
	private static final String TOPIC_SUFFIX = ".topic";
	
	/**
	 * 获取队列实例名称
	 * @param msgType
	 * @return
	 */
	public synchronized String select(String msgType){
		if(MSG_QUEUE_DESTINATION_CACHE.get(msgType) == null){
			MSG_QUEUE_DESTINATION_CACHE.put(msgType, PREFIX + msgType + QUEUE_SUFFIX);
		}
		return MSG_QUEUE_DESTINATION_CACHE.get(msgType);
	}
	
	/**
	 * 获取topic实例名称
	 * @param msgType
	 * @return
	 */
	public synchronized String selectTopic(String eventType){
		if(MSG_TOPIC_DESTINATION_CACHE.get(eventType) == null){
			MSG_TOPIC_DESTINATION_CACHE.put(eventType, PREFIX + eventType + TOPIC_SUFFIX);
		}
		return MSG_TOPIC_DESTINATION_CACHE.get(eventType);
	}
}
