package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CuraHealthCare {

	WebDriver driver;
	
	@BeforeMethod
	public void commonsetup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rudre\\Downloads\\chromedriver-win64-23rdJune\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void automationscript() {
		WebElement appointment_button = driver.findElement(By.id("btn-make-appointment"));
		appointment_button.click();
		
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
	
	
}
