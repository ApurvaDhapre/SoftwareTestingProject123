package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartHomeDecore {
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement PopupCrossButton;
	
	
	@FindBy(xpath="//span[text()='Become a Seller']")
	private WebElement BecomeASeller ;
	

	@FindBy(xpath="//div[@class='styles__RegisterContainer-r412un-14 ggQDDa']")
	private WebElement StartSelling ;
	

	@FindBy(xpath="//button[@id='moe-dontallow_button']")
	private WebElement PopupWindow2 ;
	
	@FindBy(xpath="//input[@type='number']")
	private WebElement EnterMobile ;
	

	
public FlipkartHomeDecore(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
		
	}

public void PopupCrossButton()
{
	PopupCrossButton .click();
}
/*

public void BecomeASeller()
{
	BecomeASeller.click();
}

public void StartSelling()
{
	StartSelling.click();
}

public void PopupWindow2()
{
	PopupWindow2.click();
}


public void EnterMobile()
{
	EnterMobile.sendKeys("234654645");
}

*/

}
