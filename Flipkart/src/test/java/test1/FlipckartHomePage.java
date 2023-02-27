package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipckartHomePage {
	
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\automation\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.flipkart.com/");	
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        

	
	
	
}
	
}


