package com.cg.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.Employee;

public class App1 {

	public static void main(String[] args) {
		
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
	        Employee employee = (Employee)context.getBean("employee");
	        System.out.println(employee);
	        //((AbstractApplicationContext) context).close();

	}
}
