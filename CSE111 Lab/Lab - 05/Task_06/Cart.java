
public class Cart {
  public String [] itm = new String [3];
  public double [] icost = new double [3];
  public int cnum;
  public double offer;
  public int count=0;
  
  public void create_cart(int n){
    cnum = n;
  }
  
  public void addItem(String temp, double cost){
    if(count<3){
      itm[count]=temp;
      icost[count++]=cost;
      System.out.println(temp+" added to cart "+cnum);
      System.out.println("You have "+count+" item(s) in your cart now.");
    }
    else{
      System.out.println("You already have 3 items on your cart");
    }
  }
  
  public void giveDiscount(double dis){
    offer=dis;
  }
  
  public void cartDetails(){
    System.out.println("Your cart(c"+cnum+")");
    double sum=0.0;
    for(int i=0; i<count; i++){
      sum+=icost[i];
      System.out.println(itm[i]+" - "+icost[i]);
    }
    System.out.println("Discount Applied: "+offer+"%");
    System.out.println("Total price: "+(sum-(sum*(offer/100.0))));
  }
}
