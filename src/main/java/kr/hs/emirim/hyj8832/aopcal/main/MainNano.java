package kr.hs.emirim.hyj8832.aopcal.main;

import kr.hs.emirim.hyj8832.aopcal.cal.Calculator;
import kr.hs.emirim.hyj8832.aopcal.cal.ImpCalculator;
import kr.hs.emirim.hyj8832.aopcal.cal.RecCalculator;

public class MainNano {

	public static void main(String[] args) {
		long num=100;
		long start1=System.nanoTime();
		Calculator cal1=new ImpCalculator();
		long f1=cal1.factorial(100);
		long end1=System.nanoTime();
		System.out.printf("Imp factorial(%d): 실행시간 =%d",num,(end1-start1));

		System.out.println();




		long start2=System.nanoTime();
		Calculator cal2=new RecCalculator();
		long f2=cal2.factorial(100);
		long end2=System.nanoTime();
		System.out.printf("Imp factorial(%d): 실행시간 =%d",num,(end2-start2));


	}

}
