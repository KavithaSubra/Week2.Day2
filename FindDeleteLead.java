package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindDeleteLead {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
	    driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		WebElement countryCode = driver.findElement(By.name("phoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("1");
		driver.findElement(By.xpath("//input[contains(@name,'phoneAreaCode')]")).sendKeys("044");
		driver.findElement(By.xpath("//input[contains(@name,'phoneNumber')]")).sendKeys("9987654321");
		WebElement findLeadsButton = driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]"));
		findLeadsButton.click();
		Thread.sleep(2000);
		
		WebElement leadID = driver.findElement(By.xpath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		String text = leadID.getText();
		System.out.println("Lead ID is: " + text);
		Thread.sleep(2000);
		
		leadID.click();
		driver.findElement(By.linkText("Delete")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		
		driver.findElement(By.xpath("//input[@name = 'id']")).sendKeys(text);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(2000);
		
		WebElement message = driver.findElement(By.xpath("//div[contains(text(),'No records to display')]"));
		String text2 = message.getText();
		String verify = "No records to display";

		if (verify.equalsIgnoreCase(text2)) {
			System.out.println("The Lead is deleted successfully");

		} else {
			System.out.println("Lead is not deleted");
		}

		driver.close();

	}

}
