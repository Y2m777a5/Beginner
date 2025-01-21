package Task_05;

public class Book {
    public String ttl;
    public String athr;
    public int price = 0;

    public Book (String ttl){
        this.ttl = ttl;
    }

    public Book (String ttl, String athr){
        this.ttl = ttl;
        this.athr = athr;
    }

    public Book (String ttl, String athr, int price){
        this.ttl = ttl;
        this.athr = athr;
        this.price = price;
    }

    public void setDetails (int price){
        this.price = price;
    }

    public void setDetails (String athr, int price){
        this.athr = athr;
        this.price = price;
    }

    public void displayDetails (){
        if(!(ttl==null)){
            System.out.print("Title: "+ttl);
        }
        if(!(athr==null)){
            System.out.print(", Author: "+athr);
        }
        if(!(price==0)){
            System.out.print(", Price: "+price);
        }
        System.out.println();
    }
}
