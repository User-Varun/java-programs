class MergeSort{

 
     // arguments are (arr , left , right ) 
     private static void mergeSortMethod(int[] arr , int l , int r){
      
        if(l < r){
           int mid = (l + r)/2;

           mergeSortMethod(arr, l, mid);
           mergeSortMethod(arr, mid+1 , r);

           merge(arr , l , mid , r);
        }
        
    }

     private static void merge(int[] arr , int l , int mid , int r ){
        
       int n1 = mid - l + 1;
       int n2 = r - mid;


        int lArr[] = new int[n1];
        int rArr[] = new int[n2];


        for(int x = 0; x < n1; x++){
            lArr[x] = arr[l+x];
        }
        for(int x = 0; x < n2; x++){
            rArr[x] = arr[mid + 1 + x];
        }

        int i = 0;
        int j = 0;
        int k = l;



        while(i < n1 && j < n2 ){

            if(lArr[i] <= rArr[j]){
                arr[k] = lArr[i];
                i++;
            }else{
                arr[k] = rArr[j];
                j++;
            }
            k++;




        }

        while(i < n1){
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }
 
    public static void main(String args[]) {

        int arr[] = { 3, 5, 1, 4, 6, 2 };

        System.out.println("Program of merge sort by Name:Varun pawar , enrollment number: 0873cs231133");

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

       
        mergeSortMethod(arr , 0,  arr.length-1);
      

        
        System.out.println("after sorting");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
    

    
}