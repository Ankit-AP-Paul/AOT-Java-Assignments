import java.util.Scanner;
class Q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		int len1,len2,i=0;
		char[] ch;
		System.out.print("Enter the string...");
		s=sc.nextLine();
		len1=s.length();
		System.out.print("Enter the length of char array...");
		len2=sc.nextInt();
		ch=new char[len1+len2];
		System.out.println("Enter the char array...");
		while(i<len2) {
			ch[i]=sc.next().charAt(0);
			i++;
		}
		while(i<(len1+len2)) {
			ch[i]=s.charAt(i-len2);
			i+=1;
		}
		System.out.println("Resultant array = ");
		for(char x:ch) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
}