import java.util.*;

public class Solutions {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine().trim();
        sc.close();
        int len = s.length();
        int count = 0;
        boolean flaggy = false;
        for(int i=0; i<len; i++){
            boolean flag = false;
            char temp = s.charAt(i);
            if((int)temp>=(int)'a' && (int)temp>=(int)'z'|| (int)temp>=(int)'A' && (int)temp>=(int)'Z'){
                flag = true;
                flaggy = true;
            }
            if (flag==false && flaggy){
                flaggy = false;
                count++;
            }
        }
        System.out.println(count);
        flaggy = false;
        String sum = "";
        for(int i=0; i<len; i++){
            boolean flag = false;
            char temp = s.charAt(i);
            if((int)temp>=(int)'a' && (int)temp<=(int)'z'|| (int)temp>=(int)'A' && (int)temp<=(int)'Z'){
                flag = true;
                flaggy = true;
                sum+=temp;
            }
            if (flag==false && flaggy){
                flaggy = false;
                System.out.println(sum);
                sum="";
            }
        }
    }
}
