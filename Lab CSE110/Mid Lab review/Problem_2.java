import java.util.Scanner;

public class Problem_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int itm = sc.nextInt(); // item number
        int quntt = sc.nextInt(); //quantity
        double price; // initialized the price;

        //Use condition so that calculation can be done for that specific item that has been ordered;
        if(itm==1){
            price = 4.00;
            System.out.println("Item: Hot Dog\n"+"Quantity: "+quntt+"\nTotal: $"+(quntt*price));
            //"\n" --> means new line; It only works inside a string;
        }
        else if(itm==2){
            price = 4.50;
            System.out.println("Item: X-Salad\n"+"Quantity: "+quntt+"\nTotal: $"+(quntt*price));
        }
        else if(itm==3){
            price = 5.00;
            System.out.println("Item: X-Bacon\n"+"Quantity: "+quntt+"\nTotal: $"+(quntt*price));
        }
        else if(itm==4){
            price = 2.00;
            System.out.println("Item: Toast\n"+"Quantity: "+quntt+"\nTotal: $"+(quntt*price));
        }
        /* no need for another else cause we know that if 1-4 doesn't work,
        it will come to else and calculate the item number 5 */
        else{
            price = 1.50;
            System.out.println("Item: Soda\n"+"Quantity: "+quntt+"\nTotal: $"+(quntt*price));
        }
        sc.close();
    }
}