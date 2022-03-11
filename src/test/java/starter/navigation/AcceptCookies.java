package starter.navigation;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

import net.thucydides.core.annotations.Step;



public class AcceptCookies extends PageObject{
	
	

	@FindBy(xpath = "//button[contains(text(),'Accept')]")
	public WebElement acceptbutton;

	@Step("Accept Cookies")
	public void Acceptcookies() throws Exception {
		
		Thread.sleep(1000);
		this.getDriver().switchTo().defaultContent();
		acceptbutton.click();

	}

}
