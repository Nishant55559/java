import jdk.jshell.SourceCodeAnalysis;

import java.util.*;

import static java.util.Collections.swap;

public  class array {
    public static void main (String arg[]){

        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] number = new int[size];

        // input//
        for (int i = 0; i < size; i++) {
             number[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {

            if (number[i] < min) {
              min = number[i];
            }
            if (number[i]  > max) {
                max = number[i];
            }
            
            
        }

        System.out.println("largest number is = "+ max);
        System.out.println("minimum number is ="+ min);






    }

}