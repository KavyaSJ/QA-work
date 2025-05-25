package facebook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FBTestScript {
	
	public String getpara(String key)
	{
		FileInputStream f;
		String value = null;
		try {
			f=new FileInputStream("C:\\Users\\ksjad\\eclipse-workspace\\preparation\\src\\test\\java\\facebook\\FBlocators.properties");
			Properties p = new Properties();
			p.load(f);
			 value = p.getProperty(key);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
		
		}
	public WebElement findelement(String k, WebDriver driver)
	{
		FBTestScript obj = new FBTestScript();
		WebElement ele = null;
		String data=obj.getpara(k);
		String[] eleDetails=data.split(":");
		switch(eleDetails[0])
		{
		case "id" :
			ele=driver.findElement(By.id(eleDetails[1]));
			break;
		case "className" :
			ele=driver.findElement(By.className(eleDetails[1]));
			break;
			
		case "cssSelector" :
			ele=driver.findElement(By.cssSelector(eleDetails[1]));
			break;
			
		case "linkText" :
			ele=driver.findElement(By.linkText(eleDetails[1]));
			break;
			
		case "name" :
			ele=driver.findElement(By.name(eleDetails[1]));
			break;
			
		case "partialLinkText" :
			ele=driver.findElement(By.partialLinkText(eleDetails[1]));
			break;
		case "tagName" :
			ele=driver.findElement(By.tagName(eleDetails[1]));
			break;
		case "xpath" :
			ele=driver.findElement(By.xpath(eleDetails[1]));
			break;
		default :
			System.out.println("unkown locator");
			
			
			
		}
		return ele;
		
	}

}
