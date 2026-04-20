
import java.util.Scanner;

class Stack{
    String[] sarr;
    int size;
    int top;

    Stack(int size) {
        this.size = size;
        sarr = new String[size];
        top = -1;
    }

    void push(String val){
        if(top == (size-1)){
            System.out.println("Stack is full");
        }else{
            top++;
            sarr[top] = val;
        }
    }

    void pop(){
        if(top == -1){
            System.out.println("Stack is empty");
        }else{
            System.out.println(sarr[top]+" popped from stack");
            top--;
        }
    }
    void display(){
        if(top == -1){
            System.out.println("stack is empty");
        }else{
            System.out.println("Stack elements are :");
            for(int i=top; i>=0; i--){
                System.out.println(sarr[i]);
            }
        }
    }
}

public class StringStack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of stack : ");
        int size = sc.nextInt();

        Stack s = new Stack(size);

        int option;
        do { 
            System.out.println("Choose your option : ");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("enter your option number : ");
            option = sc.nextInt();
            switch(option){
                case 1 -> {
                    System.out.println("enter value ");
                    String val = sc.next();
                    s.push(val);
                }

                case 2 -> s.pop();

                case 3 -> s.display();

                case 4 -> System.out.println("exiting");

                default -> System.out.println("invalid option");
            }
        } while (option != 4);
        sc.close();
    }
}
