package demo.user.object;

public class Employee implements Comparable<Employee> {
	
	private int empId;
	private String empName;
	public Employee(int empId, String emp) {
		super();
		this.empId = empId;
		this.empName = emp;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", emp=" + empName + "]";
	}
	public void display() {
		System.out.println("Emp ID:"+this.empId);
		System.out.println("Emp Name:"+this.empName);
		
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.empId>o.empId) {
			return 1;
		}
		else if(this.empId<o.empId) {
			return -1;
		}
		else
			return 0;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpId() {
		return empId;
	}
	
}
