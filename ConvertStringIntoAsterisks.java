/**46. Convert all input strings into asterisks (*). */
void main(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string ");
    String s = sc.next();

    String res = "";

    for(int i=0; i<=s.length()-1; i++){
        res += "*";
    }

    System.out.println(res);
}