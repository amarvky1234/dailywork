import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
class A{
    public static void main(String[] args) {
        Queue<Object> q1 = new ArrayDeque<>();
        q1.add("rajesh");
        q1.add("pawan");
        q1.add("yak");
        System.out.println(q1);
        q1.remove();
        System.out.println(q1);

        Stack s1 = new Stack();
        s1.push("rajesh");
        s1.push("pawan");
        s1.push("yak");
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);
    }
}