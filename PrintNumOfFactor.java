/**28. Print numbers that are factor of 54 and 42. */
void main (){
    int fact1 = 54; 
    int fact2 = 42;

    int i=1;
    while(i<fact1 && i<fact2){
        if(fact1%i == 0 && fact2%i == 0){
            System.out.print(i+" ");
        }
        i++;
    }
}