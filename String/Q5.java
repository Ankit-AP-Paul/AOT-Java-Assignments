import java.util.Scanner;
class Q5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.print("Enter the string...");
		s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		System.out.println("Reversed string = "+sb.reverse());
	}
}
