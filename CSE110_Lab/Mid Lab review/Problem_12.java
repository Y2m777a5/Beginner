import java.util.Scanner;
import java.lang.Math;

public class Problem_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(num!=0){
            int temp2 = num%10;
            sum+=temp2;
            num/=10;
        }
        if(sum%2==0){
            System.out.println("The sum is even.");
        }
        else{
            System.out.println("This sum is odd.");
        }


        // Alternative_1
        // int temp = num; // after counting digits it will be zero;
        // int count = 0;
        // while(temp!=0){ // counting digits
        //     count++;
        //     temp/=10;
        // }
        // System.out.println(count);
        // while(num!=0){
        //     int temp2 = num/(int)Math.pow(10,count-1); // Getting 1st number;
        //     sum+=temp2;
        //     num%=Math.pow(10,count-1); // Getting number excluding 1st number;
        //     count--; // Decreasing count;
        // }
        // if(sum%2==0){
        //     System.out.println("The sum is even."+sum);
        // }
        // else{
        //     System.out.println("The sum is odd."+sum);
        // }
        sc.close();
    }
}
