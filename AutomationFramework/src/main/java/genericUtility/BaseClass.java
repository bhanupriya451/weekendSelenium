package genericUtility;

import org.openqa.selenium.WebDriver;

public class BaseClass {
	public static ExtentReports extReport;
	public static WebDriver driver;
	
	public JavaUtility jUtill=new JavaUtility();
	public WebDriverUtility wUtil=new WebDriverUtility();
	public FileUtility fUtil=new FileUtility();
	
	@BeforeSuite
	public void reportConfig() {
		ExtentSpark
		
	}
	

}
