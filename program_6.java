import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String text=scan.nextLine();
		System.out.print(UserMainCode.matchPattern(text));
	}
}

class UserMainCode{
	public static boolean matchPattern(String text){
		return text.matches("CPT-\\d{6}");
	}
}