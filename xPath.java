package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xPath {
public static void main(String[] args) {
	//Setup the Driver
	
	WebDriverManager.chromedriver().setup();
	//WebDriverManager.firefoxdriver().setup();

	//System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe)
	//Launch the Browser
	
	ChromeDriver driver = new ChromeDriver();
	//FirefoxDriver driver = new FirefoxDriver();
	//Load URL
	
	driver.get("http://leaftaps.com/opentaps");
	//Maximize the browser
	driver.manage().window().maximize();
	//Get the title
	String title = driver.getTitle();
	System.out.println(title);	
	//Enter the username
	WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
	userName.sendKeys("DemoCSR");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	//click on Login button
	driver.findElement(By.xpath("//input[@type = 'submit']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
	
	/*driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kavitha");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
	WebElement dd = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select dropdown = new Select(dd);
	dropdown.selectByVisibleText("Website");
	driver.findElement(By.className("smallSubmit")).click();
	driver.close();*/
}
}