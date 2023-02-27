package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLoginPage {
	
	

	@FindBy(xpath="(//input[@autocomplete='off'])[2]")
	private WebElement EmailOrMobile;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement ClickOnResendOTP;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement CrossButtonClick;
	
public FlipkartLoginPage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
		
	}

public void EmailOrMobile()
{
	
	EmailOrMobile.sendKeys("6754335");
}

public void ClickOnResendOTP()
{
	
	ClickOnResendOTP.click();
}

public void CrossButtonClick()
{
	
	CrossButtonClick.click();
}


}
