package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class facebookpage {
	//declaration
	@FindBy(id="email")
	private WebElement usernametb;
	
	@FindBy(id="pass")
	private WebElement passwordtb;
	
	@FindBy (name="login")
	private WebElement loginbtn ;
	
	//inilisation
	public facebookpage (WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	//utilisation
	public void usernametextbox(String name) {
		usernametb.sendKeys(name);	
	}
	public void passwordtextboc(String pwd) {
		passwordtb.sendKeys(pwd);
	}
	public void logginbutton() {
		loginbtn .click();
	}
	

}
