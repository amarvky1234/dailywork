void main(){
    int[] arr = {23, 17, 35, 67, 7, 86, 19};

    int max = 0;

    for(int i=0; i<=arr.length-1; i++){
        if(arr[i]> max){
            System.out.print(arr[i]+" ");
            max = arr[i];
        }else{
            arr[i] = 0;
        }
    }
    System.out.println();
    System.out.println(Arrays.toString(arr));
}