package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/checkbox.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[@id='contentblock']/section/div/div[1]/input[1]")).click();
	driver.findElement(By.xpath("//div[@id='contentblock']/section/div/div[3]/input[1]")).click();
	WebElement enabledCheckbox = driver.findElement(By.xpath("//div[@id='contentblock']/section/div[2]/div/input[1]"));
	boolean enabled = enabledCheckbox.isSelected();
	System.out.println(enabled);
	WebElement enabledCheckbox1 = driver.findElement(By.xpath("//section[@class='innerblock']/div[3]/div[1]/input"));
	WebElement enabledCheckbox2 = driver.findElement(By.xpath("//section[@class='innerblock']/div[3]/div[2]/input"));
	boolean enabled1 = enabledCheckbox1.isSelected();
	System.out.println(enabled1);
	if(enabledCheckbox1.isSelected())
	{
		driver.findElement(By.xpath("//section[@class='innerblock']/div[3]/div[1]/input")).click();
	}
	boolean enabled2 = enabledCheckbox2.isSelected();
	System.out.println(enabled2);
	if(enabledCheckbox2.isSelected())
	{
		driver.findElement(By.xpath("//section[@class='innerblock']/div[3]/div[2]/input")).click();
	}
	
	driver.findElement(By.xpath("//section[@class='innerblock']/div[4]/div[1]/input")).click();
	driver.findElement(By.xpath("//section[@class='innerblock']/div[4]/div[2]/input")).click();
	driver.findElement(By.xpath("//section[@class='innerblock']/div[4]/div[3]/input")).click();
	driver.findElement(By.xpath("//section[@class='innerblock']/div[4]/div[4]/input")).click();
	driver.findElement(By.xpath("//section[@class='innerblock']/div[4]/div[5]/input")).click();
	
	
}
}
