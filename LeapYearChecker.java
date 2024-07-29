import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int year=sc.nextInt();

        boolean isLeapYear=isLeapYear(year);

        if(isLeapYear){
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
    public static boolean isLeapYear(int year){
        if(year % 4==0){
            if (year % 100 ==0){
                if (year % 400==0){
                    return true;

                } else {
                    return false;
                }
            } else {
                return true;
            } 

        }
        return false;
    }
}
