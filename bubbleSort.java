class bubbleSort{

    static void sort(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        // //the cycles
        // for(int i=0;i<arr.length-1;i++){

        //     //comp
        //     for(int j=0;j<arr.length-i-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //     }
        // }
    }
    public static void main(String[] args) {
        int arr[]={4,1,2,8,6,0};

        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}