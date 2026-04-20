
import java.util.Scanner;

class Queue{
    String[] sarr;
    int front;
    int rear;
    int size;

    public Queue(int size) {
        this.size = size;
        sarr = new String[size];
        front = -1;
        rear = -1;
    }

    void add(String val){
        if(rear == (size-1)){
            System.out.println("Queue is full");
        }else{
            if(front == -1){
                front = 0;
            }
            sarr[++rear] = val;
            System.out.println(val +"  inserted in Queue");
        }
    }

    void remove(){
        if(front == -1 || front > rear){
            System.out.println("Queue is empty");
        }else{
            System.out.println(sarr[front++]+" removed from queue");
        }
    }

    void peek(){
        if(front == -1 || front > rear){
            System.out.println("Queue is empty");
        }else{
            System.out.println("Front element is : "+sarr[front]);
        }
    }

    void display(){
        if(front == -1 || front > rear){
            System.out.println("Queue is emepty");
        }else{
            System.out.println("Queue elements are : ");
            for (int i= front; i<=rear; i++) {
                System.out.println(sarr[i]);
            }
        }
    }
}

public class StringQueue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of queue : ");
        int size = sc.nextInt();

        Queue q1 = new Queue(size);
        int option;
        
        do { 
            System.out.println("Choose your option : ");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("enter your option no : ");
            option = sc.nextInt();

            switch (option) {
                case 1: System.out.print("enter value : ");
                        String val = sc.next();
                        q1.add(val);
                        break;

                case 2: q1.remove();
                        break;

                case 3: q1.peek();
                        break;

                case 4: q1.display();
                        break;

                case 5: System.out.println("Exiting");
                        break;

                default: System.out.println("invalid option given....");        
            }
        } while (option != 5);
        sc.close();
    }
}