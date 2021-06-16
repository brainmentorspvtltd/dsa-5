
public class SumOfArray {
	
	// Space complexity : O(n)
	static int total(int arr[], int index, int sum) {
		if(arr.length == index) {
			return sum;
		}
		return total(arr, index + 1, sum + arr[index]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,5,6,7,9};	// space
		int n = arr.length;
		int sum = 0;	//extra space
		int c = 0;
		for(int i = 0; i < n; i++) {	// i is extra space
			sum += arr[i];
			c++;
		}
	}

}
