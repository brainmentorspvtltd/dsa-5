import java.util.Arrays;

public class UniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,2,4,4,5,6,6,7,7};
		Arrays.sort(arr);
		int hash[] = new int[100];
		for(int i = 0; i < arr.length; i++) {
			hash[arr[i]] = ++hash[arr[i]];
		}
		for(int i = 0; i < hash.length; i++) {
			if(hash[i] == 1) {
				System.out.println("Unique Element :: " + i);
				break;
			}
		}

	}

}
