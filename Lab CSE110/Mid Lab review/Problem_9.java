import java.util.Scanner;

public class Problem_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            // sum, x, y, start and end all of these variables changes each time loop starts;
            int sum = 0;
            int start = 0;
            int end = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();
            // Choosing the start based on small/large number where small is start point;
            if(y>x) {
                start = x; end = y;
            }
            else {
                start = y; end = x; 
            }
            for(int j=start+1; j<end; j++) { // Adding from start to end (excluding start/end);
                if(j%2!=0){ // only odd numbers are allowed;
                    sum+=j;
                }
            }
            System.out.println(sum); // Printing all the sum each time loop ends
        }
        sc.close();
    }
}
