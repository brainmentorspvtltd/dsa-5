
public class MaxDiff3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,11,5,8,1,9};
		int res = arr[1] - arr[0];
		int minVal = arr[0];
		for(int i = 1; i < arr.length; i++) {
			res = Math.max(res,  arr[i] - minVal);
			minVal = Math.min(minVal, arr[i]);
		}
//		System.out.println(first + " : " + last + " : " + max);
		System.out.println(res);

	}

}
