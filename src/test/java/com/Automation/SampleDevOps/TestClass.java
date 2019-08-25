package com.Automation.SampleDevOps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Class for testing
public class  TestClass {
	
static  WebDriver driver;

@BeforeMethod
public static void launchBrowse()
{
	System.setProperty("webdriver.chrome.driver", "F:\\System Eclipse Projects\\SeleniumTest\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@Test
public static void methodTest1()
{
	driver.get("https://www.google.co.in/");
	System.out.println("1 method");
}

@Test
public static void methodTest2()
{
	driver.get("https://www.google.co.in/");
	System.out.println("2 method");
}

@AfterMethod
public static void closeBrowser()
{
	driver.close();
}

}
