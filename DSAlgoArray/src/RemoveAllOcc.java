
public class RemoveAllOcc {

	static int removeAll(int nums[], int val) {
		int i = 0;
		for(int j = 1; j < nums.length; j++) {
			if(nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}
		return i + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,2,2,3,4,5,5,6,6,6,7,8};
		int val = 2;
		int k = removeAll(arr, val);
		System.out.println(k);
		
	}
}
