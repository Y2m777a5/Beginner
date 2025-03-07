package Task_05;

public class Smartphone {
     private String name;
     public String [] ftr = new String [10];
     public String [] fName = new String [10];
     public int count1;
     public int count2;

     public Smartphone(){}

     public Smartphone(String n){
        name = n;
     }

     public void addFeature(String f, String fn){
        if(count2<10 && name!=null){
            if(count1==0){
                ftr[count1]=f;
                fName[count1++]=fn;
                count2++;
            }
            else{
               boolean flag = false;
               for(int i=0; i<count1; i++){
                if(ftr[i]==f){
                    fName[i]+=", "+fn;
                    flag = true;
                }
               }
               if(!flag){
                ftr[count1]=f;
                fName[count1++]=fn;
               }
            }
        }
        else if(name == null){
            System.out.println("Feature can not be added without phone name");
        }
     }

     public void updateName(String n){
        name=n;
     }

     public void printDetail(){
        System.out.println("Phone Name: "+name);
        for(int i=0; i<count1; i++){
            System.out.println(ftr[i]+": "+fName[i]);
        }
     }
}
