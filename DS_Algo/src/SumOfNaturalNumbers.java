
public class SumOfNaturalNumbers {
	
//	Approach 1
//	static int func(int n) {
//		int sum = 0;
//		for(int i = 0; i <= n; i++) {
//			for(int j = 1; j <= i; j++) {
//				sum++;
//			}
//		}
//		return sum;
//	}
	
//	Approach 2 - average case
	static int func(int n) {
		if(n % 2 == 0) {
			return 0;
		}
		int sum = 0;
		for(int i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	
//	Approach 3 - Best Case
//	static int func(int n) {
//		return n * (n + 1) / 2;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int res = func(n);
		System.out.println(res);
	}

}
