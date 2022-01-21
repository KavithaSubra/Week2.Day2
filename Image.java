package Week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//img[contains(@src,'home')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'Image')]")).click();
		WebElement brokenLink = driver.findElement(By.xpath("//img[contains(@src,'abcd')]"));
		boolean enabled = brokenLink.isEnabled();
		System.out.println(enabled);
		driver.findElement(By.xpath("//img[contains(@src,'keyboard')]")).click();
		driver.close();
	}

}
