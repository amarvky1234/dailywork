/**24. Print all positive numbers in an array. */
void main() {
    int[] n = {23, -23, 34, -34, 12, 11, -9}; 
    System.out.print("positive number are ");
    for(int i=0; i<=n.length-1; i++){
        if(n[i] > 0){
            System.out.print(n[i]+",");
        }
    }
}