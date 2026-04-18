/**12. Print all the numbers from the last index to the first index except the first element. */
void main() {
    int[] num = {23, 34, 54, 0, 4, 7};
    System.out.println("array length : "+num.length);
    
    for(int i =1; i<=num.length-1; i++){
        System.out.print(num[i]+" ");
    }
}