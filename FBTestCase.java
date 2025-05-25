package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FBTestCase {
	WebDriver driver;
	FBTestScript ob=new FBTestScript();
	@BeforeMethod
	public void before()
	{
		  driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
	}
  @Test
  public void log()  
  {
	  
	 
	  ob.findelement("name", driver).sendKeys("kavya");;
	  ob.findelement("password", driver).sendKeys("kavy123");
	  ob.findelement("login", driver).click();
  }
  @Test
  public void recoverpass() 
  {
	
	  
	  ob.findelement("forgot", driver).click();
	
	  
  }
  @Test
  public void createAccount()
  {
	  ob.findelement("createAcc", driver).click();
	  
  }
}
