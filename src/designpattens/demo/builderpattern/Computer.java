package designpattens.demo.builderpattern;

public class Computer {
	
	private String cpuName;
	
	private String ram;
	
	private String storage;
	
	private String gpu;
	
	private String display;
	
	private String coolingSystem;

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getCoolingSystem() {
		return coolingSystem;
	}

	public void setCoolingSystem(String coolingSystem) {
		this.coolingSystem = coolingSystem;
	}

	public Computer(String cpuName, String ram, String storage, String gpu, String display, String coolingSystem) {
		this.cpuName = cpuName;
		this.ram = ram;
		this.storage = storage;
		this.gpu = gpu;
		this.display = display;
		this.coolingSystem = coolingSystem;
	}

	public String getCpuName() {
		return cpuName;
	}

	public void setCpuName(String cpuName) {
		this.cpuName = cpuName;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}
	
	@Override
	public String toString() {
		String specification = "[cpuName:" + cpuName + ",ram: " + ram + ",storange: " + storage + ",gpu: " + gpu + ",display: " + display 
				+ ",coolingSystem: " + coolingSystem + "]";
		return specification;
	}

}
