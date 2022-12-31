package TestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass
{
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	public static ExtentTest test;
		
	public static  String idbmdate ="";
	public static  String idbcountry ="";
	public  static String wikidate ="";
	public static String wikicountry ="";
		
	public static String Idbmurl = "https://www.imdb.com/";
	public static String wikiUrl = "https://en.wikipedia.org/wiki/Main_Page";
	public static 	WebDriver driver;
	
	@BeforeTest

	public void browsetInt() 
	{
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
		
	}

	@AfterTest

	public void tearDown() 
	{
		driver.quit();
		extent.flush();
	}
	@BeforeSuite

	public void extentRepport() {
		reporter = new ExtentSparkReporter(".//Report//detail.html");
		reporter.config().setReportName("Sorting verify");
		reporter.config().setDocumentTitle("movieDetails");
		reporter.config().setTheme(Theme.DARK);

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Operating System", "WINDOWS-11");
		extent.setSystemInfo("Browser", "CHROME");
		extent.setSystemInfo("TestVagrant Assignment", "PIYUSH");
		extent.setSystemInfo("Contact Details", "+91 7387990147");
	}

	@AfterMethod
	public void TestStatus(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {
			test.fail(MarkupHelper.createLabel(result.getMethod().getMethodName() + "testcase Fail", ExtentColor.RED));
			

		}
		
		 if (result.getStatus() == ITestResult.SUCCESS) {
			test.pass(MarkupHelper.createLabel(result.getMethod().getMethodName() + "testcase pass", ExtentColor.GREEN));
		}
	}
}
