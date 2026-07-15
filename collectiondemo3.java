import java.util.*;

public class collectiondemo3 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add(50);
        al.add(20);
        al.add(90);
        al.add(10);

        System.out.println( "before sorting" +al);

        Collections.sort(al);
        // ye isliye use hua jise hum log chhote se bade order mai arrange karne ke liye`
        System.out.println("after sorting"+al);

    }
}
