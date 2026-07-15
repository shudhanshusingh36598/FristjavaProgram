import java.util.*;

public class stackdemo1 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(50);
        s.push(30);
        s.push(20);

        System.out.println(s);

        System.out.println(s.peek());
        System.out.println(s.search(20));
        System.out.println(s.pop());
        System.out.println(s.empty());

    }
}
