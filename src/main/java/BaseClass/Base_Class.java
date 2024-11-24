package BaseClass;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		return driver;
	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public static void maxmizeWindow() {
		driver.manage().window().maximize();
	}

	public static void sendValues(WebElement element, String values) {
		element.sendKeys(values);
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void quitBrowser() {
		driver.quit();
	}

}
