package legacyFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageHeaderFooter extends PageObject {
	
	
	public HomePageHeaderFooter(WebDriver driver) {
		super(driver);
	}
	
	
	public void clickHeader() {
		WebElement marketplaceLink = driver.findElement(By.linkText("Marketplace Trust"));
		marketplaceLink.click();
	}
	
	public void clickSignUp() {
		WebElement signUpLink = driver.findElement(By.className("signUp"));
		signUpLink.click();
	}
}

