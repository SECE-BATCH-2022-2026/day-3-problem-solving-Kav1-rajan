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
		return pattern.matches("[a-zA-Z0-9][R{3}][0-9][a-zA-Z0-9]");
	}
}