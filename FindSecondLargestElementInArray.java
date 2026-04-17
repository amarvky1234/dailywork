/*51. Find the second-largest element in an array.*/
void main(){
    int[] arr = {23, 14, -6, 17, 67, 0, 87};

    int max = 0;

    for(int i=0; i<=arr.length-1; i++){
        if(arr[i]>max){
             max = arr[i];
        }
    }
    System.out.println("max val : "+max);

    int secMax = 0;
    for (int i = 0; i <= arr.length-1; i++) {
        if(arr[i]>secMax && arr[i]<max){
            secMax = arr[i];
        }
    }
    System.out.println("secMax val : "+secMax);



    //int[] secMaxVal = new int[arr.length];
    // for(int i=0; i<=arr.length-1; i++){
    //         secMaxVal[i] = arr[i];
    // }
    // Arrays.sort(secMaxVal);
    // System.out.println(Arrays.toString(secMaxVal));
    // System.out.println("Second largest element of an array is "+secMaxVal[arr.length-2]);
}
