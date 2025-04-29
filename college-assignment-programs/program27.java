import java.util.Scanner;

public class program27 {
    public static void main(String[] args) {
        System.out.println("Name: Varun Pawar, Enrollment No.: 0873CS231133");

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][4]; // 5 rows, 4 columns (5x4 = 20 elements, we'll only use 17)

        System.out.println("Enter 17 elements:");
        int count = 0, sum = 0;
        outer:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (count < 17) {
                    arr[i][j] = sc.nextInt();
                    sum += arr[i][j];
                    count++;
                } else {
                    break outer;
                }
            }
        }

        System.out.println("Sum of all elements = " + sum);
    }
}
