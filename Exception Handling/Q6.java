class PayOutOfBoundsException extends Exception {
	public String getMessage() {
		return "monthly salary is less than Rs. 10,000/-";
	}
}
class Q6 {
	public static void main(String[] args) {
		int salary=5000;
		try {
			if(salary<10000)
				throw new PayOutOfBoundsException();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
