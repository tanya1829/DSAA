package functions;

public class Fun_overloading2 {
    public static int sum(int a, int b){
        int f= a+b;
    
    return f;
    }
    public static float sum(float a, float b){
        float j= a+b;
        return j;
    }
    public static void main(String args[]){
        System.out.println(sum(5,4));
        System.out.println(sum(2.0f,7.9f));

    }
}
