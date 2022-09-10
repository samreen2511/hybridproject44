package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://www.facebook.com/");
		driver.findElement(By.cssSelector("input(id='email')")).sendKeys("user");
		driver.findElement(By.cssSelector("input(id='pass')")).sendKeys("man");
		driver.findElement(By.cssSelector("button(name='login')")).click();

	}

}