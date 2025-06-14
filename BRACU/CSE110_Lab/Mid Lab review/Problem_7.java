import java.util.Scanner;

public class Problem_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        
        for(int i=3, j=1; j<=num; i+=2, j++){ 
        // j controling counting part;
        // i controling the increament of numbers from 3,5,7...;
            if(j%2==0){
                sum-=i;
            }
            else{
                sum+=i;
            }
        }
        System.out.println(sum);


        // Alternative_1
        // for(int i=1; i<=num; i++){
        //     if(i%2==0){
        //         sum-=(2*i+1); 
        //         // (2n-1) formula to bring the odd numbers increament 
        //         //where "i" is used as number of terms 
        //     }
        //     else{
        //         sum+=(2*i+1);
        //     }
        // }
        // System.out.println(sum);


        // Alternative_2
        // boolean flag = true;
        // to keep trac of next number; if it is true it will subtract, else add;
        // sum=3;
        // for(int i=3; (i-2)<num; i++){ 
        //     if(flag){
        //         sum-=(2*i-1);
        //         flag=false;
        //     }
        //     else{
        //         sum+=(2*i-1);
        //         flag=true;
        //     }
        // }
        // System.out.println(sum);
        sc.close();
    }
}
