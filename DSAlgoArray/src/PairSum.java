
public class PairSum {
	
//	Time : O(n^2)
//	static void pairSumA1(int arr[], int k, int n) {
//		int sum = 0;
//		for(int i = 0; i < n - 1; i++) {
//			for(int j = i + 1; j <n; j++) {
//				sum = arr[i] + arr[j];
//				if(sum == k) {
//					System.out.println("Pair is : " + arr[i] + "," + arr[j]);
//					return;
//				}
//			}
//		}
//	}
	
	static void pairSumA2(int arr[], int k, int n) {
		int sum = 0;
		int hash[] = new int[100];
		for(int i = 0; i < n; i++) {
			int index = k - arr[i];
			if(hash[index] == 1) {
				System.out.println("Pair is : " + arr[i] + "," + index);
				return;
			}
			hash[arr[i]] = 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,5,6,3,6,8};
		int k = 10;
		int n = arr.length;
//		pairSumA1(arr, k, n);
		pairSumA2(arr, k, n);
	}

}
