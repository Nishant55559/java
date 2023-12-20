import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println("enter the two numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("enter the operatior");
        char operator = input.next().charAt(0);
        if (operator == '+' || operator == '-' || operator == '/' || operator == '*' || operator == '%'   ) {


            switch (operator) {
                case '+' -> System.out.println("sum of two no is "+ (num1+num2));
                case '-' -> System.out.println("subtraction of two no is "+ (num1-num2));
                case  '*' -> System.out.println("multiplication of two no is "+ (num1*num2));
                case  '/'  -> System.out.println("divide of two no is "+ (num1/num2));
                case '%' -> System.out.println("remainder of two no is "+ (num1%num2));

                default -> System.out.println("invalid output");
            }
        }
        else { System.out.println("Invalid operatior");
        }
    }

}



