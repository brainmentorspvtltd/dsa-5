
public class Sort01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,1,0,0,0,1,1,0,1,0,1,0,0,1};
		int count = 0;
		for(int i : arr) {
			if(i == 0) {
				count++;
			}
		}
		for(int i = 0; i < count; i++) {
			arr[i] = 0;
		}
		for(int i = count; i < arr.length; i++) {
			arr[i] = 1;
		}
		System.out.println("Sorted Array : ");
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
