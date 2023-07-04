package generic_Script;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Framework_Constant
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty(chrome_key, chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(base_url);
	}
	
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			TakeSreenShots.getPhoto(driver);
		}
		driver.close();
	}

}
