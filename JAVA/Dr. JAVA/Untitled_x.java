import java.util.Scanner;
class Untitled_x
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ch = sc.next();
        String out = "";
        
        for(int i=0; i< str.length(); i++)
        {          
          out = out+str.charAt(i);
          if(out.equals(ch))
          {
           System.out.println();
          }
          else
          {
            System.out.print(out);
          }
          out = "";
        }
        sc.close();
    }
}