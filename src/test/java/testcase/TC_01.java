package testcase;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.login;


public class TC_01 extends Baseclass
{
 
	
  @Test(dataProvider="data",dataProviderClass=utilities.Xutils.class)
  public void tc1(String user,String password) throws IOException
  {
	  login l=new login(driver);
	  l.setusername(user);
	  l.setpassword(password); 
	  l.click();
	  WebElement t=l.task();
	  WebDriverWait w=new WebDriverWait(driver,20);
	 if( w.until(ExpectedConditions.elementToBeClickable(t)) != null)
	 {
		 t.click();
		 Assert.assertTrue(true);
	 }
	 else
	 {
		 Assert.fail();
	 }
  
	 

	 
	
	  
  }
}
