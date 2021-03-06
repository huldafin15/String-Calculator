import static org.junit.Assert.*;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class StringCalcClassTest {

	@Before
	public void beforetest() 
	{
		System.out.println("Test has begun");
	}
	
	@After
	public void aftertest() 
	{
		System.out.println("Test has ended");
	}
	
	@Test
	public void ShouldReturnZeroWithEmptyString() 
	{
		StringCalcClass ssc = new StringCalcClass();
		
		final int num = ssc.add("");
		
		Assert.assertEquals(0, num);
		
	}	
	
	@Test
	public void ShouldReturnTenWithStringThreeAndThree() 
	{
		StringCalcClass ssc = new StringCalcClass();
		
		final int num = ssc.add("3,3");
		
		Assert.assertEquals(6, num);
		
	}
	
	@Test
	public void ShouldReturnFourWithOneNumberString() 
	{
		StringCalcClass ssc = new StringCalcClass();
		
		final int num = ssc.add("4");
		
		Assert.assertEquals(4, num);
		
	}
	
	@Test
	public void ManyNumbersInString() 
	{
		StringCalcClass ssc = new StringCalcClass();
		
		final int num = ssc.add("4,5,6,5");
		
		Assert.assertEquals(20, num);
		
	}

	@Test
	public void TestBothSeperators() 
	{
		StringCalcClass ssc = new StringCalcClass();
		
		final int num = ssc.add("1\n2,3");
		
		Assert.assertEquals(6, num);
		
	}
	
	@Test
	public void NegativeNumbersNotAllowed() 
	{
		try 
		{	
			StringCalcClass ssc = new StringCalcClass();
			final int num = ssc.add("2,4,3,5");
		}
		catch (RuntimeException e)
		{
			System.out.println(e.getMessage());
			Assert.assertEquals(true, e.getMessage().startsWith("Negatives not allowed:"));
		}
	}
	
	@Test
	public void NumbersBiggerThanThousandIgnored() 
	{
		StringCalcClass ssc = new StringCalcClass();
		
		final int num = ssc.add("1001,2");
		
		Assert.assertEquals(2, num);
		
	}
}
