package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
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
	public void automationscript() throws InterruptedException {
		WebElement appointment_button = driver.findElement(By.id("btn-make-appointment"));
		appointment_button.click();
		
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.id("btn-login")).click();
		
		
		WebElement facility_dropdown = driver.findElement(By.id("combo_facility"));
		Select sel = new Select(facility_dropdown);
		sel.selectByVisibleText("Seoul CURA Healthcare Center");
		
		
		driver.findElement(By.className("checkbox-inline")).click();
		driver.findElement(By.id("radio_program_none")).click();
		driver.findElement(By.id("txt_visit_date")).click();
		
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
	
	
}
