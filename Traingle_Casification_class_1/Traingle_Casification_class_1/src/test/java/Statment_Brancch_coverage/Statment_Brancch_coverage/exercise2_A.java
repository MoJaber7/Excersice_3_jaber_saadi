package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;

public class exercise2_A {
	
	
	@Test(expected = java.lang.ArithmeticException.class)
	public void testWeakMethod2PartialCoverage() {
		int x=5;
		int y=0;		
		WeakClass.weakMethod2(x,y);
	
	}

}
