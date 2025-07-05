import java.util.Scanner;
public class conditionals{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks= sc.nextInt();
    
       /*  if(income<500000){
            System.out.println("0% TAX");
        }
            else if(income>=500000 && income<100000){
                System.out.println("20% TAX will be charged"  +"  : " + (income*0.2));
            }
            else {
                System.out.println("30% TAX will be charged" +"  : " + (income*0.3));
            }
            */
            String type = (marks >=33? "pass" : "fail" );
            System.out.println(type);
             sc.close();
    }
   
}