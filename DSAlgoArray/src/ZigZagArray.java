
public class ZigZagArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,7,6,1,5,9,10};
		System.out.println("Original : ");
		for(int a : arr) {
			System.out.print(a + ",");
		}
		System.out.println();
		int temp = 0;
		boolean flag = true;
		for(int i = 0; i < arr.length-1; i++) {
			if(flag) {
				if(arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			else if (arr[i] < arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
			flag = !flag;
		}
		System.out.println("Zig Zag : ");
		for(int a : arr) {
			System.out.print(a + ",");
		}
	}

}
