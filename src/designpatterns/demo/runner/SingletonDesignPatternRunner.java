package designpatterns.demo.runner;

import designpatterns.demo.singletonpattern.Logger;

public class SingletonDesignPatternRunner {
	
//	You are working on a logging system for a large multi-threaded application. 
//	The application needs to have a single logging object that is used by all 
//	threads (i.e., all threads write to the same log file). 
//	The logging object is expensive to create and you want to 
//	ensure that only one instance is created. 
//	The object is accessed frequently, so you need to ensure that the access is efficient.
	
	
	public static void main(String[] args) {
		Logger mainLogger = Logger.getInstance();
		Logger checkMainLogger = Logger.getInstance();
		
		System.out.println(mainLogger);
		System.out.println(checkMainLogger);
		
		mainLogger.info("This is Main Logger Info Message");
		mainLogger.warning("This is Main Logger Info Message");
		mainLogger.debug("This is Main Logger Info Message");
		mainLogger.error("This is Main Logger Info Message");
		
		checkMainLogger.info("This is Check Main Logger Info Message");
		checkMainLogger.warning("This is Check Main Logger Info Message");
		checkMainLogger.debug("This is Check Main Logger Info Message");
		checkMainLogger.error("This is Check Main Logger Info Message");
		
	}

}
