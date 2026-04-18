/**25. Print only 2-digit numbers from an array.*/
void main(){
    int[] arr = {23, 6, 123, 13, 11, 4};

    for(int i=0; i<=arr.length-1; i++){
        if(arr[i] >= 10 && arr[i] <= 99){
            System.out.println(arr[i]);
        }
    }
}