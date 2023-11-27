import java.util.Scanner;
class Q14 {
	static String deleteMe(String str, int m) {
		return str.substring(0,m)+str.substring(m+1);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		int id;
		System.out.print("Enter the string...");
		s=sc.nextLine();
		System.out.print("Enter the position...");
		id=sc.nextInt();
		System.out.println("String with "+id+"th character removed = "+deleteMe(s,id-1));
	}
}
