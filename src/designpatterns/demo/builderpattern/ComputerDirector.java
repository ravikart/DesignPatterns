package designpatterns.demo.builderpattern;

public class ComputerDirector {

	public Computer constructGamingComputer(ComputerBuilder gameComputerBuilder) {
		return gameComputerBuilder.buildCoolingSystem("AMD")
		.buildDisplay("Samsung")
		.buildCPU("INTEL")
		.buildGPU("AMD - GPU")
		.buildRAM("32GB")
		.buildStorage("512GB").build();
	}

	public Computer constructPersonalComputer(ComputerBuilder personalComputerBuilder) {
		return personalComputerBuilder.buildDisplay("ACER")
		.buildCPU("INTEL - I5")
		.buildGPU("INTEL")
		.buildRAM("8GB")
		.buildStorage("1TB").build();
	}
	
	public Computer constructOfficeComputer(ComputerBuilder officeComputerBuilder) {
		return officeComputerBuilder.buildCoolingSystem("Natural")
		.buildDisplay("DELL")
		.buildCPU("INTEL - I9")
		.buildGPU("INTEL")
		.buildRAM("32GB")
		.buildStorage("512GB").build();
	}

}
