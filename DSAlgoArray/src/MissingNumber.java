
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
		
		int arr[] = {21,23,26,24,25};
		int x = 0;
		int y = 0;
		int min = 21;
		int max = 26;
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
