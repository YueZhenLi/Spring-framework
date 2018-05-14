package com.study.context;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by KaiLin.Guo on 2018-05-14.
 */
public class TestPerson {

	@Test
	public void testClassPath() {
		ApplicationContext context = new ClassPathXmlApplicationContext("com.study.context/person.xml");
		Object person = context.getBean("person");
		System.out.println("person.getClass().getName(): " + person.getClass().getName());
	}
}
