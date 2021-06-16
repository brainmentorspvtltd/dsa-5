import java.util.Arrays;
import java.util.HashMap;

public class DuplicateArrayP1 {
	
//	Approach 1
//	public static boolean isUnique(int arr[]) {
//		for(int i = 0; i < arr.length-1; i++) {
//			for(int j = i + 1; j < arr.length; j++) {
//				if(arr[i] == arr[j]) {
//					return false;
//				}
//			}
//		}
//		return true;
//	}
	
//	Approach 2
//	public static boolean isUnique(int arr[]) {
//		Arrays.sort(arr);
//		for(int i = 0; i < arr.length-1; i++) {
//			if(arr[i] == arr[i + 1]) {
//				return true;
//			}
//		}
//		return false;
//	}
	
//	Approach 3
	public static boolean isUnique(int arr[]) {
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		for(int i = 0; i < arr.length-1; i++) {
			if(map.get(arr[i]) != null) {
				return false;
			}
			map.put(arr[i], true);
		}
		return true;
	}
	
//	Solve this in O(n) time and O(1) space

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,6,7,8,4};
		System.out.println(isUnique(arr) ? "Girls" : "Boys");
//		System.out.println(isUnique(arr) ? "Boys" : "Girls");
	}

}
