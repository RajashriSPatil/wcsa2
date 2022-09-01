package testngpack;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@Test
	public void test1() 
	{
		Reporter.log("test 1 method",true);
	}
	@Test
	public void test2()
	{
		Reporter.log("test 2 method",true);
	}
	@BeforeMethod
	public void method1()
	{
		Reporter.log("before method annotation",true);
	}
	@BeforeClass
	public void method2()
	{
		Reporter.log("before class annotation",true);
	}
	@BeforeTest
	public void method3()
	{
		Reporter.log("before test annotation",true);
	}
	@BeforeSuite
	public void method4()
	{
		Reporter.log("before suite annotation",true);
	}
	@AfterMethod
	public void method5()
	{
		Reporter.log("after method annotation",true);
	}
	@AfterClass
	public void method6()
	{
		Reporter.log("after class annotation",true);
	}
	@AfterTest
	public void method7()
	{
		Reporter.log("after test annotation",true);
	}
	@AfterSuite
	public void method8()
	{
		Reporter.log("after suite annotation",true);
	}

}



