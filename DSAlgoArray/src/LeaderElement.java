
public class LeaderElement {
	
//	Time : O(n)
	static void leader(int arr[]) {
		int max = 0;
		for(int i = arr.length - 1; i >= 0; i--) {
			if(arr[i] > max) {
				System.out.println("Leader :: "+arr[i]);
				max = arr[i];
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,6,22,12,15,7,8,4,12,11,8};
		leader(arr);
	}

}
