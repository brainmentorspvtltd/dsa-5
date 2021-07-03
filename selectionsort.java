public class selectionsort {

    static void sort(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            int min =i;
            
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }

            }
            
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public static void main(String[] args) {
        
        int arr[]={4,1,2,7,8,3,6};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
