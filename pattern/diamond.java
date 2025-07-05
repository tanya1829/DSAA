package pattern;

public class diamond {
    public static void diamondSolid(int n){
        for(int i=1; i<=n; i++){
            //for blank places in start
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*(i)-1; j++){
                
                    System.out.print("*");
                }
                System.out.println();
        }
    
           for(int i=n; i>=1; i--){
            //for blank places in start
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*(i)-1; j++){
                
                    System.out.print("*");
                }
                System.out.println();
        }
    }
    

    public static void main(String[] args) {
        diamondSolid(4);
    }
    
}
