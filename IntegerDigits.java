import java.util.Scanner;

public class IntegerDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        
        while(num>0){
            int digit=num%10;
            System.out.print(" ");
            System.out.print(digit);
            num=num/10;
        }
    }
}
