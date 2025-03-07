import java.util.Scanner;

public class Problem_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            // sum, count, x and y all of these variables changes each time loop starts;
            int sum = 0;
            int count = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j=x; count!=y; j++) {
                // Adding from x (including start);
                // counting will be continued until y==count;
                if(j%2!=0){ // only odd numbers are allowed;
                    sum+=j;
                    count++;
                }
            }
            System.out.println(sum); // Printing all the sum each time loop ends
        }


        // Alternative_1
        // for(int i=0; i<n; i++) {
        //     // sum, count, x and y all of these variables changes each time loop starts;
        //     int sum = 0;
        //     int count = 0;
        //     int x = sc.nextInt();
        //     int y = sc.nextInt();
        //     while(count!=y) { // We don't need extra variable j;
        //         // Adding from x (including start);
        //         // counting will be continued until y==count;
        //         if(x%2!=0){ // only odd numbers are allowed;
        //             sum+=x;
        //             count++;
        //         }
        //         x++;
        //     }
        //     System.out.println(sum); // Printing all the sum each time loop ends
        // }
        sc.close();
    }
}
