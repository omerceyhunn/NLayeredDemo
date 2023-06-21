package nLayeredDemo.core;

import nLayeredDemo.JLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {

	@Override
	public void logToSystem(String messsage) {
		JLoggerManager manager =new JLoggerManager();
		manager.add(messsage);
		
		
		
	}
 
}
