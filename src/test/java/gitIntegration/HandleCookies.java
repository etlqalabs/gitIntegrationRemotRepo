package gitIntegration;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCookies {
	
	@Test
	public void coockiesHandling()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");	
		Cookie c = new Cookie("Hetu","Preeti");
		driver.manage().addCookie(c);
		Set<Cookie> cookies= driver.manage().getCookies();
		System.out.println(cookies.size());
		 for(Cookie cooki : cookies)
		 {
			 System.out.println(cooki.getName()+":  "+cooki.getValue());
		 }
	   driver.close();
		
		
	}

}
