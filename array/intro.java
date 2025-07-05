package array;
import java.util.*;
public class intro {
    public static void main(String[] args) {
    // create, 
    int marks[]= new int[100];
    // create method2 
    //int numbers[] = {1,2,3};

    //input,
     Scanner sc= new Scanner(System.in);
     marks[0]= sc.nextInt();
      marks[1]= sc.nextInt();
       marks[2]= sc.nextInt();
    // output,
    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);
    // update
    marks[2]=100;
    System.out.println(marks[2]);

    System.out.println("length" + marks.length);
    sc.close();
}

}