public class UnderstandingConst {
    int x, y;

    // init block
    {
        System.out.println("Pre const call" + x + " " + y);
    }

    public UnderstandingConst() {
        System.out.println("Default const call" + x + " " + y);
    }
    public static void main(String[] args) {
        UnderstandingConst obj = new UnderstandingConst();
        System.out.println(obj.x + " " + obj.y);
    }
}
