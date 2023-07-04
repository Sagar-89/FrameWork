package extentR;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Log4j_msg_On_Console 
{
	@Test
	public void test2()
	{
		BasicConfigurator.configure();
		Logger log = Logger.getLogger(this.getClass().getName());
		log.error("error");
		log.fatal("fatal");
		log.info("info");
	}

}
