package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Profilepage {
	
	@FindBy(xpath="//*[@href='profile.php']")
	public static WebElement profilepage;
	@FindBy(id="fname")
	public static WebElement fname;
	@FindBy(id="lname")
	public static WebElement lname;
	@FindBy(id="licn")
	public static WebElement licence;
	@FindBy(id="ssn")
	public static WebElement ssn;
	@FindBy(id="addr")
	public static WebElement Address;
	@FindBy(id="age")
	public static WebElement Age;
	@FindBy(id="weight")
	public static WebElement Weight;
	@FindBy(id="height")
	public static WebElement Height;
	@FindBy(id="city")
	public static WebElement City;
	@FindBy(id="state")
	public static WebElement State;
	@FindBy(id="zip")
	public static WebElement Zipcode;
	@FindBy(id="proinfo")
	public static WebElement ProviderInfo;
	@FindBy(id="Insinfo")
	public static WebElement Insurance;
	@FindBy(id="Ebtn")
	public static WebElement Editbtn;
	@FindBy(xpath=("//*[@href='viewhistory.php']"))
	public static WebElement ViewHistory;
	@FindBy(xpath=("//*[@href='viewreports.php']"))
	public static WebElement ViewReports;
	@FindBy(id="Sbtn")
	public static WebElement Savebtn;
	
}
