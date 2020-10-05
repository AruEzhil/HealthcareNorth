package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class Sendmessagepage {
	
	

	@FindBy(xpath=("/html/body/div/div/div[1]/div/ul/li[8]/a/span"))
	public static WebElement messages;
	
	@FindBy(id="subject")
	public static WebElement ContactReason;
	

	@FindBy(id="message")
	public static WebElement Subject;
	
	@FindBy(xpath="//*[@type='submit'][@value='Send']")
	public static WebElement Send;

	

	
	
	
}
