public class OddAppearence {
	
	static void odd(int arr[], int n) {
		int xor = 0;
		for(int i = 0; i < n; i++) {
			xor = xor ^ arr[i];
		}
		System.out.println(xor);
		int x = xor & (~(xor - 1));	// right most bit
		System.out.println(x);
		
		int result1 = 0, result2 = 0;
		for(int i = 0; i < n; i++) {
			if((arr[i] & x) != 0) {
				result1 = result1 ^ arr[i];
			}
			else {
				result2 = result2 ^ arr[i];
			}
		}
		System.out.println(result1 + ", " + result2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,7,7,5,4,3};
		int n = arr.length;
		odd(arr, n);
	}

}
