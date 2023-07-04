package extentR;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

public class Log4j_msg_On_Reports 
{
	@Test
	public void test1() throws IOException
	{
		PatternLayout lay = new PatternLayout("%d %c %m %n");
		new FileAppender(lay,"./reports/l1.log");
		BasicConfigurator.configure();
		Logger log = Logger.getLogger(this.getClass().getName());
		log.error("error");
		log.fatal("fatal");
		log.info("info");
	}

}
