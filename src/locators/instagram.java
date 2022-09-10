package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("username")).sendKeys("samreen");
		driver.findElement(By.name("password")).sendKeys("786");
		driver.findElement(By.xpath("//div[contains(@class,' qF0y9')])[4]")).click();
		
	}

}