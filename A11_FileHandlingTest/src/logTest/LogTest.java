package logTest;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
	
	public static Logger log = LoggerFactory.getLogger(LogTest.class);

	public static void main(String[] args) {
		
		PropertyConfigurator.configure("C:\\Vcentry\\Workspace\\A11_FileHandlingTest\\src\\logTest\\log4j.properties");
		
		log.info("Information3");
		log.error("Error3");
		

	}

}
