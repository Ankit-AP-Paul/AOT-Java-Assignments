class Q5 {
	public static void main(String[] args) {
		try {
			throw new ArrayIndexOutOfBoundsException(); 
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
