import java.util.Scanner;

public class program21 {
    public static void main(String[] args) {
        System.out.println("Name: Varun Pawar, Enrollment No.: 0873CS231133");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check prime or not: ");
        int number = sc.nextInt();
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(number + " is a Prime number.");
        else
            System.out.println(number + " is not a Prime number.");
    }
}
