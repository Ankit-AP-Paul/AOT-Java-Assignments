class RangeOrderException extends Exception {
	public String getMessage() {
		return "Initial num > Final num";
	}
}

class Q8 {
	public static void main(String[] args) {
		String s1="",s2="",rev="";
		int a=0,b=0;
		try {
			s1=args[0];
			a=Integer.parseInt(args[1]);
			b=Integer.parseInt(args[2]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("No proper argument");
		}
		catch(NumberFormatException e) {
			System.out.println("Type error");
		}
		try {
			if(a>b) {
				throw new RangeOrderException();
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		try {
			s2=s1.substring(a,b);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Substring indices out of range");
		}
		for(int i=0;i<s2.length();i++) {
			rev=s2.charAt(i)+rev;
		}
		System.out.println("Reversed = "+rev);
	}
}
