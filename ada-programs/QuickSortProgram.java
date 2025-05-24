public class QuickSortProgram {
    
    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
            
        }
    }
    
    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;
        

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
         int temp = arr[i + 1];
         arr[i + 1] = arr[high];
         arr[high] = temp;

        
         return i + 1;

    }
      
   
    public static void main(String args[]) {
        
        int arr[] = { 5, 6, 2, 3, 1, 8, 4 };

        System.out.println("Program of quick sort by Name:Varun pawar , enrollment number: 0873cs231133");

        int high = arr.length - 1;
        int low = 0;

        System.out.println("before Sort");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();


        quickSort(arr, low, high);

        System.out.println("after Sort");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
