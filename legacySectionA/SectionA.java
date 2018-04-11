package legacySectionA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SectionA {
	
	static WebDriver ffDriver;
	
	public static void main(String[] args) {
		
		SectionA myObj = new SectionA();
		myObj.openFireFox();
		myObj.clickMarketplaceTrust();
		myObj.clickBuyingHeader();
		myObj.clickSellingHeader();
		myObj.loginUser("jarworkman", "Theones123");
		myObj.clickMyProxibid();
		ffDriver.quit();
		
	}
	
	public void openFireFox() {

		System.setProperty("webdriver.gecko.driver", "D:\\Projects\\WebDrivers\\geckodriver.exe");
		ffDriver = new FirefoxDriver();
		ffDriver.manage().deleteAllCookies();
		ffDriver.manage().window().maximize();
		ffDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ffDriver.manage().timeouts().pageLoadTimeout(30,  TimeUnit.SECONDS);
		
		ffDriver.get("https://www.proxibid.com");
	}

	public void loginUser(String user, String pass) {
		WebElement loginLink = ffDriver.findElement(By.id("login"));
		loginLink.click();
		WebElement userField = ffDriver.findElement(By.id("username"));
		userField.sendKeys(user);
		WebElement passField = ffDriver.findElement(By.id("password"));
		passField.sendKeys(pass);
		WebElement loginButton = ffDriver.findElement(By.cssSelector(".btn"));
		loginButton.click();
		
	}
	
	public void clickMyProxibid() {
		
			try {
				WebElement myProxibidLink = ffDriver.findElement(By.linkText("MyProxibid"));
				myProxibidLink.click();
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void clickMarketplaceTrust() {
		
			WebElement marketplaceLink = ffDriver.findElement(By.linkText("Marketplace Trust"));
			marketplaceLink.click();
			ffDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			ffDriver.navigate().back();
		
	}
	
	public void clickBuyingHeader() {
		
			WebElement buyingLink = ffDriver.findElement(By.linkText("Buying"));
			buyingLink.click();
			ffDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			ffDriver.navigate().back();

	}
	
	public void clickSellingHeader() {
		
			WebElement sellingLink = ffDriver.findElement(By.linkText("Selling"));
			sellingLink.click();
			ffDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			ffDriver.navigate().back();
	}
	
	public void clickHelpHeader() {
		
			WebElement helpLink = ffDriver.findElement(By.linkText("Help"));
			helpLink.click();
			ffDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			ffDriver.navigate().back();
	}
	
	
}
