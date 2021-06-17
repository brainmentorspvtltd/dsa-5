
public class OddAppearence {
	
	static int getOddAppearence(int arr[], int n) {
		for(int i = 0; i < n; i++) {
			int count = 0;
			for(int j = 0; j < n; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count % 2 != 0) {
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,2,3,4,3,3,1,4};
		int n = arr.length;
		System.out.println(getOddAppearence(arr, n));

	}

}
