package com.ck.test;
import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.alibaba.fastjson.JSON;

import com.ck.model.User;
import com.ck.services.UserServices;


public class TestMyclass {

	private static Logger logger = Logger.getLogger(TestMyclass.class);
	// private ApplicationContext ac = null;
	@Resource
	private UserServices userService;

	// @Before
	// public void before() {
	// ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	// userService = (IUserService) ac.getBean("userService");
	// }

	@Test
	public void test1() {
		//int count=userService.insertUser("zhumin", "nibaba", 25);
		//User user = userService.getUser(2);
		
		// System.out.println(user.getUserName());
		// logger.info("Öµ£º"+user.getUserName());
		//logger.info(JSON.toJSONString(count));
	}

}
