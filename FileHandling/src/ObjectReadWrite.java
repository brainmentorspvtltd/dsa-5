import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable {
	private int id;
	private String name;
	private double salary;
	private String city;
	Emp(int id, String name, double salary, String city) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.city = city;
		System.out.println("Cons call...");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}

public class ObjectReadWrite {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Emp obj = new Emp(101,"Ram",45000.00,"Delhi");
		FileOutputStream fo = new FileOutputStream("emp_data.dat");
		ObjectOutputStream os = new ObjectOutputStream(fo);
		os.writeObject(obj);
		os.close();
		fo.close();
		System.out.println("Object written...");
		
		System.out.println("=========================");
		
		System.out.println("Reading object...");
		
		FileInputStream fs = new FileInputStream("emp_data.dat");
		ObjectInputStream oi = new ObjectInputStream(fs);
		Emp e = (Emp)oi.readObject();
		System.out.println("ID : " + e.getId());
		System.out.println("Name : " + e.getName());
		System.out.println("City : " + e.getCity());
		System.out.println("Salary : " + e.getSalary());
		oi.close();
		fs.close();
	}

}
