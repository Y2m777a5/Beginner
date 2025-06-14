package Task_04;

public class Dog extends Animal{
    public String breed;
    
    public Dog(String n, int age, String c, String breed){
        super(n, age, c);
        this.breed = breed;
    }
       
    public String info() {
        return super.info()+"breed: "+breed;
    }

    public void makeSound(){
        System.out.println(color+" color "+name+" is barking");
    }
}
