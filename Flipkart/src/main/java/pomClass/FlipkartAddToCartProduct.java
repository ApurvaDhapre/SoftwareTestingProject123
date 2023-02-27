package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartAddToCartProduct {
	
	@FindBy(xpath="(//input[@autocomplete='off'])[2]")
	private WebElement EmailOrMobile;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement ClickOnResendOTP;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement CrossButtonClick;
	

	@FindBy(xpath="//input[@class='_3704LK']")
	private WebElement SearchBox;
	

	@FindBy(xpath="//button[@class='L0Z3Pu']")
	private WebElement SearchButton;
	
	@FindBy(xpath="//div[@class='_2kHMtA']")
	private WebElement ClickOnProduct;
	
	
	@FindBy(xpath="//li[@class='col col-6-12']")
	private WebElement AddToCart;
	
	
public FlipkartAddToCartProduct(WebDriver driver)
	
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

public void SearchBox()
{
	
	SearchBox.sendKeys("Fastrack Smart Watch");
}
public void SearchButton()
{
	
	SearchButton.click();
}

public void ClickOnProduct()
{
	
	ClickOnProduct.click();
}

public void AddToCart()
{
	
	AddToCart.click();
}



}
