import java.util.Scanner;
import java.util.StringTokenizer;
class Q17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1,s2,s3="",temp="";
		int c=0,i=1;
		System.out.println("Enter the 2 strings...");
		s1=sc.next();
		s2=sc.next();
		StringTokenizer st=new StringTokenizer(s1,s2);
		c=st.countTokens();
		while(st.hasMoreTokens()) {
			temp=st.nextToken();
			if(i==c) {
				s3+=""+temp.charAt(0);
			}
			if(i==1) {
				s3+=""+temp.charAt(temp.length()-1);
			} 
			if(i!=1 && i!=c) {
				s3+=""+temp.charAt(0)+temp.charAt(temp.length()-1);
			}
			i++;
		}
		System.out.println("New String = "+s3);
	}
}
