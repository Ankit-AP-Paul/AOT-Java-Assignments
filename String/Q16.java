import java.util.Scanner;
class Q16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s,s1="";
		int n;
		System.out.print("Enter the string...");
		s=sc.nextLine();
		System.out.print("Enter a number between 0 and "+s.length()+"...");
		n=sc.nextInt();
		try {
			for(int i=0;i<n;i++) {
				s1+=s.substring(s.length()-n);
			}
			System.out.println("New string = "+s1);
		} catch(Exception e) {
			System.err.println("Wrong Input!!");
		}
	}
}
