package Task_03;

public class Student {
    static int cse_id_count;
    static int other_id_count;
    static int total_id_count;

    public int id;
    public String name;
    public double cg;
    public String dept = "CSE";

    public Student(String name, double cg){
        cse_id_count++;
        total_id_count ++;
        this.name = name;
        this.cg = cg;
        id = total_id_count;
    }

    public Student(String name, double cg, String dept){
        other_id_count++;
        total_id_count++;
        this.name = name;
        this.cg = cg;
        this.dept = dept;
        id = total_id_count;
    }

    public static Student createStudent(String n, double c, String d){
        //Student s = new Student(n, c, d);
        return new Student(n, c, d);
    }

    public void individualDetail(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("CGPA: "+cg);
        System.out.println("Department: "+dept);
    }

    static void printDetails(){
        System.out.println("Total Student(s): "+total_id_count);
        System.out.println("CSE Student(s): "+cse_id_count);
        System.out.println("Other Department Student(s): "+other_id_count);
    }
}
