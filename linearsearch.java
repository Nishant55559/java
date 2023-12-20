import java.util.*;
public class linearsearch {

    public static void main(String[] args) {

     int[] arr = {18, 13, 14, 6 , 7, 8};
     int target = 1;
     System.out.println(linearsearch(arr , target, 0, 5));
    }

    static int linearsearch(int[] arr, int target, int start, int end){

         int i = 0;
        //run a for loop
        for(int index = start; index <= end ; index++){

            //check for element at every index if it is = target

            int element = arr[index];
            if(element == target) {
                i= index;
                break;
            }
            else i=-1;
        } return i;
    }
}
