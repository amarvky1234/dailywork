/**45. Check if a string is a palindrome using a loop. */
void main(){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a string : ");
    String s1 = sc.next();

    String rev = "";
    
    for(int i=s1.length()-1; i>=0 ; i--){
        rev += s1.charAt(i);
    }

    System.out.println(s1+"         "+rev);
    if(s1.equalsIgnoreCase(rev)){
        System.out.println("Given string is a palindrome");
    }else{
        System.out.println("Given string is not a palindrome");
    }
}