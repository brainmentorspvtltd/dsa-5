public class primeNumber {
    public static void main(String[] args) {
        int num = 17;
        boolean isPrime = true;
        for(int i = 2; i <= num / 2; i++) {
            if(num % i == 0) {
                // System.out.println("Not Prime");
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println("Number is prime");
        }
        else {
            System.out.println("Number is not prime");
        }
    }
}
