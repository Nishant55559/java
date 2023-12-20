import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
  Scanner ic = new Scanner(System.in);
   int num = 123456; // reverse of number//
   int ans = 0;
   while (num > 0){
       int rem = num % 10;
       num =  num/10;
       ans = ans * 10 + rem ;


   }
       System.out.println(ans);

    }
}
