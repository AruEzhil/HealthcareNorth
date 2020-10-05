package commonfunction;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjectmodel.Loginpage;

@Listeners(listener.ListnerClass.class)
public class Baseclass {
	

	public static Properties property=null;
	 public static WebDriver driver=null;
	static Logger logger=Logger.getLogger(Baseclass.class);
	
	public Properties propertyfile() throws IOException {
		FileInputStream file=new FileInputStream("config.properties");
		 property=new Properties();
		property.load(file);
		return property;
		
	}
	@BeforeTest(alwaysRun=true)
	 public void launchbrowser() throws IOException {
		PropertyConfigurator.configure("log4j.properties");
	
		propertyfile();
		logger.info("loading the property file");
		String URL= property.getProperty("url");
	    String Browser=property.getProperty("browser");
	      
	    if(Browser.equalsIgnoreCase("chrome")) {
	    	WebDriverManager.chromedriver().setup();
	    	 driver=new ChromeDriver();
	    	
	    	
	    }
	    else if( Browser.equalsIgnoreCase("firefox")){
	    	WebDriverManager.firefoxdriver().setup();
	    	 driver=new FirefoxDriver();
	    	
	    }
	   driver.manage().deleteAllCookies();
	    driver.get(URL);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    enter();
	    
	    	
	    	}
	
	
	public void enter() {
    	PageFactory.initElements(driver, Loginpage.class);
    	//Loginpage.oficelogin.click();
    	Actions action=new Actions(driver);

    	action.moveToElement(Loginpage.ulogin).click().build().perform();

    	Loginpage.unamee.sendKeys(property.getProperty("uname"));
    	Loginpage.upasss.sendKeys(property.getProperty("pword"));
    	Loginpage.sub.click(); 
		 
	}
	
	public static void failed(String testMethodName) throws IOException {
		TakesScreenshot screenshot= (TakesScreenshot)driver;
	File Sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
	logger.info("failure");
	File destinationfile= new File("/Users/vigne/eclipse-workspace/Selenium-Testing/src/basicsOfJava/NorthAmericalMedical/screenshot/"+testMethodName+"_"+".png");
	FileUtils.copyFile(Sourcefile,destinationfile);
	

	
		
	}
		
	
	 
	 @AfterSuite
	 public void closebrowser() {
		 
	 WebElement teardown=driver.findElement(By.linkText("Logout"));
		teardown.click();
		
		 
	 }
	 
	 
	 
	//Website project:http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/index.php


}
