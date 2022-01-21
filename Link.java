package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leafground.com/pages/Link.html");
	driver.findElement(By.xpath("//a[contains(text(),'Go to Home Page')]")).click();
	driver.findElement(By.xpath("//h5[contains(text(),'HyperLink')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Find where am supposed to go without clicking me?')]")).click();
	driver.findElement(By.xpath("//button[@id='home']")).click();
	driver.findElement(By.xpath("//h5[contains(text(),'HyperLink')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Verify am I broken?')]")).click();
	String title = driver.getTitle();
	if (title.contains("error"))
	{
		System.out.println("The page is broken");
		driver.close();
	
		
	}
	
	driver.get("http://leafground.com/pages/Link.html");
	
	/*WebElement links = driver.findElement(By.tagName("a"));
	System.out.println(links.getSize());*/
	 	
}
}
