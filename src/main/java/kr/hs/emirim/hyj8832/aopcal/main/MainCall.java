package kr.hs.emirim.hyj8832.aopcal.main;

import kr.hs.emirim.hyj8832.aopcal.cal.Calculator;
import kr.hs.emirim.hyj8832.aopcal.cal.ImpCalculator;
import kr.hs.emirim.hyj8832.aopcal.cal.RecCalculator;

public class MainCall {

	public static void main(String[] args) {
		long num=100;
		long start1=System.currentTimeMillis();
		  Calculator cal1=new ImpCalculator();
		  long f1=cal1.factorial(100);
		  long end1=System.currentTimeMillis();
			System.out.printf("Imp factorial(%d): 실행시간 =%d",num,(end1-start1));

			System.out.println();
			
			
			
			
			long start2=System.currentTimeMillis();
		  Calculator cal2=new RecCalculator();
		  long f2=cal2.factorial(100);
		  long end2=System.currentTimeMillis();
			System.out.printf("Imp factorial(%d): 실행시간 =%d",num,(end2-start2));


	}

}
