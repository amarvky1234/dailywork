/**62. Sort elements in ascending/descending order.*/
void main(){
    int[] arr = {23, 54, 13, 57, 34, 87};
    
    Arrays.sort(arr);

    System.out.print("Ascending Order : ");
    for(int i=0; i<=arr.length-1; i++){
        System.out.print(+arr[i]+"  ");
    }

    System.out.println("");
    System.out.print("Descending Order : ");
    for(int i=arr.length-1; i>=0; i--){
        System.out.print(+arr[i]+"  ");
    }
}