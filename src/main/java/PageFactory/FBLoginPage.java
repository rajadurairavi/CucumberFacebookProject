package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonFunctions.TestBase;

public class FBLoginPage extends TestBase {



	@FindBy(xpath = "//input[@id='email']")
	public static WebElement FBusername;

	@FindBy(xpath="//input[@id='pass']")
	public static WebElement FBpassword;

	@FindBy(xpath="//button[@name='login']")
	public static WebElement FBSubmit;

	
	public FBLoginPage() {
		PageFactory.initElements(driver, this);   
	}

	public void enterUserName(String username) {

		FBusername.sendKeys(username);

	}
	public void enterPassword(String password) {
		
		FBpassword.sendKeys(password);

	}
	public void clickLogin() {
		
		FBSubmit.click();

	}




}
