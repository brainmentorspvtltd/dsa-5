//POJO - Plain Old Java Object

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	private String email;
	private String phone;
	private String dept;
	private String desig;
	private String company;
	
	public String getEmpCompany() {
		return "Brain Mentors";
	}
	
	public Employee() {
//		this.company = "Brain Mentors";
		company = getEmpCompany();
	}
	
//	constructor chaining
	public Employee(int id, String name, double salary) {
		this();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getId() {
		return id;
	}
	
//	public double getHRA() {
//		
//	}
	
//	1. create function getNetSalary()
//	2. to print salary report
	
	public String showEmp() {
//		1. Convert name to proper format
//		2. convert salary to Indian format
		return "Id : " + id + "\nName : " + name + "\nSalary : " + salary;
	}
	
	
//	public void showEmp() {
//        System.out.println("Company is : " +company);
//        System.out.println("ID is : " + id);
//        System.out.println("Name is :" + name);
//        System.out.println("Salary is : " + salary);
//    }
	
}
