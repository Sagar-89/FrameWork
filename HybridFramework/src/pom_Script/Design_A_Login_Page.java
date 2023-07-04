package pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import generic_Script.Base_Page;

public class Design_A_Login_Page extends Base_Page
{
	@FindBy (id="email")              //(OR) @FindBy(xpath="//input[@id='email']")
	private WebElement un;
	
	@FindBy (id="pass")               //(OR) //@FindBy (xpath = "//input[@id='pass']")
	private WebElement pwd;
	
	@FindBy (xpath = "//button[text()='Log in']")
	private WebElement lgnbtn;

public Design_A_Login_Page(WebDriver driver)
{
	super(driver);
}

public void unTxtf(String usn)
{
	un.sendKeys(usn);
}
public void pwTxtf(String pw)
{
	pwd.sendKeys(pw);
}
public void loginBtn()
{
	lgnbtn.click();
}
}

