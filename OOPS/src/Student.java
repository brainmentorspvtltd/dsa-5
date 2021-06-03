// SRP
class StudentDetails {
    int rollno;
    String name;
    String course;
    String address;
    double fees;

    public void takeInput(int rollno, String name, String course, String address, double fees) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
        this.address = address;
        this.fees = fees;
    }

    // DRY
    public void showDetails() {
        System.out.println("Roll no is : " + this.rollno);
        System.out.println("Name is : " + this.name);
        System.out.println("Course is : " + this.course);
        System.out.println("Address is : " + this.address);
        System.out.println("Fees is : " + this.fees);
    }
}

public class Student {
    public static void main(String[] args) {
        // 1. default constructor will be called
        // 2. Student class object will be created
        // 3. reference of object will be stored in ram
        StudentDetails ram = new StudentDetails();

        // System.out.println("Roll no is : " + ram.rollno);
        // System.out.println("Name is : " + ram.name);
        // System.out.println("Course is : " + ram.course);
        // System.out.println("Address is : " + ram.address);
        // System.out.println("Fees is : " + ram.fees);

        // ram.rollno = 20;
        // ram.name = "Ram";
        // ram.course = "MCA";
        // ram.address = "Delhi";
        // ram.fees = 2500.00;

        ram.takeInput(20, "Ram", "MCA", "Delhi", 25000.00);
        // ram.branch = "IT";
        ram.showDetails();

        System.out.println("===============================");

        // System.out.println("Roll no is : " + ram.rollno);
        // System.out.println("Name is : " + ram.name);
        // System.out.println("Course is : " + ram.course);
        // System.out.println("Address is : " + ram.address);
        // System.out.println("Fees is : " + ram.fees);

        StudentDetails shyam = new StudentDetails();
        // shyam.rollno = 25;
        // shyam.name = "Shyam";
        // shyam.course = "Btech";
        // shyam.address = "Delhi";
        // shyam.fees = 45000.00;

        shyam.takeInput(25, "Shyam", "Btech", "Delhi", 45000.00);
        shyam.showDetails();

        // System.out.println("===============================");

        // System.out.println("Roll no is : " + shyam.rollno);
        // System.out.println("Name is : " + shyam.name);
        // System.out.println("Course is : " + shyam.course);
        // System.out.println("Address is : " + shyam.address);
        // System.out.println("Fees is : " + shyam.fees);
    }
}