import java.util.Scanner;
import java.util.StringTokenizer;
class Q8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name,abv="";
		int l=0;
		System.out.print("Enter the name...");
		name=sc.nextLine();
		StringTokenizer st=new StringTokenizer(name);
		l=st.countTokens();
		while(st.hasMoreTokens()) {
			if(l>1) {
				abv+=st.nextToken().charAt(0)+".";
				l--;
			} else {
				abv+=st.nextToken();
			}
		}
		System.out.println("Abbreviated Name = "+abv);
	}
}
