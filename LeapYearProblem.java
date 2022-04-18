public class LeapYearProblem {
    import java.util.Scanner;


    public static void main(String[] args) {
        // leap year
        System.out.println("take input from user : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year / 4 == 0) {
            System.out.println(year + " it is a leap year..");
        } else {
            System.out.println(year + " is not a leap year..");
        }
    }
}
