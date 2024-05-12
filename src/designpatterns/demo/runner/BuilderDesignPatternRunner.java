package designpatterns.demo.runner;

import designpattens.demo.builderpattern.ComputerBuilderImpl;
import designpattens.demo.builderpattern.ComputerDirector;

public class BuilderDesignPatternRunner {

	public static void main(String[] args) {
		
		ComputerDirector buildComputer =  new ComputerDirector();
		
		ComputerBuilderImpl gamingComputerBuilder =  new ComputerBuilderImpl();
		ComputerBuilderImpl personalComputerBuilder =  new ComputerBuilderImpl();
		ComputerBuilderImpl officeComputerBuilder =  new ComputerBuilderImpl();
		
		System.out.println(buildComputer.constructGamingComputer(gamingComputerBuilder));
		System.out.println(buildComputer.constructPersonalComputer(personalComputerBuilder));
		System.out.println(buildComputer.constructOfficeComputer(officeComputerBuilder));
		
	}
}
