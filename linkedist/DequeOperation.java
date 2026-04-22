package com.edupoly.collection.linkedist;

import java.util.LinkedList;

public class DequeOperation {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();

        //acting as a Queue(FIFO)
        queue.addLast("user1");
        queue.addLast("user2");
        String str1 = queue.removeFirst();
        System.out.println(str1);
        System.out.println(queue);

        //acting as a Stack(LIFO)
        queue.push("page1");
        queue.push("page2");
        System.out.println(queue);
        String backButton = queue.pop();
        System.out.println(backButton);
        System.out.println(queue);

        String top = queue.peek();
        System.out.println(top);
    }
}
