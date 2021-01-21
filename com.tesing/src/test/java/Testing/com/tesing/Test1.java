package Testing.com.tesing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {
	
	WebDriver driver ;
	
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","C://Program Files//selenuim3//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/login.php");
		
		
		}
	
	@Test
	public void login() {
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("submit")).click();
		
		
	}
	

}
