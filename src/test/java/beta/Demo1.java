package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;
 
public class Demo1 {
	
	public static Logger log = LogManager.getLogger(Demo1.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("debug");
		log.error("error");
		log.info("info");
		log.fatal("fatal");
	}

}
