import java.util.Scanner;

public class Minusplus {
    public static int oneToN(int a, int n){

        if(n == 0){
            return n;
        }
        else{
            System.out.print(oneToN(1, n-1)+" ");
            return n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N=");
        int N = sc.nextInt();
        oneToN(1,N);
    }

    /* ADD YOUR CODE HERE */

}
