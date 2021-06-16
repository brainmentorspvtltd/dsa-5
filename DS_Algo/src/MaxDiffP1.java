
public class MaxDiffP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,11,5,8,1,9};
		int max = Integer.MIN_VALUE;
		int first = 0;
		int last = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(max < arr[j] - arr[i]) {
					max = arr[j] - arr[i];
					first = arr[i];
					last = arr[j];
				}
			}
		}
		System.out.println(first + " : " + last + " : " + max);

	}

}
