


public class StringCalcClass 
{
	
	public int add(String num)
	{
		if(num.isEmpty())
		{
			return 0;
		}
		else if (!num.contains(","))
		{
				return Integer.valueOf(num);
		}
			
		String[] result = num.split("(,)|(\n)");
		int sum = 0;
		String neikvadar ="";
		for(int i = 0; i<result.length; i++)
		{  
			if(Integer.valueOf(result[i]) < 0)	
					{
						neikvadar += result[i] + ",";
					}
			sum += Integer.valueOf(result[i]);	
		}
		
		if(neikvadar.length() > 0)
		{
		throw new RuntimeException("Negatives not allowed:" + neikvadar);
		}
		
		
		return sum;			
	}
}
