
import java.util.Scanner;

class Stack {
    int[] arr;
    int size;
    int top;

    Stack(int size){
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int value) {
        if(top == (size-1)){
            System.out.println("Stack is full");
        }else{
            top++;
            arr[top] = value;
        }
        System.out.println();
    }
    void pop(){
        if(top == -1){
            System.out.println("Stack is empty");
        }else{
            int val = arr[top];
            arr[top] = 0;
            top--;
            System.out.println(val+" popped from stack");
        } 
        System.out.println();
    }
    void peek() {
        if(top == -1){
            System.out.println("stack is emepty");
        }else{
            int val = arr[top];
            System.out.println("top element is : "+val);
        }
        System.out.println();
    }
    void display(){
        if(top == -1){
            System.out.println("Stack is empty");
        }else{
            System.out.println("stack elements:");
            for(int i=top; i>=0; i--){
                System.out.println(arr[i]+"  ");
            }
        }
        System.out.println();
    }
}

public class IntStack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter stack size : ");
        int size = sc.nextInt();
        Stack s1 = new Stack(size);

        int option;
         do{ 
            System.out.println("Choose your option : ");
            System.out.println("1. push ");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. display");
            System.out.println("5. exit");
            System.out.print("enter your option number : ");
            option = sc.nextInt();
            System.out.println();

            switch(option){
                case 1 -> {
                    System.out.println("enter a value : ");
                    int val = sc.nextInt();
                    s1.push(val);
                }

                case 2 -> {
                    s1.pop();
                }

                case 3 -> {
                    s1.peek();
                }
                
                case 4 -> {
                    s1.display();
                }
                        
                case 5 -> System.out.println("exiting");

                default -> System.out.println("invalid option given ");
            }
        } while(option != 5);
        sc.close();
    }
}