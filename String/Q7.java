import java.util.Scanner;
class Q7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1,s2,s3;
		System.out.println("Enter the 2 strings...");
		s1=sc.nextLine();
		s2=sc.nextLine();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.charAt(s1.length()-1)==s2.charAt(0)) {
			s3=s1.substring(0,s1.length()-1)+s2;
		} else {
			s3=s1+s2;
		}
		System.out.println("Concatenated string = "+s3);
	}
}
