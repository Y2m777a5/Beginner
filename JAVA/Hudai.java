public class Hudai{
    public static int Rsum(int a,int n){
        if(a == n){
            return n;
        }
        else{
            return a+Rsum(a+1,n);
        }
    }
    public static void main(String [] args){
        System.out.println(Rsum(1,9));
    }
}