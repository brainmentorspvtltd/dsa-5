public class LoopsCommandLine {
    public static void main(String[] args) {
        int sum = 0;
        // Traditional for loop
        // for(int i = 0; i < args.length; i++) {
        //     sum += Integer.parseInt(args[i]);
        // }

        // Enhanced for loop
        for(String i:args) {
            sum += Integer.parseInt(i);
        }
        System.out.println("Sum is "+sum);
    }
}
