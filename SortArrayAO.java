void main() {
    int[] arr = {23, 34, 54, 10, 4, 7};
    //Arrays.sort(arr);
    //System.out.println("Sorted Array in AO : "+Arrays.toString(arr));

    for(int i=0; i<= arr.length-1; i++){
        for(int j=0; j< arr.length-1-i; j++){
            if(arr[j]>arr[j+1]){
                int k = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = k;
            } 
        }
    }
    System.out.println(Arrays.toString(arr));
}