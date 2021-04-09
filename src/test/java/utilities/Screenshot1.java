package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

import testcase.Baseclass;

public class Screenshot1  extends Baseclass
{
   public static void screen(String name) throws IOException 
   {
	  TakesScreenshot s=(TakesScreenshot)driver;
	  File source=s.getScreenshotAs(OutputType.FILE);
	  File des=new File("./Screenshot0410/"+name+".png");
	  Files.copy(source, des);
	  System.out.println("Taken Screenshot");
   }
}
