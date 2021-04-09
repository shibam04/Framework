package testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utilities.Screenshot1;

public class Testdata 
{
	
  public void testsample(WebDriver driver,String name,WebElement task) throws IOException
  {
	  WebDriverWait w=new WebDriverWait(driver,20);
	  if(w.until(ExpectedConditions.elementToBeClickable(task)) != null)
	  {
		  task.click();
		  Assert.assertTrue(true);
	  }
	  else
	  {
		  Screenshot1.screen(name);
		  Assert.assertTrue(false);
	  }
	 
	  
  }
  public Testdata(WebDriver driver)
  {
	  PageFactory.initElements(driver, Testdata.class);
  }
  }

