class Q11 {
	public static void main(String[] args) {
		String s1="University of Technology",s2="Tech";
		int id=s1.indexOf(s2);
		if(id==-1) {
			System.out.println(s2+" not present in "+s1);
		} else {
			System.out.println("Index of "+s2+" in "+s1+" = "+id);
		}
	}
}
