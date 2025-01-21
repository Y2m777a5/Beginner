import java.util.Scanner;
public class Task_4 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length of array: ");
        int N = sc.nextInt();
        int [] arr = new int [N];
        System.out.println("Please enter the elements of the array:");
        for(int i=0; i<N;i++){
            arr [i]= sc.nextInt();
            System.out.println();            
        }
        System.out.println("Please enter the target value:");
        int num = sc.nextInt();
        boolean flag = false;
        for(int i=0; i<N-1; i++){
          for(int j=i+1; j<N; j++){
            if(arr[i]+arr[j] == num){
              System.out.println("Elements need to be added: "+arr[i]+" "+arr[j]);
              System.out.println("Index of the elements: "+ i +" and "+j);
              flag = true;
              break;
            }
          }
          if(flag){
            break;
          }
        }
        if(flag == false){
          System.out.println("Target value not found");
        }
  }
  
  /* ADD YOUR CODE HERE */
  
}
