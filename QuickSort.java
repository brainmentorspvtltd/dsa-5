public class QuickSort {

    static int partitionAndPivotPlacing(int arr[], int lo, int hi){

        int pivotIndex=hi;
        int pivot=arr[hi];
        int left=lo;
        int right=hi-1;

        while(true){
            while(left<=pivotIndex && arr[left]<pivot){
                left++;
            }
            while(right>=0 && arr[right]>pivot){
                right--;
            }
            if(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
            else if(left>right){
               arr[pivotIndex]=arr[left];
               arr[left]=pivot;
               pivotIndex=left;
               break;
            }
            
        }
        return pivotIndex;
    }
    static void sort(int arr[], int lo,int hi){

        if(lo>=hi){
            return;
        }
       int pivotIndex= partitionAndPivotPlacing(arr, lo,hi);
       sort(arr,lo,pivotIndex-1);
       sort(arr,pivotIndex+1,hi);
    }
    public static void main(String[] args) {
        int arr[]={3,1,7,8,4,5,9};

        sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
