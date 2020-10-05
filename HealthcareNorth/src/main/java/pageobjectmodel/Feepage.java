package pageobjectmodel;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Feepage {
	
	
	@FindBy(xpath="//*[@href='fees.php']")
	public static WebElement feelink;
	
	@FindBy(xpath=("//*[text()='Fee details']"))
	public static WebElement feedetails;
	
	@FindBy(xpath=("//*[text()='Your Outstanding Fee']"))
	public static WebElement Outstandingfee;
	
	@FindBy(xpath=("//*[@href='paynow.php']"))
	public static WebElement pay;
	
	@FindBys(@FindBy(xpath=("//select[@id='amount']//following::option")))
	public static List<WebElement> selectpay;
	
	@FindBy(xpath=("//*[@type='submit'][@value='Continue']"))
	public static WebElement continuefee;
	@FindBy(id=("name"))
	public static WebElement Feename;
	@FindBy(id=("card_name"))
	public static WebElement selectcard;
	@FindBy(id=("cid"))
	public static WebElement cardno;
	@FindBy(id=("cardMonth"))
	public static WebElement cardmonth;
	@FindBy(id=("cardYear"))
	public static WebElement cardyear;
	@FindBy(id=("cvv"))
	public static WebElement codeno;
	@FindBy(xpath=("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/form/p/input"))
	public static WebElement feesubmit;
	
}
