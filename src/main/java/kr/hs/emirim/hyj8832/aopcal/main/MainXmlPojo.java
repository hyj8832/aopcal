package kr.hs.emirim.hyj8832.aopcal.main;

import kr.hs.emirim.hyj8832.aopcal.cal.Calculator;
import org.springframework.context.support.GenericXmlApplicationContext;



public class MainXmlPojo {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("classpath:aopPojo.xml");

		
		Calculator impCal=ctx.getBean("impCal",Calculator.class);
		long fiveFact1=impCal.factorial(5);
		System.out.println("impCal.factorial(5)= "+fiveFact1);
		
		Calculator recCal=ctx.getBean("recCal",Calculator.class);
		long fiveFact2=impCal.factorial(5);
		System.out.println("recCal.factorial(5)= "+fiveFact2);
		
	}

}
