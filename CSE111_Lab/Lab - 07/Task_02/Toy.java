
public class Toy {
  public String name;
  public int price;
  
  public Toy(String name, int price) {
    System.out.println("A new toy has been made!");
    this.name=name;
    this.price=price;
  }
  
  public void updatePrice(int price){
    this.price=price;
  }
  
  public void updateName(String name){
    System.out.println("Changing old name: "+this.name);
    this.name=name;
    System.out.println("new name: "+this.name);
  }
  
  public void showPrice(){
    System.out.println("price: "+price+" Taka");
  }
}
