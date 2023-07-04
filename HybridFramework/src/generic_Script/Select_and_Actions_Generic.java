package generic_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public final class Select_and_Actions_Generic 
{	
	public static void dDP(WebElement ele)
	{
		Select se = new Select(ele);
	}
	public static void atn(WebDriver driver)
	{
		Actions act = new Actions(driver);
	}
	
	

}
