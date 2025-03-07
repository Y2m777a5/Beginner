package Task_07;

public class Student {
    private int id;
    private double cg;
    private String [] course = new String [4];
    private int count=0;

    public Student (int id){
        this.id=id;
    }

    public Student (int id, double cg){
        this.id=id;
        this.cg=cg;
    }

    public void setCG(double cg){
        this.cg=cg;
    }

    public void setID(int id){
        this.id=id;
    }

    public void addCourse (String cname){
        if(cg>0.0){
            if(cg<3.0){
                if(count<3){
                    course[count++]=cname;
                }
                else{
                    System.out.println("Failed to add "+cname+"\nCG is low. Can't add more than 3 courses.");
                }
            }
            else{
                if(count<4){
                    course[count++]=cname;
                }
                else{
                    System.out.println("Failed to add "+cname+"\nMaximum 4 courses allowed.");
                }
            }
        }
        else{
            System.out.println("Failed to add "+cname+"\nSet CG first");
        }
    }

    public void addCourse (String courses[]){
        for(int i=0;i<courses.length;i++){
            addCourse(courses[i]);
        }
    }

    public void rmAllCourse(){
        course = new String [4];
        count=0;
    }

    public void showAdvisee (){
        System.out.println("Student ID: "+id+", CGPA: "+cg);
        if(count>0){
            System.out.println("Added courses are:");
            for(int i=0; i<count; i++){
                if(!(i==(count-1))){
                    System.out.print(course[i]+" ");
                }
                else{
                    System.out.println(course[i]);
                }
            }
        }
        else{
            System.out.println("No courses added.");
        }
    }
}
