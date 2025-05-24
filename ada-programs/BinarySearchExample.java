import java.util.Scanner;

public class BinarySearchExample {
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key)
                return mid; // Element found at index mid
            else if (arr[mid] < key)
                low = mid + 1; // Search right half
            else
                high = mid - 1; // Search left half
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program of binary search by Name:Varun pawar , enrollment number: 0873cs231133");

        // Input array size and elements
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input element to search
        System.out.print("Enter element to search: ");
        int key = scanner.nextInt();

        int result = binarySearch(arr, key);

        if (result == -1)
            System.out.println("Element not found in the array.");
        else
            System.out.println("Element found at index " + result);

        scanner.close();
    }
}
