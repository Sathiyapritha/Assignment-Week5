package week5.testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends Baseclass {

	
@Test	
	public void runCreatLead() throws InterruptedException 
		{
			
			
	// create lead button
			driver.findElement(By.linkText("Leads")).click();
			Thread.sleep(1000);
				
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sathiya");
			
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Pritha");
			
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("MRS");
			driver.findElement(By.name("departmentName")).sendKeys("Software Testing");
			
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Hello Test Leaf!!!");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xyadsd@gmail.com");
	
	// Select web elements
			
			WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			  Select city = new Select(state);
			  city.selectByVisibleText("New York");
			  //Thread.sleep(1000);
			  
	//click on create lead button		  
			  
			  driver.findElement(By.name("submitButton")).click();
		
}

}