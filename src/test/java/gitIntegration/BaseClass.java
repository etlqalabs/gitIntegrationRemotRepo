package gitIntegration;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.CopyUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BaseClass {
	
	@SuppressWarnings("deprecation")
	@Test
	public static void drawBorderusingJS(WebElement ele , WebDriver driver) throws IOException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='2px solid Red'", ele);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tgt = new File(".\\Screeshots\\login.png");
		FileUtils.copyFile(src, tgt);
		
	}

	
	public static void clickUsingJs(WebElement ele , WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ele);
	}
	
	
	public static void generateAlert(String message,WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert(' " + message +"')");
	}
	
	public static void refreshPageByJs(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
	}
	
	
	public static String getTitleUsingJs(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String title = js.executeScript("return document.title").toString();
		return title;
		
		
	}
	
	
	
}
