package test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
public class day1 {
	
	
	@AfterSuite
	public void afterSuites()
	{
		System.out.println("I will be number 1 from last");
	}
	@AfterTest
		public void afterTest()
		{
			System.out.println("This will run last");
			System.out.println("Git Changes");
			System.out.println("Git Changes");
			
			//Changes by x user

		}
	
	@Test
	public void demo()
	{
		System.out.println("Hello");
	}
	@Test
	public void demo1()
	{
		System.out.println("Hello1");
	}
	@Test
	public void demo2()
	{
		System.out.println("world");
	}
	@Test
	public void demo3()
	{
		System.out.println("world2");
	}

}
