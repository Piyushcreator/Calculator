package Calculator;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

	public static int Add(String number)
	{
		if(number.isEmpty())
		{	return 0;
		
		}
		else
		{			
			String numberlist[]= getnumberList(number);
			ArrayList<Integer> negativeNumbers = new ArrayList<Integer>();
			int sum = 0;
			
			for(int i =0;i<numberlist.length;i++)
			{
				int nextNumber= Integer.parseInt(numberlist[i]);
				if(nextNumber< 1001)
				sum += nextNumber ;
				
				if (nextNumber<0)					
				negativeNumbers.add(nextNumber);
			}
			
			if (negativeNumbers.size() > 0)
			{
				throw new RuntimeException("Negative not allowed: " + negativeNumbers);
			}
			else
			{	
				return sum;
			}		
			}
		
	}
	private static String[] getnumberList(String text)
	{
		if (text.startsWith("//"))
		{
			return splitUsingCustomDelimiter(text);
		}
		else
		{
			return splitUsingDefaultDelimiter(text);
		}
	}
	private static String[] splitUsingCustomDelimiter(String text)
	{
		
		Matcher m = Pattern.compile("//(.*)\n(.*)").matcher(text);
		m.matches();
		String customDelimiter= m.group(1);
		String numbers= m.group(2);
		return numbers.split(Pattern.quote(customDelimiter));

		
	}
	private static String[] splitUsingDefaultDelimiter(String text)
	{
		return text.split(",|\n");
	}
	

}


