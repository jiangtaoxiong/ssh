package com.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.interceptor.TransactionProxyFactoryBean;

import com.bill.dao.IOperate;
import com.bill.entity.User;

public class hTest {

	@Test
	public void test(){
		BeanFactory bf = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IOperate<User> ioperater = (IOperate<User>)bf.getBean("userDao");
		ioperater.save(new User("ddd", "aaa", 9));
		

		
		List<User> list = ioperater.ListByExpress("");
		
		for(User user:list)
		{
			System.out.println("username="+user.getUsername());
		}
	}
}
