package Utility;

import org.apache.log4j.Logger;

/**
 * @author bhavay.pant
 *
 */
public class Log {

	public static Logger log= Logger.getLogger(Log.class.getClass());

	public static void startTestCase(String sTestCaseName){

		Log.info("******************************************");
		Log.info("******************************************");
		Log.info("$$$$$$$     "+sTestCaseName+"      $$$$$$$");
		Log.info("******************************************");
		Log.info("******************************************");
	}
	public static void endTestCase(String sTestCaseName){

		Log.info("XXXXXXX     "+"-E--N--D-"+"        XXXXXXX");
		Log.info("X");
		Log.info("X");
		Log.info("X");
		Log.info("X");
	}

	public static void info (String message){
		log.info(message);
	}
	
	public static void warn (String message){
		log.warn(message);
	}
	
	public static void error (String message){
		log.error(message);
	}
	
	public static void fatal (String message){
		log.fatal(message);
	}
	
	public static void debug (String message){
		log.debug(message);
	} 
}