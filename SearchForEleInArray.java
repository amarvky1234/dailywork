/**61. Search for an element in an array.*/
void main(){
    int[] arr = {12, 34, 23, 16, 17, 78};

    int element = 44;
    boolean isAvailable = false;
    for(int i=0; i<=arr.length-1; i++){
        if(arr[i] == element){
            System.out.println("Given element available in an array");
            isAvailable = true;
            break;
        }
    }
    if(!isAvailable){
        System.out.println("Given element not available in an array");
    }
}