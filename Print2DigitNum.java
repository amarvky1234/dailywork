/**Print only 2-digit numbers from an array */
void main(){
    int[] arr = {1, 22, 13, 7, 8, 234, 11, 65, 3, 76};

    for(int i=0; i<=arr.length-1; i++){
        int num = arr[i];
        int count =0;
        while(num>0){
           int digit = num%10;
            count++;
            num = num/10; 
        }
        if(count==2){
            System.out.println(arr[i]);
        }
    }

    System.out.println("============================");

    for(int i=0; i<=arr.length-1; i++){
        if(arr[i]>=10 && arr[i]<=99){
           // System.out.print(arr[i]+" ");
        }
        System.out.println(arr[i]);
    }

    for(int i=0; i<=arr.length-1; i++){
        if(arr[i]>=10 && arr[i]<=99){
           // System.out.print(arr[i]+" ");
        }else{
            arr[i] = 0;
            //System.out.print(arr[i]+" ");
        }
        //System.out.println(arr[i]);
        System.out.println(arr[i]);
    }
    System.out.println(Arrays.toString(arr));  
}
