package Task_05;

public class Cargo {
    public static double cCap = 10.0;
    public String cont;
    public double weight;
    static int obj;
    public int id;
    public boolean load = false;

    public Cargo(String cont, double weight){
        this.cont = cont;
        this.weight = weight;
        id=++obj;
    }

    public void details(){
        System.out.println(
            "Cargo ID: "+id+
            ", Contents: "+cont+
            ", Weight: "+weight+
            ", Loaded: "+load);
    }

    public void load(){
        if(cCap-weight>=0.0){
            cCap-=weight;
            load = true;
            System.out.println("Cargo "+id+" loaded for transport.");
        }
        else{
            System.out.println("Cannot load cargo, exceeds weight capacity.");
        }
    }

    public void unload(){
        cCap+=weight;
        load = false;
        System.out.println("Cargo "+id+" unloaded.");
    }

    public static double capacity(){
        return cCap;
    }
}
