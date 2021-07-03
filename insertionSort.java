public class insertionSort {
    
    static void sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int temp=arr[i];
            for(;j>=0;j--){
                if(arr[j]<temp){
                    break;
                }
                else{
                    arr[j+1]=arr[j];
                }
            }
            arr[j+1]=temp;

        }
    }
    public static void main(String[] args) {
        int arr[]={5,32,5,8,3,56,78,564};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
