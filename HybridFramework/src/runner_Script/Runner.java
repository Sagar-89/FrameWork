package runner_Script;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import generic_Script.Base_Test;
import generic_Script.DDT;
import pom_Script.Design_A_Login_Page;



public class Runner extends Base_Test
{
	@Test(dataProvider = "testdata")
	public void fb(String f1, String f2) throws InterruptedException, IOException
	{
		Design_A_Login_Page d = new Design_A_Login_Page(driver);
		String g1=DDT.getData("Sheet1", 0, 0);
		String g2 = DDT.getData("Sheet1", 1, 0);
		d.unTxtf(g1);
		Thread.sleep(2000);
		d.pwTxtf(g2);
		Thread.sleep(2000);
		d.loginBtn();
		//Assert.fail();	
	}
	
	@DataProvider(name = "testdata")
	public Object[][] createData1()
	{
		return new Object[][] {
		{"Sushant","Sgdks1"},
		{"Singh","Sjflkej123"} };

}
}


