package designpatterns.demo.compositepattern;

public class SalesDepartment implements Department{
	
	private String deparmentId;
	
	private String departmentName;
	
	public SalesDepartment(String deparmentId,String departmentName) {
		this.deparmentId = deparmentId;
		this.departmentName = departmentName;
	}

	@Override
	public void printDepartmentName() {
		System.out.println(this.departmentName);
	}

}
