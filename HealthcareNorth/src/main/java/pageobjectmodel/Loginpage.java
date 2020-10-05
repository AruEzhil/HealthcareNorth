package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {

	
	

	
	
	@FindBy(xpath=("/html/body/section[1]/div/div/div/div[2]/a"))
	public static WebElement ulogin;
	
	@FindBy(xpath="(//*[@id=\"username\"])")
	public static WebElement unamee;
	
	@FindBy(id="password")
	public static WebElement upasss;

	@FindBy(name="submit")
	public static WebElement sub;
	
	
	
}
