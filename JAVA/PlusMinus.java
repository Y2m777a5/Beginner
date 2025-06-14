
public class PlusMinus 
{
    public static void main(String[] args )
    {
      int n =4;
      int k=1;
      //for(n=0; n<4; n++)
      //{
        /*//minus
        int i=2;
        while(i!=0)
        {
           sum-=k;
           i--;
        }

        //plus
        int j=2;
        while(j!=0)
        {
            sum+=k;
            j--;
        }*/
        while(k<=4)
        {
            int sum=0,  tsum=0;
            for(int nk=k; 0!=nk; nk--)
            {
               sum=sum+nk;
            }
            tsum=tsum+sum;
            k++;
        }
      //}
      System.out.println(tsum);
    }
}