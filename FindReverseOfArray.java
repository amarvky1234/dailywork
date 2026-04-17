/**59. Find the reverse of an array. */
void main(){
    int[] arr = {3, 5, 1, 9, 7, 11};
    
    System.out.println("Array is : "+Arrays.toString(arr));
    System.out.println("reverse of an array ");
    for(int i=arr.length-1; i>=0; i--){
        System.out.print(arr[i]+ " ");
    }
}