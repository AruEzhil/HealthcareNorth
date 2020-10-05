package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchSymptoms {
	
	
	
	
	@FindBy(xpath="//a[@href='searchsymptoms.php']/span")
	public static  WebElement  searchsym;
	
	@FindBy(xpath="//span[@class='logo']")
	public static  WebElement heading;
	
	@FindBy(id="search")
	public static WebElement text;
	
	@FindBy(name="submit")
	public static WebElement submit;

}
