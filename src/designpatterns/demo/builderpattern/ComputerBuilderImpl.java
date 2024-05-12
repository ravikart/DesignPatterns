package designpatterns.demo.builderpattern;

public class ComputerBuilderImpl implements ComputerBuilder{
	
	private String cpuName;
	
	private String ram;
	
	private String storage;
	
	private String gpu;
	
	private String display;
	
	private String coolingSystem;

	@Override
	public Computer build() {
		return new Computer(cpuName,ram,storage,gpu,display,coolingSystem);
	}

	@Override
	public ComputerBuilder buildCPU(String cpu) {
		this.cpuName = cpu;
		return this;
	}

	@Override
	public ComputerBuilder buildRAM(String ram) {
		this.ram = ram;
		return this;
	}

	@Override
	public ComputerBuilder buildStorage(String storage) {
		this.storage = storage;
		return this;
	}

	@Override
	public ComputerBuilder buildGPU(String gpu) {
		this.gpu = gpu;
		return this;
	}

	@Override
	public ComputerBuilder buildDisplay(String display) {
		this.display = display;	
		return this;
	}

	@Override
	public ComputerBuilder buildCoolingSystem(String coolingSystem) {
		this.coolingSystem = coolingSystem;	
		return this;
	}

}
