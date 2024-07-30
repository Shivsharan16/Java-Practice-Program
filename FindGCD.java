import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args) {
        int a, b, gcd=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
         a=sc.nextInt();
        System.out.println("Enter the second number: ");
        b=sc.nextInt();
        gcd=findGCD(a,b);
        System.out.println("GCD of " + a + " and " + b + " = " + gcd);

    }

    private static int findGCD(int a, int b) {
         while(b!=0){
            if(a>b){
                a=a-b;
            }
            else {
                b=b-a;
            }
         }     
         return a;
    }
    
}
