package designpatterns.demo.runner;

import designpatterns.demo.templatemethodpattern.FinanceReport;
import designpatterns.demo.templatemethodpattern.Report;
import designpatterns.demo.templatemethodpattern.SalesReport;

public class TemplateMethodDesignPatternRunner {

	public static void main(String[] args) {

		Report financeReport = new FinanceReport();

		financeReport.generateReport("finance_report.txt");

		Report salesReport = new SalesReport();

		salesReport.generateReport("june_sales.txt");
	}

}
