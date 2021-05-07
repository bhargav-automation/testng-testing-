package ITestListners;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ITestListners.Listners.class)
public class file1 {
	
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test
	public void test2()
	{
		Assert.assertTrue(false);
		System.out.println("test2");
	}
	
	@Test(dependsOnMethods = {"test2"})
	public void test3()
	{
		System.out.println("test3");
	}

}
