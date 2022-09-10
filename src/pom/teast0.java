package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class teast0 {

	public static void main(String[] args) {
		
		
    WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.facebook.com/");
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   
   facebookpage f=new facebookpage(driver);
   f.usernametextbox("admin");
   f.passwordtextboc("manager");
   f.logginbutton();
   
   

	}

}
