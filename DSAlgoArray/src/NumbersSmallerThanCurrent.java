import java.util.Arrays;
import java.util.HashMap;

public class NumbersSmallerThanCurrent {
	
//	static void findNumbers(int arr[], int n) {
//		int count = 0;
//		int index = 0;
//		int output[] = new int[n];
//		for(int i = 0; i < n; i++, index++) {
//			count = 0;
//			for(int j = 0; j < n; j++) {
//				if(arr[i] > arr[j]) {
//					count++;
//				}
//			}
//			output[index] = count;
//		}
//		System.out.println("************************");
//		for(int i : output) {
//			System.out.print(i + ",");
//		}
//	}
	
	static void findNumbers(int arr[], int n) {
		int clone[] = arr.clone();
		Arrays.sort(arr);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int output[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], i);
			}
		}
		
		for(int i = 0; i < clone.length; i++) {
			output[i] = map.get(clone[i]);
		}
		
		System.out.println("************************");
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
