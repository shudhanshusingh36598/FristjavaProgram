import java.util.*;

public class stackdemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push('a');
        s.push('B');
        s.push('c');
        s.push('d');
        System.out.println(s);

        System.out.println(s.search('B'));
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.empty());



    }
}