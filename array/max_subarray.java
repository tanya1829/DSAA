package array;
// time complexity= n^3
//brute force - baisc solution
public class max_subarray {
    public static void subarray(int numbers[]){
        int curr=0;
        int maxSum= Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            for(int j=i; j<numbers.length; j++){
                 curr=0;
                for(int k=i;k<=j;k++){
                   curr+=numbers[k];
                }
                System.out.print(curr + " ; ");
                if(maxSum < curr){
                    maxSum=curr;
                }
            }
        }
        System.out.println(" -so the max sum : " + maxSum);
    }

public static void main(String arga[]){
    int numbers[]={1, -2, 6, -1,3};
    subarray(numbers);
}
}
