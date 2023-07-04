package runner_Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProv 
{
	
	@Test(dataProvider = "testData")
	public void validTest(String un, String pw)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pw);
		driver.findElement(By.name("login")).click();
	}
	
	@DataProvider(name = "testData")
	public Object[][] createData1()
	{
		return new Object[][] {
			{"Adam", "admin"},
			{"Anne", "manager"},};
		}
	
	}

