package array;
import java.util.*;
public class largest {
    public static int findingLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i < numbers.length; i++){
            if(largest< numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {2,3,4,9,5,6,};
        System.out.println("largest is : " + findingLargest(numbers));
    }

    }

