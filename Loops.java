public class Loops {
    public static void main(String[] args) {
        // for(int i = 0; i < 10; i++) {
        //     System.out.println(i);
        // }

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                // System.out.println(i + " : " + j);
                if (i != j) {
                    // continue;
                    break;
                }
                else {
                    System.out.println(i + " : " + j);
                }
            }
        }
    }
}
