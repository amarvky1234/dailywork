
void main() {
    int num = 24;
    int i = 1;
    System.out.println("Factors of " + num + " are ");
    while (i<=num){
        if(num%i == 0) {
            System.out.print(i + ",");
        }
        i++;
    }
}