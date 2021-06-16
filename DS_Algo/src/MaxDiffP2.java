
public class MaxDiffP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,11,5,8,1,9};
		int res = arr[1] - arr[0];
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				res = Math.max(res,  arr[j] - arr[i]);
			}
		}
//		System.out.println(first + " : " + last + " : " + max);
		System.out.println(res);
	}

}
