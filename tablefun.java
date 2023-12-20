import java.util.*;

public class tablefun {
 public static void printtable(int num){

     for (int i = 1; i <= 10; i++) {

         System.out.println(num + "*" + i + "=" + num*i );
     }

 }
 public  static void main (String arg[]){

     Scanner input = new Scanner (System.in);
     int num = input.nextInt();
     printtable(num);
 }



}