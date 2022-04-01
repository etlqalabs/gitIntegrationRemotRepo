package gitIntegration;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFiles {
	
	WebDriver driver;
	
	
	@Test
 public void fileUpload() throws SQLException, AWTException {
		
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	driver.get("https://www.monsterindia.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("wzrk-confirm")).click();
	driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
	WebElement button = driver.findElement(By.xpath("//input[@id='file-upload']"));
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", button);
	
	// Using Robot class in Java
	Robot rb = new Robot();
	rb.delay(2000);
    // copy to clipborad like CTRL +C 
	StringSelection ss = new StringSelection("D:\\Infa_install.rar");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	rb.delay(2000);
	// Ctrol +V
	 rb.keyPress(KeyEvent.VK_CONTROL);
	 rb.keyPress(KeyEvent.VK_V);
	 rb.keyRelease(KeyEvent.VK_CONTROL);
	 rb.keyRelease(KeyEvent.VK_V);
	 
	 rb.delay(2000);
	 // Press Enter
	 
	 rb.keyPress(KeyEvent.VK_ENTER);
	 rb.delay(2000);
	 rb.keyRelease(KeyEvent.VK_ENTER);
	 rb.delay(2000);
	 
	 driver.close();
	 
	 
	
		
	
	
	//driver.findElement(By.xpath("//body/div[@id='themeDefault']/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
	
		
	
	
	
	
	}	
 }

