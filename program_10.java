import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String pattern=scan.nextLine();
		System.out.print(UserMainCode.regularExpression(pattern));
	}
}

class UserMainCode{
	public static boolean regularExpression(String pattern){
		return pattern.matches("(^[2][0-9]$)||(^[3][0-9])||(^[4][0-9]$)");
	}
}