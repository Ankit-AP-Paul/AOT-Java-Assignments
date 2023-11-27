import java.util.Scanner;
import java.util.StringTokenizer;
class Q9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name,roll,password="";
		System.out.print("Enter the name...");
		name=sc.nextLine();
		System.out.print("Enter the roll number...");
		roll=sc.nextLine();
		StringTokenizer st=new StringTokenizer(name);
		while(st.hasMoreTokens()) {
			password+=st.nextToken().charAt(0);
		}
		password+=roll.substring(roll.length()-4);
		System.out.println("Password = "+password);
	}
}
