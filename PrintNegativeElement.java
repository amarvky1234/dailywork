/**48. Print all negative elements in an array. */
void main(){
    int[] arr = {23, 34, 53, -98, 0, -34, 24, -11, -23, 27, -66};

    for(int i=0; i<=arr.length-1; i++){
        if( arr[i] < 0){
            System.out.print(arr[i]+" ");
        }
    }
}