public class Course {
  public String [] course = new String [4];
  public String cname;
  public String ccode;
  public int counter = 0;
  
  public void createCourse(String cname, String ccode){
    this.cname = cname;
    this.ccode = ccode;
  }
  
  public void printDetails(){
    System.out.println("Course details:");
    System.out.println("Course Name: "+cname);
    System.out.println("Course Code: "+ccode);
    System.out.println("Course Syllabus:");
    
    if(counter>0){
      for(int i=0; i<counter; i++){
        if(i==0){
          System.out.print(course[i]);
        }
        else{
          System.out.print(", "+course[i]);
        }
      }
        System.out.println();
    }
    else{
      System.out.println("No content yet.");
    }
  } 
  
  public void addOneContent(String topic){
    if(counter<4){
      course[counter++]=topic;
      System.out.println(topic+" was added.");
    }
    else{
      System.out.println("Cannot add more content");
    }
  }
  
  public void addTwoContent(String topic1,String topic2){
    addOneContent(topic1);
    addOneContent(topic2);
  }
}
