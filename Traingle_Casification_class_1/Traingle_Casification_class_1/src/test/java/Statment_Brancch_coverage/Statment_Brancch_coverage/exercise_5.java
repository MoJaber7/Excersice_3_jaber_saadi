package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class exercise_5 {




	@Test
	public void testcheckOut1() {
		double cart=3400;
		int creditRating=100;
		String statuts = "gold"; 
		boolean expectedResult=true;
		boolean result = CheckoutApproval.checkOut(cart,creditRating,statuts);
		assertEquals(expectedResult, result);
	}
	@Test
	public void testcheckOut2() {
		double cart=3600;
		int creditRating=670;
		String statuts = "gold"; 
		boolean expectedResult=true;
		boolean result = CheckoutApproval.checkOut(cart,creditRating,statuts);

		assertEquals(expectedResult, result);
	}@Test
	public void testcheckOut3() {
		double cart=3800;
		int creditRating=600;
		String statuts = "gold"; 
		boolean expectedResult=false;
		boolean result = CheckoutApproval.checkOut(cart,creditRating,statuts);

		assertEquals(expectedResult, result);
	}

	@Test
	public void testcheckOut4() {
		double cart=2000;
		int creditRating=600;
		String statuts = "silver"; 
		boolean expectedResult=true;
		boolean result = CheckoutApproval.checkOut(cart,creditRating,statuts);

		assertEquals(expectedResult, result);
	}
	@Test
	public void testcheckOut5() {
		double cart=3000;
		int creditRating=850;
		String statuts = "silver"; 
		boolean expectedResult=true;
		boolean result = CheckoutApproval.checkOut(cart,creditRating,statuts);

		assertEquals(expectedResult, result);
	}
}

