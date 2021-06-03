class Emp {
    // member variables of class
    private int id;
    private String name;
    private double salary;

    private String email;
    private String phone;
    private String dept;
    private String desig;
    private String company;

    public Emp() {
        this.company = "TCS";
    }

    public Emp(int id, String name, double salary) {
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

    public void showEmp() {
        System.out.println("Company is : " +company);
        System.out.println("ID is : " + id);
        System.out.println("Name is :" + name);
        System.out.println("Salary is : " + salary);
    }
}

class CommonUtilities {
    public String getProperName(String name) {
        // name = "Surya kumar yadav";
        // ["Surya","kumar","yadav"]
        String names[] = name.split(" ");
        String properName = "";
        for(String n : names) {
            properName += String.valueOf(n.charAt(0)).toUpperCase() +
            n.substring(1).toLowerCase() + " ";
            // properName = "Surya Kumar Yadav"
        }
        return properName;
    }
}

public class EmpSalarySlip {
    public static void main(String[] args) {
        Emp ram = new Emp(101,"Ram",44500.00);
        // ram.id = 101;
        // ram.name = "Ram";
        // ram.salary = 34000.00;
        double incSal = 5000;
        ram.setSalary(ram.getSalary() + incSal);
        ram.showEmp();
    }
}