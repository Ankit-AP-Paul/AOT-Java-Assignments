import java.util.Scanner;
class Q10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1,s2,s3="";
		int i=0,j=0;
		System.out.println("Enter the 2 strings...");
		s1=sc.nextLine();
		s2=sc.nextLine();
		while(i<s1.length() && j<s2.length()) {
			s3+=""+s1.charAt(i)+""+s2.charAt(j);
			i++;
			j++;
		} 
		while(i<s1.length()) {
			s3+=""+s1.charAt(i);
			i++;
		} 
		while(j<s2.length()) {
			s3+=""+s2.charAt(j);
			j++;
		}
		System.out.println("New String = "+s3);
	}
}
