package smoketest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Smoke_login {
	WebDriver driver;
	
	@Test
	
	public void login() throws Exception{
		try{
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://toolsqa.com/");
			//driver.findElement(By.xpath(".//*[@id='primary-menu']/li[1]/a/span[1]/span/span")).click();
			//
			driver.close();			
		}
		catch(Exception e)
		{
			throw(e);
		}
		finally{
			driver.close();
		}
		
	}
	

}
