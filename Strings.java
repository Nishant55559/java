import java.util.*;

public class Strings {

    public static void main ( String arg[]) {

        StringBuilder name = new StringBuilder("tony stark");
        System.out.println(name);
        System.out.println(name.length());

        // char at 0 index

        System.out.println(name.charAt(0));

        // set char at index
         name.setCharAt(0,'p');
         name.setCharAt(6,'h');
         System.out.println(name);

       // insert char at any index
        name.insert(2,'n');
        System.out.println(name);

        // delete the extra char
        name.delete(0,1);
        System.out.println(name);

        StringBuilder reverse = new StringBuilder("iron man");
        for (int i = 0; i < reverse.length()/2; i++) {

            int front = i;
            int back = reverse.length()-i-1;

            char frontchar = reverse.charAt(front);
            char backchar = reverse.charAt(back);

            reverse.setCharAt(front, backchar);
            reverse.setCharAt(back , frontchar);

        }

         System.out.println(reverse);


    }


}