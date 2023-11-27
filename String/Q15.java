import java.util.Scanner;
class Q15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ans;
		int i=3;
		System.out.println("Who is the inventor of Java?");
		do {
			System.out.print("Ans..");
			ans=sc.nextLine();
			if(ans.equalsIgnoreCase("James Gosling")) {
				System.out.println("Good");
				System.exit(0);
			} else {
				System.out.println("Try Again!!");
				i--;
			}
		} while(i>0);
		System.out.println("Ans is James Gosling");
	}
}
