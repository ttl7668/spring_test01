package ex04.quiz;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		//카,에이플랜 빈을 생성하고, 의존성 주입
		//각 객체안에 잇는 배터리를 자바클래스에서 출력.
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("application-context.xml");
		Airplane air = ctx.getBean(Airplane.class);
		air.getBattery().energy();
		
		Car c = ctx.getBean(Car.class);
		c.getBattery().energy();
		
	}
	

}
