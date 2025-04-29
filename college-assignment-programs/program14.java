// reverse a given number 
import java.util.Scanner;

class program14{
 public static void main(String args[]){
     System.out.println("Name : Varun pawar , enrollment no. : 0873CS231133" + "\n");

   Scanner scan = new Scanner(System.in);
   
   System.out.print("Enter the no. to reverse: ");
   int userNum = scan.nextInt();
   
   scan.close();
   
   int reverseNum = 0 , temp; 
   
   while(userNum !=0){ 
   temp = userNum % 10;
   reverseNum = (reverseNum * 10) + temp;
   userNum = userNum/10;
   
   }
   
   System.out.println("reversed No. :"+reverseNum);
 }

}

/*
// that's so cool concept it's like 
// when we have to break a number  like 567 , we take the remainer after diving 
it with 10, that will break the number by it's 10th place with is 6 , 
so we get 56.7 , then since need remainder we only diving until hit decimal point


then we increase the reverse no place by multiplying by 10 , then we just put the val of the place stored in temp


then we finally decrease the value to userNum by 10 so reduing the places one by one , so 567 -> 56 -> 5

*/