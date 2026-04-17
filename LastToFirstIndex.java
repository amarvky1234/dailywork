/**12. Print all the numbers from the last index to the first index except the first element.
13. Print all the numbers from the last index to the first index except the last element */
void main() {
    int[] num = {11, 22, 33, 44, 55};

    System.out.print("Last to first index element except first element : ");
    for(int i=num.length-1; i>=1; i--){
        System.out.print(num[i]+" ");
    }

    System.out.println();
    System.out.print("Last to first index element except last element : ");
    for(int i=num.length-2; i>=1; i--){
        System.out.print(num[i]+" ");
    }
}