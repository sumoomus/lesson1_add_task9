import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int xx = scanner.nextInt();

        int x = 5, y = 7, z = 0, k = 9;


       z = x * x + y * y;
        System.out.println("z = " + z);
       z = x * x * x;
        System.out.println("z = " + z);
       k = x / z;
        System.out.println("k = " + k);

// делить на ноль нельзя
        // Exception in thread "main" java.lang.ArithmeticException: / by zero





    }
}
