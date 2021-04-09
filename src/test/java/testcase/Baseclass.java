package testcase;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import utilities.Readconfig;
import utilities.Screenshot1;

public class Baseclass 
{
	static Readconfig read=new Readconfig();
	public String url=read.url();
	public String ckey=read.chromekey();
	public String cvalue=read.chromevalue();
	public String fkey=read.firefoxkey();
	public String fvalue=read.firefoxvalue();
	public static String excel=read.excel();
	public String excel1=read.excel1();
	public static String screenshot=read.screenshot();
	public String browser=read.browser();
    static public  WebDriver driver;
    DateFormat custom=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
	Date currentdate=new Date();
	String name=custom.format(currentdate);
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
		
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty(ckey, cvalue);
		  driver=new ChromeDriver();
	  }
	  else  if(browser.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty(fkey, fvalue);
		  driver=new FirefoxDriver();
	  }
	  driver.get(url);
	}
	@AfterMethod
	public void exit(ITestResult result) throws IOException
	{
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
		  Screenshot1.screen(name);
		}
	}

		

	
	
	
}
