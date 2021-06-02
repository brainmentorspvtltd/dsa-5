public class SwitchCase {
    public static void main(String[] args) {
        // int num = 10;

        // switch(num) {
        //     case 5 : System.out.println("Case 5");
        //     break;
        //     case 10 : System.out.println("Case 10");
        //     break;
        //     case 15 : System.out.println("Case 15");
        //     break;
        //     default : System.out.println("Default...");
        // }

        // fall through
        // switch(num) {
        //     case 5 : System.out.println("Case 5");
        //     case 10 : System.out.println("Case 10");
        //     case 15 : System.out.println("Case 15");
        //     default : System.out.println("Default...");
        // }

        String language = "Java";
        String grade = "";
        switch(language) {
            case "Java" : grade = "A";
            break;
            case "Python" : grade = "B";
            break;
            case "C/C++" : grade = "C";
            break;
            case "PHP" : grade = "D";
            break;
            default : grade = "";
        }
        System.out.println("Grade is : " + grade);
    }
}
