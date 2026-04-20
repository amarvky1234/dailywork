
import java.util.Scanner;

class Queue {
    int arr[];
    int front;
    int rear;
    int size;

    Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue is Full");
        } else {
            if (front == -1) {
                front = 0;
            }
            arr[++rear] = value;
            System.out.println(value + " inserted into queue");
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println(arr[front++] + " removed from queue");
        }
    }

    void peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Front element is: " + arr[front]);
        }
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Queue elements:");
            for (int i = front; i <= rear; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}

public class IntQueue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of queue : ");
        int size = sc.nextInt();

        Queue q1 = new Queue(size);

        int option;

        do { 
            System.out.println("choose your option : ");
            System.out.println("1. Add Element In Queue");
            System.out.println("2. Remove Element From Queue");
            System.out.println("3. Front Element Of Queue");
            System.out.println("4. Display Queue Element");
            System.out.println("5. Exit");
            System.out.print("enter your option no : ");
            option = sc.nextInt();

            switch(option){
                case 1 -> {
                    System.out.println("enter value : ");
                    int val = sc.nextInt();
                    q1.enqueue(val);
                }

                case 2 -> q1.dequeue();

                case 3 -> q1.peek();

                case 4 -> q1.display();

                case 5 -> System.out.println();

                default -> System.out.println("invalid option! please try again...");        
            }
        } while (option != 5);
        sc.close();
    }
}
