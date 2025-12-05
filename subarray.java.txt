import java.util.*;
import java.io.*;
public class subarray{
public static void main(String args[]){
 
Scanner scan=new Scanner(System.in);

String s1=scan.nextLine();
String s2=scan.nextLine();

 System.out.print(UserMainCode.countOccurances(s1,s2));
 
}
}

class UserMainCode{

public static int countOccurances(String s1,String s2){
  if(s2.length()>s1.length())return 0;
   int count=0;
   for(int i=0;i<=s1.length()-s2.length();i++){
        boolean valid=true;
        int temp=i;
        for(int j=0;j<s2.length();j++){
        if(s1.charAt(temp)!=s2.charAt(j)){
          valid=false;
          break;
         }
         temp++;
         }
       if(valid==true){
         count++;
      }
   }

  return count;
}
}