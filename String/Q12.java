import java.util.Scanner;
class Q12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		int len=0;
		System.out.print("Enter the string...");
		s=sc.nextLine();
		len=s.length();
		if(len%2==0) {
			System.out.println("First Half = "+s.substring(0,len/2));
		} else {
			System.out.println("Null");
		}
	}
}
