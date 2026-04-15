/**6. Print the first 4 elements in an array. */
void main() {
    int[] num = {23, 34, 54, 0, 4, 7};
    System.out.println("array length : "+num.length);
    
    for(int i=0; i<=3; i++){
        System.out.print(num[i]+" ");
    }
}