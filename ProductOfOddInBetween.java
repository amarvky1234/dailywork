/**Product of Odd numbers between 1 and 10 */
void main(){
    int product = 1;
    for(int i=1; i<=10; i++){
        if(i%2 != 0){
            product = product * i;
        }
    }
    System.out.println("Product of Odd numbers between 1 and 10 is "+product);
}