import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
       Set<Student> set=new HashSet<>();
       
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
       
       int n=Integer.parseInt(br.readLine());
       
       for(int i=0;i<n;i++){
           set.add(new Student(br.readLine(),Integer.parseInt(br.readLine())));
       }
       
     
    
      Iterator<Student> iterator=set.iterator();
      while(iterator.hasNext()){
          System.out.println(iterator.next().toString());
      }
    }
}
class Student{
    private String name;
    private int rollNo;
    
    
    Student(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    
    void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    int getRollNo(){
        return rollNo;
    }
    

    public boolean equals(Object o){
        Student sobj=(Student) o;
        return this.rollNo==sobj.rollNo;
    }
    
   
    public int hashCode(){
        return this.rollNo;
    }
    
    public String toString(){
        return "Name:"+this.name+" "+"rollNo:"+this.rollNo;
    }
    
}