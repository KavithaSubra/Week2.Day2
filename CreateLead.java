package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		/*driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_companyName']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_firstName']")).sendKeys("KK");	
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_lastName']")).sendKeys("S");
		Select options = new Select(driver.findElement(By.xpath("//select[@id = 'createLeadForm_dataSourceID']")));
		options.selectByVisibleText("Partner");*/
	}

}
