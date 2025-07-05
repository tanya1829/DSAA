import java.util.*;
public class loops {
    public static void main(String args[]){
        System.out.println(" enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
      /*   int i=1;
        int sum=0;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    
        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n = n/10;
        }*/
        /* reverse the number 
        int reverse=0;
        while(n>0){
            int lastDigit = n%10;
            reverse = (reverse*10)+ lastDigit;
            n=n/10;

        } System.out.println(reverse);*/

boolean isprime = true;
for(int i=2; i<n-1; i++){
    if(n%i==0){
        System.out.println("composite");
    }
        isprime=false;
    
    if(isprime==true){
        System.out.println("prime");
    }
else{
    System.out.println("composite");
}
    } 
    sc.close();
 }
}
