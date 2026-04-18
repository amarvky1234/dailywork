/*27. Print only numbers that are multiples of 2 AND 3.*/
void main(){
    int[] num = {12,13,14,15,16,17,18,19,20};

    for(int i=0; i<=num.length-1; i++){
        if(num[i]%2 == 0 && num[i]%3 == 0){
            System.out.println(num[i]);
        }
    }
}