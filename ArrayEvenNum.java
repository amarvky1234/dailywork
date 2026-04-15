/**22. Print all even numbers in an array. */
void main() {
    int[] n = {21,22,23,24,25}; 
    System.out.print("even number are ");
    for(int i=0; i<=n.length-1; i++){
        if(n[i]%2 == 0){
            System.out.print(n[i]+",");
        }
    }
}