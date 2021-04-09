package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login 
{
	
  
  @FindBy(xpath="//input[@name='username']")
   WebElement username;
  @FindBy(xpath="//input[@name='pwd']")
  WebElement password;
  @FindBy(xpath="//a[@id='loginButton']/div[contains(.,'Login ')]")
  WebElement login;
  @FindBy(xpath="//tr/descendant::td[contains(.,'Enter Time-Track') and @class='pagetitle']")
  WebElement title;
  @FindBy(xpath="//div[@id='addTaskButtonId']")
  WebElement task;
 
  public login(WebDriver x)
  {
	  PageFactory.initElements(x, this);
  }
  
  public void setusername(String user)
  {
	  username.sendKeys(user);
  }
  public void setpassword(String pass)
  {
	 password.sendKeys(pass);
  }
  public void click()
  {
	login.click();
  }
  public WebElement title()
  {
	  return title;
  }
  public WebElement task()
  {
	  return task;
  }
 
}
