package designpatterns.demo.runner;

import designpatterns.demo.adapterpattern.PrintAdapter;
import designpatterns.demo.adapterpattern.Printer;

public class AdapterDesignPatternRunner {
	
	public static void main(String[] args) {
		Printer printer =  new PrintAdapter();
		
		printer.print("NEW MESSAGE YOU WANT TO PRINT!!!");
	}
}
