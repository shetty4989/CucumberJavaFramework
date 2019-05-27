package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;


public class HomePage {
	WebDriver driver;
	String baseUrl;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchBox;
	
	@FindBy(xpath="//input[@class='nav-input']")
	private WebElement searchButton;

	@FindBy(linkText="Sign in")
	private WebElement signIn;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateTo_HomePage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

	public void navigateTo_SignInPage() {
		signIn.click();
	}

	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
}
	
