package designpatterns.demo.compositepattern;

public class FinanceDepartment implements Department{

	private String deparmentId;

	private String departmentName;

	public FinanceDepartment(String deparmentId,String departmentName) {
		this.deparmentId = deparmentId;
		this.departmentName = departmentName;
	}

	@Override
	public void printDepartmentName() {
		System.out.println(this.deparmentId);
		System.out.println(this.departmentName);
	}

}
