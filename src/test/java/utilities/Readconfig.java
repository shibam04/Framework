package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readconfig 
{
  Properties pro;
   public Readconfig()
  {
	  File src=new File("./configuration/config.properties");
	  try {
	  FileInputStream fi = new FileInputStream(src);
	
	
	  pro=new Properties();
		pro.load(fi);
	} catch (IOException e) {
		e.printStackTrace();
	}
  }
  public String url()
  {
	  String url=pro.getProperty("URL");
	  return url;
  }
  public String chromekey()
  {
	  String ckey=pro.getProperty("ckey");
	  return ckey;
  }
  public String chromevalue()
  {
	  String cvalue=pro.getProperty("cvalue");
	  return cvalue;
  }
  public String firefoxkey()
  {
	  String fkey=pro.getProperty("fkey");
	  return fkey;
  }
  public String firefoxvalue()
  {
	  String fvalue=pro.getProperty("fvalue");
	  return fvalue;
  }
  public String excel()
  {
	  String excel=pro.getProperty("excel");
	  return excel;
  }
  public String excel1()
  {
	  String excel1=pro.getProperty("excel1");
	  return excel1;
  }
  public String screenshot()
  {
	  String screenshot=pro.getProperty("URL");
	  return screenshot;
  }
 
  public String browser()
  {
	  String browser=pro.getProperty("browser");
	  return browser;
  }
}
