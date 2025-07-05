package sorting_algo;
import java.util.Arrays;
import java.util.Collections;
public class inbuilt {
    public static void main(String args[]){
        int arr[]={5,3,7,1,2,4,6};
        Integer crr[]={1,2,3,4,5,6,7,8};  
        Arrays.sort(arr);
       Arrays.sort(crr, Collections.reverseOrder());
       System.out.println(Arrays.toString(arr) + " ");
       System.out.println(Arrays.toString(crr) + " ");
    }
    
}
