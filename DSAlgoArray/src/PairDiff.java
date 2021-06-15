
public class PairDiff {
	
	static void pairDiffA1(int arr[], int k, int n) {
		int diff = 0;
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j <n; j++) {
				diff = arr[i] - arr[j];
				diff = Math.abs(diff);
				if(diff == k) {
					System.out.println("Pair is : " + arr[i] + "," + arr[j]);
					return;
				}
			}
		}
	}
	
//	Solve this in O(n)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,7,9,10};
		int diff = 2;
		int n = arr.length;
		pairDiffA1(arr, diff, n);

	}

}
