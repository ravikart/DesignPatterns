package designpatterns.demo.builderpattern;

public interface ComputerBuilder {
	
	public ComputerBuilder buildCPU(String cpu);
	
	public ComputerBuilder buildRAM(String ram);
	
	public ComputerBuilder buildStorage(String storage);
	
	public ComputerBuilder buildGPU(String gpu);
	
	public ComputerBuilder buildDisplay(String display);
	
	public ComputerBuilder buildCoolingSystem(String coolingSystem);
	
	public Computer build();

}
