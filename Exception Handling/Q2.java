class Q2 {
	public static void main(String[] args) {
		int[] a={1,2,3,4,5};
		String s="Java";
		try {
			char ch=s.charAt(10);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		try {
			int num=a[8];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
