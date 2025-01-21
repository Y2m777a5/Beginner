
public class Passenger {
  static int no_of_passenger;
  static double total_fare;
  public String name;
  public double fare;
  
  public Passenger(String name, double dis) {
    no_of_passenger++;
    this.name = name;
    this.fare = dis*20;
    total_fare += this.fare;
  }
  
  public void setBaggageWeight(double weight){
    this.fare = fare+(weight*10);
    total_fare +=(weight*10);
  }
  
  public void passengerDetails(){
    System.out.println("Name: "+name);
    System.out.println("Fare: "+fare);
  }
}
