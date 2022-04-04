package gitIntegration;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSExecutor {
	
	String message ="Hello";
	@Test
	public void javaScriptexecutor() throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");	
//		WebElement loginButton = driver.findElement(By.name("login"));
//		//BaseClass.drawBorderusingJS(loginButton,driver);
//		WebElement email = driver.findElement(By.name("email"));
//		Thread.sleep(5000);
//		//BaseClass.drawBorderusingJS(email,driver);
//		Thread.sleep(5000);
//		BaseClass.clickUsingJs(loginButton, driver);
//		BaseClass.drawBorderusingJS(loginButton, driver);
		//System.out.println(BaseClass.getTitleUsingJs(driver));
		
		BaseClass.generateAlert(message, driver);
		Thread.sleep(5000);
		BaseClass.refreshPageByJs(driver);
		
		
		
		
		

		
}
}
