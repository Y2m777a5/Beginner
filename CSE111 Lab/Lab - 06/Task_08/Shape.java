public class Shape {
    public String sname ;
    public double area;

    public void setParameters(String name, int side){
        sname = name;
        area = Math.PI*Math.pow(side,2);
    }

    public void setParameters(String name, int side1, int side2){
        sname = name;
        area = 0.5*side1*side2;
    }

    public void setParameters(String name, int side1, int side2, int side3){
        sname = name;
        area = 0.5*(side1+side2)*side3;
    }

    public String details(){
        return "Shape Name: "+sname+"\nArea: "+area;
    }
}
