package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonfunction.Baseclass;
import excel.utility.Xls_Reader;
import pageobjectmodel.InformationPage;
import pageobjectmodel.Loginpage;
import pageobjectmodel.Profilepage;

public class ProfileTestcases extends Baseclass {
	
	
	
	
	
	
	@Test
	public void profilee(){
		
		PageFactory.initElements(driver, Profilepage.class);
		Actions action=new Actions(driver);
 		action.moveToElement(Profilepage.profilepage).click().build().perform();
		
		Xls_Reader reader1=new Xls_Reader("C:\\Users\\vigne\\eclipse-workspace\\Selenium-Testing\\src\\basicsOfJava\\NorthAmericalMedical\\src\\test\\java\\exceldata\\Profile.xlsx");
		Profilepage.fname.sendKeys(reader1.getCellData("Sheet1", "Fname", 2));
		Profilepage.lname.sendKeys(reader1.getCellData("Sheet1", "Lname", 2));
		Profilepage.licence.sendKeys(reader1.getCellData("Sheet1", "Licence", 2));
		Profilepage.ssn.sendKeys(reader1.getCellData("Sheet1", "ssn", 2));
		Profilepage.Address.sendKeys(reader1.getCellData("Sheet1", "Address", 2));
		Profilepage.Age.sendKeys(reader1.getCellData("Sheet1", "Age", 2));
		Profilepage.Weight.sendKeys(reader1.getCellData("Sheet1", "Weight", 2));
		Profilepage.Height.sendKeys(reader1.getCellData("Sheet1", "Height", 2));
		Profilepage.City.sendKeys(reader1.getCellData("Sheet1", "City", 2));
		Profilepage.State.sendKeys(reader1.getCellData("Sheet1", "State", 2));
		Profilepage.Zipcode.sendKeys(reader1.getCellData("Sheet1", "ZipCode", 2));
		Profilepage.ProviderInfo.sendKeys(reader1.getCellData("Sheet1", "ProviderInformation", 2));
		Profilepage.Insurance.sendKeys(reader1.getCellData("Sheet1", "InsuranceInformation", 2));
		Profilepage.Editbtn.click();
		Profilepage.Savebtn.click();
		
		Alert alert=driver.switchTo().alert();
		String alerttext=alert.getText();
		System.out.println("alerttext is="+alerttext);
		alert.accept();
		
		
		
	}
	
	
	
	

}
