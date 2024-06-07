package designpatterns.demo.templatemethodpattern;

public class SalesReport extends Report{

	@Override
	public String createHeader() {
		return "June Sales Report 2024";
	}

	@Override
	public String createBody() {
		return "Sales Report Body with some numbers.";
	}

	@Override
	public String createFooter() {
		return "June Sales Report";
	}

}
