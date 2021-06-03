public class StudentTest {

    // String name;

    // public void hello(String name_local) {
    //     name = name_local;
    //     System.out.println("Hello " + name);
    // }
    public static void main(String[] args) {
        StudentReport ram = new StudentReport(101, "Ram", "BCA", "Delhi", 4500.00);
        // ram.rollno = -101;
        // ram.name = "Ram";
        // ram.course = "BCA";
        // ram.address = "Delhi";
        // ram.fees = -45000.00;
        // ram.takeInput(-101, "Ram", "BCA", "Delhi", -4500.00);
        ram.showDetails();

        // StudentTest obj = new StudentTest();
        // System.out.println("Name is " + obj.name);
        // obj.hello(ram.name);

        StudentReport shyam = new StudentReport(102, "Shyam", "MCA", "Delhi", 4500.00);
        // shyam.takeInput(102, "Shyam", "MCA", "Delhi", 4500.00);
        shyam.showDetails();
    }
}
