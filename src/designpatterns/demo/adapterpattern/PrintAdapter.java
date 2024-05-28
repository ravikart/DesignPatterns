package designpatterns.demo.adapterpattern;

public class PrintAdapter implements Printer{

	@Override
	public void print(String printMessage) {
		legacyPrinter(printMessage);
	}

	private void legacyPrinter(String printMessage) {
		LegacyPrinter legacyPrinter = new LegacyPrinter(printMessage);
		legacyPrinter.printDocument();
	}

}
