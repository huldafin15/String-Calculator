
public class StringCalcClass {
	
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
			
		String[] result = num.split(",");
		int sum = 0;
		for(int i = 0; i<result.length; i++)
		{
			sum += Integer.valueOf(result[i]);
		}
		return sum;		
	}
}
