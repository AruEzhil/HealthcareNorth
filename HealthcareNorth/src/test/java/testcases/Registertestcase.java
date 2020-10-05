package testcases;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonfunction.Baseclass;
import excel.utility.ExcelClass;
import excel.utility.Xls_Reader;
import pageobjectmodel.Loginpage;
import pageobjectmodel.Register;

public class Registertestcase extends Baseclass {
	

    
	
	
	public  static void registerclick() {
		
		
		Actions action=new Actions(driver);

		action.moveToElement(Register.registerbutton).click().build().perform();

		
		}
	

	
	
	
	@Test
	public static void registermethod() throws IOException {
		PageFactory.initElements(driver, Register.class);
		
		registerclick();
		
	Xls_Reader reader=new Xls_Reader("C:\\Users\\vigne\\eclipse-workspace\\Selenium-Testing\\src\\basicsOfJava\\NorthAmericalMedical\\src\\test\\java\\exceldata\\Book5.xlsx");
		String first=reader.getCellData("Testdata","firstname", 2);
		System.out.println(first);
    Register.firstname.sendKeys(reader.getCellData("Testdata","firstname", 2));

	//reader.getCellData(sheetName, colName, rowNum)
	Register.lastname.sendKeys(reader.getCellData("Testdata","lastname",2));	
	           
	    
	Register.dob.sendKeys(reader.getCellData("Testdata","dob",2));	
	   
	    
	Register.dob.sendKeys(reader.getCellData("Testdata","licence",2));	
	    
	Register.licence.sendKeys(reader.getCellData("Testdata","ssn",2));	
	  
	    
	Register.ssn.sendKeys(reader.getCellData("Testdata","state",2));
	
	Register.state.sendKeys(reader.getCellData("Testdata","state",2));  
	Register.city.sendKeys(reader.getCellData("Testdata","city",2));	
	    
	Register.address.sendKeys(reader.getCellData("Testdata","address",2));	
	  
	Register.zipcode.sendKeys(reader.getCellData("Testdata","zipcode",2));	
	  
	Register.age.sendKeys(reader.getCellData("Testdata","age",2));	
	   
	Register.height.sendKeys(reader.getCellData("Testdata","height",2));	
	     
	Register.weight.sendKeys(reader.getCellData("Testdata","weight",2));	
	  
	Register.pharmacy.sendKeys(reader.getCellData("Testdata","pharmacy",2));	
	   
	Register.pharadd.sendKeys(reader.getCellData("Testdata","pharadd",2));	
	    
	Register.Email.sendKeys(reader.getCellData("Testdata","Email",2));	
	   
	Register.paswrd.sendKeys(reader.getCellData("Testdata","pawrd",2));	
	  
	Register.usename.sendKeys(reader.getCellData("Testdata","usename",2));	
	
	Register.confirmpass.sendKeys(reader.getCellData("Testdata","confirmpass",2));	
	    
	    
	    Select select=new Select(Register.security);
	    select.selectByVisibleText("what is your best friend name");
	   Register.answer.sendKeys("Browny"); 
	    
	   //Register.sbtn.click(); 
			
	}
	

}
     