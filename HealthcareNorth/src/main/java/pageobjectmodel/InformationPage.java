package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InformationPage  {

	@FindBy(xpath="//*[@href='information.php']")
	public static WebElement title;
	
	@FindBy(xpath="//*[@class='panel-title'][@style='font-size:18px']")
	public static WebElement note;
	
	@FindBy(xpath="//*[@placeholder='Search through site']")
	public static WebElement searchthrosite;
	
	
	
}
