
import java.util.Scanner;

class GenObjectStack{
    Object[] arr;
    int size;
    int top;
    Object obj;

    GenObjectStack(int size) {
        this.size = size;
        arr = new Object[size];
        top = -1;
    }
    
    void push(Object val){
        if(top == (size-1)){
            System.out.println("Stack is full");
        }else{
            arr[++top] = val;
        }
    }

    Object pop(){
        if(top == -1){
            System.out.println("Stack is emepty");
        }else{
            this.obj = arr[top];
            top--;
            
        }
        return obj;
    }
    void display(){
        if(top == -1){
            System.out.println("Stack is emepty");
        }else{
            System.out.println("Stack elements are : ");
            for(int i=0; i<=top; i++){
                System.out.println(arr[i]);
            }
        }
    }
}

public class GenObjectStackApp{
    public static void main(String[] args) {
        /* GenObjectStack iStack = new GenObjectStack(3);
        iStack.push(34);
        iStack.push(45);
        iStack.push("amar");
        String s = (String)iStack.pop();
        System.out.println(s+" popped from stack");
        //in above when we popped the value we take String type because pop method return obj type we caste it as string type but actual scenario
        //we dont know about it 

        //String s1 = (String)iStack.pop();
        //System.out.println(s1+" popped from stack");
        //in above scenario again we popped the value but the pop returing integer type but take it as String type which should give compile time
        //error but it not giving but at runtime it throw exception which is not good

        Object ob1 = iStack.pop();
        System.out.println(ob1+" popped from stack");
        //but above scneriao we get performance issue
        iStack.display();  */
        

        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of stack : ");
        int size = sc.nextInt();

        GenObjectStack objectStack = new GenObjectStack(size);
        int option;

        do { 
            System.out.println("Choose Your Option : ");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("enter your option no : ");
            option = sc.nextInt();

            switch (option) {
                case 1->{
                    System.out.print("enter a value :");
                    Object obj = sc.nextInt(); //for integer 
                    //Object obj = sc.next();  // for string
                    objectStack.push(obj); 
                }
                case 2->{
                    Object ob = objectStack.pop();
                    System.out.println(ob+" popped from stack");
                }
                case 3->{
                    objectStack.display();
                }
                case 4->{
                    System.out.println("Exiting");
                }
                default->{
                    System.out.println("invalid option...");
                }
            }
        } while (option != 4);
        sc.close();
    }
}