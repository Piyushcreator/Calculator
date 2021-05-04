package Calculator;

import static org.junit.Assert.*;


import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void checkForEmptyString()
	{
		assertEquals(0,StringCalculator.Add(""));
	}		
	
	@Test
	public void checkForSingleNumber()
	{
		assertEquals(1,StringCalculator.Add("1"));
	}
	
	@Test
	public void checkForTwoNumber()
	{
		assertEquals(3,StringCalculator.Add("1,2"));
	}
	
	@Test
	public void checkForMultiplenumber()
	{
		assertEquals(6,StringCalculator.Add("1,2,3"));
	}
	

}
