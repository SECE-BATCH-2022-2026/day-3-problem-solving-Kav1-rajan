import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.nextLine();
		String s=scan.nextLine();
		System.out.print(UserMainCode.repeatFront(n,s));
	}
}
class UserMainCode{
	public static String repeatFront(int n,String s){
		 StringBuilder result=new StringBuilder();
		 if(s.length()==0){
		   return result.toString();	
		 }
		 if(s.length()==1 || s.length()==2){
		 	for(int i=1;i<=n;i++){
		 		result.append(s);
		 	}
		 }
		 else{
		 	String add=s.charAt(0)+""+s.charAt(1)+""+s.charAt(2);
		 	for(int i=1;i<=n;i++)
		 	result.append(add);
		 }
		 return result.toString();
	}
}