import java.util.Arrays;

public class PairSum2Pointer {

	static void pairSum(int arr[], int k, int n) {
		int i = 0;
		int j = n - 1;
		Arrays.sort(arr);
		while(i < j) {
			if(arr[i] + arr[j] == k) {
				System.out.println("Pair is :: " + arr[i] + "," + arr[j]);
				return;
			}
			else if((arr[i] + arr[j]) < k) {
				i++;
			}
			else if((arr[i] + arr[j]) > k) {
				j--;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,5,6,3,6,8};
		int k = 10;
		int n = arr.length;
		pairSum(arr, k, n);
	}

}
