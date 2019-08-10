package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Property {
	
	public static String getPropertyValue(String filePath,String key)
	{
		String value="";
		Properties property=new Properties();
		try {
			property.load(new FileInputStream(filePath));
			value=property.getProperty(key);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return value;
	}
	
	public static void action_Move_To_Element(WebDriver driver,WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	
	
	public static boolean IsTestElementPresent(WebDriver driver,String element)
	  {
	      try
	      {
	          driver.findElement(By.xpath(element)).isDisplayed();
	          return true;
	      }
	      catch (Exception e)
	      {
	    	  System.out.println("exception  =  "+e);
	          return false;
	      }
	  }
	
	

}
