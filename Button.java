package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leafground.com/pages/Button.html");
	driver.findElement(By.xpath("//button[@id='home']")).click();
	driver.findElement(By.xpath("//h5[contains(text(),'Button')]")).click();
	WebElement position = driver.findElement(By.xpath("//button[@id='position']"));
	System.out.println(position.getLocation());  
	WebElement color = driver.findElement(By.xpath("//button[@id='color']"));
	System.out.println(color.getAttribute("background-color"));  
	WebElement sizes = driver.findElement(By.xpath("//button[@id='size']"));
	System.out.println(sizes.getSize()); 	
}
}
