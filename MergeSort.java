public class MergeSort {

    static void merge(int arr[], int lo, int mid, int hi){

        int ll=mid-lo+1;
        int rl=hi-mid;

        int left[]=new int[ll];
        int right[]=new int[rl];

        for(int i=0;i<ll;i++){
            left[i]=arr[i+lo];
        }
        for(int j=0;j<rl;j++){
            right[j]=arr[j+mid+1];
        }

        int i=0;
        int j=0;
        int k=lo;

        while(i<ll && j<rl){
            if(left[i]>right[j]){
                arr[k]=right[j];
                j++;
                k++;
            }
            else{
                arr[k]=left[i];
                k++;
                i++;
            }
        }

        while(i<ll){
            arr[k]=left[i];
            k++;
            i++;
        }
        while(j<rl){
            arr[k]=right[j];
            j++;
            k++;
        }

    }
    static void divide(int arr[],int lo, int hi){

        if(lo==hi){
            return ;
        }
        int middle=(hi+lo)/2;
        divide(arr,lo,middle);
        divide(arr,middle+1,hi);

        merge(arr,lo,middle,hi);

    }
    public static void main(String[] args) {
        
        int arr[]={3,2,7,9,4,5,6,1};
        divide(arr,0,arr.length-1);

        for(int i=0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
