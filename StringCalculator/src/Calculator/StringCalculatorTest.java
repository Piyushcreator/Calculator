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
	
	@Test
	public void shouldAcceptNewLineAsValidDelimeter()
	{
		assertEquals(6,StringCalculator.Add("1,2\n3"));
	}

	
	@Test
	public void shouldAcceptCustomDelimiterSyntax()
	{
		assertEquals(3,StringCalculator.Add("//;\n1;2"));
	}
	
	@Test
	public void customDelimiterCouldBeAlsoARegExpSpecialChar()
	{
		assertEquals(6,StringCalculator.Add("//.\n1.2.3"));
	}
	
	@Test
	public void shouldRaisExceptionOnNegatives()
	{
		try
		{
			StringCalculator.Add("-1,2,3");
			fail("Exception expected."); 
		}
		catch(RuntimeException ex)
		{
	
		}
	
	}
	
	@Test
	public void exceptionMessageShouldContainNegativeNumbers()
	{
		try
		{
			StringCalculator.Add("-1,-2,3");
			fail("Exception expected."); 
		}
		catch(RuntimeException ex)
		{
			
		assertEquals("Negative not allowed: [-1, -2]",ex.getMessage());	
		}
	
	}
	
	@Test
	public void shouldNotAddNumberGreaterThan1000()
	{
		assertEquals(4,StringCalculator.Add("1,3,1001"));
	
	}
	@Test
	public void checkForDelimiterOfMultipleLength()
	{
		
		assertEquals(6,StringCalculator.Add("//;;\n1;;2;;3"));
	
	}
}
