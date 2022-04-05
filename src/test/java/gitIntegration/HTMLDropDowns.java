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

public class HTMLDropDowns {
	
	WebDriver driver;
	
	
	@Test
 public void fileUpload() throws SQLException, AWTException, InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html#");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebElement course_dd = driver.findElement(By.id("course"));
	
	
	Select sel_courses = new Select(course_dd);
	List<WebElement> list = sel_courses.getOptions();
	for (WebElement webElement : list) {
		
		String item = webElement.getText();
		
		System.out.println(item);
	}

	
	
	
	
	
	
	
	
	
	
 
	
	
	
	
	 driver.close();
	 
	 
	
		
	
	
	//driver.findElement(By.xpath("//body/div[@id='themeDefault']/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
	
		
	
	
	
	
	}	
 }

