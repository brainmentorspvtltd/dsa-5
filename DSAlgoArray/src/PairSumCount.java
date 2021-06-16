import java.util.Arrays;

public class PairSumCount {
	
//	Approach 1
	static void pairCount(int arr[]) {
		int sum = 10;
		int count = 0;
		int n = arr.length;
		for(int i = 0; i < n - 1; i++) {
			for(int j = i+1; j < n; j++) {
				if((arr[i] + arr[j]) == sum) {
					count++;
				}
			}
		}
		System.out.println("Count is : " + count);
	}
	
//	Approach 2
	static void pairCount2(int arr[]) {
		int k = 10;
		int n = arr.length;
		Arrays.sort(arr);
		int i = 0;
		int j = n - 1;
		int ans = 0;
		while(i < j) {
			if((arr[i] + arr[j]) == k) {
				
				if((arr[i] == arr[j])) {
					ans = 0;
					// 5,5,5 - sandwich element
					int len = j - i + 1;
					ans += len * (len - 1) / 2;	// combination formula
					System.out.println("Pair is :: " + arr[i] + "," +arr[j]);
					break;
				}
				
				int c1 = 0;		// counter freq of ith element
				int c2 = 0;		// counter freq of jth element
				int v1 = arr[i];
				int v2 = arr[j];
				while(arr[i] == v1) {
					i++; c1++;
				}
				while(arr[j] == v2) {
					j--; c2++;
				}
				
				ans = ans + (c1 * c2);	// product of both count to get the combination
				
				System.out.println("Pair is :: " + v1 + "," +v2);
				System.out.println("Ans is :: " + ans);
			}
			else if ((arr[i] + arr[j]) < k ) {
				i++;
			}
			else if ((arr[i] + arr[j]) > k) {
				j--;
			}
		}
		System.out.println("Ans is :: " + ans);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,4,5,5,5,6,6,11};
		pairCount2(arr);

	}

}
