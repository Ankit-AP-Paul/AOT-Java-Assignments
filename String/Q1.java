import java.util.Scanner;
class Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		char[] ch;
		System.out.print("Enter the string...");
		s=sc.nextLine();
		ch=s.toCharArray();
		System.out.println("Char array = ");
		for(char x:ch) {
			System.out.println(x+" ");
		}
	}
}