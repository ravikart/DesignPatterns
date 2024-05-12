package designpatterns.demo.factorypattern;

public abstract class Vehicle {
	
	public boolean isRunning = false;
	
	abstract public boolean start();
	
	abstract public boolean stop();
	
}
