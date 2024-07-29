import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        
  
        int reverse = 0;

        // Reverse the number
        while (num != 0) {
            int rem = num % 10; // Extract the last digit
            reverse = reverse * 10 + rem; // Append the digit to the reversed number
            num = num / 10; // Remove the last digit
        }

       
        System.out.println("The reverse of the given number is: " + reverse);

        sc.close();
    }
}
