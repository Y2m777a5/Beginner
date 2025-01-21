import java.util.Scanner;
public class Array_Task_02 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Array_Task_02");
    int max = 0;
    int min = 0;
    int max_in = 0;
    int min_in = 0;
    int [] arr = new int [5];
    for(int i=0; i<5; i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0; i<4; i++){
      if(arr[i]==0){
        max_in = i;
        min_in = i;
        max = arr[i];
        min = arr[i];
      }
      else{
        if(arr[i]>arr[i+1] && arr[i]>arr[max_in]){
          max = arr[i];
          max_in = i;
        }
        if(arr[i]<arr[i+1] && arr[i]<arr[min_in]){
          min = arr[i];
          min_in = i;
        }
      }
    }
    System.out.println("The largest number "+max+" was found at location "+max_in);
    System.out.println("The smallest number "+min+" was found at location "+min_in);
  }
}
