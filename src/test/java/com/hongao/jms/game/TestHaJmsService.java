package com.hongao.jms.game;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hongao.jms.consts.HaMsgTypes;
import com.hongao.jms.dto.base.HaJmsMsg;
import com.hongao.jms.dto.base.TestHaJmsMsg;
import com.hongao.jms.service.HaJmsService;
import com.hongao.parent.exception.HaBizException;

/**
 * 
 * @author iTeller_zc
 *
 * @date 2017年12月11日 上午10:25:05
 */
public class TestHaJmsService extends HaGameJmsBaseTest{
	
	@Autowired
	private HaJmsService haJmsService;
	
	@Test
	public void testSendTestJmsMsg() throws HaBizException{
		TestHaJmsMsg haJmsMsg = new TestHaJmsMsg();
		haJmsMsg.setMsgType(HaMsgTypes.TEST);
		haJmsMsg.setPartyId("01");
		haJmsMsg.setUserId(1L);
		haJmsMsg.setName("iTeller");
		haJmsService.publishMsg(haJmsMsg);
	}
	
	@Test
	public void testSendRegisterJmsMsg() throws HaBizException{
		HaJmsMsg haJmsMsg = new HaJmsMsg();
		haJmsMsg.setMsgType(HaMsgTypes.REGISTER);
		haJmsMsg.setPartyId("02");
		haJmsMsg.setUserId(2L);
		haJmsService.publishMsg(haJmsMsg);
	}
}
