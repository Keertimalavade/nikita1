package com.techcushy.college.College;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(Collegeconfi.class);
		College co=(College) con.getBean("collegebean");
		System.out.println(co);
		System.out.println("object is created");
		System.out.println("bean is ready");
		co.test();
		con.close();
		
	}

}
 