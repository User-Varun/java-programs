public class program23 {
    public static void main(String[] args) {
        System.out.println("Name: Varun Pawar, Enrollment No.: 0873CS231133");

        int n1 = 1, n2 = 2, n3;
        int sum = n1 + n2;

        System.out.print(n1 + " " + n2 + " ");

        for (int i = 3; i <= 10; i++) {
            n3 = n2 + n1;
            System.out.print(n3 + " ");
            sum += n3;
            n1 = n2;
            n2 = n3;
        }

        System.out.println("\nSum of first 10 terms of Lucas series: " + sum);
    }
}
