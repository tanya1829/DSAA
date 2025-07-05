package sorting_algo;

import java.util.Arrays;

public class bubbleSort {
    // largest elemnts come to the end of array by swapping with adjacent elements 
     public static void bubblesorting(int arr[]){
        for(int turns=0; turns< arr.length-1; turns++){
            for(int j=0; j<arr.length-1-turns; j++){
                if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1]= temp;
              }
           }
             
        }
     }
     public static void printArr(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
     }
     public static void main(String[] args) {
        int arr[] = {5,4,3,1,2};
        bubblesorting(arr);
        printArr(arr);
     }
}
