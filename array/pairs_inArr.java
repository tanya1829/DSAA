package array;

public class pairs_inArr {

    public static void pairs(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++ ){
                System.out.print( "(" + curr + " ," + numbers[j] + ")" );
            }
            System.out.print(" ");
        }
    }

    public static void main(String args[]){
       int numbers[]={2,4,6,8};
      pairs(numbers);
    } 
}
    

