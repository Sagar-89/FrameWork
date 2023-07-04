package runner_Script;

import org.testng.annotations.Test;

import generic_Script.Generic_DemoStd;
import pom_Script.DemoStd;

public class Runner_DemoStd extends Generic_DemoStd
{
	@Test
	public void signUp() throws InterruptedException
	{
		DemoStd d = new DemoStd(driver);
		d.firstN("Ravgkkd");
		Thread.sleep(2000);
		d.lastN("Savgkkd");
		Thread.sleep(2000);
		d.emailID("rjvgkkd1234@gmail.com");
		Thread.sleep(2000);
		d.gender();
		Thread.sleep(2000);
		d.mobile("9876543210");
		Thread.sleep(2000);
		d.dofBoirth();
		Thread.sleep(2000);
		d.Month(4);
		Thread.sleep(2000);
		d.Year("1995");
		Thread.sleep(2000);
		d.Date();
		Thread.sleep(2000);
		d.subject("Mrndjkdk");
		Thread.sleep(2000);
		d.hobbies();
		Thread.sleep(2000);
		d.picture("C:\\Users\\Amar M\\Pictures\\asterisk.png");
		Thread.sleep(2000);
		d.address("#248 swarga road, devaloka, c/o Karnataka");
	}

}
