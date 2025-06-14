package Task_06;

public class Bus {
    public int capacity;
    public String loc;

    public Bus(int c, String l){
        capacity = c;
        System.out.println("Capacity: "+capacity);
        loc = l;
        System.out.println("Destination: "+loc);
    }

    public void addPassenger(String name, String l){
        if(loc.equals(l) && capacity>0){
            System.out.println(name+" is added to the bus.");
            capacity--;
        }
        else if(capacity==0){
            System.out.println("Bus is full.");
        }
        else{
            System.out.println("Sorry "+name+"! The bus won't stop at "+l+"\nUse another bus.");
        }
    }

    public void addPassenger(String name){
        if(capacity>0){
            capacity--;
            System.out.println(name+" is added to the bus.\n"+name+" will get off at the last stop");
        }
    }
}
