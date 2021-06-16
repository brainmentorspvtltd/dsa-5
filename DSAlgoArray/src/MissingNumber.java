
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {2,1,3,6,4};
//		int sum = 0;
//		for(int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
//		int n = arr.length;
//		int total = (n + 1) * (n + 2) / 2;
//		int missing = total - sum;
		
		int arr[] = {1,2,3,4,5,6};
		int x = 0;
		int y = 0;
		int min = 1;
		int max = 7;
		for(int i = 0; i < arr.length; i++) {
			x = x ^ arr[i];
		}
		for(int i = min; i <= max; i++) {
			y = y ^ i;
		}
		int missing = x ^ y;
		
		System.out.println("Missing Number is :: " +missing);

	}

}
