package week5.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {

	public ChromeDriver driver;
	public String String;
	
	
@BeforeMethod	
	
	public void precondition()
	{
	
	  // Launch the browser 
	  driver = new ChromeDriver();
	
   //To maximise the window		
		driver.manage().window().maximize();
			
   // Load URL 
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		// sytext to find username & password
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
		
		
	}


@AfterMethod
	public void postcondition()
{	
	driver.close();	
}
}
