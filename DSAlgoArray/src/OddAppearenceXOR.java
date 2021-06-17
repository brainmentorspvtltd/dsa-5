
public class OddAppearenceXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,2,3,1,3};
		int ans = 0;
		for(int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i];
//			System.out.println(ans);
		}
		System.out.println(ans);
	}

}
