/**55. Print all unique elements in an array. */
void main(){
    int[] arr = {12, 13, 13, 12, 14, 11, 14, 11};

    Arrays.sort(arr);
    int uEle = 0;
    for(int i=0; i<=arr.length-1; i++){
        if(arr[i] != uEle){
            System.out.println(arr[i]+"");
            uEle = arr[i];
        }
    }
}