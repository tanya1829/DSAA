package functions;
import java.util.*;
public class Binomial_coff {
    public static int bino(int n){
    int f=1;
    for(int i= 1; i<=n; i++){
        f=f*i;   
         } return f;
    }
    public static int binocoff(int n, int r){
    int fact_n=bino(n);
    int fact_r = bino(r);
    int fact_nmr = bino(n-r);
    int binomial_factorial= fact_n/(fact_r * fact_nmr);
    return binomial_factorial;
    }
    public static void main(String args[]){
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the value of r");
        int r= sc.nextInt();
        System.out.println(binocoff(n,r));
    sc.close();
    }
    }
    


