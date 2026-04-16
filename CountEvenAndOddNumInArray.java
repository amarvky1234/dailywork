/**52. Count the total even and odd elements in an array. */
void main(){
    int[] arr = {11, 12, 13, 14, 15, 16, 17};

    int count1 = 0;
    int count2 = 0;

    for(int i =0 ; i<=arr.length-1; i++){
        if(arr[i]%2 == 0){
            count1++;
        }else{
            count2++;
        }
    }
    
    System.out.println("total even elements in an array = "+count1);
    System.out.println("total odd elements in an array = "+count2);
}