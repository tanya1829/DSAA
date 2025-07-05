package array;

public class maxSumPrefix {
    public static void prefix(int numbers[]){
        int curr=0;
        int maxSum = Integer.MIN_VALUE;
        int prefixArr[]= new int [numbers.length];
        prefixArr[0]=numbers[0];
        for(int i=0; i< prefixArr.length; i++){
            prefix[i]= prefix[end] 
             for(int j=i; j<numbers.length; j++){
            curr=0;
           /*  for(int k=i; k<=j;k++){
             curr+=numbers[k];
            }*/
             System.out.println(curr + " ");
            
                if(maxSum < curr){
                   maxSum=curr;   
            }
        }
    }
    System.out.println(maxSum);
    }

public static void main(String args[]){
int numbers[]={2,4,-2,6,-7,4,9};
prefix(numbers);
}
}
