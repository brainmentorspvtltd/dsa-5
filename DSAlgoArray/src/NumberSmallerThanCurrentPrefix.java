
public class NumberSmallerThanCurrentPrefix {
	
	static void findNumbers(int arr[], int n) {
		int hash[] = new int[100];
		int output[] = new int[n];
		for(int i = 0; i < n; i++) {
			if(hash[arr[i]] == 0) {
				hash[arr[i]] = 1;
			}
			else {
				hash[arr[i]] = hash[arr[i]] + 1;
			}
		}
		
		for(int i = 1; i < hash.length; i++) {
			int prev = hash[i - 1];
			int curr = hash[i];
			hash[i] = prev + curr;
		}
		
//		for(int i = 0 ; i < 10; i++) {
//			System.out.println(i + ":" + hash[i]);
//		}
		
		for(int i = 0; i < n; i++) {
			output[i] = hash[(arr[i] - 1)];
		}
		for(int i : output) {
			System.out.print(i + ",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8,1,2,2,3};
		int n = arr.length;
		findNumbers(arr, n);
	}

}
