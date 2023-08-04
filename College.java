package com.techcushy.college.College;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class College {
	
	private Principal principal;
	private Teacher teacher;
	
	@Value("GEC")
	private String collegename;
	

	public Teacher getTeacher() {
		return teacher;
	}



	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}



	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public Principal getPrincipal() {
		return principal;
	}



	public void test() {
		principal.princinfo();
		teacher.teach();
		System.out.println("college name is:"+collegename);
		System.out.println("test is created in college");
	}
}
