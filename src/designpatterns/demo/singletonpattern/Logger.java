package designpatterns.demo.singletonpattern;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	
	private static volatile Logger logger = null;
	
	private Logger() {
		
	}
	
	public static Logger getInstance() {
		if(logger == null) {
			synchronized (Logger.class) {
				if(logger == null) {
					logger = new Logger();
				}
			}
		}
		
		return logger;
	}
	
	public void info(String message) {
		log(LogLevel.INFO,message);
	}
	
	public void debug(String message) {
		log(LogLevel.DEBUG,message);
	}
	
	public void warning(String message) {
		log(LogLevel.WARNING,message);
	}
	
	public void error(String message) {
		log(LogLevel.ERROR,message);
	}

	private void log(LogLevel logLevel, String message) {
		String timestamp =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		String logMessage = timestamp + " [" + logLevel.name() + "] " + message;
		System.out.println(logMessage);
	}

}
