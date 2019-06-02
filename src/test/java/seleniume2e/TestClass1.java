package seleniume2e;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bsh.Remote;

public class TestClass1 {

	public static WebDriver driver;

	 public static final String USERNAME = "aniruddha18";
	  public static final String AUTOMATE_KEY = "XfG5PqzQdnprsbsDmxYK";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	  
	@BeforeMethod
	public void launchDriver() {
		
		DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browser", "Chrome");
	    caps.setCapability("browser_version", "73.0");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "8.1");
	    caps.setCapability("resolution", "1024x768");
	    caps.setCapability("name", "Bstack-[Java] Sample Test");
	    caps.setCapability("project", "AutomationProjectE2E");
	    caps.setCapability("build", "Build1");
	    caps.setCapability("name", "TestCaseName");
	    
			try {
				driver = new RemoteWebDriver(new URL(URL), caps);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().fullscreen();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}   	
	}
	
	@Test
	public void test1() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void test2() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void test3() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}
}
