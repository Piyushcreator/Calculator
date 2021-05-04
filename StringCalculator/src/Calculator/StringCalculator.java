package Calculator;

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
			String numberlist[]= number.split(",|\n");
			int sum = 0;
			
			for(int i =0;i<numberlist.length;i++)
			{
				int nextNumber= Integer.parseInt(numberlist[i]);			
				sum += nextNumber ;
				
			}
			return sum;
		}
		
	}
	

}


