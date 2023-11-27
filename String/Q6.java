import java.util.Scanner;
class Q6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.print("Enter the string...");
		s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		if(s.equalsIgnoreCase(sb.reverse().toString())) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}
}
