package testcases;

import static org.testng.Assert.assertTrue;

import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonfunction.Baseclass;
import pageobjectmodel.InformationPage;
import pageobjectmodel.Loginpage;
import pageobjectmodel.Profilepage;
import pageobjectmodel.Scheduleappointmentpage;

public class Scheduleappointmenttestcase extends Baseclass {
		
	
	
	
	@Test
	public void appointment() {
	 
	String scheduledate=property.getProperty("dateschedule");
	
		
		PageFactory.initElements(driver,Scheduleappointmentpage.class );
		 Actions action=new Actions(driver);
  		action.moveToElement(Scheduleappointmentpage.Schedule).click().build().perform();
		
		Actions actioncreate=new Actions(driver);
		
		actioncreate.moveToElement(Scheduleappointmentpage.Createnew).click().build().perform();
		
	Set<String> handles=driver.getWindowHandles();
	for(String newwindow:handles) {
		driver.switchTo().window(newwindow);
	}

	Scheduleappointmentpage.Bookappointment.click();
	    driver.switchTo().frame("myframe");
	
		Scheduleappointmentpage.calendar. click();
		
		Scheduleappointmentpage.dates.click();
	
		Select select=new Select(Scheduleappointmentpage.time);
		select.selectByValue(property.getProperty("timesche"));
		Scheduleappointmentpage.continuebtn.click();
		Scheduleappointmentpage.symt.sendKeys("fever corona");
		Scheduleappointmentpage.submitbutton.click();
		int columnno=Scheduleappointmentpage.columncount.size();
		System.out.println("columnno is"+ columnno);
		int rowno=Scheduleappointmentpage.rowcount.size();
		System.out.println("rowno is"+ rowno);
		
		HashMap<String,String> hmap= new HashMap<String, String>();
		hmap.put(Scheduleappointmentpage.Appointment.get(10).getText().trim(),Scheduleappointmentpage.Doctor.get(10).getText().trim());
		  
		    System.out.println("key value pair is="+hmap.entrySet());
		    
     if (hmap.containsKey("corona")) {
    	 System.out.println("true");
    	
     }else {
    	 System.out.println("false");
     }
     
		
		
	
		
	
	
		
		
		
		
	}
	

}
