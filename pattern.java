import java.util.Scanner;
public class pattern{
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        if ( num % 2 ==0 && num != 2 || num % 3==0 && num != 3 || num % 4 == 0 && num != 4  || num % 5 == 0 && num != 5 || num % 6 == 0 && num != 6 || num % 7 == 0 && num != 7|| num % 8 == 0 && num != 8 || num % 9 == 0 && num != 9   ) {
            System.out.println("it is not a prime no");
        }
        else{
            System.out.println("it is a prime no");
        }
         Scanner size = new Scanner(System.in);
         int row = input.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(" @");
            }
            System.out.println();

        }

        }
    }

