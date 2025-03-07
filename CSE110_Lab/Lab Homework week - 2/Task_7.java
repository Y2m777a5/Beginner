
public class Task_7 {
  
  
  public static void main(String[] args) { 
    float sec = 23f;
    float min = 56f;
    float hour = 5f;
    float tHour = (hour+(min/60)+(sec/3600));
    float meter = 2500f;
    float km = (meter/1000);
    float miles = (meter/1609);
    System.out.printf("Your velocity in km/h is %.7f\n",(km/tHour));
    System.out.printf("Your velocity in miles/h is %.7f\n",(miles/tHour));
  }
 
}
