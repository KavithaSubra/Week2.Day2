package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.opencart.com/index.php?route=account/register");
	driver.findElement(By.xpath("//input[@id = 'input-username']")).sendKeys("kavi");
	driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Kavi");
	driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys("S");
	driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("kavi@gmail.com");
	WebElement country = driver.findElement(By.xpath("//select[@id = 'input-country']"));
    Select countryoption = new Select(country);
    countryoption.selectByValue("99");
    driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("opencart");
   /* WebElement image = driver.findElement(By.xpath("//div[@class='bg-info']"));
    System.out.println(image.getText());*/
   /* driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();*/
}
}
