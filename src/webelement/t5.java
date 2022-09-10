package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class t5 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		driver.findElement(By.id("nav-search-submit-button")).submit();
		
	}

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement Searchtb=driver.findElement(By.name("q"));
			Thread.sleep(3000);
			Searchtb.clear();
			
	}

}
