
public class Product {
  private String name;
  private double price;
  private int quantity;
  public Product() { 
    name = "Unknown";
    price = 0.0;
  }
  
  public Product(String name, double price) { 
    this.name = name;
    this.price = price;
  }
  
  public void setQuantity(int n){
    quantity=n;
  }
  
  public double getPrice(){
    return price;
  }
  
  public double getQuantity(){
    return quantity;
  }
  
  public void displayInfo(){
    System.out.println("Product Name: "+name);
    System.out.print("Price: $"+price);
  }
  
  public void displayInfo(boolean flag){
    System.out.println("Product Name: "+name);
    System.out.println("Price: $"+price);
    System.out.println("Quantity: "+quantity);
  }
}
