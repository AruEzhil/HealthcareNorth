package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonfunction.Baseclass;
import pageobjectmodel.Feepage;
import pageobjectmodel.Loginpage;

public class Feetestcase extends Baseclass{
	
	
	
	
	
	@Test
	public void feestructure() {
		
		PageFactory.initElements(driver, Feepage.class);
		Actions action=new Actions(driver);
		action.moveToElement(Feepage.feelink).click().build().perform();
		
		
		String coloris=Feepage.feedetails.getAttribute("style");
		System.out.println("coloris="+coloris);
		String mytext=Feepage.feedetails.getText();
		System.out.println("mytext="+mytext);
       Feepage.pay.click();
        
       int position=0;
       for( WebElement Fees:Feepage.selectpay) {
    	   System.out.println(Fees.getText());
    	   position++;
    	   if(position==3) {
    		  Fees.click();
    		  break;
    	   }
    	   
       }
		
      Feepage.continuefee.click();
       Feepage.Feename.sendKeys("Ezhil Hello");
       Select select=new Select(Feepage.selectcard);
       select.selectByVisibleText("American Express");
       
       Feepage.cardno.sendKeys("12345678");
       Select selectmonth=new Select(Feepage.cardmonth);
       selectmonth.selectByVisibleText("September (09)");
       Select selectyear=new Select(Feepage.cardyear);
       selectyear.selectByVisibleText("2023");
       Feepage.codeno.sendKeys("123");
       
       Feepage.feesubmit.click();   // Not working this button  */
      
		
	}

}
