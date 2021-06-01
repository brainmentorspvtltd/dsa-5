class CommandLineArg {
    public static void main(String[] args) {
        // String fnum = args[0];
        // String snum = args[1];
        // String result = fnum + snum;

        if (args.length == 2) {
            int fnum = Integer.parseInt(args[0]);
            int snum = Integer.parseInt(args[1]);
            int result = fnum + snum;

            System.out.println("Sum is "+result);
        }
        else {
            System.out.println("Invalid Input");
        }
    }    
}
