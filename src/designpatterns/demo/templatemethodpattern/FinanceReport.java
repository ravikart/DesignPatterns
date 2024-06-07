package designpatterns.demo.templatemethodpattern;

public class FinanceReport extends Report {

	@Override
	public String createHeader() {
		return "Finance Report 2024";
	}

	@Override
	public String createBody() {
		return "Finance Report Body with some numbers.";
	}

	@Override
	public String createFooter() {
		return "Report for Financial Year 2023-2024";
	}

}
