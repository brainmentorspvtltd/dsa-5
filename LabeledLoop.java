public class LabeledLoop {
    public static void main(String[] args) {
        outer:
        for(int i = 0; i < 5; i++) {
            // inner:
            for(int j = 0; j < 5; j++) {
                if (i == j) {
                    // break outer;
                    continue outer;
                }
                else {
                    System.out.println(i + " : " + j);
                    // continue inner;
                }
            }
        }
    }
}
