public class Binarysearch {

    static int bsearch(int arr[], int key, int lo, int hi){

        if(lo>hi){
            return -1;
        }
        int middle=(hi+lo)/2;
        if(arr[middle]==key)
        return middle;
        else if(arr[middle]>key){
            return bsearch(arr, key, lo, middle-1);
        }
        else if(arr[middle]<key){
            return bsearch(arr, key, middle+1, hi);
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println(bsearch(arr,10,0,arr.length-1));

    }
}
