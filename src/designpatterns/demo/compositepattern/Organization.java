package designpatterns.demo.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Organization implements Department{
	
	private String organizationId;
	
	private String organizationName;
	
	private List<Department> departmentsInsideOrganization;
	
	public Organization(String organizationId,String organizationName) {
		this.organizationId = organizationId;
		this.organizationName = organizationName;
		this.departmentsInsideOrganization = new ArrayList<Department>();
	}

	@Override
	public void printDepartmentName() {
		this.departmentsInsideOrganization.stream().forEach(Department::printDepartmentName);
	}
	
	public void addDepartment(Department department) {
		this.departmentsInsideOrganization.add(department);
	}
	
	public void removeDepartment(Department department) {
		this.departmentsInsideOrganization.remove(department);
	}
	
}
