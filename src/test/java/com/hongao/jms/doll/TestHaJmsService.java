package com.hongao.jms.doll;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hongao.jms.consts.HaMsgTypes;
import com.hongao.jms.dto.base.HaJmsMsg;
import com.hongao.jms.service.HaJmsService;
import com.hongao.parent.exception.HaBizException;

/**
 * 
 * @author iTeller_zc
 *
 * @date 2017年12月11日 上午10:25:05
 */
public class TestHaJmsService extends HaDollJmsBaseTest{
	
	@Autowired
	private HaJmsService haJmsService;
	
	@Test
	public void testSendJmsMsg() throws HaBizException{
		HaJmsMsg haJmsMsg = new HaJmsMsg();
		haJmsMsg.setMsgType(HaMsgTypes.TEST);
		haJmsMsg.setPartyId("01");
		haJmsMsg.setUserId(1L);
		haJmsService.publishMsg(haJmsMsg);
	}
}
