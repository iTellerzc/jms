package com.hongao.jms.doll;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:ha-doll-jms-test.xml"})
public abstract class HaDollJmsBaseTest {

}
