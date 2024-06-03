package designpatterns.demo.iteratorpattern;

import java.util.List;
import java.util.NoSuchElementException;

public class EmployeeIterator implements Iterator<Employee> {
	
	private int currentIndex = 0;
	private List<Employee> employeeList;
	
	protected EmployeeIterator(List<Employee> employee) {
		this.employeeList = employee;
	}

	@Override
	public boolean hasNext() {
		return currentIndex < employeeList.size();
	}

	@Override
	public Employee next() {
		if(!hasNext()) {
			throw new NoSuchElementException();
		}
		return employeeList.get(currentIndex++);
	}

}
