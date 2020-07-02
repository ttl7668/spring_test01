package ex08.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ex01.SpringTest;
import ex02.construct.Hotel;
import ex03.setter.DatabaseDev;

public class Main {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		SpringTest t = ctx.getBean(SpringTest.class);
		t.test();
		
		Hotel h = ctx.getBean(Hotel.class);
		h.getChef().cook();
		
		DatabaseDev dev = ctx.getBean(DatabaseDev.class);
		System.out.println(dev.getUrl());
		System.out.println(dev.getUid());
		System.out.println(dev.getUpw());

		
		
	}

}
