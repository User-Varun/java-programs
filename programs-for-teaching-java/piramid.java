import java.util.Scanner;

public class piramid {

    public static void main(String args[]) {

        Scanner scr = new Scanner(System.in);

        char p;

        int n = scr.nextInt();

        scr.close();

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");

            }
            p = 'A';
            for (int j = 0; j <= i + i; j++) {
                System.out.print(p);

                if (j == 1) {
                    p += 32;
                }

                if (i < n - 1) {

                    p = (j < 1) ? ++p : --p;

                }
                System.out.print("\n");
            }
        }
    }
}