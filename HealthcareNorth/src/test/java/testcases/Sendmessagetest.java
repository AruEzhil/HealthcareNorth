package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonfunction.Baseclass;
import pageobjectmodel.Loginpage;
import pageobjectmodel.SearchSymptoms;
import pageobjectmodel.Sendmessagepage;


public class Sendmessagetest extends Baseclass {
	
	
	
	@Test
	public void messagemodule() {
		
		PageFactory.initElements(driver,Sendmessagepage.class);
		Actions action=new Actions(driver);
  		action.moveToElement(Sendmessagepage.messages).click().build().perform();
		
		Sendmessagepage.ContactReason.sendKeys("flu");
		Sendmessagepage.Subject.sendKeys("Been sick for the past 10 days");
		Sendmessagepage.Send.click();
		Alert alert=driver.switchTo().alert();
		String textis=alert.getText();
		System.out.println("textis="+textis);
		alert.accept();
	}

}
