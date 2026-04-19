/**23. Store only even numbers of an array into another array. */
void main() {
    int[] n = {21,22,23,24,25};
    int[] evenNum = new int[n.length];
    int k = 0;
    for(int i=0; i<=n.length-1; i++){
        if(n[i]%2 == 0){
            evenNum[k] = n[i];
            k++;
        }
    }
    
    for(int i=0; i<k; i++){
        System.out.print(evenNum[i]+" ");
    }
    System.out.println();
    System.out.println(Arrays.toString(evenNum));
}