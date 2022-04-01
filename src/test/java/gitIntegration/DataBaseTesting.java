package gitIntegration;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataBaseTesting {
	
	WebDriver driver;
	
	
	@Test
 public void xpathApprach() throws SQLException {
		
	//WebDriverManager.chromedriver().setup();
	
	//driver = new ChromeDriver();
		int empnumber= 33;
		int deptnumber= 100;
		
    
	String sqlQuery = "select empno,deptno from employee";
	
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "system","admin");
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery(sqlQuery);
	
	boolean status = false;
	while (rs.next())
	{
	
		
	int empno = rs.getInt("empno");
	int deptno = rs.getInt("deptno");
	
	if (empno==empnumber || deptno==deptnumber)
	{
		System.out.println("record found");
		 status = true;
		break;
		
	}
	
	}
	
	if (status == false)
	System.out.println("record not found");
	
	
	
	}
	

			
	

		
 }

