package testNg;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomClass.FlipkartAddToCartProduct;
import pomClass.FlipkartHomeDecore;
import pomClass.FlipkartLoginPage;

public class TestNG {
	
	WebDriver driver;
	@BeforeClass
	
	
	public void  beforeclass ()
	{
	System.out.println("Before class");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\automation\\automation\\browsersexefile\\chromedriver.exe");

	driver = new ChromeDriver(); 
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.manage().window().maximize();

	}
	
	@BeforeMethod
	public void beforeMethod ()
	{
		System.out.println("Before method");
		driver.get("https://www.flipkart.com/");
		
    }
	
	@Test 
	public void  verifyFlipkartLoginPage() {
		
		 FlipkartLoginPage  flipkartLoginPage =new FlipkartLoginPage(driver);
		 
		 flipkartLoginPage.EmailOrMobile();
		 flipkartLoginPage.ClickOnResendOTP();
		 flipkartLoginPage.CrossButtonClick();
		 
		
	}
	
	@Test(priority=1)
	public void verifyFlipkartAddToCartProduct() 
	{
		FlipkartAddToCartProduct flipkartAddToCartProduct =new FlipkartAddToCartProduct(driver);
		
	
		flipkartAddToCartProduct.SearchBox();
		flipkartAddToCartProduct.SearchButton();
	    flipkartAddToCartProduct.ClickOnProduct();
	    ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(addr.get(1));
		
		flipkartAddToCartProduct.AddToCart();	
		
		// string create Actual And Accepted   
		//Assert.assertEquals(null, null, null);
		
	}
	
	
	/*@Test (priority = 2)
	public void verifyFlipkartHomeDecore()
	{
		FlipkartHomeDecore flipkartHomeDecore = new FlipkartHomeDecore(driver);
		
		flipkartHomeDecore.PopupCrossButton();
		flipkartHomeDecore.BecomeASeller();
		flipkartHomeDecore.EnterMobile();
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(addr.get(1));
		flipkartHomeDecore.StartSelling();
		flipkartHomeDecore.PopupWindow2();
	}
	*/
	@AfterMethod
	
	public void afterMethod() 
	
	{
		driver.get("https://www.flipkart.com/");
		
	}
	@AfterClass
	
	public void afterClass ()
	{
		
		driver.quit();
	}
	
}


