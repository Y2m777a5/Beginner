
public class UniversityTester {
  
  
  public static void main(String[] args) { 
    University u1 = new University();
    University u2 = new University();
    
    //Task_1A
    System.out.println("Location of object1: "+u1);
    System.out.println("Location of object1: "+u2);
    System.out.println(u1.name);
    System.out.println(u1.country);
    System.out.println(u2.name);
    System.out.println(u2.country);
    if(u1.equals(u2)){
      System.out.println("Equal");
    }
    else{
      System.out.println("Not equal");
    }
    
    
    //Task_1B
    String old_name1= u1.name;
    String old_name2= u2.name;
    String old_country1= u1.country;
    String old_country2= u2.country;
    
    u1.name = "Imperial College London";
    u1.country = "England";
    u2.name = "Brac University";
    u2.country = "Bangladesh";
    
    if(u1.name.equals(old_name1) && u1.country.equals(old_country1)){
      System.out.println("1st object is remaining Same.");
    }
    else{
      System.out.println("1st object has Changed.");
    }
       
    if(u2.name.equals(old_name2) && u2.country.equals(old_country2)){
      System.out.println("2nd object is remaining Same.");
    }
    else{
      System.out.println("2nd object has Changed.");
    }
    
    System.out.println(u1.name);
    System.out.println(u1.country);
    System.out.println(u2.name);
    System.out.println(u2.country);
    
    if(u1.name.equals(u2.name)){
      System.out.println("Instance variable (name) is same.");
    }
    else{
      System.out.println("Instance variable (name) is not same.");
    }
    
    if(u1.country.equals(u2.country)){
      System.out.println("Instance variable (country) is same.");
    }
    else{
      System.out.println("Instance variable (country) is not same.");
    }
  }
}

