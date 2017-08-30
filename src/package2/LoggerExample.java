package package2;

import org.apache.log4j.Logger;

public class LoggerExample {
public static Logger logger=Logger.getLogger(LoggerExample.class);
public void testLoggerDebug()
{
	logger.debug("hello..I m in debud method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
