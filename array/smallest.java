package array;

public class smallest {
    public static int small(int numbers[]){
        int smallestt= Integer.MAX_VALUE;
        for(int i=0; i < numbers.length; i++){
            if(smallestt > numbers[i])
            {
                 smallestt=numbers[i];

            }

        }
        return smallestt;
    } 
    public static void main(String args[]){
        int numbers[]= {2,9,5,7,3,0,33};
        System.err.println("smallest number is" + small(numbers));
    }
}
