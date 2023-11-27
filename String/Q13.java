import java.util.Scanner;
import java.util.Arrays;
class Q13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.print("Enter the string...");
		s=sc.nextLine();
		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		System.out.println("In alphabetical order = "+new String(ch));
	}
}
