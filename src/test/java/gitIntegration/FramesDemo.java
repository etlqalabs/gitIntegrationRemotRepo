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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesDemo {
	
	WebDriver driver;
	
	
	@Test
 public void fileUpload() throws SQLException, AWTException, InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.findElement(By.id("name")).sendKeys("Hello");
	
	driver.switchTo().frame(driver.findElement(By.id("frm1")));
	
	WebElement frm1_dd = driver.findElement(By.xpath("//select[@id='selectnav1']"));
	
	Select selec_fr1DD = new Select(frm1_dd);
	
	//selec_fr1DD.selectByVisibleText("- SQL");
	Thread.sleep(10000);
	selec_fr1DD.selectByVisibleText("Tech News");
	driver.switchTo().defaultContent();
	
	// switch to frm2
	driver.switchTo().frame(driver.findElement(By.id("frm2")));
	
	WebElement frm2_dd = driver.findElement(By.xpath("//select[@id='selectnav1']"));
	
	Select selec_fr2DD = new Select(frm2_dd);
	selec_fr2DD.selectByVisibleText("- SQL");
	driver.switchTo().defaultContent();
	
	// switch to frm3
	Thread.sleep(10000);
		driver.switchTo().frame(driver.findElement(By.id("frm3")));
		
		WebElement frm3_dd = driver.findElement(By.xpath("//select[@id='selectnav1']"));
		
		Select selec_fr3DD = new Select(frm3_dd);
		selec_fr3DD.selectByVisibleText("- SQL");

		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Returned to home page");
	
	
	
    
	
	
	
		}	
 }

