import org.w3c.dom.stylesheets.LinkStyle;

import java.util.*;

public class Jan22 {


    public static void main(String[] args) {
        int length = 5;
        int count = 1;
        System.out.println("Triangle pattern Programm using numbers");
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(count++ + " ");

            }
            System.out.println();
        }

        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(list.subList(0,2));
        System.out.println(list.set(0,10));
        System.out.println(list);



    }
}
