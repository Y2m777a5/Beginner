public class Course2 {
    public String [] courses = new String [4];
    public String cname ;
    public String ccode;
    public int counter = 0;

    public void createCourse(String name, String code){
        cname = name;
        ccode = code;
    }

    public void printDetails(){
        System.out.println("Course details:");
        System.out.println("Course Name: "+cname);
        System.out.println("Course Code: "+ccode);
        System.out.println("Course Syllabus:");

        if(counter>0){
            for(int i=0; i<counter; i++){
                if(i==0){
                    System.out.print(courses[i]);
                }
                else{
                    System.out.print(", "+courses[i]);
                }
            }
            System.out.println();
        }
        else{
            System.out.println("No content yet.");
        }
    }

    public void addContent(String name){
        if(counter<4){
            courses[counter++]=name;
            System.out.println(name+" was added");
        }
        else{
            System.out.println("Cannot add more content");
        }
    }
    //Same method but with two parameter to pass two arguments;
    public void addContent(String name1, String name2){
        addContent(name1);
        addContent(name2);
    }
}
