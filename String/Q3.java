import java.util.Scanner;
class Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.print("Enter the string...");
		s=sc.nextLine();
		System.out.println("Length with spaces = "+s.length());
		System.out.println("Length without spaces = "+s.trim().length());
	}
}