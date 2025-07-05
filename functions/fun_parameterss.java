package functions;
import java.util.*;
public class fun_parameterss {
    public static int CalculateSum(int a, int b){
        
        // int a and b are formal parameter 
    int sum = a+b;
    return sum;
}

public static void main(String args[]){
   System.out.println("hello");
   Scanner sc= new Scanner(System.in);
   int a= sc.nextInt();
    System.out.println("enter value of b");
    int b = sc.nextInt();
    int sum= CalculateSum(a,b); 
    // while calling a,b are called as arguments or actual parameters. 
    System.out.println(sum);


sc.close();
}
}

