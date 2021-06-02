public class StringMethods {
    public static void main(String[] args) {
        String name = "Ram";
        String name2 = "Ram";
        System.out.println("Double Equals : " + name == name2); // compare reference
        System.out.println("Equals : " + name.equals(name2)); // value compare
        System.out.println("Ravi".equalsIgnoreCase("ravi"));
    }
}
