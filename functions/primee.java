package functions;

public class primee {
    public static boolean prime(int n){
       boolean prime =true;
       // should use root n as max numb can go upto rrot n and for 2 ... 2%2=0 which will give 2 as composite its better whether define for 2 separatly or use root 
       for(int i=2; i<=Math.sqrt(n);i++){
        if(n%i==0){
            prime = false;
        }
       }
       return prime;
    }
    public static void main(String args[]){
        System.out.println(prime(2));
    }
}
