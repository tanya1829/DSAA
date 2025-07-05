package functions;

public class CallByValue {
    public static void swap(int a, int b){
         a =5;
         b =10;
        int c=a;
        a=b;
        b=c;
        System.out.println("value of a is " + a);
        System.out.println("value of b is "+ b);
    }
    public static void main(String args[]){
        int a =5;
        int b =10;
        swap(a ,b); 
    }
}
    

