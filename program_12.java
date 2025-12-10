import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		char ch=scan.next().charAt(0);
		System.out.print(Arrays.toString(UserMainCode.splitString(str,ch)));
	}
}

class UserMainCode{
	public static String[] splitString(String text,char ch){
		String str[]=text.split(""+ch);
		int idx=0;
		for(String s:str){
			StringBuilder sb=new StringBuilder(s.toLowerCase());
			sb.reverse();
			str[idx++]=sb.toString();
		}
		return str;
	}
}