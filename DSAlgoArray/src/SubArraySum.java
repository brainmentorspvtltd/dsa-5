
public class SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,3,4,6,2};
		int sum = 15;
		int i = 0;
		int j = 0;
		int currentElement = arr[0];
		int n = arr.length;
		while(i < n) {
			if(currentElement < sum) {
				j++;
				if(j < n) {
					currentElement += arr[j];
				}
			}
			else if(currentElement > sum) {
				currentElement -= arr[i];
				i++;
				if(i > j) {
					j++;
				}
			}
			else if(currentElement == sum) {
				System.out.println("Found...");
				return;
			}
		}
		System.out.println("Not Found...");

	}

}
