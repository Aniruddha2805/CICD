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
	
	@BeforeMethod
	public void launchDriver() {
		DesiredCapabilities dr = null;
		dr = DesiredCapabilities.chrome();
		dr.setBrowserName("chrome");
		dr.setPlatform(Platform.WIN8_1);
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		try {
			System.out.println("Remote Driver Started");
			driver = new RemoteWebDriver(new URL("http://192.168.0.106:4444/wd/hub"), dr);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
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
