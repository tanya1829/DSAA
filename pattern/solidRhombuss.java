package pattern;

public class solidRhombuss {
    public static void SolidRhombus(int n){
        //loop for number for total rows we needed to print
        for(int i=1; i<=n; i++){
            //loop for printing the number of spaces
            for(int j=1; j<= n-i; j++){
                System.out.print(" ");
            }
            // loop to print stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            // after all 5 five stars and spaces go on next line
            System.out.println();
        }
    }
    public static void main(String args[]){
  SolidRhombus(6);
    }

    }
