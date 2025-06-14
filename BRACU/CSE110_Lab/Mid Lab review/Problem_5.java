import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int increament = sc.nextInt();
        int end = sc.nextInt();
        
        // int sum = start;
        // System.out.print(sum);
        // for(int i=start; sum<=end; i++){
        //     // i variable have no work just helping to create a for loop;
        //     sum=sum+increament;
        //     if(sum<=end){ 
        //     //Again using condition just to print less or equal to the "end" number;
        //         System.out.print(", "+sum);
        //     }
        // }
        

        //#Alternative_1

        System.out.print(start);
        while(start<=(end-increament)){ //Creating a formula to avoid condition;
            start = start+increament;
            System.out.print(" ,"+start);
        }


        //#Alternative_2

        // System.out.print(start);
        // while(start<=end){
        //     start = start+increament;
        //     if(start<=end){
        //         System.out.print(" ,"+start);
        //     } 
        // }
        sc.close();
    }
}
