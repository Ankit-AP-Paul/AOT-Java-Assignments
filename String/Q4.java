import java.util.Scanner;
class Q4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s,rev="";
		int len;
		System.out.print("Enter the string...");
		s=sc.nextLine();
		len=s.length();
		for(int i=0;i<len;i++) {
			rev=s.charAt(i)+rev;
		}
		System.out.println("Reversed string = "+rev);
	}
}
