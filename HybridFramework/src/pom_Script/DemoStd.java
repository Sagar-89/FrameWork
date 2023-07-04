package pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DemoStd 
{
	Select s;
	
	@FindBy (id="firstName")
	private WebElement fn;
	
	@FindBy (id="lastName")
	private WebElement ln;
	
	@FindBy (id="userEmail")
	private WebElement em;
	
	@FindBy (xpath = "//label[text()='Male']")
	private WebElement gen;
	
	@FindBy (id="userNumber")
	private WebElement mob;
	
	@FindBy (id="dateOfBirthInput")
	private WebElement dob;
	
	@FindBy (xpath = "//select[@class='react-datepicker__month-select']")
	private WebElement month;
	
	@FindBy (xpath = "//select[@class='react-datepicker__year-select']")
	private WebElement year;
	
	@FindBy (xpath = "//div[text()='13']")
	private WebElement date;
	
	@FindBy (id="subjectsInput")
	private WebElement sub;
	
	@FindBy (xpath="//label[text()='Sports']")
	private WebElement hobb;
	
	@FindBy (xpath ="//input[@id='uploadPicture']")
	private WebElement pic;
	
	@FindBy (id="currentAddress")
	private WebElement addr;
	
public DemoStd(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void firstN(String fname)
{
	fn.sendKeys(fname);
}
public void lastN(String lname)
{
	ln.sendKeys(lname);
}
public void emailID(String email)
{
	em.sendKeys(email);
}
public void gender()
{
	gen.click();
}	
public void mobile(String contact)
{
	mob.sendKeys(contact);
}
public void dofBoirth()
{
	dob.click();
}
public void Month(int mont)
{
	s = new Select(month);
	s.selectByIndex(mont);
}
public void Year(String yr)
{
	s = new Select(year);
	s.selectByValue(yr);
}
public void Date()
{
	date.click();
}
public void subject(String subj)
{
	sub.sendKeys(subj);
}
public void hobbies()
{
	hobb.click();
}
public void picture(String pict)
{
	pic.sendKeys(pict);
}
public void address(String addres)
{
	addr.sendKeys(addres);
}

}
