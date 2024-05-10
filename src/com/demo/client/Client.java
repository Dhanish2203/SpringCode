package com.demo.client;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.service.WelcomeService;


public class Client {
	public static void main(String args[]) {
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
//		WelcomeService service=(WelcomeService)context.getBean("service");
//		System.out.println(service.getMessage());
		
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
//		WelcomeService service = context.getBean("service",WelcomeService.class);
//		System.out.println(service.getMessage());
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
//		WelcomeService service=(WelcomeService)context.getBean(WelcomeService.class);
//		System.out.println(service.getMessage());
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
//		WelcomeService service=(WelcomeService)context.getBean(WelcomeService.class);
//		System.out.println(service.getMessage());
//		((ClassPathXmlApplicationContext)context).close();
		///the applicationContext is closed
		
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		WelcomeService service=(WelcomeService)context.getBean(WelcomeService.class);
		System.out.println(service.getMessage());
		context.close();
		
	}
}
