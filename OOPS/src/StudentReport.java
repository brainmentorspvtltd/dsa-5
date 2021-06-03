// Encapsulation = wrapping of variable and methods is single unit (class)
// Data hiding = make member variables private
// Good Encapsulation = Data Hiding + Encapsulation
public class StudentReport {
    private int rollno;
    private String name;
    private String course;
    private String address;
    private double fees;
    private String collegeName;

    // default constructor
    public StudentReport() {
        // this.rollno = 101;
        // this.name = "Some Name";
        // this.course = "BCA";
        // this.fees = 4500.00;
        // this.address = "Delhi";
        this.collegeName = "DIT";
    }

    public StudentReport(int rollno, String name, String course, String address, double fees) {
        // it will call default const.
        this();
        this.rollno = rollno;
        this.name = name;
        this.course = course;
        this.address = address;
        this.fees = fees;
    }

    public void takeInput(int rollno, String name, String course, String address, double fees) {
        if(rollno > 0 && fees > 0) {
            this.rollno = rollno;
            this.name = name;
            this.course = course;
            this.address = address;
            this.fees = fees;
        }
        else {
            System.out.println("Invalid Input");
        }
    }

    public void showDetails() {
        System.out.println("Welcome to : " + collegeName);
        System.out.println("Roll No : " + this.rollno);
        System.out.println("Name : " + this.name);
        System.out.println("Course : " + this.course);
        System.out.println("Address : " + this.address);
        System.out.println("Fees : " + this.fees);
    }
}
