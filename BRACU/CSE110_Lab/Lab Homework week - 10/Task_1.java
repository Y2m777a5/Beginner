
public class Task_1 {
  public static boolean isPrime(int a){
    int checker = 0;
    boolean flag = true;
    
    for(int i=2; i<a ; i++){
      if(a%i==0){
        checker = 1;
      }
    }
    if(checker == 0 && a!=1){
      flag = true;
    }
    else{
      flag = false;
    }
    return flag;
  }
  
  public static boolean isPerfect(int a){
    boolean flag = true;
    int sum = 1;
    
    for(int i=2; i<a ; i++){
      if(a%i==0){
        sum+=i;
      }
    }
    if(sum == a && a!=1){
      flag = true;
    }
    else{
      flag = false;
    }
    return flag;
  }
  
  public static int special_sum(int a){
    int sum = 0;
    
    for(int i=1; i<=a ; i++){
      if(isPrime(i) || isPerfect(i)){
        sum+=i;
      }
    }
    return sum;
  }
  
  public static void main(String[] args) { 
    boolean check = isPrime(7);
    System.out.println(check);
    
    check = isPrime(15);
    System.out.println(check);
    
    check = isPerfect(6);
    System.out.println(check);
    
    check = isPerfect(33);
    System.out.println(check);
    
    int result = special_sum(8);
    System.out.println(result);

  }
  
  /* ADD YOUR CODE HERE */
  
}
