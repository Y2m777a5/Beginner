import java.util.Scanner;
import java.util.Arrays;
public class Task_3 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length of array 1: ");
        int N = sc.nextInt();
        int [] arr1 = new int [N];
        System.out.println("Please enter the elements of the arr1:");
        for(int i=0; i<N;i++){
            arr1 [i]= sc.nextInt();
            System.out.println();            
        }
        System.out.print("Please enter the length of array 2: ");
        int num = sc.nextInt();
        int [] arr2 = new int [num];
        System.out.println("Please enter the elements of the arr2:");
        for(int i=0; i<num;i++){
            arr2 [i]= sc.nextInt();
            System.out.println();            
        }
        int count=0;;
        for(int i=0; i<arr2.length; i++){
          for(int j=0; j<arr1.length; j++){
            if(arr2[i]==arr1[j]){
              count++;
              continue;
            }
          }
        }
        if(count==arr2.length){
          System.out.println("Array 2 is a subset of Array 1.");
        }
        else{
          System.out.println("Array 2 is not a subset of Array 1.");
        }
  }
  
  /* ADD YOUR CODE HERE */
  
}
