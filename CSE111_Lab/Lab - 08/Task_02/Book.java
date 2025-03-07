package Task_02;

public class Book{
    static int total_books_sold;
    static double total_revenue;
    public String ttl;
    public double price = 150.0;

    public Book(String name, int dis) {
        total_books_sold++;
        ttl = name;
        price -= (price*dis/100);
        total_revenue += price;
    }

    public void bookDetails() {
        System.out.println("Title: "+ttl);
        System.out.println("Price after Discount: "+price+" TK");
    }
}