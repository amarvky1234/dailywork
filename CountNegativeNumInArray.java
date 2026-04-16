/**53. Count the total negative numbers in an array. */
void main(){
    int[] arr = {11, -6, 9, -8, 45, 65, -32, -31, 0};

    int count = 0;

    for(int i=0; i<= arr.length-1; i++){
        if(arr[i]<0){
            count++;
            System.out.println(arr[i]);
        }
    }

    System.out.println("Total negative numbers in array = "+count);
}