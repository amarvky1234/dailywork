/**23. Print all odd numbers in an array. */
void main() {
    int[] num = {23, 34, 54, 10, 4, 7};
    for(int i=0; i<=num.length-1; i++){
        if(num[i]%2 != 0){
            System.out.print(num[i]+" ");
        }
    }
}