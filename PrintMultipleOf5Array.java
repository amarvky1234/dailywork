/**26. Print only multiples of 5 from an array.*/
void main(){
    int[] num = {12, 15, 16, 18, 20};

    System.out.println("mutiple of 5 elements are : ");
    for(int i=0; i<=num.length-1; i++){
        if(num[i]  % 5 == 0){
            System.out.println(num[i]);
        }
    }
}