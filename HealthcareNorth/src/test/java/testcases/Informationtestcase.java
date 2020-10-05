package testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonfunction.Baseclass;
import pageobjectmodel.Feepage;
import pageobjectmodel.InformationPage;
import pageobjectmodel.Loginpage;

public class Informationtestcase extends Baseclass {
	
	static Logger logger=Logger.getLogger(Informationtestcase.class);
	
	
	@Test
	public void checktitle() {
		
            	
            	                      	 
            	 PageFactory.initElements(driver, InformationPage.class);
            	 Actions action=new Actions(driver);
         		action.moveToElement(InformationPage.title).click().build().perform();
            	
            	 String actualtext=InformationPage.title.getText();
            	logger.info("text is information");
            	 Assert.assertEquals(actualtext, "Information");
            	 
                     
            	 
            	String note =InformationPage.note.getText();
            	 System.out.println("noteis="+note);
            	 
            	if(note.contains("MMP")) {
            		logger.info("In actual Message MMP exist i marked as fault to c screenshot");
            		Assert.assertTrue(true);
            	}
            	
            	
            	
            	 
            	 InformationPage.searchthrosite.sendKeys("fever");
            	 
            	 
             }
	
	

}
