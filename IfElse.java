public class IfElse {
    public static void main(String[] args) {
        int num = 10;
        // if(num % 2 == 0)  {
        //     System.out.println("Even Number");
        // }
        // else {
        //     System.out.println("Odd Number");
        // }
        String output = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is " + output);
    }
}
