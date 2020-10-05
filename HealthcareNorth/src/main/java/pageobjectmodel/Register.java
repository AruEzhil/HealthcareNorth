package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register {
	
	@FindBy(xpath=("//*[@href='portal/registration.php']"))
	public static WebElement registerbutton;
	
	@FindBy(id="firstname")
	public static WebElement firstname;
	@FindBy(id="lastname")
	public static WebElement lastname;
	@FindBy(id="datepicker")
	public static WebElement dob;
	@FindBy(id="license")
	public static WebElement licence;
	@FindBy(id="ssn")
	public static WebElement ssn;
	@FindBy(id="state")
	public static WebElement state;
	@FindBy(id="city")
	public static WebElement city;
	@FindBy(id="address")
	public static WebElement address;
	@FindBy(id="zipcode")
	public static WebElement zipcode;
	@FindBy(id="age")
	public static WebElement age;
	@FindBy(id="height")
	public static WebElement height;
	@FindBy(id="weight")
	public static WebElement weight;
	@FindBy(id="pharmacy")
	public static WebElement pharmacy;
	@FindBy(id="pharma_adress")
	public static WebElement pharadd;
	@FindBy(id="email")
	public static WebElement Email;	
	@FindBy(id="password")
	public static WebElement paswrd;
	@FindBy(id="username")
	public static WebElement usename;
	@FindBy(id="confirmpassword")
	public static WebElement confirmpass;
	@FindBy(id="security")
	public static WebElement security;
	@FindBy(id="answer")
	public static WebElement answer;
	
	@FindBy(xpath=("//*[@type='submit'][@value='Save']"))
	public static WebElement sbtn;

}
