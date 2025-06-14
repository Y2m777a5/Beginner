import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        float sum = 0;
        for(float i=1; i<=num; i++){ 
            // Using float here because:
            // 1/i(if i int) result:0 (int value in result); 1/2 --> 0.0
            // 1/i(if i double/float) result:0.0 (double/float value in result); 1/2.0 --> 0.5
            if(i%4==0){
                sum-=(1/i);
            }
            else{
                sum+=(1/i);
            }
        }
        System.out.printf("%.4f",sum);
        sc.close();
    }
}
