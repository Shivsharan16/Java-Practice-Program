import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num =sc.nextInt();
        sc.close();

        long factorial=1;
        for (int i=1; i<=num; i++){
            factorial *=i;

        }
        System.out.println("The Factorial of " + num + " is " + factorial);
    }
}
