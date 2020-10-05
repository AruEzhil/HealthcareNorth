package testcases;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonfunction.Baseclass;
import pageobjectmodel.Loginpage;
import pageobjectmodel.Scheduleappointmentpage;
import pageobjectmodel.SearchSymptoms;

public class SearchSymptomtest extends Baseclass {
	
	
	
	
	@Test
	public void search() {
		
		PageFactory.initElements(driver, SearchSymptoms.class);
		 Actions action=new Actions(driver);
	  		action.moveToElement(SearchSymptoms.searchsym).click().build().perform();
		
	String header	=SearchSymptoms.heading.getText();
		System.out.println("header is="+header);
	     
		SearchSymptoms.text.sendKeys("flu");
		SearchSymptoms.submit.click();
		
	}
	
	

}
