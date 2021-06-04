
public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ram = new Employee(101, "Ram", 34000);
//		System.out.println(ram.getSalary());
		ram.setSalary(ram.getSalary() + 5000);
		System.out.println(ram.getSalary());
		ram.showEmp();
	}

}
