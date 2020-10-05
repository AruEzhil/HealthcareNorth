package pageobjectmodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Scheduleappointmentpage {
	
	@FindBy(xpath=("//*[@href='sheduleappointments.php']"))
	public static WebElement Schedule;
	
	@FindBy(xpath=("//*[@type='submit'][@value='Create new appointment']"))
	public static WebElement Createnew;
	
	
	@FindBy(xpath=("//*[text()='Dr.Smith']/ancestor::ul/following-sibling::button"))
	public static WebElement Bookappointment;	
	
	
	@FindBy(xpath= ("//*[@id='datepicker']"))
	public static WebElement calendar;
	
	
	
	
	@FindBy(xpath=("//*[contains(text(),'30')]"))
	public static WebElement dates;
			
	@FindBy(id=("time"))
	public static WebElement time;
	
	@FindBy(xpath=("//*[@id=\"ChangeHeatName\"]"))
	public static WebElement continuebtn;

	@FindBy(id=("sym"))
	public static WebElement symt;

	@FindBy(xpath=("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[3]/input"))
	public static WebElement submitbutton;
	
	@FindBys(@FindBy(tagName=("th")))
	public static List<WebElement> columncount;
	
	@FindBys(@FindBy(tagName=("tr")))
	public static List<WebElement> rowcount;
	
	@FindBys(@FindBy(xpath="//table[@class='table']/tbody/tr/td[3]"))
	public static List<WebElement> Appointment;
	
	@FindBys(@FindBy(xpath="//table[@class='table']/tbody/tr/td[4]"))
	public static List<WebElement> Doctor;
	
	
	//@FindBy(xpath=("//td[normalize-space()='fever corona']//following::td[1]"))
    public static WebElement doctor;
}
