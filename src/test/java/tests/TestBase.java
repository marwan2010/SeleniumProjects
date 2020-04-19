package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	public static WebDriver driver ;
	public static  Actions action; 
	  JavascriptExecutor js ;	
	String baseUrl="http://ryadiyworld.com/";
	//Store current project workspace location in a string variable ‘path’
	String workingDir = System.getProperty("user.dir");
	String driverPath=workingDir+"\\drivers\\geckodriver.exe"; 
	String autoIt=workingDir+"\\drivers\\"; 
	
	public String imagePath=workingDir+"\\Uploads\\";
	

	
	@BeforeSuite
	public void startDriver() {
		//Mention the location of GeckoDriver in localsystem
		System.setProperty("webdriver.gecko.driver", driverPath);
		// Object is created- Chrome browser is opened
		driver= new FirefoxDriver();
		// maximize browser
		driver.manage().window().maximize();
		// Open webpage
	    driver.get(baseUrl);
	    

	}
	
	/* @Test
		public void user() {
	        System.out.print("lunchGood"); 

		}*/
	
	
}
