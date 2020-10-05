package Arman.Bangalore;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class heelTest {
	
	@Test
	public void shoe()
	{
		System.out.println("shoe");
	}
	
	@BeforeTest
	public void slip()
	{
		System.out.println("shoebefore");
	}

}
