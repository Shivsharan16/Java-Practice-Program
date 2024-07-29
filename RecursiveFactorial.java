import java.util.Scanner;

public class RecursiveFactorial {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        long factorial =factorial(number);
        System.out.println("The Factorial of " + number + " is " + factorial);

}
public static long factorial(int n){
    if(n==0 || n==1){
        return 1;
    } else {
        return n* factorial(n-1);
    }
}
}
