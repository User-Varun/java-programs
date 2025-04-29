import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class program26 {
    public static void main(String[] args) {
        System.out.println("Name: Varun Pawar, Enrollment No.: 0873CS231133");

        Scanner sc = new Scanner(System.in);
        Integer[] arr = new Integer[10];

        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("Array in descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
