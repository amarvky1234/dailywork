void main() {
    int num = 154256;
    while(num > 0){
        int rem = num % 10;
        if(rem%2 == 0){
            System.out.print(rem + ",");
        }
        num = num / 10;
    }
}