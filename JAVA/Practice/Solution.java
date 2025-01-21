import java.io.*;
import java.util.Scanner;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
 public static void main(String[] args){
  
  Scanner in = new Scanner(System.in);
  int testCases = Integer.parseInt(in.nextLine());
  while(testCases>0){
   String line = in.nextLine();
   int len = line.length();
   String temp ="";
   int checker = 0;
   int count2=0;
   String sum ="";
   boolean flag = false;
           for(int i=0; i<len; i++){
               char lineChar= line.charAt(i);
               
               // collecting valid tag;
               if (lineChar=='<'){
                   int count=0;
                   String str1="", str2="";
                   for(int a=i; a<len; a++){
                       if(line.charAt(a) == '<'){
                           count++;
                           count2++;
                       }
                       if (a<len-1){
                           str1 = ""+line.charAt(a)+ line.charAt(a+1);
                       }
                       if(str1.equals("</")){
                           count--;
                           }
                       }
                       count2--; //as the 1st '<' entering in this condition;
                   
                   boolean tagCheck = true;
                   String stag="", etag="";
                   for(int t=i; t<len; t++){
                       if(line.charAt(t)=='<' || tagCheck || line.charAt(t)=='>'){
                           if(line.charAt(t)=='<'){
                               tagCheck = true;
                           }
                           else if(line.charAt(t)=='>'){
                               tagCheck = false;
                           }
                           else{
                               temp += line.charAt(t);
                           }
                       }
                       stag = temp;
                       checker=stag.length();
                       if (t<len-2){
                           str2 = ""+line.charAt(t)+ line.charAt(t+1);
                       }
                                    //System.out.println(str2);
                       if(str2.equals("</")){
                           if(count==1){
                               for(int e=t+2; e<=(stag.length()+t+1); e++){
                                   etag+=line.charAt(e);
                               }
                               if(stag.equals(etag)){
                                   flag = true;
                                   break;
                               }
                               else{
                                   flag =false;
                               }
                           }
                           else{count--;}
                       }
                   }
                   i+=stag.length()+1;
               }
               else if (flag){
                   if(count2==1){
                       sum = sum+""+line.charAt(i);
                   }
                   else{
                       sum="";
                   }
               }
           }
              System.out.println(sum);
   testCases--;
  }
 }
}