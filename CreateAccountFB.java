package Week2.Day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccountFB {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[@data-testid = 'open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Kavitha");
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("S");
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("ABC@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("aAbBcC");
		
		WebElement day = driver.findElement(By.xpath("//select[@id = 'day']"));
		WebElement month = driver.findElement(By.xpath("//select[@id = 'month']"));
		WebElement year = driver.findElement(By.xpath("//select[@id = 'year']"));

		Select dropdown1 = new Select(day);
		Select dropdown2 = new Select(month);
		Select dropdown3 = new Select(year);

		int size = dropdown2.getOptions().size();

		dropdown1.selectByVisibleText("23");
		dropdown2.selectByIndex(size-7);
		dropdown3.selectByValue("1999");
		
		WebElement gender = driver.findElement(By.xpath("//div[contains(text(),'Gender')]/following-sibling::span//label[contains(text(), 'Female')]"));
		gender.click();
		
		driver.findElement(By.xpath("//button[@name = 'websubmit']")).click();
		
		driver.close();
		

		
		
		
	}

}
