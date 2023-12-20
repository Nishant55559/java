
import java.util.*;

public class function2 {
public static void printprime(int num){

    if (num % 2 ==0 && num != 2 || num % 3==0 && num != 3 || num % 4 == 0 && num != 4  || num % 5 == 0 && num != 5 || num % 6 == 0 && num != 6 || num % 7 == 0 && num != 7|| num % 8 == 0 && num != 8 || num % 9 == 0 && num != 9  ) {
        System.out.println("it is not a prime no");
    }
    else{
        System.out.println("it is a prime no");
    }

    return;

    }

     public static void main(String arg[]){

     Scanner input = new Scanner(System.in);
     int num = input.nextInt();

     printprime( num);

     }



}