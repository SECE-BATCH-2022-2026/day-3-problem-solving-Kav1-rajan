import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String pattern=scan.nextLine();
		System.out.print(UserMainCode.phoneValidator(pattern));
	}
}

class UserMainCode{
	public static boolean phoneValidator(String pattern){
		return pattern.matches("[1-9]{2}[0-9]{8}");
	}
}