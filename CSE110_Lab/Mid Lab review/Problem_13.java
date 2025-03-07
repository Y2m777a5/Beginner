import java.util.Scanner;
import java.lang.Math;

public class Problem_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i=0; num!=0; i++){
            int temp2 = num%10;
            sum+=(temp2*Math.pow(2,i));
            num/=10;
        }
        System.out.println(sum);


        // Alternative_1 (without using Math.pow)
        
        // for(int i=0; num!=0; i++){
        //     int temp = num%10;
        //     int temp2 = 1;
        //     for(int j=0; j<i; j++){
        //         temp2*=2;
        //     }
        //     sum+=(temp*temp2);
        //     num/=10;
        // }
        // System.out.println(sum);
        sc.close();
    }
}
