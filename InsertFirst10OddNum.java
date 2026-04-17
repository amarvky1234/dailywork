/**35. Insert the first 10 odd numbers into an empty array. */
void main(){
    int[] arr = new int[10];
    int num = 1;
    
    for(int i=0; i<10; i++){
        arr[i] = num;
        num = num + 2;
    }
    System.out.println(Arrays.toString(arr));
}