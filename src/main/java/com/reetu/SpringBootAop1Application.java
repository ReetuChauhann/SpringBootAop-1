package com.reetu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.reetu.beans.MyBean;

@SpringBootApplication
public class SpringBootAop1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootAop1Application.class, args);
		MyBean m=ctx.getBean(MyBean.class);
		m.addInt(5,8);
		m.addString("hi","hello");
		
//		int s=m.sum(5, 8);
//		System.out.println("Sum: "+s);
		
//		int p=m.div(5, 0);
//		System.out.println("Division: "+p);
	}

}
