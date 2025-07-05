package sorting_algo;

public class selection {
    // idea is to pick the smallest from the un sorted arrray and put ir at the beginning
    public static void selectionSort(int arr [] ){
        // why it is n-1? 
        // beacuse index is from 0 to 4 for n=5 after placing 4 correct last one will be automatically at the correct pos
        for(int i=0; i< arr.length-1; i++){
            int minPosition = i;
            // to find the minimum from the unsorted
            // to check till the last elemnt we can check for i< n or i<= n-1;
            for(int j=i+1; j < arr.length; j++){
                if(arr[minPosition] > arr[j] ){
                    minPosition=j;
                }
            }
            //swap the minimum with the current position
            int temp= arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i]= temp;
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
       selectionSort (arr);
        printArr(arr);
     }
}

