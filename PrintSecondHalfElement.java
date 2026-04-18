/**32. Print elements in the second half of an array. */
void main(){
    int[] arr = {1, 2, 4, 5, 8, 11, 23, 25};

    for(int i=arr.length/2; i<=arr.length-1; i++){
        System.out.println(arr[i]);
    }
}