package designpatterns.demo.runner;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import designpatterns.demo.iteratorpattern.Employee;
import designpatterns.demo.iteratorpattern.EmployeeAggregate;
import designpatterns.demo.iteratorpattern.Iterator;

public class IteratorDesignPatternRunner {

	public static void main(String[] args) {
		List<Employee> employeeList = new LinkedList<Employee>();
		
		employeeList.add(new Employee("Ravi", new BigDecimal(30000)));
		employeeList.add(new Employee("Raj", new BigDecimal(70000)));
		employeeList.add(new Employee("Ram", new BigDecimal(60000)));
		employeeList.add(new Employee("Rohan", new BigDecimal(50000)));
		employeeList.add(new Employee("Reddy", new BigDecimal(40000)));
		
		Iterator<Employee> iterator =  new EmployeeAggregate(employeeList).createIterator();
		
		BigDecimal totalSalary = new BigDecimal(0);
		
		while(iterator.hasNext()) {
			Employee employeeDetails = iterator.next();
			System.out.println(employeeDetails.getName());
			totalSalary = totalSalary.add(employeeDetails.getSalary());
		}
		
		System.out.println(totalSalary);
	}

}
