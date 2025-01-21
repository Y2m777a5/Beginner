import java.util.Scanner;
import java.util.Arrays;
public class Task_2 {
  
  
  public static void main(String[] args) { 
    int [] arr = {23,100,23,56,100};
        System.out.println("Input array: ");
        for(int i=0; i<arr.length;i++){
          System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0; i<arr.length;i++){
          for(int j=i+1; j<arr.length; j++){
            if(arr[i] == arr[j]){
              arr[j] = 0;
            }
          }
        }
        int count=0;
        for(int i=0; i<arr.length;i++){
          if(arr[i]==0){
            count++;
          }
        }
        int num = arr.length-count;
        int [] Narr = new int [num];
        int j=0;
        for(int i=0; i<arr.length;i++){
          if(arr[i]!=0){
            Narr[j] = arr[i];
            j++;
          }
        }
       System.out.println("New array: ");
       for(int i=0; i<Narr.length;i++){
          System.out.print(Narr[i]+" ");
        }
  }
  
  /* ADD YOUR CODE HERE */
  
}