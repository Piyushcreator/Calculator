package Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void checkForEmptyString()
	{
		assertEquals(0,StringCalculator.Add(""));
	}		
	
}
