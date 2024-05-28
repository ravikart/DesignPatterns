package designpatterns.demo.runner;

import designpatterns.demo.compositepattern.Department;
import designpatterns.demo.compositepattern.FinanceDepartment;
import designpatterns.demo.compositepattern.Organization;
import designpatterns.demo.compositepattern.SalesDepartment;

public class CompositeDesignPatternRunner {
	
	public static void main(String[] args) {
		Organization organization = new Organization("20", "Dummy ORG");
		
		Department financialDepartment = new FinanceDepartment("1", "Administration");
		Department salesDepartment = new SalesDepartment("2", "Sales Department");
		
		Department financialDepartment2 = new FinanceDepartment("1", "Accounts");
		Department salesDepartment2 = new SalesDepartment("2", "Marketing Department");
		
		organization.addDepartment(financialDepartment);
		organization.addDepartment(salesDepartment);
		organization.addDepartment(financialDepartment2);
		organization.addDepartment(salesDepartment2);
		
		organization.printDepartmentName();

		
	}

}
