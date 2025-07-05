package array;

public class subarray {
    public static void subArrays(int numbers[]){
        for(int i=0; i< numbers.length; i++){
            
            for(int j=i; j<numbers.length; j++){
              
            
            for(int k=i; k<= j; k++){ // just for printing
                System.out.print(numbers[k]+ " "); //subarray
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
public static void main(String[] args) {
    int numbers[]={2,4,6,8,10};
 subArrays(numbers);
}
}
