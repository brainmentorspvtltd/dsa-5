
public class RemoveDuplicate {
	
	static int removeDuplicate(int nums[]) {
		int i = 0;
		for(int j = 1; j < nums.length; j++) {
			if(nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,2,2,3,4,5,5,6,6,6,7,8};
		int k = removeDuplicate(arr);
		System.out.println(k);
		
	}

}
