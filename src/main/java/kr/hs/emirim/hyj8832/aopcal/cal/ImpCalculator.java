package kr.hs.emirim.hyj8832.aopcal.cal;

public class ImpCalculator implements Calculator{
	
	@Override
	public long factorial(long num) {
		
		
		long result = 1;
		for (long i = 1; i <= num; i++) {
			result *= i;
		}
		
		return result;
	}
}
