import java.util.Scanner;
 public class Continuee {
    public static void main(String args[]){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a number");
       int num = scanner.nextInt();
       if(num%10 == 0) {
         System.out.println(" ");
       }
       else {
        System.out.println(num);
       }
    }
    
}
