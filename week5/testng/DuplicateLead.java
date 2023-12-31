package week5.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DuplicateLead extends Baseclass {

	//TestNg decleration
@Test
	
	public  void runDuplicateLead () throws InterruptedException {
		
	// create duplicate lead text button
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
			  
					
 //For Duplicate page
		
	//Get title of thr resulting(current)page	
		  System.out.println("Page title : " +driver.getTitle());
			  
			     
	//Duplicate button parts starts here
		driver.findElement(By.linkText("Duplicate Lead")).click();
			
		//Get title of thr resulting(current)page	
		  System.out.println("Page title : " +driver.getTitle());	
		
  //Clear the elements and Re-enter part starts here
	
	//clear company name
		WebElement clearcmpny =driver.findElement(By.id("createLeadForm_companyName"));
		clearcmpny.clear();
		
 //Re-enter new company name	

	/*	WebElement rewrite = driver.findElement(Byid("createLeadForm_companyName"));
	     rewrite.sendKeys("Wipro");	Using id attribute*/
		
	  WebElement rewrite = driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
	     rewrite.sendKeys("Wipro");     
	     
	//clear first name
			WebElement clrfistnme =driver.findElement(By.id("createLeadForm_firstName"));
			clrfistnme.clear();
			
  //Re-enter new first name	     
			//driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Preetha"); Using normal id locator
		
			WebElement refirstnme = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
			refirstnme.sendKeys("Sivakumar");  //using xpath 
			
	    //click on Duplicate Lead button		  
		  
			driver.findElement(By.name("submitButton")).click();
							
			Thread.sleep(2000);
			
	//Get title of thr resulting(current)page	
		  System.out.println("Page title : " +driver.getTitle());
			
	   

	}

}

/* Page title : View Lead | opentaps CRM
Page title : Duplicate Lead | opentaps CRM
Page title : View Lead | opentaps CRM */

