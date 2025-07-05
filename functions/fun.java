package functions;

public class fun {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers from 1 to 1000 :");
        
        for (int number = 1; number <= 1000; number++) {
            int no = number;
            int sum = 0;
            int digits = String.valueOf(number).length();
            
            while (no > 0) {
                int digit = no % 10;
                sum += Math.pow(digit, digits);
                no /= 10;
            }

            if (sum == number) {
                System.out.println(number);
            }
        }
    }
}

