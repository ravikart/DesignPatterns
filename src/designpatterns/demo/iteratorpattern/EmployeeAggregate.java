package designpatterns.demo.iteratorpattern;

import java.util.List;

public class EmployeeAggregate implements Aggregate<Employee>{
	
	private List<Employee> employees;
	
	public EmployeeAggregate(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public Iterator<Employee> createIterator() {
		return new EmployeeIterator(employees);
	}

}
