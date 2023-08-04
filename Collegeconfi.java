package com.techcushy.college.College;



import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan(basePackages="com.techcushy.college.College")


public class Collegeconfi {
	
	//@Bean
	public Principal principal() {
		Principal pr=new Principal();
		return pr;
		
	}
	
	@Bean
	public Teacher Mathteacher() {
		Teacher tc=new Mathteacher();
		return tc;
		
	}
	
	@Bean
	public College collegebean() {
		
		College college=new College();
		college.setPrincipal(principal());
		college.setTeacher(Mathteacher());
		return college;
		
		
	}
	

}
