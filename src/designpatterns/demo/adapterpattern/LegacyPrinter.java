package designpatterns.demo.adapterpattern;

public class LegacyPrinter {
	
	private String textContent;
	
	LegacyPrinter(String textContent){
		this.textContent = textContent;
	}
	
	public void printDocument() {
		System.out.println("Print Document from Legacy Printer");
		System.out.println(this.textContent);
	}
	
}